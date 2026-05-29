package smiley;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SmileyApplication extends Application {

    public static void main(String[] args) {
        launch(SmileyApplication.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        Canvas paintingCanvas = new Canvas(640, 480);
        GraphicsContext painter = paintingCanvas.getGraphicsContext2D();
        
        painter.setFill(Color.WHITE);
        painter.fillRect(0, 0, paintingCanvas.getWidth(), paintingCanvas.getHeight());
        
        smiley(painter);
        
        BorderPane canvas = new BorderPane();
        canvas.setCenter(paintingCanvas);

        Scene view = new Scene(canvas);
        window.setScene(view);
        window.show();
    }
    
    public void smiley(GraphicsContext painter) {
        painter.setFill(Color.BLACK);
        painter.fillRect(200, 50, 50, 50);
        
        painter.setFill(Color.BLACK);
        painter.fillRect(370, 50, 50, 50);
        
        painter.setFill(Color.BLACK);
        painter.fillRect(150, 200, 50, 50);
        
        painter.setFill(Color.BLACK);
        painter.fillRect(200, 250, 50, 50);
        
        painter.setFill(Color.BLACK);
        painter.fillRect(250, 250, 60, 50);
        
        painter.setFill(Color.BLACK);
        painter.fillRect(310, 250, 60, 50);   
        
        painter.setFill(Color.BLACK);
        painter.fillRect(370, 250, 50, 50);
        
        painter.setFill(Color.BLACK);
        painter.fillRect(420, 200, 50, 50);
    }

}
