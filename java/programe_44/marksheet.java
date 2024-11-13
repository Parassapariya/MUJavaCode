package programe_44;

import java.util.*;

public class marksheet {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Your Name :-");
        String name = sc.next();
        System.out.print("Please enter mark of java out of 100:-");
        int java = sc.nextInt();
        System.out.print("Please enter mark of ds out of 100:-");
        int ds = sc.nextInt();
        System.out.print("Please enter mark of rdms out of 100:-");
        int rdms = sc.nextInt();
        
        int total = (java + ds + rdms );
        int per = total / 3;
        String Grade;
        if (java < 40 || ds < 40 || rdms < 40) {
            Grade = "Fail";
        } else if (per >= 80) {
            Grade = "Distinction";
        } else if (per <= 79 && per >= 60) {
            Grade = "First Class";
        } else {
            Grade = "Pass";
        }
        System.out.println("Name:-" + name);
        System.out.println("Total:-" + total);
        if (Grade == "Fail") {
            System.out.println("Per:- ***");
        } else {
            System.out.println("Result :- Pass");
            System.out.println("Per:-" + per);
        }
        System.out.println("Class:-" + Grade);
    }
}
