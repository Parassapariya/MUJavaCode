package programe_44;

import java.util.*;

public class simp_and_comp_intrest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Principal amount :-");
        double p = sc.nextInt();
        System.out.print("Please Enter Years :-");
        double n = sc.nextInt();
        System.out.print("Please Enter Rate :-");
        double r = sc.nextInt();
        double si = (p * n * r) / 100;
        //compound intrest
        double ci = (p * Math.pow((1 + r / 100 ), n) - p);

        System.out.println("Simple Interest is: " + si);
        System.out.println("Compound Interest is: " + ci);

    }

}
