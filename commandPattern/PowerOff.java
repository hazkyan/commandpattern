package commandPattern;

public class PowerOff implements Command {
    private Tv tv;

    public PowerOff(Tv tv){
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.powerOff();
    }
}