
package prac17;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
public class Prac17 extends Application {

    public static void main(String[] args) {
       launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        
        GridPane pane = new GridPane();

		// Add nodes to pane
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				int n = (int)(Math.random() * 3);
				if (n == 0)
					pane.add(new ImageView(new Image("x.gif")), j, i);
				else if (n == 1)
					pane.add(new ImageView(new Image("0.gif")), j, i);
				else
					continue;
			}
		}

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane,800,800);
		stage.setTitle("Tic tac toe"); // Set title for stage
		stage.setScene(scene); // Place the scene in the stage
		stage.show(); // Display the stage
	}
}
