package application;

import java.io.*;
import java.util.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class PartiesApplication extends Application {

    public String file = "partiesdata.tsv";

    public static void main(String[] args) {
        launch(PartiesApplication.class);
    }

    public Map<String, Map<Integer, Double>> loadData(String file) {
        Map<String, Map<Integer, Double>> values = new HashMap<>();
        try ( BufferedReader br = new BufferedReader(new FileReader(file))) {
            String header = br.readLine();
            String[] parts = header.split("\t");
            List<Integer> years = new ArrayList<>();
            for (int i = 1; i < parts.length; i++) {
                years.add(Integer.valueOf(parts[i]));
            }

            String line;
            while ((line = br.readLine()) != null) {
                String[] tokens = line.split("\t");
                String party = tokens[0];
                Map<Integer, Double> yearValues = new TreeMap<>();
                for (int i = 1; i < tokens.length; i++) {
                    if (!tokens[i].equals("-")) {
                        yearValues.put(years.get(i - 1), Double.valueOf(tokens[i]));
                    }
                }
                values.put(party, yearValues);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return values;
    }

    @Override
    public void start(Stage stage) throws Exception {
        NumberAxis xAxis = new NumberAxis(1968, 2008, 4);
        NumberAxis yAxis = new NumberAxis(0, 30, 5);

        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Relative Support of the parties");

        Map<String, Map<Integer, Double>> values = loadData(file);
        // go through the parties and add them to the chart
        values.keySet().stream().forEach(party -> {
            // a different data set for every party
            XYChart.Series data = new XYChart.Series();
            data.setName(party);

            // add the party's support numbers to the data set
            values.get(party).entrySet().stream().forEach(pair -> {
                data.getData().add(new XYChart.Data(pair.getKey(), pair.getValue()));
            });

            // and add the data set to the chart
            lineChart.getData().add(data);
        });
        
        Scene view = new Scene(lineChart);
        stage.setScene(view);
        stage.show();
    }
}
