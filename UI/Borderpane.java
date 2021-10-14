package borderpane;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
public class Borderpane extends Application {
    public static void main(String[] args) {
        // TODO code application logic here
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane root = new BorderPane();
       
       // Button up = new Button("up");
        //Button down = new Button("down");
        //Button left = new Button("left");
        //Button rigth = new Button("rigth");
        //BorderPane.setAlignment(up, Pos.TOP_CENTER);
        //BorderPane.setAlignment(down, Pos.BOTTOM_CENTER);
        //BorderPane.setAlignment(left, Pos.CENTER_LEFT);
        //BorderPane.setAlignment(rigth, Pos.CENTER_RIGHT);
        root.setTop(getButton());
        root.setBottom(new Button("down"));
        root.setRight(new Button("left"));
        root.setLeft( new Button("rigth"));
        root.setPadding(new Insets(10,10,10,10));
        
       // root.getChildren().addAll(up,down,left,rigth);
        Scene scene = new Scene(root,500,500);
        stage.setScene(scene);
        stage.show();
      
    }
    public Button getButton()
    {
        Button button = new Button("Top");
        button.setPrefWidth(50.0);
        
        button.setAlignment(Pos.BASELINE_CENTER);
        return button;
    }
    
}
 