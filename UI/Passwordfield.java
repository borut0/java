package passwordfield;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.HBox;

import javafx.stage.Stage;
public class Passwordfield extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        PasswordField pw = new PasswordField();
        Label lb = new Label("Password:");
        Button btn = new Button("ok");
        btn.setOnAction(e -> {
            if(pw.getText().length()<4)
            {
                System.out.println("please enter 4> letter");
            }
            else{
            System.out.println("you entered" + pw.getText());
            }   
        });
        HBox root = new HBox(10,lb,pw,btn);
        root.setPadding(new Insets(10));
        Scene scene = new Scene(root,500,500);
        stage.setScene(scene);
        stage.show();
    }
    
}
