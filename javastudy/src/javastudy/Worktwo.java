package javastudy;

import java.util.Scanner;

public class Worktwo {
    public static void main(String[] args) {
		Worktwoclass w = new  Worktwoclass();
//		w.work1();
//		w.work2();
//		w.work3();
		w.work5();
		
		
	}
}

class Worktwoclass {
	
	public void work1() {
		System.out.println("请输入一个double型的摄氏温度");
		Scanner s = new Scanner(System.in);
		double d = s.nextDouble();
		System.out.println("转化为华氏温度为"+(1.8*d+32));
		s.close();
	}
	
	public void work2() {
		System.out.println("Enter a value for feet");
		Scanner s = new Scanner(System.in);
		double d = s.nextDouble();
		System.out.println(d +" feet is "+d*0.305+" meters");
		s.close();
	}
	
	public void work3() {
		double money , moneyrate;
		System.out.println("Enter the sybtotal and a gratuity rate:");
		Scanner s = new Scanner(System.in);
		money = s.nextDouble();
		moneyrate = s.nextDouble();
		System.out.println("The gratuity is $"+money*moneyrate*0.01+" and total is $"+(money*moneyrate*0.01+money));
		s.close();
	}
	
	public void work4() {
		double x1,x2,y1,y2;
		System.out.println("Enter x1 and y1 :");
		Scanner s = new Scanner(System.in);
		x1 = s.nextDouble();
		y1 = s.nextDouble();
		System.out.println("Enter x2 and y2 :");
		x2 = s.nextDouble();
		y2 = s.nextDouble();
		double distance;
		distance = Math.pow((Math.abs(x1-x2)*Math.abs(x1-x2))+( Math.abs(y1-y2)*Math.abs(y1-y2)),0.5);
		System.out.println("The distance between the two points is "+distance);
		s.close();
		
	}
	
	public void work5() {
		double investAmount,annualRate,yearNumber,sumMoney;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter investment amount :");
		investAmount = s.nextDouble();
		System.out.println("Enter annual interest rate in percentage:");
		annualRate = s.nextDouble();
		System.out.println("Enter number of years:");
		yearNumber = s.nextDouble();
		sumMoney = investAmount*Math.pow(1+(annualRate*0.01),yearNumber);
		System.out.println("Accumulated value is $"+sumMoney);
		s.close();
	}
	
}