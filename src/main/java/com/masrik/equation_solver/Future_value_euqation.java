package com.masrik.equation_solver;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Future_value_euqation extends Application {
    static TextField text_field_N;
    static TextField text_field_R;
    static TextField text_field_PV;
    static TextField text_field_FV;


    @Override
    public void start(Stage stage) {
        //creating label email
        Text text1 = new Text("N");

        //creating label password
        Text text2 = new Text("R");

        //creating label email
        Text text3 = new Text("PV");

        //creating label password
        Text text4 = new Text("FV");

        //Creating Text Filed for email
        text_field_N = new TextField();

        //Creating Text Filed for password
        text_field_R = new TextField();

        //Creating Text Filed for email
        text_field_PV = new TextField();

        //Creating Text Filed for password
        text_field_FV = new TextField();

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
        gridPane.add(text_field_N, 1, 0);

        gridPane.add(text2, 0, 1);
        gridPane.add(text_field_R, 1, 1);

        gridPane.add(text3, 0, 2);
        gridPane.add(text_field_PV, 1, 2);

        gridPane.add(text4, 0, 3);
        gridPane.add(text_field_FV, 1, 3);

        gridPane.add(button1, 0, 5);
        gridPane.add(button2, 1, 5);

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
        String val = "";
        int _case = 0;
        if ( !(text_field_N.getText().trim().equals("")) &&
                !(text_field_R.getText().trim().equals("")) &&
                !(text_field_PV.getText().trim().equals("")) ){
            _case = 1;
        }

        else if ( !(text_field_N.getText().trim().equals("")) &&
                !(text_field_R.getText().trim().equals("")) &&
                !(text_field_PV.getText().trim().equals("")) ){
            _case = 2;
        }

        else if ( !(text_field_N.getText().trim().equals("")) &&
                !(text_field_R.getText().trim().equals("")) &&
                !(text_field_PV.getText().trim().equals("")) ){
            _case = 3;
        }

        else if ( !(text_field_N.getText().trim().equals("")) &&
                !(text_field_R.getText().trim().equals("")) &&
                !(text_field_PV.getText().trim().equals("")) ){
            _case = 4;
        }

        switch(_case) {
            case 1:
                // code block
                break;
            case 2:
                // code block
                break;
            case 3:
                // code block
                break;
            case 4:
                // code block
                break;
            default:
                // code block
        }



    }
}
