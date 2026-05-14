package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class ShanghaiApplication extends Application {

    public static void main(String[] args) {
        launch(ShanghaiApplication.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        NumberAxis xAxis = new NumberAxis(2006, 2018, 4);
        NumberAxis yAxis = new NumberAxis(0, 100, 4);

        xAxis.setLabel("Year");
        yAxis.setLabel("Ranking");

        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("University of Helsinki, Shanghai Ranking");
        
        XYChart.Series yearData = new XYChart.Series();
        yearData.getData().add(new XYChart.Data(2007, 73));
        yearData.getData().add(new XYChart.Data(2008, 68));
        yearData.getData().add(new XYChart.Data(2009, 72));
        yearData.getData().add(new XYChart.Data(2010, 72));
        yearData.getData().add(new XYChart.Data(2011, 74));
        yearData.getData().add(new XYChart.Data(2012, 73));
        yearData.getData().add(new XYChart.Data(2013, 76));
        yearData.getData().add(new XYChart.Data(2014, 73));
        yearData.getData().add(new XYChart.Data(2015, 67));
        yearData.getData().add(new XYChart.Data(2016, 56));
        yearData.getData().add(new XYChart.Data(2017, 56));
        
        
        lineChart.getData().add(yearData);
        
        Scene view = new Scene(lineChart, 640, 480);
        window.setScene(view);
        window.show();
        
    }

}
