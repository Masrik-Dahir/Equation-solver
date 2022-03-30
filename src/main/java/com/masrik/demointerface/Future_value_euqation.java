package com.masrik.demointerface;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Future_value_euqation extends Application {
    static TextField textField1;


    @Override
    public void start(Stage stage) {
        //creating label email
        Text text1 = new Text("N");

        //creating label password
        Text text2 = new Text("1/Y");

        //creating label email
        Text text3 = new Text("PV");

        //creating label password
        Text text4 = new Text("FV");

        //creating label password
        Text decimal = new Text("5");

        //Creating Text Filed for email
        textField1 = new TextField();

        //Creating Text Filed for password
        TextField textField2 = new TextField();

        //Creating Text Filed for email
        TextField textField3 = new TextField();

        //Creating Text Filed for password
        TextField textField4 = new TextField();

        //Creating Buttons
        Button button1 = new Button("Submit");
        Button button2 = new Button("Clear");

        //Creating a Grid Pane
        GridPane gridPane = new GridPane();

        //Setting size for the pane
        gridPane.setMinSize(400, 200);

        //Setting the padding
        gridPane.setPadding(new Insets(10, 10, 10, 10));

        //Setting the vertical and horizontal gaps between the columns
        gridPane.setVgap(5);
        gridPane.setHgap(5);

        //Setting the Grid alignment
        gridPane.setAlignment(Pos.CENTER);

        //Arranging all the nodes in the grid
        gridPane.add(text1, 0, 0);
        gridPane.add(textField1, 1, 0);

        gridPane.add(text2, 0, 1);
        gridPane.add(textField2, 1, 1);

        gridPane.add(text3, 0, 2);
        gridPane.add(textField3, 1, 2);

        gridPane.add(text4, 0, 3);
        gridPane.add(textField4, 1, 3);

        gridPane.add(button1, 0, 4);
        gridPane.add(button2, 1, 4);

        //Styling nodes
        button1.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
        button2.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");

        text1.setStyle("-fx-font: normal bold 20px 'serif' ");
        text2.setStyle("-fx-font: normal bold 20px 'serif' ");
        text3.setStyle("-fx-font: normal bold 20px 'serif' ");
        text4.setStyle("-fx-font: normal bold 20px 'serif' ");


        gridPane.setStyle("-fx-background-color: BEIGE;");

        //Creating a scene object
        Scene scene = new Scene(gridPane);

        //Setting title to the Stage
        stage.setTitle("Future Value");

        //Adding scene to the stage
        stage.setScene(scene);

        //Displaying the contents of the stage
        stage.show();

        button1.setOnAction(e -> Future_value_euqation.calc());


    }
    public static void main(String args[]){
        launch(args);
    }

    public static void calc(){
        textField1.setText("34");
    }
}
