package padda;

import java.util.Scanner;

public class OnlinePaid implements Database {
    private long MobileNumber;
    private long Pin;
    int code;
    
    private double paid;
    private long[] digits;
    
    Scanner scn;

    public OnlinePaid(int code, double fine) {
        scn = new Scanner(System.in);
        MobileNumber = -1;
        Pin = -1;
        this.code = code;
        
        paid = 0;
        digits = new long[11];
        
    }

    public static void Printmsg() {
        System.out.println("\nEnter your mobile number.");
    }


    public boolean TestNumber() {
        boolean check = false;
        MobileNumber = scn.nextLong();
        int cnt = digit(MobileNumber);
        if (cnt == 10 && digits[10] == 0 && digits[9] == 1) {
            int tmp = password();
            if (tmp == 5) {
                check = true;
            }
        } else {
            System.out.println("Sorry!! Number could not found\n");
            Toll.setSuccess();
        }
        return check;
    }

    private int password() {
        System.out.println("Enter your account Pin Code : ");
        Pin = scn.nextLong();
        int cnt = digit(Pin);
        if (cnt != 5) {
            System.out.println("Invalid Password");
            Toll.setSuccess();
        }
        return cnt;
    }

    private int digit(long number) {
        long result = number;
        int cnt = 0;

        while (result != 0) {
            digits[cnt] = result % 10;
            result = result / 10;
            cnt++;
        }
        return cnt;
    }

    public String toString() {
        String msg = "";
       
        return "Paid : " + paid + "  taka." +  msg;

    }
}