package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{



        HBox root = new HBox();
        root.setPadding(new Insets(15, 12, 15, 12));
        root.setSpacing(10);
        FXMLLoader listLoader = new FXMLLoader(getClass().getResource("MVCexample1.fxml"));
        root.getChildren().add(listLoader.load());

        Controller controller = listLoader.getController();


        FXMLLoader listLoader2 = new FXMLLoader(getClass().getResource("MVCexample2.fxml"));
        root.getChildren().add(listLoader2.load());



        Controller2 controller2 = listLoader2.getController();


        Model model = new Model();
        controller.initModel(model);
        controller2.initModel(model);

        Scene scene = new Scene(root, 300, 275);
        primaryStage.setTitle("MVC example 2");
        primaryStage.setScene(scene);
        primaryStage.show();


    }


    public static void main(String[] args) {
        launch(args);
    }
}


