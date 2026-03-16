// Sara White - Assignment 11.2 - CSD-402 //

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class ExampleProgram extends Application {

    @Override
    public void start(Stage stage) {

        // Create labels and text fields //
        Label songLabel = new Label("Song Title:");
        TextField songField = new TextField();

        Label artistLabel = new Label("Artist:");
        TextField artistField = new TextField();

        // Create buttons //
        Button addButton = new Button("Add Song");
        Button clearButton = new Button("Clear");

        // HBox arranges buttons horizontally //
        HBox buttonBox = new HBox(10);
        buttonBox.getChildren().addAll(addButton, clearButton);

        // VBox arranges components vertically //

        VBox root = new VBox(10);
        root.getChildren().addAll(songLabel, songField, artistLabel, artistField, buttonBox);

        Scene scene = new Scene(root, 300, 200);

        stage.setTitle("JavaFX VBox and HBox Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }