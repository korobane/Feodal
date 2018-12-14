package ua.miratech.koroban;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;

import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.io.IOException;


public class Feodal extends Application
{
    private Stage rootStage;
    private BorderPane rootView;
    private BorderPane boardView;
    protected Dice firstDice;
    protected Dice secondDice;

    @Override
    public void start(Stage rootStage) throws Exception
    {
        this.rootStage = rootStage;
        rootStage.setTitle("Feodal game");
        initRootView();
        initBoardView();
        rootView.setCenter(boardView);

        showScene();
    }


    public void initRootView()
    {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Feodal.class.getResource("RootView.fxml"));
            rootView = (BorderPane) loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void initBoardView()
    {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Feodal.class.getResource("BoardView.fxml"));
            boardView = (BorderPane) loader.load();
            BoardController boardController = loader.getController();
            createDices();
            boardController.setFeodalGame(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void showScene()
    {
        Scene rootScene = new Scene(rootView);
        rootStage.setScene(rootScene);

        rootStage.show();

    }

    public void createDices ()
    {
        this.firstDice = new Dice();
        this.secondDice = new Dice();
    }

    public static void main( String[] args) throws Exception
    {

        launch(args);


    }

}
