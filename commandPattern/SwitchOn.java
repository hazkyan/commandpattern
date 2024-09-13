package commandPattern;

public class SwitchOn implements Command {
    private Lights lights;

    public SwitchOn(Lights lights){
        this.lights = lights;
    }

    @Override
    public void execute() {
        lights.switchOn();
    }
}