package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

    @FXML
    private Button btnLogin;

    @FXML
    private Label lblMessage;

    @FXML
    private Label titleLabel;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private TextField txtUsername;


    @FXML
    void handleLogin(ActionEvent event) {
        try {
            String username = txtUsername.getText();
            String password = txtPassword.getText();

            if (username.equals("admin") && password.equals("admin123")) {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/dashboard.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                Stage stage = (Stage) btnLogin.getScene().getWindow();
                stage.setTitle("Inventory Management System - Dashboard");
                stage.setScene(scene);
                stage.show();
            } else {
                lblMessage.setText("Invalid username or password.");
            }
        } catch (IOException e) {
            lblMessage.setText("Error loading dashboard: " + e.getMessage());
        }
    }



}


