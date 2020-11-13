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
import java.sql.Time;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

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
    TextField x1;

    @FXML
    TextField x2;

    @FXML
    TextField x3;

    @FXML
    TextField x4;

    @FXML
    TextField x5;

    @FXML
    TextField x6;

    @FXML
    TextField x7;

    @FXML
    TextField x8;

    @FXML
    TextField x9;

    @FXML
    TextField x10;

    @FXML
    TextField x11;

    @FXML
    TextField x12;

    @FXML
    TextField x13;

    @FXML
    TextField x14;

    @FXML
    TextField x15;

    @FXML
    TextField x16;

    @FXML
    TextField x17;

    @FXML
    TextField x18;

    @FXML
    TextField x19;

    @FXML
    TextField x20;

    @FXML
    TextField x21;

    @FXML
    TextField x22;

    @FXML
    TextField x23;

    @FXML
    TextField x24;

    @FXML
    TextField x25;

    @FXML
    TextField x26;

    @FXML
    TextField x27;

    @FXML
    TextField x28;

    @FXML
    TextField x29;

    @FXML
    TextField x30;

    @FXML
    TextField x31;

    @FXML
    TextField x32;

    @FXML
    TextField x33;

    @FXML
    TextField x34;

    @FXML
    TextField x35;

    @FXML
    TextField x36;

    @FXML
    TextField x37;

    @FXML
    TextField x38;

    @FXML
    TextField x39;

    @FXML
    TextField x40;

    @FXML
    TextField x41;

    @FXML
    TextField x42;

    @FXML
    TextField x43;

    @FXML
    TextField x44;

    @FXML
    TextField x45;

    @FXML
    TextField x46;

    @FXML
    TextField x47;

    @FXML
    TextField x48;

    @FXML
    TextField x49;

    @FXML
    TextField x50;

    @FXML
    TextField x51;

    @FXML
    TextField x52;

    @FXML
    TextField x53;

    @FXML
    TextField x54;

    @FXML
    TextField x55;

    @FXML
    TextField x56;

    @FXML
    TextField x57;

    @FXML
    TextField x58;

    @FXML
    TextField x59;

    @FXML
    TextField x60;

    @FXML
    TextField x61;

    @FXML
    TextField x62;

    @FXML
    TextField x63;

    @FXML
    TextField x64;

    @FXML
    TextField x65;

    @FXML
    TextField x66;

    @FXML
    TextField x67;

    @FXML
    TextField x68;

    @FXML
    TextField x69;

    @FXML
    TextField x70;

    @FXML
    TextField x71;

    @FXML
    TextField x72;

    @FXML
    TextField x73;

    @FXML
    TextField x74;

    @FXML
    TextField x75;

    @FXML
    TextField x76;

    @FXML
    TextField x77;

    @FXML
    TextField x78;

    @FXML
    TextField x79;

    @FXML
    TextField x80;

    @FXML
    TextField x81;

    @FXML
    Text messageBox;

    @FXML
    Text timeBox;

    @FXML
    ComboBox<String> puzzleCombo;

    @FXML
    Pane gridOne; //3x3

    @FXML
    Pane gridTwo; //2x2

    @FXML
    Pane gridThree; //2x3

    @FXML
    Pane gridFour; //X-Sudoku

    public static ArrayList<TextField> listOfCells = new ArrayList<>();
    boolean error = false;
    boolean solved = false;
    int type = 1;
    TextField[] arrayOfGray = new TextField[17];

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        puzzleCombo.setPromptText("3x3");
        gridOne.setVisible(true);

        //System.out.println(((GridPane) (gridOne.getChildren().get(0))).getChildren().get(1).getId());
        //System.out.println(gridOne.getChildren().size());
        checkType();

        puzzleCombo.getItems().setAll("3x3", "2x3", "2x2", "X-Sudoku");
        puzzleCombo.getSelectionModel().selectedItemProperty().addListener((options, old, newVal) -> {
            if (newVal.equals("3x3")) {
                type = 1;
                checkType();
            } else if (newVal.equals("2x2")) {
                type = 2;
                checkType();
            } else if (newVal.equals("2x3")) {
                type = 3;
                checkType();
            } else {
                type = 4;
                // = {x1, x11, x21, x31, x41, x51, x61, x71, x81, x9, x17, x25, x33, x49, x57, x65, x73};
                arrayOfGray[0] = x1;
                arrayOfGray[1] = x11;
                arrayOfGray[2] = x21;
                arrayOfGray[3] = x31;
                arrayOfGray[4] = x41;
                arrayOfGray[5] = x51;
                arrayOfGray[6] = x61;
                arrayOfGray[7] = x71;
                arrayOfGray[8] = x81;
                arrayOfGray[9] =  x9;
                arrayOfGray[10] = x17;
                arrayOfGray[11] = x25;
                arrayOfGray[12] = x33;
                arrayOfGray[13] = x49;
                arrayOfGray[14] = x57;
                arrayOfGray[15] = x65;
                arrayOfGray[16] = x73;


                checkType();
            }

        });

    }

    public void checkType() {
        if (type == 1) {
            gridTwo.setVisible(false);
            gridThree.setVisible(false);
            gridFour.setVisible(false);
            gridOne.setVisible(true);

            puzzleCombo.setPrefWidth(68);
            puzzleCombo.setLayoutX(553);

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
            gridFour.setVisible(false);
            gridTwo.setVisible(true);

            puzzleCombo.setPrefWidth(68);
            puzzleCombo.setLayoutX(553);

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
        } else if (type == 3) {
            gridOne.setVisible(false);
            gridTwo.setVisible(false);
            gridFour.setVisible(false);
            gridThree.setVisible(true);

            puzzleCombo.setPrefWidth(68);
            puzzleCombo.setLayoutX(553);

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

        } else {
            gridOne.setVisible(false);
            gridTwo.setVisible(false);
            gridThree.setVisible(false);
            gridFour.setVisible(true);

            puzzleCombo.setPrefWidth(97);
            puzzleCombo.setLayoutX(524);

            clearPuzzle();
            listOfCells.clear();

            listOfCells.add(x1);
            listOfCells.add(x2);
            listOfCells.add(x3);
            listOfCells.add(x4);
            listOfCells.add(x5);
            listOfCells.add(x6);
            listOfCells.add(x7);
            listOfCells.add(x8);
            listOfCells.add(x9);
            listOfCells.add(x10);
            listOfCells.add(x11);
            listOfCells.add(x12);
            listOfCells.add(x13);
            listOfCells.add(x14);
            listOfCells.add(x15);
            listOfCells.add(x16);
            listOfCells.add(x17);
            listOfCells.add(x18);
            listOfCells.add(x19);
            listOfCells.add(x20);
            listOfCells.add(x21);
            listOfCells.add(x22);
            listOfCells.add(x23);
            listOfCells.add(x24);
            listOfCells.add(x25);
            listOfCells.add(x26);
            listOfCells.add(x27);
            listOfCells.add(x28);
            listOfCells.add(x29);
            listOfCells.add(x30);
            listOfCells.add(x31);
            listOfCells.add(x32);
            listOfCells.add(x33);
            listOfCells.add(x34);
            listOfCells.add(x35);
            listOfCells.add(x36);
            listOfCells.add(x37);
            listOfCells.add(x38);
            listOfCells.add(x39);
            listOfCells.add(x40);
            listOfCells.add(x41);
            listOfCells.add(x42);
            listOfCells.add(x43);
            listOfCells.add(x44);
            listOfCells.add(x45);
            listOfCells.add(x46);
            listOfCells.add(x47);
            listOfCells.add(x48);
            listOfCells.add(x49);
            listOfCells.add(x50);
            listOfCells.add(x51);
            listOfCells.add(x52);
            listOfCells.add(x53);
            listOfCells.add(x54);
            listOfCells.add(x55);
            listOfCells.add(x56);
            listOfCells.add(x57);
            listOfCells.add(x58);
            listOfCells.add(x59);
            listOfCells.add(x60);
            listOfCells.add(x61);
            listOfCells.add(x62);
            listOfCells.add(x63);
            listOfCells.add(x64);
            listOfCells.add(x65);
            listOfCells.add(x66);
            listOfCells.add(x67);
            listOfCells.add(x68);
            listOfCells.add(x69);
            listOfCells.add(x70);
            listOfCells.add(x71);
            listOfCells.add(x72);
            listOfCells.add(x73);
            listOfCells.add(x74);
            listOfCells.add(x75);
            listOfCells.add(x76);
            listOfCells.add(x77);
            listOfCells.add(x78);
            listOfCells.add(x79);
            listOfCells.add(x80);
            listOfCells.add(x81);

            for (TextField textField : arrayOfGray) {
                textField.setStyle("-fx-control-inner-background: #CDCDCD; -fx-display-caret: false");
            }

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
        int digits;
        int limit;

        if (type == 1 || type == 4) {
            digits = 9;
            limit = 21;
        } else if (type == 2) {
            digits = 4;
            limit = 4;
        } else {
            digits = 6;
            limit = 8;
        }

        if (countDigits() < limit && !error) {
            messageBox.setText("Few digits!");
            Color color = Color.rgb(255, 0, 0);
            messageBox.setFill(color);
        } else if (error) {
            messageBox.setText("You made a mistake!");
            Color color = Color.rgb(255, 0, 0);
            messageBox.setFill(color);
        } else {
            messageBox.setText("");
            int[][] puzzle = new int[digits][digits];
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
                if (rowC % (digits - 1) == 0 && rowC != 0) {
                    colC++;
                    rowC = 0;
                } else
                    rowC++;
            }

            if (type == 4) {
                for (TextField textField : arrayOfGray) {
                    if (textField.getText().equals("")) {
                        textField.setStyle("-fx-control-inner-background: #CDCDCD; -fx-text-inner-color: #0000FF; -fx-display-caret: false");
                    } else {
                        textField.setStyle("-fx-control-inner-background: #CDCDCD; -fx-text-inner-color: #000000; -fx-display-caret: false");
                    }
                }
            }

            State start = new State().start(puzzle);

            long startTime = System.nanoTime();
            int answer = SudokuSolver.startSolutionCheck(start, type);
            long endTime = System.nanoTime();
            long elapsedTime = endTime - startTime;

            double elapsedSeconds = (double) TimeUnit.MICROSECONDS.convert(Duration.ofNanos(elapsedTime)) / 1000000;

            if (answer == 1) {
                messageBox.setText("Solved!");
                Color color = Color.rgb(0, 255, 0);
                messageBox.setFill(color);
                timeBox.setText("It took " + elapsedSeconds + " seconds!");
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
        timeBox.setText("");
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
            int[] diagArray = getDiagVals(textField);
            int[] finalArray;
            if (type != 4) {
                finalArray = new int[rowArray.length + colArray.length + boxArray.length];
            } else {
                if (diagArray.length > 1)
                    finalArray = new int[rowArray.length + colArray.length + boxArray.length + diagArray.length];
                else
                    finalArray = new int[rowArray.length + colArray.length + boxArray.length];
            }

            if (type != 4) {
                System.arraycopy(rowArray, 0, finalArray, 0, rowArray.length); //copies first array into new array
                System.arraycopy(colArray, 0, finalArray, rowArray.length, colArray.length);
                System.arraycopy(boxArray, 0, finalArray, rowArray.length + colArray.length, boxArray.length);
            } else {
                System.arraycopy(rowArray, 0, finalArray, 0, rowArray.length); //copies first array into new array
                System.arraycopy(colArray, 0, finalArray, rowArray.length, colArray.length);
                System.arraycopy(boxArray, 0, finalArray, rowArray.length + colArray.length, boxArray.length);
                if (diagArray.length > 1)
                    System.arraycopy(diagArray, 0, finalArray, rowArray.length + colArray.length + boxArray.length, diagArray.length);
            }

            String cssExtra = "-fx-control-inner-background: #FFFFFF;";

            if (type == 4) {
                for (TextField tf2 : arrayOfGray) {
                    if (textField.equals(tf2)) {
                        cssExtra = "-fx-control-inner-background: #CDCDCD;";
                        break;
                    }
                }
            }

            for (Integer i : finalArray) {
                if (textField.getText().equals(listOfCells.get(i - 1).getText()) && textField != listOfCells.get(i - 1)) {
                    textField.setStyle(cssExtra + "-fx-text-inner-color: #FF0000; -fx-display-caret: false");
                    error = true;
                    break;
                } else {
                    textField.setStyle(cssExtra + "-fx-text-inner-color: #000000; -fx-display-caret: false");
                    error = false;
                    messageBox.setText("");
                }
            }
        }
    }

    private int[] getRowVals(TextField textField) {
        int maxDigits;
        if (type == 1 || type == 4) {
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
        int maxDigits;
        if (type == 1 || type == 4) {
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
        int maxDigits;
        if (type == 1 || type == 4) {
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

        if (type == 1 || type == 4) {
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

    private int[] getDiagVals(TextField textField) {
        String[] aoG1 = {"1", "11", "21", "31", "41", "51", "61", "71", "81"};
        String[] aoG2 = {"9", "17", "25", "33", "41", "49", "57", "65", "73"};

        int[] result = new int[9];
        boolean left = false;
        boolean right = false;

        for (String s : aoG1) {
            if (textField.getId().equals(s)) {
                left = true;
                break;
            }
        }

        for (String s : aoG2) {
            if (textField.getId().equals(s)) {
                right = true;
                break;
            }
        }

        int counter = 0;
        if (left && !right) {
            for (String s : aoG1) {
                int val = Integer.parseInt(s);
                result[counter] = val;
                counter++;
            }
        } else if (right && !left) {
            for (String s : aoG2) {
                int val = Integer.parseInt(s);
                result[counter] = val;
                counter++;
            }
            result[8] = 41;
        } else if (left && right) {
            result = new int[18];
            for (String s : aoG1) {
                int val = Integer.parseInt(s);
                result[counter] = val;
                counter++;
            }
            for (String s : aoG2) {
                int val = Integer.parseInt(s);
                result[counter] = val;
                counter++;
            }
        } else {
            result = new int[1];
        }

        return result;
    }

    @FXML
    public void helpButton(MouseEvent event) {
        if (event.getEventType() == MouseEvent.MOUSE_ENTERED) {
            helpBox.setVisible(true);
            helpBox.setLayoutX(event.getSceneX() - helpBox.getWidth());
            helpBox.setLayoutY(event.getSceneY());
        } else if (event.getEventType() == MouseEvent.MOUSE_EXITED) {
            helpBox.setVisible(false);
        }
    }

    @FXML
    public void demoButton(Event event) {
        if (type == 1) {
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
}
