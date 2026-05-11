package application;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application{

    public static void main(String[] args) {
        launch(MultipleViews.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        BorderPane borderPane = new BorderPane();
        Label label1 = new Label("First View!");
        Button toSecondView = new Button("To the second view!");
        borderPane.setTop(label1);
        borderPane.setCenter(toSecondView);
        
        VBox verticalBox = new VBox();
        Button toThirdView = new Button("To the third view!");
        Label label2 = new Label("Second View!");
        verticalBox.getChildren().addAll(toThirdView,label2);
        
        GridPane gridPane = new GridPane();
        Label label3 = new Label("Third View!");
        Button toFirstView = new Button("To the first view!");
        gridPane.add(label3, 0, 0);
        gridPane.add(toFirstView, 1, 1);
        
        Scene firstScene = new Scene(borderPane);
        Scene secondScene = new Scene(verticalBox);
        Scene thirdScene = new Scene(gridPane);
        
        toSecondView.setOnAction((event) -> {
            window.setScene(secondScene);
        });
        
        toThirdView.setOnAction((event) -> {
            window.setScene(thirdScene);
        });
        
        toFirstView.setOnAction((event) -> {
            window.setScene(firstScene);
        });
        
        window.setScene(firstScene);
        window.show();
    }

}
