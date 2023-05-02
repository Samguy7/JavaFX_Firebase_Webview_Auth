/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.mvvmexample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author sam
 */
public class SignInController implements Initializable {

    @FXML
    private TextField Email;
    @FXML
    private PasswordField Password;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    @FXML
    private void switchToSecondary() throws IOException {
        String email = Email.getText();
        String password = Password.getText();
         if (email.isEmpty() || password.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR, "Please enter both email and password!");
            alert.showAndWait();
            return;
        }else{
        App.setRoot("AccessFBView.fxml");
    }
    }
    
    @FXML
    private void switchToSignUp() throws IOException {
        App.setRoot("SignUp.fxml");
        
    }
    
}
