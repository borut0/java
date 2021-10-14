
package flowpane;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
public class Flowpane extends Application {

    public static void main(String[] args) {
        // TODO code application logic here
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
       FlowPane root = new FlowPane();
       Button btn = new Button("one");
       Button btn1 = new Button("two");
       Button btn2 = new Button("three");
       Button btn3 = new Button("four");
       root.setHgap(10);
       root.setVgap(10);
       root.setAlignment(Pos.CENTER);
       root.getChildren().addAll(btn,btn1,btn2,btn3);
       Scene scene = new Scene(root,200,200);
       stage.setScene(scene);
       stage.setTitle("Flowpane");
      
       stage.show();
    }
}
