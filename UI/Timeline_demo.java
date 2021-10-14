package timeline_demo;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
//import javafx.animation.Timeline_demo;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.animation.Timeline;
public class Timeline_demo extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Circle circle = new Circle(20,50,50);
        circle.setFill(Color.DARKSALMON);
        circle.setStroke(Color.LIME);
        
        Timeline tm = new Timeline();
        KeyValue kv = new KeyValue(circle.translateXProperty(),1000);
        KeyFrame kf = new KeyFrame(Duration.millis(2000),kv);
        
        tm.getKeyFrames().addAll(kf);
        tm.setCycleCount(20);
        
        tm.setAutoReverse(true);
        
        tm.play();
        Group root = new Group(circle);
        Scene scene = new Scene(root,500,500);
        stage.setScene(scene);
       stage.show();
    }
    
}
