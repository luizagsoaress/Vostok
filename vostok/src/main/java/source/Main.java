package source;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        
        Screens screens = new Screens();
        HBox root = screens.S0();    

        Scene scene = new Scene(root, 1000, 600);
        
        stage.setTitle("Vostok");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}