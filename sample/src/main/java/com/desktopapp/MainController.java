package com.desktopapp;

import javafx.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MainController {
    public static Scene CreateScene(Integer id) throws Exception {
     
        URL sceneUrl = MainController.class.getResource("login-scene.fxml");

        // if (sceneUrl == null) {
        //     throw new Exception("Arquivo FXML 'MainScreen.fxml' não foi encontrado!");
        // }

        FXMLLoader loader = new FXMLLoader(sceneUrl);
        Parent root = loader.load();
        Scene scene = new Scene(root);

        MainController controller = loader.getController();
        controller.setId(id);
        
        return scene;
    }

    private Integer id;
    public void setId(Integer id) {
        this.id = id;
    }

    @FXML
    protected void initialize(URL location, ResourceBundle Resources) {
        this.btLogin.setText(id.toString());
    }
    @FXML
    protected Button btLogin;
    @FXML
    protected TextField tfLogin;
    @FXML
    protected PasswordField pfPass;
    @FXML
    protected CheckBox cbPass;

    @FXML
    protected void submit(ActionEvent e) throws Exception {
        if (!tfLogin.getText().equals("Nicolle")) {
            Alert alert = new Alert(
                AlertType.ERROR,
                "Você não é a Nicolle!",
                ButtonType.OK
            );
            alert.showAndWait();
            return;
        }

        if (!pfPass.getText().equals("senha")) {
            Alert alert = new Alert(
                AlertType.ERROR,
                "Senha errada, você não é a Nicolle!",
                ButtonType.OK
            );
            alert.showAndWait();
            return;
        }

        Stage crrStage = (Stage)btLogin
            .getScene().getWindow();
        crrStage.close();

        Stage newStage = new Stage();
        Scene newScene = MainController.CreateScene(this.id + 1);
        newStage.setScene(newScene);
        newStage.show();
    }
    
}


// package com.desktopapp;

// import java.net.URL;
// import javafx.event.ActionEvent;
// import javafx.fxml.FXML;
// import javafx.fxml.FXMLLoader;
// import javafx.scene.Parent;
// import javafx.scene.Scene;
// import javafx.scene.control.Alert;
// import javafx.scene.control.Alert.AlertType;
// import javafx.scene.input.MouseEvent;
// import javafx.stage.Stage;
// import javafx.scene.control.Button;
// import javafx.scene.control.ButtonType;
// import javafx.scene.control.CheckBox;
// import javafx.scene.control.PasswordField;
// import javafx.scene.control.TextField;

// public class LoginSceneController {

//     public static Scene CreateScene() throws Exception {
//         // Ajuste o caminho do seu arquivo FXML conforme necessário
//         URL sceneUrl = LoginSceneController.class.getResource("projetoScene.fxml");
//         Parent root = FXMLLoader.load(sceneUrl);
//         return new Scene(root);
//     }
//         // Variáveis que representam os componentes
//         // Note que id/field devem ser iguais ao nome
//         // que aparece aqui.
//         @FXML
//         protected Button btLogin;
//         @FXML
//         protected TextField tfLogin;
//         @FXML
//         protected PasswordField pfPass;
//         @FXML
//         protected CheckBox cbPass;
//         // Evento submit executado ao rodar a aplicação.
//         @FXML
//         protected void onButtonClick(MouseEvent e) throws Exception {
            
//         }
//     }


// package com.desktopapp;

// import java.net.URL;
// import javafx.event.ActionEvent;
// import javafx.fxml.FXML;
// import javafx.fxml.FXMLLoader;
// import javafx.scene.Parent;
// import javafx.scene.Scene;
// import javafx.scene.control.Alert;
// import javafx.scene.control.Alert.AlertType;
// import javafx.scene.input.MouseEvent;
// import javafx.stage.Stage;
// import javafx.scene.control.Button;
// import javafx.scene.control.ButtonType;
// import javafx.scene.control.CheckBox;
// import javafx.scene.control.PasswordField;
// import javafx.scene.control.TextField;

// public class LoginSceneController {

//     public static Scene CreateScene(Integer id) throws Exception {
//         // Ajuste o caminho do seu arquivo FXML conforme necessário

//         URL sceneUrl = LoginSceneController.class.getResource("projetoScene.fxml");

//         LoginSceneController controller = new LoginSceneController();
//         FXMLLoader loader = FXMLLoader.load(sceneUrl)
//         Parent root = loader.load();
//         Scene scene = new Scene(root);


//         return scene;

        
//     }
//         // Variáveis que representam os componentes
//         // Note que id/field devem ser iguais ao nome
//         // que aparece aqui.
//         @FXML
//         protected Button btLogin;
//         @FXML
//         protected TextField tfLogin;
//         @FXML
//         protected PasswordField pfPass;
//         @FXML
//         protected CheckBox cbPass;
//         // Evento submit executado ao rodar a aplicação.
//         @FXML

//         // como mudar der cena

//         protected void onButtonClick(MouseEvent e) throws Exception { 
//             Stage crrStage = (Stage)btLogin
//             .getScene().getWindow();

//             crrStage.close();

//             Stage newStage = new Stage();
//             Scene newScene = LoginSceneController.CreateScene(null);
//             newStage.setScene(newScene);
//             newStage.show();
//         }
//     }




