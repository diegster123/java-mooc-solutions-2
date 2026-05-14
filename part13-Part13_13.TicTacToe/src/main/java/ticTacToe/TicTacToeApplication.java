package ticTacToe;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TicTacToeApplication extends Application {

    private String playerTurn = "X";

    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
    }

    @Override
    public void start(Stage game) throws Exception {
        BorderPane layout = new BorderPane();

        Label turn = new Label("Turn: " + playerTurn);
        turn.setFont(Font.font("Verdana", 40));

        GridPane grid = new GridPane();

        grid.setAlignment(Pos.CENTER);
        grid.setVgap(10);
        grid.setHgap(10);
        grid.setPadding(new Insets(10, 10, 10, 10));
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Button btn = new Button(" ");
                btn.setFont(Font.font("Monospaced", 40));
                grid.add(btn, i, j);
                btn.setOnMouseClicked((event -> {
                    makeTurn(btn, turn);
                    if (checkWin(grid, turn)) {
                        grid.getChildren().forEach(node -> ((Button) node).setDisable(true));
                    }
                }));
            }
        }

        layout.setTop(turn);
        layout.setCenter(grid);

        Scene scene = new Scene(layout);
        game.setScene(scene);
        game.show();
    }

    public void makeTurn(Button btn, Label turn) {
        if (!btn.getText().trim().isEmpty()) {
            return;
        }
        if (playerTurn.equals("X")) {
            btn.setText("X");
            playerTurn = "O";
        } else {
            btn.setText("O");
            playerTurn = "X";
        }
        turn.setText("Turn: " + playerTurn);
    }

    public boolean checkWin(GridPane grid, Label turn) {
        for (int row = 0; row < 3; row++) {
            Button b1 = getButton(grid, row, 0);
            Button b2 = getButton(grid, row, 1);
            Button b3 = getButton(grid, row, 2);

            if (!b1.getText().trim().isEmpty()
            && b1.getText().equals(b2.getText())
            && b2.getText().equals(b3.getText())) {
                turn.setText("The end!");
                return true;
            }
        }

        for (int row = 0; row < 3; row++) {
            Button b1 = getButton(grid, 0, row);
            Button b2 = getButton(grid, 1, row);
            Button b3 = getButton(grid, 2, row);

            if (!b1.getText().trim().isEmpty()
            && b1.getText().equals(b2.getText())
            && b2.getText().equals(b3.getText())) {
                turn.setText("The end!");
                return true;
            }
        }

        Button d1 = getButton(grid, 0, 0);
        Button d2 = getButton(grid, 1, 1);
        Button d3 = getButton(grid, 2, 2);
        if (!d1.getText().trim().isEmpty()
        && d1.getText().equals(d2.getText())
        && d2.getText().equals(d3.getText())) {
            turn.setText("The end!");
            return true;
        }

        Button d4 = getButton(grid, 0, 2);
        Button d5 = getButton(grid, 1, 1);
        Button d6 = getButton(grid, 2, 0);
        if (!d4.getText().trim().isEmpty()
        && d4.getText().equals(d5.getText())
        && d5.getText().equals(d6.getText())) {
            turn.setText("The end!");
            return true;
        }
        return false;
    }

    private Button getButton(GridPane grid, int col, int row) {
        for (javafx.scene.Node node : grid.getChildren()) {
            if (GridPane.getColumnIndex(node) == col && GridPane.getRowIndex(node) == row) {
                return (Button) node;
            }
        }
        return null;
    }

}
