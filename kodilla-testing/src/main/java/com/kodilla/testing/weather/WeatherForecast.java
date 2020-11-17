package com.kodilla.testing.weather;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeatherForecast {
    private Temperatures temperatures;
    private Map<String, Double> Mapa;


    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public WeatherForecast(Map<String, Double> Mapa) {
        this.Mapa = Mapa;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }

    public double average() {

        Map<String, Double> temperatures = this.temperatures.getTemperatures();
        double average = 0;
        for (Map.Entry<String, Double> entry : temperatures.entrySet()) {
            average += entry.getValue();

        }
        return average / temperatures.size();
    }


    public double mediana() {
        Map<String, Double> temperatures = this.temperatures.getTemperatures();
        List<Double> theList = new ArrayList<>();
        double temporary;
        for (Map.Entry<String, Double> entry : temperatures.entrySet()) {
                double temp = entry.getValue();
                theList.add(temp);
        }

        for (int i = 0; i < theList.size()-1; i++) {
            for (int j = 0; j < temperatures.size()-1; j++) {
                if (theList.get(j) > theList.get(j + 1)) {
                    temporary = theList.get(j);
                    double z = theList.get(j + 1);
                    theList.remove(j + 1);
                    theList.remove(j);
                    theList.add(j, z);
                    theList.add(j + 1, temporary);
                }
            }
        }
        if(theList.size()%2==0){
            int x=theList.size()/2;
            double mediana =((theList.get(x)) + theList.get(x+1))/2;
            return  mediana;
        }
        else {
            int x = theList.size()/2;
            double mediana = theList.get(x);
            return  mediana;
        }

}


}


