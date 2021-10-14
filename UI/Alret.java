package alret;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
public class Alret extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        StackPane root = new StackPane();
        Button btn = new Button("click me ");
        btn.setOnAction(e ->{
            Alert alert = new Alert(AlertType.CONFIRMATION);
            alert.setTitle("its Alert");
            alert.setHeaderText("solve this problem");
            alert.setContentText("why we are living?");
            alert.showAndWait();
        });
        root.getChildren().add(btn);
        Scene scene = new Scene(root,500,520);
        stage.setScene(scene);
        stage.show();
    }
    
}
