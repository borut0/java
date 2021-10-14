
package vbox;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class Vbox extends Application {

    public static void main(String[] args) {
        // TODO code application logic here
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
       stage.setTitle("VBox Explorer");

		VBox vbox = new VBox();
		vbox.setAlignment(Pos.CENTER_RIGHT);

		Button button1 = new Button("One");
		Button button2 = new Button("Two");
		Button button3 = new Button("Three");

		button1.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		button2.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		button3.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);

		VBox.setVgrow(button1, Priority.ALWAYS);
		VBox.setVgrow(button2, Priority.ALWAYS);
		VBox.setVgrow(button3, Priority.ALWAYS);

		vbox.getChildren().addAll(button1, button2, button3);

		Scene scene = new Scene(vbox, 500, 300);
		stage.setScene(scene);
		stage.show();
    }
    
}
