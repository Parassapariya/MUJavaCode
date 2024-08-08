public class MultiArray {
    public static void main(String[] args) {
        int[][] MultiArrays = new int[3][3];
        MultiArrays[0][0] = 1;
        MultiArrays[0][1] = 2;
        MultiArrays[0][2] = 3;
        MultiArrays[1][0] = 4;
        MultiArrays[1][1] = 5;
        MultiArrays[1][2] = 6;
        MultiArrays[2][0] = 7;
        MultiArrays[2][1] = 8;
        MultiArrays[2][2] = 9;
        for (int i = 0; i < MultiArrays.length; i++) {
            for (int j = 0; j < MultiArrays.length; j++) {
               System.out.println(MultiArrays[i][j]);
            }
        }
    }
}
