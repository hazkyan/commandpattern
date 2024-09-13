package commandPattern;

public class TurnOff implements Command {

    private Thermostat thermostat;
    public TurnOff(Thermostat thermostat){
        this.thermostat = thermostat;
    }
    @Override
    public void execute() {
        thermostat.turnOn();
    }
}