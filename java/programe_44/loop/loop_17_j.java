package programe_44.loop;

public class loop_17_j {
    public static void main(String[] args) {
        int n = 5;
        int number = 1;
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i; j++) {
                if (j%2==0) {
                    System.out.print("0");
                }else{
                    System.out.print("1");
                }
                
            }
            //number--;
            System.out.println();
        }
    }
}
