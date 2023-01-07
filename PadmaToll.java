package padda;

import java.util.Scanner;
public class PadmaToll {
    public static void main(String[] args) {
        Registry Enter1 = new Registry();
        Vehicle Entry = new Vehicle();
        boolean Loop = true;
        System.out.println("To terminate the programme enter -999");
        while(Loop){
            System.out.println();
            System.out.println();
            System.out.println("**********WELCOME TO NEW PADMA BRIDGE**********");
            System.out.println();
            System.out.println();
            Toll.Opening();
            Scanner sc = new Scanner(System.in);

            System.out.print("\n Enter Your Vehicle Type: ");
            int code = sc.nextInt();
            if(code == -999){
                System.out.println("\nProgramme has been terminated successfully.");
                break;
            }
            Toll.TollMessege(code);
            System.out.println();

            System.out.println("-------------Please Pay the Money-------------");
            Toll.Payment();
            int PaymentMethode = sc.nextInt();
            if(PaymentMethode == -999){
                System.out.println("\nProgramme has been terminated successfully.");
                break;
            }

            
            
            System.out.println("");

            Toll input1 = new Toll(PaymentMethode, code, Enter1, Entry);
            input1.Showlane();
            System.out.println();
            System.out.println("*****THANKS FOR COMING*****\n*****HAVE A SAFE JOURNEY*****");
            System.out.println("-----------------------------------------------------------------------------------------" +
                    "---------------------------------------------------------------------------------------------------" +
                    "----------------------------------------------------------------------------------------------------");
            System.out.println();
            System.out.println();
            System.out.println();
        }



        System.out.println("-------------------------------------------------" +
                "-----------------------------------------------------------------------------------------------" +
                "-------------------------------------------------------------------------------------------------------" +
                "--------------------------------------------------------------------------------------------------------" +
                "\n\t\tSystem is created by Simon, Tanjila, Samin, Shirazum and Nishat\n\t\tSpecial Thanks to Our Honorable Course Instructor" +
                "\n\t\t- ");
    }
}

