package pl.mp3_player.controler;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Slider;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleButton;
import javafx.scene.input.MouseDragEvent;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Button prevButton;

    @FXML
    private ToggleButton playButton;

    @FXML
    private Button nextButton;

    @FXML
    private Slider volumeSlider;

    @FXML
    private Slider songSlider;

    @FXML
    private TableView<?> contentTable;

    @FXML
    private Menu fileMenu;

    @FXML
    private MenuItem fileMenuItem;

    @FXML
    private MenuItem dirMenuItem;

    @FXML
    private MenuItem closeMenuItem;

    @FXML
    private MenuItem aboutMenuItem;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        configureButtons();
        configureVolume();

    }

    private void configureButtons() {
        volumeSlider.addEventFilter(MouseDragEvent.MOUSE_PRESSED, new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent event) {
                System.out.println("Wciśnięto przycisk suwaku głośności");
            }
        });
    }

    private void configureVolume() {
        prevButton.setOnAction(new EventHandler<javafx.event.ActionEvent>() {
            @Override
            public void handle(javafx.event.ActionEvent event) {
                System.out.println("Poprzednia piosenka");
            }
        });
        nextButton.setOnAction(new EventHandler<javafx.event.ActionEvent>() {
            @Override
            public void handle(javafx.event.ActionEvent event) {
                System.out.println("Następna piosenka");
            }
        });
        playButton.setOnAction(new EventHandler<javafx.event.ActionEvent>() {
            @Override
            public void handle(javafx.event.ActionEvent event) {
                if (playButton.isSelected()){
                    System.out.println("Play");
                }else{
                    System.out.println("Stop");
                }
            }
        });
    }

}


