package sample;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.NumberBinding;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Pane root = new Pane();

        final int count = 7;// number of rectangles

        NumberBinding minSide = Bindings
                .min(root.heightProperty(), root.widthProperty())
                .divide(count);
        for (int x = 0; x<count; x++){
            for (int y = 0; y<count; y++) {

                Color color = Color.LIGHTGREY;
                if (((y+x)%2==0)) {
                    color = Color.DARKGREY;
                }


                Rectangle rectangle = new Rectangle(0, 0, color);

                // binding rectangle location to its side size
                rectangle.xProperty().bind(minSide.multiply(x));
                rectangle.yProperty().bind(minSide.multiply(y));

                // binding rectangle's width and height
                rectangle.heightProperty().bind(minSide.subtract(2));
                rectangle.widthProperty().bind(rectangle.heightProperty());

                root.getChildren().add(rectangle);

            }
        }


        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
