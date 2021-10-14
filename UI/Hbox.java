
package hbox;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.stage.Stage;
public class Hbox extends Application {

    public static void main(String[] args) {
        // TODO code application logic here
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        HBox root = new HBox(10);
        Button btn = new Button("1");
        Button btn1 = new Button("2");
        Button btn2 = new Button("3");
        btn.setMaxWidth(Integer.MAX_VALUE);
        HBox.setMargin(btn,new Insets(20));
        HBox.setHgrow(btn, Priority.ALWAYS);
        btn1.setMaxWidth(Integer.MAX_VALUE);
        HBox.setMargin(btn1,new Insets(20));
        HBox.setHgrow(btn1, Priority.ALWAYS);
        btn2.setMaxWidth(Integer.MAX_VALUE);
        HBox.setMargin(btn2,new Insets(20));
        HBox.setHgrow(btn2, Priority.ALWAYS);
        Region region =new Region();
        HBox.setHgrow(region, Priority.ALWAYS);
        root.getChildren().addAll(btn,btn1,region,btn2);
        Scene scene = new Scene(root,300,300);
        stage.setScene(scene);
        stage.show();
        
    }
    
}
