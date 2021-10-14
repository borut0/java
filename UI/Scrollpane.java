package scrollpane;
import java.io.FileInputStream;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
public class Scrollpane extends Application{
    public static void main(String[] args) {
        // TODO code application logic here
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane root =new BorderPane();
        ScrollPane root1 = new ScrollPane();
        root.setCenter(root1);
        ImageView imgv = new ImageView(new Image(new FileInputStream("F:\\photos\\x.gif")));
        root1.setContent(imgv);
        //
        root1.setPannable(true);
        //
        root1.setHbarPolicy(ScrollBarPolicy.AS_NEEDED);
        Scene scene = new Scene(root,200,200);
        stage.setScene(scene);
        stage.show();
    }
    
}
