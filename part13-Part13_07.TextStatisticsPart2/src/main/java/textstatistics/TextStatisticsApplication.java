package textstatistics;

import java.util.Arrays;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TextStatisticsApplication extends Application {

    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        BorderPane view = new BorderPane();
        HBox box = new HBox();

        Label letterCount = new Label("Letters: 0");
        Label wordCount = new Label("Words: 0");
        Label longestWord = new Label("The longest word is: ");

        TextArea textArea = new TextArea("");
        textArea.textProperty().addListener((change, oldValue, newValue) -> {
            int characters = newValue.length();
            String[] parts = newValue.split(" ");
            int words = parts.length;
            String longest = Arrays.stream(parts)
            .sorted((s1, s2) -> s2.length() - s1.length())
            .findFirst()
            .get();
            
            letterCount.setText("Letters: " + characters);
            wordCount.setText("Words: " + words);
            longestWord.setText("The longest word is: " + longest);

        });
        box.getChildren().add(letterCount);
        box.getChildren().add(wordCount);
        box.getChildren().add(longestWord);
        box.setSpacing(20);

        view.setBottom(box);
        view.setCenter(textArea);

        Scene scene = new Scene(view);
        window.setScene(scene);
        window.show();
    }

}
