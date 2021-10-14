package tilepane;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;
public class Tilepane extends Application {
    public static void main(String[] args) {
        // TODO code application logic here
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
       TilePane root = new TilePane();
       
       Button[] buttons = new Button[51];
       for(int i=0;i<51;i++)
       {
           
           Button btn = new Button(Integer.toString(i));
           btn.setPrefHeight(50);
           btn.setPrefWidth(50);
           root.getChildren().add(btn);
           buttons[i]=btn;
       }
       //root.setOrientation(Orientation.HORIZONTAL);
       root.setOrientation(Orientation.VERTICAL);
       root.setHgap(10);
       root.setVgap(10);
       buttons[25].setPrefHeight(75);
       buttons[25].setPrefWidth(75);
       root.setAlignment(Pos.TOP_LEFT);
       TilePane.setAlignment(buttons[1], Pos.TOP_RIGHT);
       TilePane.setAlignment(buttons[44], Pos.BOTTOM_RIGHT);
       root.setPadding(new Insets(10,10,10,10));
       Scene scene = new Scene(root);
       stage.setScene(scene);
        stage.show();
    }
    
}
