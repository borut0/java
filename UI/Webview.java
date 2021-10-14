package webview;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
public class Webview extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        WebView wv = new WebView ();
        wv.getEngine().load("https://www.google.com");
        VBox root = new VBox(wv);
        Scene scene = new Scene(root,900,900);
        stage.setScene(scene);
        stage.show();
    }
    
}
