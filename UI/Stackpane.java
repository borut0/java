package stackpane;
import java.io.FileInputStream;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
public class Stackpane extends Application {
    public static void main(String[] args) {
        // TODO code application logic here
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        StackPane root = new StackPane();
        Label lb = new Label("hello,here you can watch the text");
        StackPane.setAlignment(lb, Pos.BOTTOM_CENTER);
        Button btn = new Button("just_click");
        StackPane.setAlignment(btn,Pos.TOP_CENTER);
        ImageView imgv = new ImageView(new Image(new FileInputStream("F:\\photos\\0.gif")));
        btn.setOnAction(e -> lb.setText("hello how are you?"));
        root.getChildren().addAll(imgv,lb,btn);
        Scene scene = new Scene(root);
        scene.setFill(Color.DARKBLUE);
        stage.setScene(scene);
        stage.show();
    }
    
}
