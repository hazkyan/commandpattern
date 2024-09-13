package commandPattern;

public class TurnOn implements Command {

    private Thermostat thermostat;
    public TurnOn(Thermostat thermostat){
        this.thermostat = thermostat;
    }
    @Override
    public void execute() {
        thermostat.turnOn();
    }

}