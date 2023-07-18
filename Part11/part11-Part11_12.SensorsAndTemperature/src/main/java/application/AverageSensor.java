package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AverageSensor implements Sensor{
    
    private List<Sensor> sensorList;
    private List<Integer> averageReading;
   
    public AverageSensor() {
        this.sensorList = new ArrayList<>();
        this.averageReading = new ArrayList<>();
    }

    public void addSensor(Sensor toAdd) {
        this.sensorList.add(toAdd);
    }

    @Override
    public boolean isOn() {
        int count = 0;
        for (Sensor i : sensorList) {
            if (i.isOn() == true) {
                count++;
            }
        }
        if (count == sensorList.size()) {
            return true;
        }

        return false;
    } 
    
    @Override
    public void setOn() {
        for (Sensor i : sensorList) {
            i.setOn();
        }
    }  
    
    @Override
    public void setOff() {
        for (Sensor i : sensorList) {
            i.setOff();
        }
    }  
      
    @Override
    public int read() {
        int sum = 0;
        for (Sensor i : sensorList) {
            sum += i.read();
        }

        if (isOn() == false || sensorList.isEmpty()) {
            throw new IllegalStateException();
        }

        int average = sum/sensorList.size();
        this.averageReading.add(average);
        return average;

    }

    public List<Integer> readings() {
        List<Integer> temp = new ArrayList<>();
        for (Integer i : averageReading) {
            temp.add(i);
        }

        return temp;
    }
}
