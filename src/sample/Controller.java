package sample;

import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class Controller {


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private MenuItem CreateProject;

    @FXML
    private MenuItem OpenProject;

    @FXML
    private MenuItem SaveProject;

    @FXML
    private MenuItem exit;

    @FXML
    private MenuItem createStation;

    @FXML
    private MenuItem RedactStation;

    @FXML
    private MenuItem deleteStation;

    @FXML
    void newCreateMethod(ActionEvent event) {
        System.out.println("Создать");

    }

    @FXML
    void newCreateStation(ActionEvent event) {

    }

    @FXML
    void newDelStation(ActionEvent event) {
        System.out.println("Удалить Станцию");
    }

    @FXML
    void newExitMethod(ActionEvent event) {
        System.out.println("Выйти");
    }

    @FXML
    void newOpenMethod(ActionEvent event) {
        System.out.println("Открыть");
    }

    @FXML
    void newRedStation(ActionEvent event) {
        System.out.println("Редактировать станцию");
    }

    @FXML
    void newSaveMethod(ActionEvent event) {
        System.out.println("Сохранить");
    }

    @FXML
    void initialize() {
        assert CreateProject != null : "fx:id=\"CreateProject\" was not injected: check your FXML file 'sample.fxml'.";
        assert OpenProject != null : "fx:id=\"OpenProject\" was not injected: check your FXML file 'sample.fxml'.";
        assert SaveProject != null : "fx:id=\"SaveProject\" was not injected: check your FXML file 'sample.fxml'.";
        assert exit != null : "fx:id=\"exit\" was not injected: check your FXML file 'sample.fxml'.";
        assert createStation != null : "fx:id=\"createStation\" was not injected: check your FXML file 'sample.fxml'.";
        assert RedactStation != null : "fx:id=\"RedactStation\" was not injected: check your FXML file 'sample.fxml'.";
        assert deleteStation != null : "fx:id=\"deleteStation\" was not injected: check your FXML file 'sample.fxml'.";



        createStation.setOnAction(event -> {

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/Form.fxml"));

            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.showAndWait();


        });





    }
}
