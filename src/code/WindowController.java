package code;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
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
    TextField v1;

    @FXML
    TextField v2;

    @FXML
    TextField v3;

    @FXML
    TextField v4;

    @FXML
    TextField v5;

    @FXML
    TextField v6;

    @FXML
    TextField v7;

    @FXML
    TextField v8;

    @FXML
    TextField v9;

    @FXML
    TextField v10;

    @FXML
    TextField v11;

    @FXML
    TextField v12;

    @FXML
    TextField v13;

    @FXML
    TextField v14;

    @FXML
    TextField v15;

    @FXML
    TextField v16;

    @FXML
    TextField w1;

    @FXML
    TextField w2;

    @FXML
    TextField w3;

    @FXML
    TextField w4;

    @FXML
    TextField w5;

    @FXML
    TextField w6;

    @FXML
    TextField w7;

    @FXML
    TextField w8;

    @FXML
    TextField w9;

    @FXML
    TextField w10;

    @FXML
    TextField w11;

    @FXML
    TextField w12;

    @FXML
    TextField w13;

    @FXML
    TextField w14;

    @FXML
    TextField w15;

    @FXML
    TextField w16;

    @FXML
    TextField w17;

    @FXML
    TextField w18;

    @FXML
    TextField w19;

    @FXML
    TextField w20;

    @FXML
    TextField w21;

    @FXML
    TextField w22;

    @FXML
    TextField w23;

    @FXML
    TextField w24;

    @FXML
    TextField w25;

    @FXML
    TextField w26;

    @FXML
    TextField w27;

    @FXML
    TextField w28;

    @FXML
    TextField w29;

    @FXML
    TextField w30;

    @FXML
    TextField w31;

    @FXML
    TextField w32;

    @FXML
    TextField w33;

    @FXML
    TextField w34;

    @FXML
    TextField w35;

    @FXML
    TextField w36;

    @FXML
    Text messageBox;

    @FXML
    ComboBox<String> puzzleCombo;

    @FXML
    Pane gridOne; //3x3

    @FXML
    Pane gridTwo; //2x2

    @FXML
    Pane gridThree; // 2x3

    public static ArrayList<TextField> listOfCells = new ArrayList<>();
    boolean error = false;
    boolean solved = false;
    int type = 1;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        puzzleCombo.setPromptText("3x3");
        gridOne.setVisible(true);

        System.out.println(((GridPane) (gridOne.getChildren().get(0))).getChildren().get(1).getId());
        System.out.println(gridOne.getChildren().size());
        int col = 0;
        int row = 0;
        int next = 0;

        checkType();

        puzzleCombo.getItems().setAll("3x3", "2x3", "2x2");

        puzzleCombo.getSelectionModel().selectedItemProperty().addListener((options, old, newVal) -> {
            if (newVal.equals("3x3")) {
                type = 1;
                checkType();
            } else if (newVal.equals("2x2")) {
                type = 2;
                checkType();
            } else {
                type = 3;
                checkType();
            }

        });


    }

    public void checkType() {
        if (type == 1) {
            System.out.println("here");
            gridTwo.setVisible(false);
            gridThree.setVisible(false);
            gridOne.setVisible(true);
            type = 1;

            clearPuzzle();
            listOfCells.clear();

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
        } else if (type == 2) {
            gridOne.setVisible(false);
            gridThree.setVisible(false);
            gridTwo.setVisible(true);
            type = 2;

            System.out.println("added");

            clearPuzzle();
            listOfCells.clear();

            listOfCells.add(v1);
            listOfCells.add(v2);
            listOfCells.add(v3);
            listOfCells.add(v4);
            listOfCells.add(v5);
            listOfCells.add(v6);
            listOfCells.add(v7);
            listOfCells.add(v8);
            listOfCells.add(v9);
            listOfCells.add(v10);
            listOfCells.add(v11);
            listOfCells.add(v12);
            listOfCells.add(v13);
            listOfCells.add(v14);
            listOfCells.add(v15);
            listOfCells.add(v16);
        } else {
            gridOne.setVisible(false);
            gridTwo.setVisible(false);
            gridThree.setVisible(true);
            type = 3;

            clearPuzzle();
            listOfCells.clear();

            listOfCells.add(w1);
            listOfCells.add(w2);
            listOfCells.add(w3);
            listOfCells.add(w4);
            listOfCells.add(w5);
            listOfCells.add(w6);
            listOfCells.add(w7);
            listOfCells.add(w8);
            listOfCells.add(w9);
            listOfCells.add(w10);
            listOfCells.add(w11);
            listOfCells.add(w12);
            listOfCells.add(w13);
            listOfCells.add(w14);
            listOfCells.add(w15);
            listOfCells.add(w16);
            listOfCells.add(w17);
            listOfCells.add(w18);
            listOfCells.add(w19);
            listOfCells.add(w20);
            listOfCells.add(w21);
            listOfCells.add(w22);
            listOfCells.add(w23);
            listOfCells.add(w24);
            listOfCells.add(w25);
            listOfCells.add(w26);
            listOfCells.add(w27);
            listOfCells.add(w28);
            listOfCells.add(w29);
            listOfCells.add(w30);
            listOfCells.add(w31);
            listOfCells.add(w32);
            listOfCells.add(w33);
            listOfCells.add(w34);
            listOfCells.add(w35);
            listOfCells.add(w36);

        }

        for (TextField textField : listOfCells) {
            textField.textProperty().addListener(new ChangeListener<String>() {
                @Override
                public void changed(ObservableValue<? extends String> observableValue, String sOld, String sNew) {
                    if (!sNew.matches("\\d"))
                        textField.setText("");
                    else if (Integer.parseInt(sNew) == 0)
                        textField.setText("");
                    else if (type == 2 && Integer.parseInt(sNew) > 4)
                        textField.setText("");
                    else if (type == 3 && Integer.parseInt(sNew) > 6)
                        textField.setText("");
                    else
                        constraintFunc(textField);
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
        if (type == 1) {
            if (countDigits() < 22 && !error) {
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
                int answer = SudokuSolver.startSolutionCheck(start);

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
        } else if (type == 2) {
            if (countDigits() < 4) {
                messageBox.setText("Few digits!");
                Color color = Color.rgb(255, 0, 0);
                messageBox.setFill(color);
            } else if (error) {
                messageBox.setText("You made a mistake!");
                Color color = Color.rgb(255, 0, 0);
                messageBox.setFill(color);
            } else {
                messageBox.setText("");
                int[][] puzzle = new int[4][4];
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
                    if (rowC % 3 == 0 && rowC != 0) {
                        colC++;
                        rowC = 0;
                    } else
                        rowC++;
                }

                State start = new State().start(puzzle);
                int answer = SudokuSolver.startSolutionCheck(start);

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
        } else {

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
        int maxDigits = 0;
        if (type == 1) {
            maxDigits = 9;
        } else if (type == 2) {
            maxDigits = 4;
        } else {
            maxDigits = 6;
        }

        String id = textField.getId();
        int num = 0;
        int row = 1;
        int[] result = new int[maxDigits];
        if (id.length() == 2) num = Integer.parseInt(id.substring(1, 2));
        else if (id.length() == 3) num = Integer.parseInt(id.substring(1, 3));

        while ((num - 1) % maxDigits != 0) {
            num -= 1;
        }

        int start = 0;

        for (int i = 0; i < result.length; i++) {
            result[i] = num + start;
            start++; //no need for if cause loop will break when it reaches maxDigits
        }

        return result;
    }

    private int[] getColVals(TextField textField) {
        int maxDigits = 0;
        if (type == 1) {
            maxDigits = 9;
        } else if (type == 2) {
            maxDigits = 4;
        } else {
            maxDigits = 6;
        }

        String id = textField.getId();
        int[] result = new int[maxDigits];
        int start = 0;
        int num = 0;
        if (id.length() == 2) num = Integer.parseInt(id.substring(1, 2));
        else if (id.length() == 3) num = Integer.parseInt(id.substring(1, 3));

        while (num > maxDigits) {
            num -= maxDigits;
        }

        for (int i = 0; i < result.length; i++) {
            result[i] = num + start;
            start += maxDigits;
        }

        return result;

    }

    private int[] getBoxVals(TextField textField) {
        int maxDigits = 0;
        if (type == 1) {
            maxDigits = 9;
        } else if (type == 2) {
            maxDigits = 4;
        } else {
            maxDigits = 6;
        }

        String id = textField.getId();
        int[] result = new int[maxDigits];
        int col = 0;
        int row = 1;
        int box = 0;
        int start = 0;
        if (id.length() == 2) col = Integer.parseInt(id.substring(1, 2));
        else if (id.length() == 3) col = Integer.parseInt(id.substring(1, 3));

        while (String.valueOf(col).length() >= 2) {
            col = col - maxDigits;
            row++;
        }

        String temp = textField.getParent().getId();
        box = Integer.parseInt(temp.substring(4, 5));

        if (type == 1) {
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
        } else if (type == 2) {
            switch (box) {
                case 1:
                    start = 1;
                    break;
                case 2:
                    start = 3;
                    break;
                case 3:
                    start = 9;
                    break;
                case 4:
                    start = 11;
                    break;
            }

            int j = 0;

            for (int i = 0; i < result.length; i++) {
                int val = start + j;
                if (j == 1) j = 4;
                else j++;

                result[i] = val;
            }
        } else {
            switch (box) {
                case 1:
                    start = 1;
                    break;
                case 2:
                    start = 4;
                    break;
                case 3:
                    start = 13;
                    break;
                case 4:
                    start = 16;
                    break;
                case 5:
                    start = 25;
                    break;
                case 6:
                    start = 28;
                    break;
            }

            int j = 0;

            for (int i = 0; i < result.length; i++) {
                int val = start + j;
                if (j == 2) j = 6;
                else j++;

                result[i] = val;
            }
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

        for (int i = 0; i < input[0].length; i++) {
            for (int j = 0; j < input[0].length; j++) {
                if (input[i][j] != 0) listOfCells.get(counter).setText(String.valueOf(input[i][j]));
                else listOfCells.get(counter).setText("");

                counter++;
            }
        }
    }

}
