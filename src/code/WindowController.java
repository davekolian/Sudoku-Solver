package code;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
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
    TextField u1;





    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ArrayList<TextField> arrayList = new ArrayList<>();
        arrayList.add(u1);

    }

    @FXML
    private void clearTextField(Event event){
        System.out.println("hi");
        TextField tf = (TextField) event.getSource();
        tf.setText("");
        /*int number = 0;
        if (id.length() == 2) number = Integer.parseInt(id.substring(1, 2));
        else if (id.length() == 3) number = Integer.parseInt(id.substring(2, 3));*/
    }
}
