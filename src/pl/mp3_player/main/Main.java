package pl.mp3_player.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        final String appName = "Mp3Player v0.2";
        Parent parent = FXMLLoader.load(getClass().getResource("/pl/mp3_player/view/Player.fxml"));
        Scene scene = new Scene(parent);
        primaryStage.setTitle(appName);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}