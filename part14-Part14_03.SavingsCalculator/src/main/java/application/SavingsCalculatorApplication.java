package application;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SavingsCalculatorApplication extends Application {

    public static void main(String[] args) {
        launch(SavingsCalculatorApplication.class);
        System.out.println("Hello world!");
    }

    @Override
    public void start(Stage window) throws Exception {
        BorderPane layout = new BorderPane();

        NumberAxis xAxis = new NumberAxis(0, 30, 1);
        NumberAxis yAxis = new NumberAxis();
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Savings calculator");
        lineChart.setLegendVisible(false);

        //VBOX for monthly savings and yearly interest
        VBox topComponent = new VBox();
        BorderPane monthlySavings = new BorderPane();
        Slider monthlySavingsSlider = new Slider(25, 250, 25);
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

        // Approach 1: Using a ChangeListener to display the values in the right hand side
        monthlySavingsSlider.valueProperty().addListener((change, oldvalue, newValue) -> {
            amount.setText(String.format("%.1f", newValue));
            updateChart(lineChart, monthlySavingsSlider.getValue(), yearlySavingsSlider.getValue());
        });

        yearlySavingsSlider.valueProperty().addListener((change, oldValue, newValue) -> {
            updateChart(lineChart, monthlySavingsSlider.getValue(), yearlySavingsSlider.getValue());
        });

        topComponent.getChildren().addAll(monthlySavings, yearlyInterest);

        layout.setTop(topComponent);
        layout.setCenter(lineChart);

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.show();

    }

    public static void updateChart(LineChart<Number, Number> chart, double monthlyValue, double interestRate) {
        chart.getData().clear();
        XYChart.Series<Number, Number> savingsData = new XYChart.Series();
        for (int i = 0; i <= 30; i++) {
            double yearlySavings = monthlyValue * 12 * i;
            savingsData.getData().add(new XYChart.Data(i, yearlySavings));
        }

        XYChart.Series<Number, Number> interestData = new XYChart.Series();
        double savings = 0;
        for (int i = 0; i <= 30; i++) {
            savings += monthlyValue * 12;
            savings = savings * (1 + interestRate / 100);
            interestData.getData().add(new XYChart.Data(i, savings));
        }
        chart.getData().addAll(savingsData, interestData);
    }
}
