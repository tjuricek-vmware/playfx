package playfx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        var button = new Button();
        button.setText("Say hi");
        button.setOnAction(event -> System.out.println("hello, console"));

        var stackPane = new StackPane();
        stackPane.getChildren().add(button);

        var scene = new Scene(stackPane, 300, 250);

        primaryStage.setTitle("Hello, World");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
