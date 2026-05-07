package buttonandtextfield;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class ButtonAndTextFieldApplication extends Application{


    public static void main(String[] args) {
        launch(ButtonAndTextFieldApplication.class);
    }

    @Override
    public void start(Stage window) throws Exception {
//        Label label = new Label("Name");
        Button button = new Button("Hello");
        TextField text = new TextField();
        FlowPane components = new FlowPane();
        components.getChildren().add(button);
        components.getChildren().add(text);
        
        Scene scene = new Scene(components);
        
        window.setScene(scene);
        window.show();
    }

}
