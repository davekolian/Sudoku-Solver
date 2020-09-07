package code;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sudokuWindow.fxml"));
        stage.setTitle("Sudoku Solver");
        stage.setScene(new Scene(root, 550, 750));
        stage.show();
    }

    public static void main(String[] args){
        launch(args);
        //code.SudokuSolver.main(args);
    }
}
