package exception_2;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import static javafx.scene.text.Font.font;
import javafx.stage.Stage;
class myexception1 extends Exception
{
    myexception1(String msg ){
        super(msg);
    }
}
class myexception2 extends Exception
{
    myexception2(String msg ){
        super(msg);
    }
}
public class Exception_2 extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        HBox root = new HBox(20);
        Label lb = new Label("Enter time in this format:- mm:hh");
        lb.setFont(font(20));
        TextField tf = new TextField();
        tf.setPrefSize(30,25);
        TextField tf1 = new TextField();
        tf1.setPrefSize(30, 25);
        root.setPadding(new Insets(20));
        Button btn = new Button("Answer");
        
        Label lb1 = new Label("");
        lb1.setFont((font(30)));
        lb1.setAlignment(Pos.BOTTOM_CENTER);
        //btn.disableProperty().bind(tf.textProperty().isEmpty().or(tf1.textProperty().isEmpty()));
        root.getChildren().addAll(lb,tf,tf1,btn,lb1);
        
        btn.setOnAction(e ->{ 
            try{
            if(Integer.parseInt(tf.getText())<=0 || Integer.parseInt(tf.getText())>=60)
            {
                throw new myexception1("value must be in between 0-60");
            }
            }
            catch(myexception1 f)
            {
                   lb1.setText(f.getMessage());
            }
            try{
            if(Integer.parseInt(tf1.getText())<=0 || Integer.parseInt(tf1.getText())>=24)
            {
                throw new myexception1("value must be in between 0-24");
            }
            }
            catch(myexception1 k)
            {
                   lb1.setText(k.getMessage());
            }
                        
        });
        
        Scene scene = new Scene(root,800,300);
        stage.setScene(scene);
        stage.show();
    }
    
}
