package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            GridPane root = (GridPane)FXMLLoader.load(getClass().getResource("/fxml/CalculadoraFXML.fxml"));
            Scene scene = new Scene(root,600,600);
            scene.getStylesheets().add(getClass() .getResource("/css/application.css").toExternalForm());
            primaryStage.setTitle("CALCULADORA");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
