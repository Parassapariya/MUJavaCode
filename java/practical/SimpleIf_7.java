// Find Maximum Number From Array Using If Condtion
package practical;
public class SimpleIf_7 {
    public static void main(String[] args) {
        int[] intArray = new int[]{3,2,6,1,4,8,5};
        int max = intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            if (max < intArray[i]) {
                max = intArray[i];
            }
        }
       System.out.println(max);
    }
}
