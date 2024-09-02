package programe_44.loop;

public class loop_17_j {
    public static void main(String[] args) {
        int rows = 5; // Number of rows in the pattern

        for (int i = 1; i <= rows; i++) {
            StringBuilder line = new StringBuilder();
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    line.append("1");
                } else {
                    line.append("0");
                }
            }
            System.out.println(line.toString());
        }
    }
}
