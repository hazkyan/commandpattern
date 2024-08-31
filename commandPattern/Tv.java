package commandPattern;

public class Tv implements Command{

    @Override
    public String option1() {
        String str = "TV screen on. Let's watch";
        return str;
    }
   
    @Override
    public String option2() {
        String str = "TV has turned off. Bye :< ";
        return str;
    }
}
