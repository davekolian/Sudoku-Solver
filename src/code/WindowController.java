package code;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class WindowController implements Initializable {
    @FXML
    Button helpButton;

    @FXML
    Pane helpBox;

    @FXML
    GridPane box1;

    @FXML
    GridPane box2;

    @FXML
    GridPane box3;

    @FXML
    GridPane box4;

    @FXML
    GridPane box5;

    @FXML
    GridPane box6;

    @FXML
    GridPane box7;

    @FXML
    GridPane box8;

    @FXML
    GridPane box9;


    @FXML
    TextField u1;

    @FXML
    TextField u2;

    @FXML
    TextField u3;

    @FXML
    TextField u4;

    @FXML
    TextField u5;

    @FXML
    TextField u6;

    @FXML
    TextField u7;

    @FXML
    TextField u8;

    @FXML
    TextField u9;

    @FXML
    TextField u10;

    @FXML
    TextField u11;

    @FXML
    TextField u12;

    @FXML
    TextField u13;

    @FXML
    TextField u14;

    @FXML
    TextField u15;

    @FXML
    TextField u16;

    @FXML
    TextField u17;

    @FXML
    TextField u18;

    @FXML
    TextField u19;

    @FXML
    TextField u20;

    @FXML
    TextField u21;

    @FXML
    TextField u22;

    @FXML
    TextField u23;

    @FXML
    TextField u24;

    @FXML
    TextField u25;

    @FXML
    TextField u26;

    @FXML
    TextField u27;

    @FXML
    TextField u28;

    @FXML
    TextField u29;

    @FXML
    TextField u30;

    @FXML
    TextField u31;

    @FXML
    TextField u32;

    @FXML
    TextField u33;

    @FXML
    TextField u34;

    @FXML
    TextField u35;

    @FXML
    TextField u36;

    @FXML
    TextField u37;

    @FXML
    TextField u38;

    @FXML
    TextField u39;

    @FXML
    TextField u40;

    @FXML
    TextField u41;

    @FXML
    TextField u42;

    @FXML
    TextField u43;

    @FXML
    TextField u44;

    @FXML
    TextField u45;

    @FXML
    TextField u46;

    @FXML
    TextField u47;

    @FXML
    TextField u48;

    @FXML
    TextField u49;

    @FXML
    TextField u50;

    @FXML
    TextField u51;

    @FXML
    TextField u52;

    @FXML
    TextField u53;

    @FXML
    TextField u54;

    @FXML
    TextField u55;

    @FXML
    TextField u56;

    @FXML
    TextField u57;

    @FXML
    TextField u58;

    @FXML
    TextField u59;

    @FXML
    TextField u60;

    @FXML
    TextField u61;

    @FXML
    TextField u62;

    @FXML
    TextField u63;

    @FXML
    TextField u64;

    @FXML
    TextField u65;

    @FXML
    TextField u66;

    @FXML
    TextField u67;

    @FXML
    TextField u68;

    @FXML
    TextField u69;

    @FXML
    TextField u70;

    @FXML
    TextField u71;

    @FXML
    TextField u72;

    @FXML
    TextField u73;

    @FXML
    TextField u74;

    @FXML
    TextField u75;

    @FXML
    TextField u76;

    @FXML
    TextField u77;

    @FXML
    TextField u78;

    @FXML
    TextField u79;

    @FXML
    TextField u80;

    @FXML
    TextField u81;

    @FXML
    Text messageBox;

    static ArrayList<TextField> listOfCells = new ArrayList<>();
    boolean error = false;
    boolean solved = false;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        listOfCells.add(u1);
        listOfCells.add(u2);
        listOfCells.add(u3);
        listOfCells.add(u4);
        listOfCells.add(u5);
        listOfCells.add(u6);
        listOfCells.add(u7);
        listOfCells.add(u8);
        listOfCells.add(u9);
        listOfCells.add(u10);
        listOfCells.add(u11);
        listOfCells.add(u12);
        listOfCells.add(u13);
        listOfCells.add(u14);
        listOfCells.add(u15);
        listOfCells.add(u16);
        listOfCells.add(u17);
        listOfCells.add(u18);
        listOfCells.add(u19);
        listOfCells.add(u20);
        listOfCells.add(u21);
        listOfCells.add(u22);
        listOfCells.add(u23);
        listOfCells.add(u24);
        listOfCells.add(u25);
        listOfCells.add(u26);
        listOfCells.add(u27);
        listOfCells.add(u28);
        listOfCells.add(u29);
        listOfCells.add(u30);
        listOfCells.add(u31);
        listOfCells.add(u32);
        listOfCells.add(u33);
        listOfCells.add(u34);
        listOfCells.add(u35);
        listOfCells.add(u36);
        listOfCells.add(u37);
        listOfCells.add(u38);
        listOfCells.add(u39);
        listOfCells.add(u40);
        listOfCells.add(u41);
        listOfCells.add(u42);
        listOfCells.add(u43);
        listOfCells.add(u44);
        listOfCells.add(u45);
        listOfCells.add(u46);
        listOfCells.add(u47);
        listOfCells.add(u48);
        listOfCells.add(u49);
        listOfCells.add(u50);
        listOfCells.add(u51);
        listOfCells.add(u52);
        listOfCells.add(u53);
        listOfCells.add(u54);
        listOfCells.add(u55);
        listOfCells.add(u56);
        listOfCells.add(u57);
        listOfCells.add(u58);
        listOfCells.add(u59);
        listOfCells.add(u60);
        listOfCells.add(u61);
        listOfCells.add(u62);
        listOfCells.add(u63);
        listOfCells.add(u64);
        listOfCells.add(u65);
        listOfCells.add(u66);
        listOfCells.add(u67);
        listOfCells.add(u68);
        listOfCells.add(u69);
        listOfCells.add(u70);
        listOfCells.add(u71);
        listOfCells.add(u72);
        listOfCells.add(u73);
        listOfCells.add(u74);
        listOfCells.add(u75);
        listOfCells.add(u76);
        listOfCells.add(u77);
        listOfCells.add(u78);
        listOfCells.add(u79);
        listOfCells.add(u80);
        listOfCells.add(u81);

        for (TextField textField : listOfCells) {
            textField.textProperty().addListener(new ChangeListener<String>() {
                @Override
                public void changed(ObservableValue<? extends String> observableValue, String sOld, String sNew) {
                    if (!sNew.matches("\\d"))
                        textField.setText("");
                    else if (Integer.parseInt(sNew) == 0)
                        textField.setText("");
                    else {
                        constraintFunc(textField);
                    }
                }
            });
        }
    }

    @FXML
    private void clearTextField(Event event) {
        TextField tf = (TextField) event.getSource();
        tf.setText("");
    }

    private int countDigits() {
        int counter = 0;

        for (TextField textField : listOfCells) {
            if (!textField.getText().equals("")) counter++;
        }

        return counter;
    }


    @FXML
    private void solvePuzzle(Event event) {
        if (countDigits() < 17) {
            messageBox.setText("Few digits!");
            Color color = Color.rgb(255, 0, 0);
            messageBox.setFill(color);
        } else if (error) {
            messageBox.setText("You made a mistake!");
            Color color = Color.rgb(255, 0, 0);
            messageBox.setFill(color);
        } else {
            messageBox.setText("");
            int[][] puzzle = new int[9][9];
            int rowC = 0;
            int colC = 0;
            solved = true;
            for (TextField tf : listOfCells) {
                if (!tf.getText().equals("")) {
                    puzzle[colC][rowC] = Integer.parseInt(tf.getText());
                    tf.setStyle("-fx-text-inner-color: #000000; -fx-display-caret: false");
                } else {
                    puzzle[colC][rowC] = 0;
                    tf.setStyle("-fx-text-inner-color: #0000FF; -fx-display-caret: false");
                }
                if (rowC % 8 == 0 && rowC != 0) {
                    colC++;
                    rowC = 0;
                } else
                    rowC++;
            }

            State start = new State().start(puzzle);
            int answer = SudokuSolver.function(start);

            if (answer == 1) {
                messageBox.setText("Solved!");
                Color color = Color.rgb(0, 255, 0);
                messageBox.setFill(color);
            } else if (answer == -1) {
                messageBox.setText("Cannot be solved!");
                solved = false;
                Color color = Color.rgb(255, 0, 0);
                messageBox.setFill(color);
            }
        }

    }

    public static void fillPuzzle(State state) {
        int cellCounter = 0;

        for (TextField textField : listOfCells) {
            textField.setText(String.valueOf(state.getCells().get(cellCounter).getValue()));
            cellCounter++;
        }
    }

    @FXML
    private void clearPuzzle() {
        messageBox.setText("");
        solved = false;
        error = false;
        for (TextField textField : listOfCells) {
            textField.setText("");
        }
    }

    private void constraintFunc(TextField textField) {
        if (!solved) {
            int[] rowArray = getRowVals(textField);
            int[] colArray = getColVals(textField);
            int[] boxArray = getBoxVals(textField);
            int[] finalArray = new int[rowArray.length + colArray.length + boxArray.length];

            System.arraycopy(rowArray, 0, finalArray, 0, rowArray.length); //copies first array into new array
            System.arraycopy(colArray, 0, finalArray, rowArray.length, colArray.length);
            System.arraycopy(boxArray, 0, finalArray, rowArray.length + colArray.length, boxArray.length);

            for (Integer i : finalArray) {
                if (textField.getText().equals(listOfCells.get(i - 1).getText()) && textField != listOfCells.get(i - 1)) {
                    textField.setStyle("-fx-text-inner-color: #FF0000; -fx-display-caret: false");
                    error = true;
                    break;
                } else {
                    textField.setStyle("-fx-text-inner-color: #000000; -fx-display-caret: false");
                    error = false;
                    messageBox.setText("");
                }
            }
        }
    }

    private int[] getRowVals(TextField textField) {
        String id = textField.getId();
        int num = 0;
        int row = 1;
        int[] result = new int[9];
        if (id.length() == 2) num = Integer.parseInt(id.substring(1, 2));
        else if (id.length() == 3) num = Integer.parseInt(id.substring(1, 3));


        while (String.valueOf(num).length() >= 2) {
            num = num - 9;
            row++;
        }

        int start = 0;
        if (row != 1) start = 9 * (row - 1) + 1;
        else start = 1;
        for (int i = 0; i < result.length; i++) {
            result[i] = start + i;
        }

        return result;

    }

    private int[] getColVals(TextField textField) {
        String id = textField.getId();
        int[] result = new int[9];
        int col = 0;
        int count = 1;
        if (id.length() == 2) col = Integer.parseInt(id.substring(1, 2));
        else if (id.length() == 3) col = Integer.parseInt(id.substring(1, 3));
        int num = col;


        while (String.valueOf(col).length() >= 2) {
            col = col - 9;
            count++;
        }

        for (int i = 0; i < result.length; i++) {
            int val = col + (9 * (i));
            result[i] = val;
        }

        return result;

    }

    private int[] getBoxVals(TextField textField) {
        String id = textField.getId();
        int[] result = new int[9];
        int col = 0;
        int row = 1;
        int box = 0;
        int start = 0;
        if (id.length() == 2) col = Integer.parseInt(id.substring(1, 2));
        else if (id.length() == 3) col = Integer.parseInt(id.substring(1, 3));

        while (String.valueOf(col).length() >= 2) {
            col = col - 9;
            row++;
        }

        if ((row >= 1 && row <= 3) && (col >= 1 && col <= 3)) box = 1;
        if ((row >= 1 && row <= 3) && (col >= 4 && col <= 6)) box = 2;
        if ((row >= 1 && row <= 3) && (col >= 7 && col <= 9)) box = 3;
        if ((row >= 4 && row <= 6) && (col >= 1 && col <= 3)) box = 4;
        if ((row >= 4 && row <= 6) && (col >= 4 && col <= 6)) box = 5;
        if ((row >= 4 && row <= 6) && (col >= 7 && col <= 9)) box = 6;
        if ((row >= 7 && row <= 9) && (col >= 1 && col <= 3)) box = 7;
        if ((row >= 7 && row <= 9) && (col >= 4 && col <= 6)) box = 8;
        if ((row >= 7 && row <= 9) && (col >= 7 && col <= 9)) box = 9;

        switch (box) {
            case 1:
                start = 1;
                break;
            case 2:
                start = 4;
                break;
            case 3:
                start = 7;
                break;
            case 4:
                start = 28;
                break;
            case 5:
                start = 31;
                break;
            case 6:
                start = 34;
                break;
            case 7:
                start = 55;
                break;
            case 8:
                start = 58;
                break;
            case 9:
                start = 61;
                break;
        }

        int j = 0;

        for (int i = 0; i < result.length; i++) {
            int val = start + j;
            if (j == 2) j = 9;
            else if (j == 11) j = 18;
            else j++;

            result[i] = val;
        }

        return result;

    }

    @FXML
    public void helpButton(MouseEvent event) {
        if (event.getEventType() == MouseEvent.MOUSE_ENTERED) {
            helpBox.setVisible(true);
            helpBox.setLayoutX(event.getSceneX() - helpBox.getWidth());
        } else if (event.getEventType() == MouseEvent.MOUSE_EXITED) {
            helpBox.setVisible(false);
        }
    }

    @FXML
    public void demoButton(Event event) {
        int counter = 0;
        int[][] input = {{8, 0, 0, 0, 0, 0, 0, 0, 0}, //Hardest puzzle ever
                {0, 0, 3, 6, 0, 0, 0, 0, 0},
                {0, 7, 0, 0, 9, 0, 2, 0, 0},
                {0, 5, 0, 0, 0, 7, 0, 0, 0},
                {0, 0, 0, 0, 4, 5, 7, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 3, 0},
                {0, 0, 1, 0, 0, 0, 0, 6, 8},
                {0, 0, 8, 5, 0, 0, 0, 1, 0},
                {0, 9, 0, 0, 0, 0, 4, 0, 0}};

        for(int i = 0; i < input[0].length; i++){
            for(int j = 0; j < input[0].length; j++){
                if(input[i][j] != 0) listOfCells.get(counter).setText(String.valueOf(input[i][j]));
                else listOfCells.get(counter).setText("");

                counter++;
            }
        }
    }
}
