package org.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;



import javafx.application.Application;
//import javafx.fxml.FXMLLoader;
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

        //first TextField "Distance"
        root.setPadding(new Insets(10,10,10,10));
        root.setHgap(5);
        root.setVgap(5);
        TextField distance = new TextField();
        distance.setPromptText("distance");
        GridPane.setConstraints(distance,11,10);
        root.getChildren().add(distance);

        //second TextField "Speed"
        TextField speed = new TextField();
        speed.setPromptText("speed");
        GridPane.setConstraints(speed,50,10);
        root.getChildren().add(speed);

        // label distance
        Label label = new Label();
        GridPane.setConstraints(label, 10, 10);
        label.setText("Расстояние");
        label.setPrefSize(80,20);
        root.getChildren().add(label);

        // label speed
        Label label1 = new Label();
        GridPane.setConstraints(label1, 35, 10);
        label1.setText("Скорость");
        label1.setPrefSize(130,20);
        root.getChildren().add(label1);

        // label passing time
        Label label3 = new Label();
        GridPane.setConstraints(label3, 10, 20);
        label3.setText("Время прохождения");
        label3.setPrefSize(210,20);
        root.getChildren().add(label3);

        // label time
        Label label4 = new Label();
        GridPane.setConstraints(label4, 20, 20);
        //label4.setText("Время прохождения");
        label4.setPrefSize(120,20);
        root.getChildren().add(label4);

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
            label4.setText(str);
        });
        root.getChildren().add(button);

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
