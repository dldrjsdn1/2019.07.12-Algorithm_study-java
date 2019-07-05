


import java.util.Scanner;

public class MapMul {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int[] count = new int[10];
      String result = sc.nextInt() * sc.nextInt() * sc.nextInt() + "";
      char[] arr = result.toCharArray();

      for (int i = 0; i < arr.length; i++)
         count[Character.getNumericValue(arr[i])]++;

      for (int i = 0; i < 10; i++)
         System.out.println(i + ":" + count[i]);

   }
}