package pl.mp3_player.controler;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Slider;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleButton;

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

    }
}


