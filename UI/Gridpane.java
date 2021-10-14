package gridpane;
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;
public class Gridpane extends Application {
    public static void main(String[] args) {
        // TODO code application logic here
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        GridPane root = new GridPane();
        Label label = new Label("Username:");
        Label label1 = new Label("Passowd:");
        TextField t1 = new TextField();
        TextField t2 = new TextField();
        Button btn = new Button("Submmit");
        Button btn2 = new Button("Clear");
        //
        btn.disableProperty().bind(t1.textProperty().isEmpty());
        //if you want to do for more 
        btn.disableProperty().bind(t1.textProperty().isEmpty().or(t2.textProperty().isEmpty()));
        root.add(label, 0, 0);
        root.add(t1, 1, 0);
        root.add(label1,0,1);
        root.add(t2,1,1);
        root.add(btn,0,2,2,2);
        root.add(btn2,1,2,2,2);
        root.setHgap(10);
        root.setVgap(10);
        root.setPadding(new Insets(10,10,10,10));
        //ColumnConstraints column1 = new ColumnConstraints();
	//ColumnConstraints column2 = new ColumnConstraints();
        //root.getColumnConstraints().add(column1);
	//root.getColumnConstraints().add(column2);
        GridPane.setHalignment(label, HPos.RIGHT);
        GridPane.setHalignment(label1, HPos.RIGHT);
        GridPane.setHgrow(t1, Priority.ALWAYS);
        GridPane.setVgrow(t1, Priority.ALWAYS);
        GridPane.setHgrow(t2, Priority.ALWAYS);
        GridPane.setVgrow(t2, Priority.ALWAYS);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
}
