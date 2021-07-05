package sample;

import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import sample.Model;

public class Controller2 {

    @FXML
    private TextArea textArea;

    private Model model ;

    public void initModel(Model model){
        // ensure model is only set once:
        if (this.model != null) {
            throw new IllegalStateException("Model can only be initialized once");
        }

        this.model = model ;
        // bind textArea to integer, you can't bind it simply to an integer as it has no way off telling it has changed.
        // instead use SimpleIntegerProperty and the method ".valueProperty return SimpleIntegerProperty"
        textArea.textProperty().bind(Bindings.concat("The number is: \t",model.valueProperty()));
    }

}
