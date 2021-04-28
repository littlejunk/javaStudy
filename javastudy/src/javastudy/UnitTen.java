package javastudy;

import java.sql.Date;
import java.util.Scanner;

public class UnitTen {
    public static void main(String[] args) {
		MyPoint m1 = new MyPoint(0,0);
		MyPoint m2 = new MyPoint(10,30.5);
		System.out.println(m1.distance(m2));
	}
}

class MyPoint{
	private double x;
	
	private double y;
	
	public MyPoint(double x,double y) {
		this.x = x;
		this.y = y;
	}
	
	public MyPoint() {
		x = 0;
		y = 0;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double distance(Object object) {
		if(object != null) {
			if(object instanceof MyPoint) {
				MyPoint point = (MyPoint)object;
				return distance(point.x, point.y);
			}else {
				return -1;
			}
		}else {
			return -1;
		}
	}
	
	public double distance(double x,double y) {
		return Math.sqrt((this.x-x)*(this.x-x)+((this.y-y)*(this.y-y)));
	}
	
}


class Account{
	private int id;
  
	private double balance;
	
	private double annualInterestRate;
	
	private Date dateCreated;
	
	public Account() {
		
	}
	
	
	public Account(int id,double balance) {
	    this.id = id;
	    this.balance = balance;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		if(balance>0) {
	      	this.balance = balance;
	
		}
	}


	public double getAnnualInterestRate() {
		return annualInterestRate;
	}


	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	public Date getDateCreated() {
		return this.dateCreated;
	}
	
	public double getMonthlyInterestRate() {
		return annualInterestRate/12;
	}
	
	public void withDraw() {
		System.out.println("please input money you want to get");
		System.out.println("your banlance is "+ balance);
		Scanner scanner = new Scanner(System.in);
		double money = scanner.nextDouble();
		while(money>balance) {
			System.out.println("sorry ,you balance is not enough , input again");
			money = scanner.nextDouble();
		}
		balance -= money;
		System.out.println("you get "+ money+"  !");
		System.out.println("your banlance is "+ balance);
	}
	
	public void desposit() {
		System.out.println("your banlance is "+ balance);
		System.out.println("please input the money you want to desposit");
		Scanner scanner = new Scanner(System.in);
	    double money = scanner.nextDouble();
	    balance += money;
		System.out.println("your banlance is "+ balance);
	}
	
	
	
}