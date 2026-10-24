public class Thermostat {
    private String location;
    private int temperature;
    private static final int MIN = 16;
    private static final int MAX = 30;
    private static int activeCount = 0;

    Thermostat(String location, int startTemp){
        this.location= location;
        if(startTemp>=MIN && startTemp<=MAX){
            this.temperature=startTemp;
        }
        else{
            this.temperature=22;
        }
        activeCount++;
    }

    public Thermostat(String location){
        this(location, 22);
    }

    public void raise(){
        if(temperature<MAX){
            temperature++;
        }
        else{
            System.out.println("Already at maximum(30)");
        }
    }

    public void lower(){
        if(temperature>MIN){
            temperature--;
        }
        else{
            System.out.println("Already at minimum (16)");
        }
    }

    public int getTemperature(){
        return temperature;
    }

    public static int getactiveCount(){
        return activeCount;
    }
}