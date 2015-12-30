package com.test.contract.ui;

import com.sun.java.accessibility.util.EventID;
import com.test.contract.entity.Contact;
import com.test.contract.service.ContactService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.event.EventTarget;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.EventObject;
import java.util.List;

@SuppressWarnings("SpringJavaAutowiringInspection")
public class MainController {

    // Инъекции Spring
    @Autowired
    private ContactService contactService;

    // Инъекции JavaFX
    @FXML private TableView<Contact> table;
    @FXML private TextField txtName;
    @FXML private TextField txtPhone;
    @FXML private TextField txtEmail;
    @FXML private TextField txtAge;

    // Variables
    private ObservableList<Contact> data;

    /**
     * Инициализация контроллера от JavaFX.
     * Метод вызывается после того как FXML загрузчик произвел инъекции полей.
     *
     * Обратите внимание, что имя метода <b>обязательно</b> должно быть "initialize",
     * в противном случае, метод не вызовется.
     *
     * Также на этом этапе еще отсутствуют бины спринга
     * и для инициализации лучше использовать метод,
     * описанный аннотацией @PostConstruct,
     * который вызовется спрингом, после того, как им будут произведены все инъекции.
     * {@link MainController#init()}
     */

    @FXML
    private Button button;

    boolean nameTyped = false;
    boolean phoneTyped = false;
    boolean emailTyped = false;
    boolean ageTyped = false;

    public void check() {
        if (nameTyped && phoneTyped && emailTyped && ageTyped) {
            button.setDisable(false);
        }
    }

    @FXML
    public void initialize() {
            txtName.addEventHandler(KeyEvent.KEY_TYPED, new EventHandler<KeyEvent>() {
                @Override
                public void handle(KeyEvent event) { nameTyped = true; check(); }
            });
            txtPhone.addEventHandler(KeyEvent.KEY_TYPED, new EventHandler<KeyEvent>() {
                @Override
                public void handle(KeyEvent event) { phoneTyped = true; check(); }
            });
            txtEmail.addEventHandler(KeyEvent.KEY_TYPED, new EventHandler<KeyEvent>() {
                @Override
                public void handle(KeyEvent event) { emailTyped = true; check(); }
            });
            txtAge.addEventHandler(KeyEvent.KEY_TYPED, new EventHandler<KeyEvent>() {
                @Override
                public void handle(KeyEvent event) { ageTyped = true; check(); }
            });
            button.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    nameTyped = false;
                    phoneTyped = false;
                    emailTyped = false;
                    ageTyped = false;
                    button.setDisable(true);
                }
            });
    }


    /**
     * На этом этапе уже произведены все возможные инъекции.
     */
    @SuppressWarnings("unchecked")
    @PostConstruct
    public void init() {
        List<Contact> contacts = contactService.findAll();
        data = FXCollections.observableArrayList(contacts);

        // Столбцы таблицы
        TableColumn<Contact, String> idColumn = new TableColumn<>("ID");
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));

        TableColumn<Contact, String> nameColumn = new TableColumn<>("Имя");
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));

        TableColumn<Contact, String> phoneColumn = new TableColumn<>("Телефон");
        phoneColumn.setCellValueFactory(new PropertyValueFactory<>("phone"));

        TableColumn<Contact, String> emailColumn = new TableColumn<>("E-mail");
        emailColumn.setCellValueFactory(new PropertyValueFactory<>("email"));

        TableColumn<Contact, String> ageColumn = new TableColumn<>("Age");
        ageColumn.setCellValueFactory(new PropertyValueFactory<>("age"));

        table.getColumns().setAll(idColumn, nameColumn, phoneColumn, emailColumn, ageColumn);

        // Данные таблицы
        table.setItems(data);
    }

    /**
     * Метод, вызываемый при нажатии на кнопку "Добавить".
     * Привязан к кнопке в FXML файле представления.
     */
    @FXML
    public void addContact() {
        Contact contact = new Contact(txtName.getText(), txtPhone.getText(), txtEmail.getText(), txtAge.getText());
        contactService.save(contact);
        data.add(contact);

        txtName.setText("");
        txtPhone.setText("");
        txtEmail.setText("");
        txtAge.setText("");
    }
}
