package commandPattern;

import java.util.Scanner;

public class RemoteControl {
     Scanner sc = new Scanner (System.in);

    public RemoteControl(){
        
        int choice = 0;
        int control = 0;
        while (choice != 4) {
            System.out.print(" [1] TV \n [2] Thermostat \n [3] MusicPlayer \n [4] Exit \n Choose: ");
            choice = sc.nextInt();

            Command controlDevice;

        switch (choice){
            case 1: controlDevice = new Tv();
                while (control != 3) {
                System.out.print(" [1] Power On \n [2] Power Off \n [3] Select Different Device \n Choose: ");
                control = sc.nextInt();
                switch (control) {
                    case 1: System.out.println (controlDevice.option1());
                    continue;
                    case 2: System.out.println (controlDevice.option2());
                    continue;
                    case 3 :
                    break;
                }
            }
            control = 0;
            break;
            case 2: controlDevice = new Thermostat();
                 while (control != 3) {
                 System.out.print(" [1] Increase Temperature \n [2] Decrease Temperature \n [3] Select Different Device \n Choose: ");
                 control = sc.nextInt();
                 switch (control) {
                    case 1: System.out.println (controlDevice.option1());
                    continue;
                    case 2: System.out.println (controlDevice.option2());
                    continue;
                    case 3 :
                    break;
                }
            }
            control = 0;
            break;
            case 3: controlDevice = new musicPlayer();
                while (control != 3) {
                System.out.print(" [1] Open Music Player \n [2] Close Music Player \n [3] Select Different Device \n Choose: ");
                control = sc.nextInt();
                switch (control) {
                   case 1: System.out.println (controlDevice.option1());
                   continue;
                   case 2: System.out.println (controlDevice.option2());
                   continue;
                   case 3 :
                   break;
               }
           }
           control = 0;
            break;
            case 4: System.out.println("Exiting...");
            break;
            default:
                System.out.println("Invalid choice. Please select 1, 2, 3, or 4.");
                continue;
        }
    } 
}
} 


