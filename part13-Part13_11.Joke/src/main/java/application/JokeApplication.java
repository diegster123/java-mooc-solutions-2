package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JokeApplication extends Application{


    public static void main(String[] args) {
        launch(JokeApplication.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        BorderPane layout = new BorderPane();
        
        HBox box = new HBox();
        box.setPadding(new Insets(20, 20, 20, 20));
        box.setSpacing(10);
        
        Button first = new Button("Joke");
        Button second = new Button("Answer");
        Button third = new Button("Explanation");
        box.getChildren().addAll(first, second, third);
        
        layout.setTop(box);
        
        StackPane question = createView("What do you call a bear with no teeth?");
        StackPane joke = createView("A gummy bear.");
        StackPane explanation = createView("The bear has no teeth therefore only his gums remain.");
        
        layout.setCenter(question);
        
        first.setOnAction((event -> {
            layout.setCenter(question);
        }));
        
        second.setOnAction((event -> {
            layout.setCenter(joke);
        }));
        
        third.setOnAction((event -> {
            layout.setCenter(explanation);
        }));
        
        Scene scene = new Scene(layout);
        
        window.setScene(scene);
        window.show();
    }
    
    private static StackPane createView(String text) {
        StackPane view = new StackPane();
        view.setPrefSize(300, 180);
        view.getChildren().add(new Label(text));
        view.setAlignment(Pos.CENTER);
        
        return view;
    }
}
