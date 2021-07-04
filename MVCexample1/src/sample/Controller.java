package sample;

import javafx.beans.binding.Bindings;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class Controller {

    @FXML
    private TextArea textArea;

    private Model model ;

    public void initModel(Model model) throws NullPointerException {
        // ensure model is only set once:
        if (this.model != null) {
            throw new IllegalStateException("Model can only be initialized once");
        }

        this.model = model ;
        // bind textArea to integer, you can't bind it simply to an integer as it has no way off telling it has changed.
        // instead use SimpleIntegerProperty and the method ".valueProperty return SimpleIntegerProperty"
        textArea.textProperty().bind(Bindings.convert(model.valueProperty()));
    }

    @FXML
    public void AddOneButton() {
        model.addNumber(1);
    }

    @FXML
    public void AddTwoButton() {
        model.addNumber(2);
    }

    @FXML
    public void MultiplyTwoButton() {
        model.multiplyNumber(2);
    }


}