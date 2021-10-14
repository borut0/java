package titlepane_and_checkbox;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class Titlepane_and_checkbox extends Application{
    public static void main(String[] args) {
        // TODO code application logic here
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        TitledPane root = new TitledPane();
        BorderPane root2 = new BorderPane();
        CheckBox cb = new CheckBox("Detail");
        GridPane root3 = new GridPane();
        root3.add(new Label("User_Id:"), 0, 0);
        root3.add(new TextField(), 1, 0);
        root3.add(new Label("Passoword:"), 0, 1);
        root3.add(new TextField(), 1, 1);
        root3.add(new Label("Email:"), 0,2);
        root3.add(new TextField(), 1, 2);
        root3.setHgap(10);
        root3.setVgap(10);
        root3.setPadding(new Insets(10));
        root.setContent(root3);
        VBox vbox = new VBox(cb,root);
        root2.setLeft(root);
        root2.setPadding(new Insets(30));
        // Set the Title
        root.setText("Detail");
        // 4. Expand and Collapse
	root.setExpanded(true);
        // Disable Collapsing
	root.setCollapsible(true);	
	// Set Animation
	root.setAnimated(true);
        Scene scene = new Scene(root2,500,500);
        stage.setScene(scene);
        stage.show();
    }
    
}
