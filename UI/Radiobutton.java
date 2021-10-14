package radiobutton;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class Radiobutton extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Label lb = new Label("which browser your yousing now?");
        RadioButton rb = new RadioButton("Google");
        RadioButton rb1 = new RadioButton("Bing");
        RadioButton rb2 = new RadioButton("Yahoo!");
        RadioButton rb3 = new RadioButton("DukeDukeGo");
        ToggleGroup group = new ToggleGroup();
        rb.setToggleGroup(group);
        rb1.setToggleGroup(group);
        rb2.setToggleGroup(group);
        rb3.setToggleGroup(group);
        rb.setOnAction(e -> System.out.println("you select google!"));
        VBox root = new VBox(10,lb,rb,rb1,rb2,rb3);
        
        root.setPadding(new Insets(10));
        
        Scene scene = new Scene(root,500,500);
        stage.setScene(scene);
        stage.show();
         }
    
}
