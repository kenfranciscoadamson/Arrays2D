/**
 * https://www.hackerrank.com/challenges/30-2d-arrays/problem
 * Input: array of 6x6 integers separated by space
 * Output: biggest sum of an hourglass (a distinct pattern in the array)
 * @author CoffeeCyborg
 */

import java.util.*;

public class Arrays2D {
    
    public static void hourglass(int[][] inputArr) {
        int finalSum = 0;
        int sum = 0;
        for (int  i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                sum += inputArr[i][j];
                sum += inputArr[i-1][j];
                sum += inputArr[i+1][j];
                sum += inputArr[i-1][j-1];
                sum += inputArr[i-1][j+1];
                sum += inputArr[i+1][j-1];
                sum += inputArr[i+1][j+1];
                if (sum > finalSum) {
                    finalSum = sum;
                }
                sum = 0;
            }
        }
        System.out.println(finalSum);
    }
  
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        
        scanner.close();
        
        hourglass(arr);
    }
}
