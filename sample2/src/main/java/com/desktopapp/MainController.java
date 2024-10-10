package com.desktopapp;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.binding.IntegerBinding;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class MainController {
    
    public static Scene CreateScene(Integer id) throws Exception
    {
        URL sceneUrl = MainController.class
            .getResource("MainScreen.fxml");
        FXMLLoader loader = new FXMLLoader(sceneUrl);
        Parent root = loader.load();
        Scene scene = new Scene(root);

        MainController controller = loader.getController();
        controller.setId(id);
        controller.btMain.setText(id.toString());
        
        return scene;
    }

    private Integer id;
    public void setId(Integer id) {
        this.id = id;
    }

    @FXML
    protected Button btMain;

    @FXML
    protected CheckBox cbMain;

    @FXML
    protected void corinhtihanhs(MouseEvent e) throws Exception
    {
        Stage crrStage = (Stage)btMain
            .getScene()
            .getWindow();
        
        Scene newScene = MainController.CreateScene(this.id + 1);
        crrStage.setScene(newScene);
    }
}
