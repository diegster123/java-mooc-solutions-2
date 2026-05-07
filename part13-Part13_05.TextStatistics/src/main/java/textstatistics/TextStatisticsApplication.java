package textstatistics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class TextStatisticsApplication extends Application{


    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        BorderPane view = new BorderPane();
        
        view.setCenter(new TextArea(""));
        HBox text = new HBox();
        text.setSpacing(20);
        text.getChildren().add(new Label("Letters: 0"));
        text.getChildren().add(new Label("Words: 0"));
        text.getChildren().add(new Label("The longest word is:"));
        
        view.setBottom(text);
        
        Scene scene = new Scene(view);
        window.setScene(scene);
        window.show();
    }

}
