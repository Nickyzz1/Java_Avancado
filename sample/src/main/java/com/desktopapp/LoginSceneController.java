package com.desktopapp;

import java.net.URL;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginSceneController {

    public static Scene CreateScene() throws Exception {
        // Ajuste o caminho do seu arquivo FXML conforme necessário
        URL sceneUrl = LoginSceneController.class.getResource("projetoScene.fxml");
        Parent root = FXMLLoader.load(sceneUrl);
        return new Scene(root);
    }
        // Variáveis que representam os componentes
        // Note que id/field devem ser iguais ao nome
        // que aparece aqui.
        @FXML
        protected Button btLogin;
        @FXML
        protected TextField tfLogin;
        @FXML
        protected PasswordField pfPass;
        @FXML
        protected CheckBox cbPass;
        // Evento submit executado ao rodar a aplicação.
        @FXML
        protected void onButtonClick(MouseEvent e) throws Exception {
            
        }
    }


