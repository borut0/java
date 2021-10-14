package sceneswitching;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
public class Sceneswitching extends Application {
    Scene scene0;
    Button btn;
    HBox root0;
    
    Scene scene1;
    Button btn1;
    HBox root1;
    Stage primaryStage;
    
    public static void main(String[] args) {
        // TODO code application logic here
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
       primaryStage=stage;
       scene0 = CreatesceneOne();
       scene1 = Createscenetwo(); 
       primaryStage.setScene(scene0);
       primaryStage.show();
    }
    public Scene CreatesceneOne()
    {
        btn = new Button("click to go 2nd scene");
        btn.setOnAction(e -> primaryStage.setScene(scene1) );
        root0 = new HBox(btn);
        scene0 = new Scene(root0,500,600);
        return scene0;
    }
    public Scene Createscenetwo()
    {
        btn1 = new Button("click to go 1nd scene");
        btn1.setOnAction(e -> primaryStage.setScene(scene0) );
        root1 = new HBox(btn1);
        scene1 = new Scene(root1,700,600);
        return scene1;
    }

}
