package code;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application{
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sudokuWindow.fxml"));
        stage.setTitle("Sudoku Solver");
        stage.setScene(new Scene(root, 635, 610));
        stage.getIcons().add(new Image(Main.class.getResourceAsStream("sudoku.png")));
        stage.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}
