package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

// END SOLUTION
public class VocabularyPracticeApplication extends Application {

    private Dictionary dictionary;

    @Override
    public void init() throws Exception {
        this.dictionary = new Dictionary();
    }

    @Override
    public void start(Stage window) throws Exception {
        EnterView enterView = new EnterView(this.dictionary);
        PracticeView practiceView = new PracticeView(this.dictionary);
        Button enter = new Button("Enter new words");
        Button practice = new Button("Practice");

        BorderPane layout = new BorderPane();

        HBox menu = new HBox();
        menu.setPadding(new Insets(20, 20, 20, 20));
        menu.setSpacing(10);

        menu.getChildren().addAll(enter, practice);
        layout.setTop(menu);

        enter.setOnAction((event) -> layout.setCenter(enterView.getView()));
        practice.setOnAction((event) -> layout.setCenter(practiceView.getView()));

        layout.setCenter(enterView.getView());

        Scene view = new Scene(layout, 400, 300);

        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(VocabularyPracticeApplication.class);
    }
}
