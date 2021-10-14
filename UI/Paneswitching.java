package paneswitching;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class Paneswitching extends Application{
    Stage stage;
    
    VBox root1;
    Button btn1;
    
    VBox root2;
    Button btn2;
    public static void main(String[] args) {
        // TODO code application logic here
        launch(args);
    }

    @Override
    public void start(Stage primarystage) throws Exception {
        BorderPane root = new BorderPane();
        root1 = new VBox();
        root2 = new VBox();
        btn2 = new Button("Click to go 1sr pane");
        btn2.setOnAction(e -> root.setCenter(root1));
        root2.getChildren().add(btn2);
        btn1 = new Button("click to go 2nd pane");
        //ImageView imgv = new ImageView(new Image(new FileInputStream("F:\\photos\\0.gif")));
        root1.getChildren().add(btn1);
        btn1.setOnAction(e -> root.setCenter(root2));
        root1.setAlignment(Pos.CENTER);
        Label lb1 = new Label("top");
        Label lb2 = new Label("down");
        Label lb3 = new Label("left");
        Label lb4 = new Label("right");
        root.setTop(lb1);
        root.setBottom(lb2);
        root.setLeft(lb3);
        root.setRight(lb4);
        root.setCenter(root1);
        lb1.setPrefSize(50, 50);
        BorderPane.setAlignment(lb1, Pos.CENTER);
        stage = primarystage;
        Scene scene = new Scene(root,500,500);
         stage.setScene(scene);
         stage.show();
         
    }
    
}
