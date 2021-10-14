package stageswiitching;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class Stageswiitching extends Application{
    public static void main(String[] args) {
        // TODO code application logic here
        
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Stage stage1 = new Stage();
        stage1.setTitle("2nd stage");
        Button btn = new Button("click for 2nd stage");
        btn.setOnAction(e -> stage1.show());
        VBox root = new VBox(btn);
        Scene scene = new Scene(root,500,500);
        stage.setScene(scene);
        Button btn0 = new Button("click for 1st stage");
        btn0.setOnAction(e -> stage.show());
        VBox root0 = new VBox(btn0);
        Scene scene0 = new Scene(root0,800,800);
        stage1.setScene(scene0);
        stage.setTitle("Main Stage");
        stage.show();
    }
}
