package sample;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;
import javafx.scene.control.RadioButton;

import static sample.Main.*;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button generateButton;

    @FXML
    private TextField password_field;

    @FXML
    private TextField passwordLength_field;

    @FXML
    private Button clearButton;

    @FXML
    private Button copyButton;

    @FXML
    private RadioButton symbolsRadiobutton;

    @FXML
    private RadioButton NumbersRadiobutton;

    @FXML
    private RadioButton UppercaseRadiobutton;

    @FXML
    private RadioButton LowercaseRadiobutton;



    @FXML
    void initialize() {
        generateButton.setOnAction(event ->{
           pasLenght=Integer.parseInt(passwordLength_field.getText());

            if (LowercaseRadiobutton.isSelected()&&UppercaseRadiobutton.isSelected()) {
                password_field.setText(passGenUpperLower());
            }
            else if (LowercaseRadiobutton.isSelected()){
                password_field.setText(passGenLower());
            }
            else if (symbolsRadiobutton.isSelected()){
                password_field.setText(passGenSymbols());
            }
            else if (NumbersRadiobutton.isSelected()){
                password_field.setText(passGenNumbers());
            }
            else if
                (UppercaseRadiobutton.isSelected()) {
                    password_field.setText(passGenUpper());
            }
            else if ((passwordLength_field.getText().equals(null))) {
                    password_field.setText("Enter password length");
            }
            else {
                password_field.setText(passGen());
            }
        });

        clearButton.setOnAction(actionEvent -> {
            password_field.clear();
            passwordLength_field.clear();
        });

        copyButton.setOnAction(actionEvent -> {
            final ClipboardContent clipboardContent = new ClipboardContent();
            clipboardContent.putString(this.password_field.getText());
            Clipboard.getSystemClipboard().setContent(clipboardContent);
        });
    }
}

