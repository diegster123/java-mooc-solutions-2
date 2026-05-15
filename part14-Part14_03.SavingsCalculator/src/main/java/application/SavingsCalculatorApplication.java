package application;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SavingsCalculatorApplication extends Application{

    public static void main(String[] args) {
        launch(SavingsCalculatorApplication.class);
        System.out.println("Hello world!");
    }

    @Override
    public void start(Stage window) throws Exception {
        BorderPane layout = new BorderPane();
        
        NumberAxis xAxis = new NumberAxis(0, 30, 1);
        NumberAxis yAxis = new NumberAxis(0, 27500, 2500);
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
               
        VBox topComponent = new VBox();
        BorderPane monthlySavings = new BorderPane();
        Slider monthlySavingsSlider = new Slider(25, 250, 50);  
        monthlySavingsSlider.setShowTickLabels(true);
        monthlySavingsSlider.setShowTickMarks(true);
        
        Label amount = new Label(String.valueOf(monthlySavingsSlider.getValue()));
        monthlySavings.setLeft(new Label("Monthly savings"));
        monthlySavings.setCenter(monthlySavingsSlider);
        monthlySavings.setRight(amount);
        
        BorderPane yearlyInterest = new BorderPane();
        Slider yearlySavingsSlider = new Slider(0, 10, 0);
        yearlySavingsSlider.setShowTickLabels(true);
        yearlySavingsSlider.setShowTickMarks(true);
        
        Label interest = new Label(String.valueOf(yearlySavingsSlider.getValue()));
        yearlyInterest.setLeft(new Label("Yearly interest rate"));
        yearlyInterest.setCenter(yearlySavingsSlider);
        yearlyInterest.setRight(interest);
        
        // Approach 1: Using a ChangeListener
        monthlySavingsSlider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                amount.setText(String.format("%.2f", newValue));
            }
        });
        
        yearlySavingsSlider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                interest.setText(String.format("%.2f", newValue));
            }
        });
        
              
        topComponent.getChildren().addAll(monthlySavings, yearlyInterest);
        
        layout.setTop(topComponent);
        layout.setCenter(lineChart);
        
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.show();
        
    }

}
