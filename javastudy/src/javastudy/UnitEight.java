package javastudy;

import java.util.Arrays;
import java.util.Scanner;

public class UnitEight {
	
    public static void main(String[] args) {
		//TestTwo.show();
    	//TestFive.show();
    	//TestTwenseven.show();
    	//TestTweneight.show();	

	}
    
}

class TestTwo{
	
	 public static double sumMajorDiagonal(double[][] m) {
	    	double sum = 0.0;
	        for(int i=0;i<m.length;i++) {
	        	sum+=m[i][i];
	        }
	    	return sum;
	 }
	 
	 public static void show() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("输入一个4x4矩阵");
	        double[][] m = new double[4][4];
	        for(int i=0;i<4;i++) {
	        	for(int j=0;j<4;j++) {
	        		m[i][j]=scanner.nextDouble();
	        	}
	        }
	        System.out.println("主对角线所有元素之和为："+sumMajorDiagonal(m));
	 }
}

class TestFive{
	
	public static double[][] addMatrix(double[][] a,double[][] b){
		if(a.length!=b.length) {
			return null;
		}
		double[][] c = new double[a.length][a.length];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		return c;
	}
	
	public static void show() {
		double[][] a = new double[3][3];
		double[][] b = new double[3][3];
		double[][] c ;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter matrix1: ");
        for(int i=0;i<3;i++) {
        	for(int j=0;j<3;j++) {
        		a[i][j] = scanner.nextDouble();
        	}
        }
        System.out.print("Enter matrix2: ");
        for(int i=0;i<3;i++) {
        	for(int j=0;j<3;j++) {
        		b[i][j] = scanner.nextDouble();
        	}
        }
        c = addMatrix(a, b);
        System.out.println("The matrices are added as follows");
        for(int i=0;i<3;i++) {
        	if(i!=1) {
        		System.out.println(String.format("%-3s", a[i][0])+"  "+String.format("%-3s", a[i][1])+"  "+String.format("%-3s", a[i][2])+
        				"        "+String.format("%-3s", b[i][0])+"  "+String.format("%-3s", b[i][1])+"  "+String.format("%-3s", b[i][2])+
        				"        "+String.format("%-3s", c[i][0])+"  "+String.format("%-3s", c[i][1])+"  "+String.format("%-3s", c[i][2]));
        	}else {
				System.out.println(String.format("%-3s", a[i][0])+"  "+String.format("%-3s", a[i][1])+"  "+String.format("%-3s", a[i][2])+
        				"    +   "+String.format("%-3s", b[i][0])+"  "+String.format("%-3s", b[i][1])+"  "+String.format("%-3s", b[i][2])+
        				"    =   "+String.format("%-3s", c[i][0])+"  "+String.format("%-3s", c[i][1])+"  "+String.format("%-3s", c[i][2]));
			}
        }
	}
}

class TestTwenseven{
	
	public static double[][] sortColumns(double[][] m){
		double[][] m1 = new double[m.length][m[0].length];
		double[] temp = new double[m.length];
		for(int i=0;i<m[0].length;i++) {
			for(int j=0;j<m.length;j++) {
				temp[j] = m[j][i];
			}
			Arrays.sort(temp);
			for(int j=0;j<m.length;j++) {
				m1[j][i] = temp[j];
			}
		}
		return m1;
	}
	
	public static void show() {
		System.out.println("Enter a 3-by-3 matrix row by row:");
		Scanner scanner = new Scanner(System.in);
		double[][] m = new double[3][3];
		double[][] m1;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				m[i][j] = scanner.nextDouble();
			}
		}
		m1 = sortColumns(m);
		System.out.println("The column-sorted array is");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(" "+String.format("%-6s", m1[i][j])+" ");
			}
			System.out.println();
		}
	}
	
}

class TestTweneight{
	
	public static boolean equals(int[][] m1,int[][] m2) {
		if(m1.length!=m2.length) {
			return false;
		}
		if(m1[0].length!=m2[0].length) {
			return false;
		}
		boolean flag = true;
		for(int i=0;i<m1.length;i++) {
			for(int j=0;j<m1[0].length;j++) {
				if(m1[i][j]!=m2[i][j]) {
					flag = false;
					break;
				}
			}
		}
		return flag;
	}
	
	public static void show() {
		int[][] m1 = new int[3][3];
		int[][] m2 = new int[3][3];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter list1:");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				m1[i][j] = scanner.nextInt();
			}
		}
		System.out.println("Enter list2:");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				m2[i][j] = scanner.nextInt();
			}
		}
		if(equals(m1, m2)) {
			System.out.println("The two arrays are strictly identical");
		}else {
			System.out.println("The two arrays are not strictly identical");
		}
	}
}


