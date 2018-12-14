package ua.miratech.koroban;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
/**
 * Created by Elena on 27.11.2018.
 */
public class BoardController {

    @FXML private Label diceSideLabelFirst;
    @FXML private Label diceSideLabelSecond;
    Feodal feodalGame;

    @FXML protected void changeBoardLabel(ActionEvent event)
    {
        String labelText = "n/a";
        switch (feodalGame.firstDice.rollDice()){
            case ONE:   labelText = "One";
                break;
            case TWO:   labelText = "Two";
                break;
            case THREE: labelText = "Three";
                break;
            case FOUR:  labelText = "Four";
                break;
            case FIVE:  labelText = "Five";
                break;
            case SIX:   labelText = "Six";
                break;
        }
        diceSideLabelFirst.setText(labelText);

        switch (feodalGame.secondDice.rollDice()){
            case ONE:   labelText = "One";
                break;
            case TWO:   labelText = "Two";
                break;
            case THREE: labelText = "Three";
                break;
            case FOUR:  labelText = "Four";
                break;
            case FIVE:  labelText = "Five";
                break;
            case SIX:   labelText = "Six";
                break;
        }
        diceSideLabelSecond.setText(labelText);
    }

    public void setFeodalGame(Feodal feodalGame)
    {
        this.feodalGame = feodalGame;
    }
}
