package sample;

import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import javax.swing.*;

public class Form {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField nameStationField;

    @FXML
    private TextField KuStationField;

    @FXML
    private TextField sensitivityField;

    @FXML
    private TextField MaxPowerField;



    @FXML
    void newButtonSaveStation(ActionEvent event) {

        String name = nameStationField.getText();
        String ku = KuStationField.getText();
        String se = sensitivityField.getText();
        String maxPower = MaxPowerField.getText();

        try {
            FileWriter writer = new FileWriter("station.txt");
            writer.write(" Название станции : " + name + "\n");
            writer.write(" КУ антенны, дб : " + ku + "\n");
            writer.write(" Чувствительность приёмника, дбм : " + se + "\n");
            writer.write(" Макс. мощность ПРД, дбм : " + maxPower + "\n");
            writer.close();
            JOptionPane.showMessageDialog(null," Успех ");

        }catch (Exception e){

            JOptionPane.showMessageDialog(null," Ошибка ");
        }

    }

    @FXML
    void initialize() {
        assert nameStationField != null : "fx:id=\"nameStationField\" was not injected: check your FXML file 'Form.fxml'.";
        assert KuStationField != null : "fx:id=\"KuStationField\" was not injected: check your FXML file 'Form.fxml'.";
        assert sensitivityField != null : "fx:id=\"sensitivityField\" was not injected: check your FXML file 'Form.fxml'.";
        assert MaxPowerField != null : "fx:id=\"MaxPowerField\" was not injected: check your FXML file 'Form.fxml'.";


    }


}
