package practical;
import java.util.*;

public class Marksheet_9 {
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
        System.out.print("Please enter mark of os out of 100:-");
        int os = sc.nextInt();
        int total = (java + ds + rdms + os);
        int per = total / 4;
        String Grade;
        if (java < 40 || ds < 40 || rdms < 40 || os < 40) {
            Grade = "Fail";
        } else if (per > 80) {
            Grade = "Distinction";
        } else if (per < 79 && per > 60) {
            Grade = "First Class";
        } else {
            Grade = "Pass";
        }
        System.out.println("Name:-" + name);
        System.out.println("Total:-" + total);
        if (Grade == "Fail") {
            System.out.println("Per:- ***" );
        } else {
            System.out.println("Per:-" + per);
        }
        System.out.println("Grade:-" + Grade);
    }
}
