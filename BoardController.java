package ua.miratech.koroban;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
/**
 * Created by Elena on 27.11.2018.
 */
public class BoardController {

    @FXML private Label diceSide;

    @FXML protected void changeBoardLabel(ActionEvent event)
    {

        diceSide.setText("New text");
    }
}
