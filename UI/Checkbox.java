package checkbox;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class Checkbox extends Application{
    public static void main(String[] args) {
        // TODO code application logic here
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        CheckBox cb = new CheckBox("Detail");
        TitledPane tp = createTitledPane();
        DatePicker dp = new DatePicker();
        VBox vbox = new VBox(cb,tp,dp);
        vbox.setPadding(new Insets(30));
        //*****this is amazing ******\\\
        tp.expandedProperty().bindBidirectional(cb.selectedProperty());
       
        Scene scene = new Scene(vbox,500,500);
        stage.setScene(scene);
        stage.show();
        
    }
    public TitledPane createTitledPane() {

        GridPane gridPane = new GridPane();
	gridPane.setPadding(new Insets(10));
	gridPane.setVgap(5);
	gridPane.setHgap(5);
	gridPane.add(new Label("Street Name"), 0, 1);
	gridPane.add(new TextField(), 1, 1);
	gridPane.add(new Label("Street Number"), 0, 0);
	gridPane.add(new TextField(), 1, 0);
	gridPane.add(new Label("City"), 0, 2);
	gridPane.add(new TextField(), 1, 2);
	gridPane.add(new Label("Province"), 0, 3);
	gridPane.add(new TextField(), 1, 3);
	gridPane.add(new Label("Postal Code"), 0, 4);
	gridPane.add(new TextField(), 1, 4);
	TitledPane titledPane = new TitledPane("Address", gridPane);
	titledPane.setExpanded(false);
        return titledPane;
	}
    
}
