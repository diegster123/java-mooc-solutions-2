package buttonandlabel;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class ButtonAndLabelApplication extends Application{


    public static void main(String[] args) {
        launch(ButtonAndLabelApplication.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        Label label = new Label("Label");
        Button button = new Button("Yes");
        
        FlowPane components = new FlowPane();
        components.getChildren().add(label);
        components.getChildren().add(button);
        
        Scene scene = new Scene(components);
        window.setScene(scene);
        window.show();
    }

}
