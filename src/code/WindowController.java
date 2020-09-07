package code;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PopupControl;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Popup;
import javafx.stage.Stage;
import org.w3c.dom.Text;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class WindowController implements Initializable {
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

    ArrayList<TextField> listOfCells = new ArrayList<>();

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
                    try {
                        constraintFunc(textField);
                    } catch (Exception e) {
                        e.printStackTrace();
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

    //check solve clear load
    @FXML
    private void checkPuzzle() {

    }

    @FXML
    private void solvePuzzle() {

    }

    @FXML
    private void clearPuzzle() {
        for (TextField textField : listOfCells) {
            textField.setText("");
        }
    }

    @FXML
    private void loadPuzzle() {
        //Will do later
    }


    private void constraintFunc(TextField textField) throws Exception {
        String id = textField.getId();
        int number = 0;
        if (id.length() == 2) number = Integer.parseInt(id.substring(1, 2));
        else if (id.length() == 3) number = Integer.parseInt(id.substring(2, 3));
        int[] rowArray = {2, 3, 4, 5, 6, 7, 8, 9};
        int[] boxArray = {2, 3, 10, 11, 12, 19, 20, 21};
        int[] colArray = {10, 19, 28, 37, 46, 55, 64, 73};

        for (Integer i : rowArray) {
            if (listOfCells.get(i - 1).getText().equals(textField.getText()) && !textField.getText().equals("") && !listOfCells.get(i - 1).getText().equals("")) {
                System.out.println("hii");
                textField.setStyle("-fx-text-inner-color: #FF0000; -fx-display-caret: false");
                textField.setDisable(true);
                popUpMethod();
            }
        }
    }

    private void popUpMethod() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("popup.fxml"));
        Stage stage = new Stage();
        stage.setTitle("Error!");
        stage.setScene(new Scene(root, 300, 200));
        stage.show();
    }

}
