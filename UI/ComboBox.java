package combobox;
import javafx.application.Application;
import javafx.stage.Stage;
public class ComboBox extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane root = new BorderPane();
	ComboBox<String> cb = new ComboBox<String>();
	cb.setVisibleRowCount(5);
	cb.setEditable(true);
	ObservableList<String> list = cb.getItems();
	list.add("Java");
	list.add("Python");
	list.add("C");
	list.add("C++");
	list.add("C#");
	list.add("Kotlin");
	list.add("JavaScript");
	list.add("TypeScript");
	list.add("PHP");
	list.add("Go");
	list.add("Scala");
	list.add("Ruby");
	list.add("Rust");
	list.add("SQL");
	
	root.setCenter(cb);
			
	Label message = new Label("Ready");
	HBox hbox = new HBox();
	hbox.setPadding(new Insets(10));
	hbox.getChildren().add(message);
	root.setBottom(hbox);
		
	cb.setOnAction(new EventHandler<ActionEvent>() {
		@Override
		public void handle(ActionEvent event) {
		message.setText("You have selected " + cb.valueProperty().get());
			}
	});
		
	Scene scene = new Scene(root,400,400);
	scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	stage.setScene(scene);
	stage.show();
    }
    
}
