package org.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;



import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //int dis = 0, sp = 0;

        GridPane root = new GridPane();
        primaryStage.setTitle("Time");
        primaryStage.setScene(new Scene(root, 780, 275));

        root.setPadding(new Insets(10,10,10,10));
        root.setHgap(5);
        root.setVgap(5);

        TextField distance = createTextDistance(root);          //first TextField "Distance"
        TextField speed = createTextSpeed(root);                //second TextField "Speed"

        Label labelDistance = createLabelDistance(root);        // label distance
        Label labelSpeed = createLabelSpeed(root);              // label speed
        Label labelPTime = createLabelPTime(root);               // label passing time
        Label timeLabel = createTimeLabel(root);                 // label time

        addButton(root, distance, speed, timeLabel);

        primaryStage.show();
    }

    TextField createTextDistance(GridPane root){
        TextField distance = new TextField();
        distance.setPromptText("distance");
        GridPane.setConstraints(distance,11,10);
        root.getChildren().add(distance);
        return distance;
    }

    TextField createTextSpeed(GridPane root){
        TextField speed = new TextField();
        speed.setPromptText("speed");
        GridPane.setConstraints(speed,50,10);
        root.getChildren().add(speed);
        return speed;
    }

    Label createLabelDistance(GridPane root){
        Label labelDistance = new Label();
        GridPane.setConstraints(labelDistance, 10, 10);
        labelDistance.setText("Расстояние");
        labelDistance.setPrefSize(80,20);
        root.getChildren().add(labelDistance);
        return labelDistance;
    }

    Label createLabelSpeed(GridPane root){
        Label labelSpeed = new Label();
        GridPane.setConstraints(labelSpeed, 35, 10);
        labelSpeed.setText("Скорость");
        labelSpeed.setPrefSize(130,20);
        root.getChildren().add(labelSpeed);
        return labelSpeed;
    }

    Label createLabelPTime(GridPane root){
        Label labelPTime = new Label();
        GridPane.setConstraints(labelPTime, 10, 20);
        labelPTime.setText("Время прохождения");
        labelPTime.setPrefSize(210,20);
        root.getChildren().add(labelPTime);
        return labelPTime;
    }

    Label createTimeLabel(GridPane root){
        Label timeLabel = new Label();
        GridPane.setConstraints(timeLabel, 20, 20);
        //timeLabel.setText("Время прохождения");
        timeLabel.setPrefSize(120,20);
        root.getChildren().add(timeLabel);
        return timeLabel;
    }
    void addButton(GridPane root, TextField distance, TextField speed, Label timeLabel){
        // button
        Button button = new Button();
        GridPane.setConstraints(button, 50, 20);
        button.setText("Посчитать");
        button.setPrefSize(140,20);
        button.setOnAction(event -> {
            float dis = Float.parseFloat(distance.getText());
            float sp = Float.parseFloat(speed.getText());
            float time1 = dis / sp;
            String str = Float.toString(time1);
            timeLabel.setText(str);
        });
        root.getChildren().add(button);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
