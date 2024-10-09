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
    private Integer id;

    // indica que os campos a seguir então vinculados no fxml. esse @ representa o id refereneciado
    @FXML
    protected Button btLogin;
    @FXML
    protected TextField tfLogin;
    @FXML
    protected PasswordField pfPass;
    @FXML
    protected CheckBox cbPass;

    public static Scene CreateScene(Integer id) throws Exception {
        URL sceneUrl = MainController.class.getResource("login-scene.fxml");
    
        // Se id for 2, carrega a cena de cartas
        if (id == 2) {
            sceneUrl = MainController.class.getResource("cartaScene.fxml");
        }
    
        FXMLLoader loader = new FXMLLoader(sceneUrl); //isso lê o arquivo fxml
        Parent root = loader.load(); // lê e traduz o fxml pra java
        Scene scene = new Scene(root); // dria uma nova cena e mostra oque foi carregado no root
    
        MainController controller = loader.getController(); // ele cria um controler método nativo
        // o contolador responde aos eventos do usuário na cerna

        controller.setId(id);
        
        return scene;
    }
    

    @FXML // aqui depois da declaração eu gerencio eventos que podem ocorrer com o elemento no fxl

    //  protected diz que só pode ser acessado no mesmo pacote
    protected void initialize(URL location, ResourceBundle resources) {
        this.btLogin.setText(id != null ? id.toString() : "Login");
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @FXML
    protected void submit(ActionEvent e) throws Exception {
        // Validação de login
        if (!tfLogin.getText().equals("Nicolle")) {
            showAlert("Você não é a Nicolle!");
            return;
        }

        if (!pfPass.getText().equals("senha")) {
            showAlert("Senha errada, você não é a Nicolle!");
            return;
        }

        // Se o login for bem-sucedido, abra a nova cena de cartas
        switchToCartaScene();
    }

    private void showAlert(String message) {
        Alert alert = new Alert(AlertType.ERROR, message, ButtonType.OK);
        alert.showAndWait();
    }

    private void switchToCartaScene() throws Exception {
        // Fechar a janela atual
        Stage currentStage = (Stage) btLogin.getScene().getWindow();
        currentStage.close();

        // Criar a nova cena de cartas
        URL sceneUrl = MainController.class.getResource("cartaScene.fxml");
        FXMLLoader loader = new FXMLLoader(sceneUrl);
        Parent root = loader.load();
        Scene newScene = new Scene(root);

        // Exibir a nova cena
        Stage newStage = new Stage();
        newStage.setScene(newScene);
        newStage.setTitle("Cena de Cartas heheheh");
        newStage.show();
    }
}
