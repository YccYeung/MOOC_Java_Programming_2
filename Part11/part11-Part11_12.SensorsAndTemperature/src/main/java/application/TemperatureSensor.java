package application;
import java.util.Random;

public class TemperatureSensor implements Sensor{
    
    private boolean IsOn;
   
    public TemperatureSensor() {
        IsOn = false;
    }

    @Override
    public boolean isOn() {
        return IsOn;
    } 
    
    @Override
    public void setOn() {
        IsOn = true;
    }  
    
    @Override
    public void setOff() {
        IsOn = false;
    }  
      
    @Override
    public int read() {

        if  (isOn() == false) {
            throw new IllegalStateException();
        }

        Random random = new Random();
        int value = random.nextInt(61) - 30;

        return value;
    }
}


