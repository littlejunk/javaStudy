package javastudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class TestFour {
    public static void main(String[] args) {
	        Euation.show();
	}	
    
}

class TestFourArray{
	public static int[] eliminateDuplicates(int[] list){
		 int[] array1 = new int[list.length];
	        int length = 1;
	        boolean flag ;
	        array1[0] = list[0];
	        for(int i = 1;i<list.length;i++){
	            flag =true;
	            for(int j=0;j<length;j++){
	                if(list[i]==array1[j]){
	                    flag = false;
	                    break;
	                }
	            }
	            if(flag){
	                array1[length++] = list[i];
	            }
	        }
	        int[] array2 = new int[length];
	        for(int i=0;i<length;i++){
	        	array2[i] = array1[i];
	        }
	        return array2;
	}
	
	public static int[] eliminateDuplicates(int[] list1, int[] list2){
		int[] array1 = new int[list1.length+list2.length];
		for(int i=0;i<list1.length;i++){
			array1[i] = list1[i];
		}
		for(int i=list1.length;i<list1.length+list2.length;i++){
			array1[i] = list2[i-list1.length];
		}
		return eliminateDuplicates(array1);
	}
	
	public static int[] mergeDuplicatesOrder (int[] list1, int[] list2){
		int[] array = eliminateDuplicates(list1, list2);
		Arrays.sort(array);
		return array;
	}
	
	public static void show(){
		int listoneLength , listtwoLength;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the list1 (the first is the length of list) : ");
		listoneLength = scanner.nextInt();
		int[] list1 = new int[listoneLength];
		for(int i=0;i<listoneLength;i++){
			list1[i] = scanner.nextInt();
		}
		System.out.print("Enter the list2 (the first is the length of list) : ");
		listtwoLength = scanner.nextInt();
		int[] list2 = new int[listtwoLength];
		for(int i=0;i<listtwoLength;i++){
			list2[i] = scanner.nextInt();
		}
		int[] result1 = eliminateDuplicates(list1, list2);
		int[] result2 = mergeDuplicatesOrder(list1, list2);
		System.out.println("Aftre eliminate Duplicates data  , the ayyay is :");
		for(int i =0;i<result1.length;i++){
			System.out.print(" "+result1[i]);
		}
		System.out.println();
		System.out.println("After order and eliminate Duplicates data ,the array is :");
		for(int i = 0;i<result2.length;i++){
			System.out.print(" "+result2[i]);
		}
		
	}
}

class Gcd{
	public static int gcd(int n1 , int n2) {
		if(n1==0||n2==0) {
			System.out.println("error");
			return -1;
		}
		n1 = Math.abs(n1);
		n2 = Math.abs(n2);
		while(n1!=n2) {
			if(n1>n2) {
				n1 = n1-n2;
			}else {
				n2 = n2-n1;
			}
		}
		return n2;
	}
	
	public static int gcd(int...numbers) {
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i] == 0) {
				System.out.println("error");
				return -1;
			}
			numbers[i] = Math.abs(numbers[i]);
		}
		Arrays.sort(numbers);
		int matchNum = 0;
	    int gcd = 1;
		for(int i = 1; i <= numbers[0];i++) {
			matchNum = 0;
			for (int j = 0; j < numbers.length; j++) {
			    if(numbers[j] % i == 0) {
			    	matchNum++;
			    }
			}
			if(matchNum == numbers.length) {
				gcd = i;
			}
		}
		return gcd;
	}
	
	public static void show() {
		System.out.println(gcd(11,22,33,44,55));
		System.out.println(gcd(48,36,12));
		System.out.println(gcd(19,57));
	}
}

class RandomNumSum{
	
	public static void show() {
	    ArrayList List = new ArrayList();
	    System.out.println("enter the num end with -1");
	    int temp;
	    Scanner scanner = new Scanner(System.in);
	    temp = scanner.nextInt();
	    while(temp != -1) {
	        List.add(temp);
	        temp = scanner.nextInt();
	    }
	    int sum = 0;
	    for(int i = 0; i < List.size(); i++) {
	    	sum += (int)List.get(i);
	    }
	    System.out.println("the sum of them is "+sum);
	    List.clear();
	}
}

class Euation{
	
	public static int solveQuadratic(double[] eqn,double[] roots){
		double disc,q;
		disc = eqn[1]*eqn[1]-(4*eqn[0]*eqn[2]);
		if(eqn[0] == 0.0) {
			System.out.println("error");
			return -1;
		}
		q = Math.sqrt(Math.abs(disc));
		if(disc > 0.0) {
			roots[0] = (-1*eqn[1]+q)/2/eqn[0];
			roots[1] = (-1*eqn[1]-q)/2/eqn[0];
			return 2;
		}else if(disc == 0.0) {
			roots[0] = (-1*eqn[1]+q)/2/eqn[0];
			return 1;
		}else {
			return 0;
		}
		
	}
	
	public static void show() {
		double[] equ = new double[3];
		double[] roots = new double[2];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a,b,c :");
		for(int i = 0; i <3; i++) {
			equ[i] = scanner.nextDouble();
		}
		switch(solveQuadratic(equ, roots)) {
		 case -1:
			 System.out.println("it is not equation");
			 break;
		 case 0:
			 System.out.println("the equation has no roots ");
			 break;
		 case 1:
			 System.out.println("the equation has one roots : "+roots[0]);
			 break;
		 case 2:
			 System.out.println("the equation has two roots : "+roots[0]+"  "+roots[1]);
			 break;
		 default:
			 break;
		}
	}
	
}
