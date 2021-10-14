package exception_1;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import static javafx.scene.text.Font.font;
import javafx.stage.Stage;
import javafx.scene.control.Button;
public class Exception_1 extends Application{
    int ans;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        GridPane root = new GridPane();
        root.setPadding(new Insets(20));
        root.setHgap(10);
        root.setVgap(10);
        Label l1 = new Label("Enter upone value:");
        l1.setFont(font(20));
        Label l2 = new Label("Enter divisor value:");
        l2.setFont(font(20));
        TextField tf1 = new TextField("");
        TextField tf2 = new TextField();
        Label l3 = new Label("");
        l3.setFont(font(20));
        Button btn = new Button("Answer");
        root.add(l1, 0, 0);
        root.add(tf1,1,0);
        root.add(l2, 0, 1);
        root.add(tf2,1,1);
        root.add(btn, 1, 3);
        
        root.add(l3, 0,4);
        btn.setOnAction(e ->
        {
        try{
            ans = Integer.parseInt(tf1.getText())/Integer.parseInt(tf2.getText());
            l3.setText("The Answer is " + ans);
        }
        catch(ArithmeticException f)
        {
            l3.setText("devide by zero");
        }
        catch(NumberFormatException k)
        {
            l3.setText("please enter integer");
        }
        });
        Scene scene = new Scene(root,500,500);
        stage.setScene(scene);
        stage.show();
    }
    
}
