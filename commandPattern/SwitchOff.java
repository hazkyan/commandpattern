package commandPattern;

public class SwitchOff implements Command {
    private Lights lights;

    public SwitchOff(Lights lights){
        this.lights = lights;
    }

    @Override
    public void execute() {
        lights.switchOff();
    }
}