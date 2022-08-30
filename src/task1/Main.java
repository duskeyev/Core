package task1;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];

        Random rnd = new Random();
        for (int i=0;i < arr.length;i++) {
            for (int j=0;j < arr[i].length;j++) {
                arr[i][j]=rnd.nextInt(100);
            }
        }
        int min = arr[1][1];
        int max = arr[1][1];
        double sum = 0;
        int counter = 0;

        for (int i=0;i < arr.length;i++) {
            for (int j=0;j < arr[i].length;j++) {
            counter++;
            sum = sum+arr[i][j];

            if (arr[i][j]<min){
                min = arr[i][j];
                }
            if (arr[i][j]> max) {
                max =arr[i][j];
                }
            }

         }
        double average = sum/counter;
        for (int i=0;i<arr.length;i++ ){
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println(min + " - MIN");
        System.out.println(max +  " - MAX");
        System.out.println(average + " - Average");




    }

}
