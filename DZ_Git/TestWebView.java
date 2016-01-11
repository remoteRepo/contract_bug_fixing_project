package com.test.contract;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.concurrent.Worker;
import javafx.scene.Scene;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import netscape.javascript.JSObject;

import static javafx.concurrent.Worker.State;

public class TestWebView extends Application {
    private Scene scene;

    @Override
    public void start(Stage stage) {
        // create the scene
        stage.setTitle("Web View");
        scene = new Scene(new Browser(), 750, 500, Color.web("#666970"));
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

class Browser extends Region {

    final WebView browser = new WebView();
    final WebEngine webEngine = browser.getEngine();

    public Browser() {
        //apply the styles
        getStyleClass().add("browser");
        // load the web page
        webEngine.loadContent("" +
                "<script>" +
                "function localEvent(s){" +
                "   testEventClass.ping();" +
                "   testEventClass.event(s);" +
                "}" +
                "function changeTextForInputFieldFromWebEngine(){" +
                "   document.getElementById(\"txtId\").value=\"new val was set by webengine from code\"; " +
                "}" +
                "</script>" +
                "<html>\n" +
                "<body>\n" +
                "<form>\n" +
                "\n" +
                "<input id=\"txtId\" type=\"text\" value=\"test\"/>" +
                "<p><input type=\"button\" onclick=\"localEvent('you clicked me!!!')\" value=\"Invoke TestEventClass\"/></p>" +
                "<p><input type=\"button\" onclick=\"testEventClass.changeFieldText()\" value=\"event\"/></p>" +
                "</form>\n" +
                "</body>\n" +
                "</html>");

        // extend the webview js context
        webEngine.getLoadWorker().stateProperty().addListener(new ChangeListener<Worker.State>() {
            @Override
            public void changed(final ObservableValue<? extends Worker.State> observableValue, final State oldState, final State newState) {
                if (newState == State.SUCCEEDED) {
                    JSObject win = (JSObject) webEngine.executeScript("window");
                    win.setMember("testEventClass", new TestEventClass());
                    webEngine.executeScript("testEventClass.ping()");
                    webEngine.executeScript("testEventClass.event(\"webEngine.executeScript...\")");
                }
            }
        });
        //add the web view to the scene
        getChildren().add(browser);

    }

    public class TestEventClass {

        public void changeFieldText() {
            webEngine.executeScript("changeTextForInputFieldFromWebEngine();");//please looking for changeTextForInputFieldFromWebEngine function within js module above
        }

        public void ping() {
            System.out.println("ping() invoked from javascript");
        }

        public void event(String s) {
            System.out.println("event() invoked from javascript, s=" + s);
        }
    }
}