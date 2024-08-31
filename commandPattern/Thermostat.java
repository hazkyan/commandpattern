package commandPattern;

public class Thermostat implements Command{

    @Override
    public String option1() {
        String str = "Room gets colder *grrr*";
        return str;
    }

    @Override
    public String option2() {
        String str = "Room gets warmer :<";
        return str;
    }
    
}
