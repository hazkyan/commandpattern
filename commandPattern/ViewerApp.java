package commandPattern;

public class ViewerApp {
    public static void main(String[] args) {
        Tv tv = new Tv();
        Lights lights = new Lights();
        Thermostat thermostat = new Thermostat();
        RemoteControl remoteControl = new RemoteControl();

        Command powerOn = new PowerOn(tv);
        Command powerOff = new PowerOff(tv);
        Command switchOn = new SwitchOn(lights);
        Command switchOff = new SwitchOff(lights);
        Command turnOn = new TurnOn(thermostat);
        Command turnOff = new TurnOff(thermostat);

        remoteControl.setCommand(powerOn);
        remoteControl.executeCommand();

        remoteControl.setCommand(switchOn);
        remoteControl.executeCommand();

        remoteControl.setCommand(turnOn);
        remoteControl.executeCommand();




    }

}