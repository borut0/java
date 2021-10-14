package all_shape_of_button;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;


import javafx.stage.Stage;
public class All_shape_of_button extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Button circle_type = new Button("+");
        circle_type.setShape(new Circle(10));
        circle_type.setMaxSize(50,50);
        circle_type.setMinSize(50,50);
        
        Button rectangle_type = new Button("");
        rectangle_type.setShape(new Rectangle(100,100));
        rectangle_type.setMaxSize(50, 50);
        rectangle_type.setMinSize(50, 50);
        Button triangle_type = new Button("");
        triangle_type.setShape(new Polygon(50,50,600,100,100,500));
        HBox root = new HBox(20);
        root.setPadding(new Insets(10));
        Image image = new Image("bakugou.jpg");
        ImageView iv = new ImageView(image);
        iv.setFitHeight(50);
        iv.setFitWidth(50);
        
       
        root.getChildren().addAll(circle_type,rectangle_type,triangle_type,iv);
        Scene scene = new Scene(root,500,500);
        stage.setScene(scene);
        stage.show();
    }
    
}
