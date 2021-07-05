package sample;

import javafx.beans.binding.Bindings;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class Controller {

    private Model model1 ;

    public void initModel(Model model1){
        // ensure model is only set once:
        if (this.model1 != null) {
            throw new IllegalStateException("Model can only be initialized once");
        }

        this.model1 = model1 ;
        // bind textArea to integer, you can't bind it simply to an integer as it has no way off telling it has changed.
        // instead use SimpleIntegerProperty and the method ".valueProperty return SimpleIntegerProperty"
        //textArea.textProperty().bind(Bindings.convert(model.valueProperty()));
    }

    @FXML
    public void AddOneButton() {
        model1.addNumber(1);
    }

    @FXML
    public void AddTwoButton() {
        model1.addNumber(2);
    }

    @FXML
    public void MultiplyTwoButton() {
        model1.multiplyNumber(2);
    }


}