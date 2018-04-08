package pl.mp3_player.main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        final String appName = "Mp3Player v0.1";
        try {
            BorderPane root = new BorderPane();
            Scene scene = new Scene(root,400,400);
            primaryStage.setTitle(appName);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}