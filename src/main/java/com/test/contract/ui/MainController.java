package com.test.contract.ui;

import com.test.contract.entity.Contact;
import com.test.contract.service.ContactService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.List;

@SuppressWarnings("SpringJavaAutowiringInspection")
public class MainController {

    // Инъекции Spring
    @Autowired
    private ContactService contactService;

    // Инъекции JavaFX
    @FXML
    private TableView<Contact> table;
    @FXML
    private TextField txtName;
    @FXML
    private TextField txtPhone;
    @FXML
    private TextField txtEmail;
    @FXML
    private TextField txtAge;



    // Variables
    private ObservableList<Contact> data;

    /**
     * Инициализация контроллера от JavaFX.
     * Метод вызывается после того как FXML загрузчик произвел инъекции полей.
     * <p>
     * Обратите внимание, что имя метода <b>обязательно</b> должно быть "initialize",
     * в противном случае, метод не вызовется.
     * <p>
     * Также на этом этапе еще отсутствуют бины спринга
     * и для инициализации лучше использовать метод,
     * описанный аннотацией @PostConstruct,
     * который вызовется спрингом, после того, как им будут произведены все инъекции.
     * {@link MainController#init()}
     */
    @FXML
    public void initialize() {
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

        table.getColumns().setAll(idColumn, nameColumn, phoneColumn, emailColumn);

        // Данные таблицы
        table.setItems(data);
    }

    /**
     * Метод, вызываемый при нажатии на кнопку "Добавить".
     * Привязан к кнопке в FXML файле представления.
     */
    @FXML
    public void addContact() {
//cмотри - выделяешь строчку с if - > и нажимаешь ALT+F8 -> РЕЗУЛЬТАТ ПРОВЕРКИ IF(---> ТВОЙ ПРЕДИКАТ (УСЛОВИЕ) <<--) = FALSE, КАК ТЫ ВИДЕШЛ
        Contact contact = new Contact(txtName.getText(), txtPhone.getText(), txtEmail.getText(), txtAge.getText());

        if (!contact.getName().isEmpty() && !contact.getPhone().isEmpty() && !contact.getEmail().isEmpty() && !contact.getAge().isEmpty()) {
            if (checkString(contact.getAge())) {
                contactService.save(contact);
                data.add(contact);//это то, что отвечает за вывод листинга с контрактами на ui
                //из-за этого у тебя не отрабатывало только сохранение в базу --->>>   contactService.save(contact);

                txtName.setText("");
                txtPhone.setText("");
                txtEmail.setText("");
                txtAge.setText("");
            }
        }
    }

    public boolean checkString(String string) {
        try {
            Integer.parseInt(string);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}




