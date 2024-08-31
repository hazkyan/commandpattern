package commandPattern;

public class musicPlayer implements Command{
   
    @Override
    public String option1() {
        String str = "Music player on! Running playlist 1";
        return str;
    }

    @Override
    public String option2() {
        String str = "Music player has turned off";
        return str;
    }
    
}
