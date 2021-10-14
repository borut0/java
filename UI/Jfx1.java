package jfx1;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class Jfx1 extends Application{

	public static void main(String[] args){
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Button btn = new Button("click me");
		Button btn2 = new Button("Exit");
		btn2.setOnAction(e -> {
			System.out.println("buy!");
			System.exit(0);
		});
		btn.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				System.out.println("hello guys!");
			}
		});
		VBox root = new VBox();
		root.getChildren().addAll(btn,btn2);
		Scene scene = new Scene(root,500,300);
		primaryStage.setScene(scene);
		primaryStage.show();

		
	}

}

