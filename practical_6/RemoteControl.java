package practical_6;

interface Switchable {
    void on();
    void off();
    default void toggle() {
        on();
    }
}

class Fan implements Switchable {
    public void on() {
        System.out.println("Fan is ON");
    }
    public void off() {
        System.out.println("Fan is OFF");
    }
}

class Light implements Switchable {
    public void on() {
        System.out.println("Light is ON");
    }
    public void off() {
        System.out.println("Light is OFF");
    }
}

@FunctionalInterface
interface SwitchRule {
    boolean maySwitchOn(Switchable device, int hour);
}

public class RemoteControl {
    public static void main(String[] args) {
        Fan fan = new Fan();
        Light light = new Light();
        Switchable[] devices = {fan, light};

        System.out.println("Toggling devices:");
        for (int i = 0; i < devices.length; i++) {
            devices[i].toggle();
        }

        int hour = 20;

        SwitchRule rule1 = new SwitchRule() {
            public boolean maySwitchOn(Switchable device, int hour) {
                return hour >= 18 && hour <= 22;
            }
        };

        System.out.println("\nAnonymous class:");
        System.out.println("Fan may switch ON: " + rule1.maySwitchOn(fan, hour));

        SwitchRule rule2 = (device, h) -> h >= 6 && h <= 22;
        
        System.out.println("\nLambda:");
        System.out.println("Light may switch ON: " + rule2.maySwitchOn(light, hour));
    }
}