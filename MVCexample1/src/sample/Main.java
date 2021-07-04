package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        BorderPane root = new BorderPane();
        FXMLLoader listLoader = new FXMLLoader(getClass().getResource("MVCexample.fxml"));
        root.setCenter(listLoader.load());
        Controller controller = listLoader.getController();


        Model model = new Model();
        controller.initModel(model);

        Scene scene = new Scene(root, 300, 275);
        primaryStage.setTitle("MVC example 1");
        primaryStage.setScene(scene);
        primaryStage.show();


    }


    public static void main(String[] args) {
        launch(args);
    }
}


