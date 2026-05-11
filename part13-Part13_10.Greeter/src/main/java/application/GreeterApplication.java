package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GreeterApplication extends Application {

    public static void main(String[] args) {
        launch(GreeterApplication.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        Label instruction = new Label("Enter your name and start.");
        TextField name = new TextField();
        Button start = new Button("Start");

        GridPane layout = new GridPane();

        layout.add(instruction, 0, 0);
        layout.add(name, 0, 1);
        layout.add(start, 0, 2);

        layout.setPrefSize(300, 180);
        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(20, 20, 20, 20));

        Scene nameView = new Scene(layout);
               
        Label welcomeText = new Label("");
        
        StackPane welcomeLayout = new StackPane();
        welcomeLayout.setPrefSize(300, 180);
        welcomeLayout.getChildren().add(welcomeText);
        welcomeLayout.setAlignment(Pos.CENTER);
        
        Scene welcomeView = new Scene(welcomeLayout);

        start.setOnAction((event -> {
            String nameString = name.getText();
            welcomeText.setText("Welcome " + nameString + "!");
            window.setScene(welcomeView);
        }));     
        
        window.setScene(nameView);
        window.show();

    }
}
