package anchorpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
public class Anchorpane extends Application {
    public static void main(String[] args) {
        // TODO code application logic here
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        AnchorPane root = new AnchorPane();
        TextArea textarea = new TextArea();
        
        Button btn = new Button("open");
        btn.prefWidth(75.0);
        Button btn1 = new Button("close");
        btn1.prefWidth(75.0);
        AnchorPane.setTopAnchor(textarea,10.0);
        AnchorPane.setBottomAnchor(textarea,10.0);
        AnchorPane.setLeftAnchor(textarea,10.0);
        AnchorPane.setRightAnchor(textarea,100.0);
        AnchorPane.setTopAnchor(btn,10.0);
        AnchorPane.setRightAnchor(btn,10.0);
        AnchorPane.setRightAnchor(btn1,10.0);
        AnchorPane.setBottomAnchor(btn1,10.0);
        root.getChildren().addAll(textarea,btn,btn1);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        
    }
    
}
