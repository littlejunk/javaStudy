package javastudy;

import java.util.Scanner;

public class TestThree {
    public static void main(String[] args) {
            double[] array = new double[10];
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter 10 double value");
            for(int i=0;i<10;i++){
            	array[i] = scanner.nextDouble();
            }
            System.out.println("The average of 10 double values is "+MyArray.average(array));
            System.out.println("The minnum of 10 double values is  "+MyArray.min(array));
            System.out.println("The element of index "+MyArray.indexOfSmallestElement(array)+" is the mininum element");
    }

    public static void randomNum(){
        int[] array = new int[10];
        for(int i=0;i<100;i++){
            int random = (int)(Math.random()*10);
            array[random]+=1;
        }
        for(int i=0;i<10;i++){
            System.out.println( i+"  Number of occurrences is  "+array[i]);
        }
    }

    public static void saveNum(){
        System.out.println("Enter 10 numbers:");
        int[] array = new int[10];
        Scanner s = new Scanner(System.in);
        for(int i=0;i<10;i++){
            array[i] = s.nextInt();
        }
        int[] array1 = new int[10];
        int length = 1;
        boolean flag ;
        array1[0] = array[0];
        for(int i = 1;i<10;i++){
            flag =true;
            for(int j=0;j<length;j++){
                if(array[i]==array1[j]){
                    flag = false;
                    break;
                }
            }
            if(flag){
                array1[length++] = array[i];
            }
        }
        System.out.println("the number of distinct values is "+length);
        for(int i=0;i<length;i++){
            System.out.print(array1[i]+"  ");
        }
    }
 }

class MyArray {
    public static int average(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }

    public static double average(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length * 1.0;
    }

    public static double min(double[] list) {
        double min = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i] < min) {
                min = list[i];
            }
        }
        return min;
    }

    public static int indexOfSmallestElement(double[] list) {
        double min = list[0];
        int minNum = 0;
        for (int i = 1; i < list.length; i++) {
            if (list[i] < min) {
                min = list[i];
                minNum = i;
            }
        }
        return minNum;
    }
}