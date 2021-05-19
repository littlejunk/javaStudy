package javastudy;

import java.sql.Date;


public class TestTen {
     public static void main(String[] args) {
//		 Queue queue = new Queue();
//    	 for(int i = 0; i < 20; i ++) {
//			 queue.enqueue(i+1);
//		 }
//    	 for(int i = 0; i < 20; i++) {
//    		 System.out.println(queue.dequeue());
//    	 }
    	 
    	 BankTest.test();
	}
}

class Queue{
	
	private int size;
	
	private int[] element;
	
	public Queue() {
		size = 0;
		element = new int[8];
	}
	
	public void enqueue(int v) {
		size ++;
		if(size > element.length) {
			int[] newelement = new int[element.length*2];
			for(int i = 0;i < element.length; i ++) {
				newelement[i] = element[i];
			}
			element = newelement;
			newelement[size-1] = v;
		}else {
			element[size-1] = v;
		}
	}
	
	public int dequeue() {
		int result = element[0];
		for(int i = 0; i < size-1; i++) {
			element[i] = element[i+1];
		}
		element[size-1] = 0;
		size --;
		return result;
	}
	
	public boolean empty() {
		return !(size == 0);
	}
	
	public int size() {
		return size;
	}
	
	
	
}

class BankTest{
	public static void test() {
	    Account account = new Account(1122, 1000,"George");
		account.setAnnualInterestRate(5.5);
		account.deposit(30);
		account.deposit(40);
		account.deposit(50);
		account.withdraw(5);
		account.withdraw(4);
		account.withdraw(2);
		show(account);
	}
	
	public static void  show(Account account) {
		System.out.println("name : "+ account.getName());
		System.out.println("Annal interst rate : "+account.getAnnualInterestRate());
		System.out.println("balance : "+account.getBalance());
		System.out.println("date                        type      amount      balance");
		Transfromation transfromation[] = account.getTransfromations();
		for(int i=0;i<account.getTnum();i++) {
			System.out.println(transfromation[i].getDate().toGMTString()+"     "+transfromation[i].getType()+"        "+
					transfromation[i].getAmount()+"         "+transfromation[i].getBalance());
		}
	}
}

class Account {
	
	private String name;
	
    private int id;
    
    private double balance;
    
    private static double annualInterestRate;
    
    private java.util.Date dateCreated;
    {
         dateCreated = new java.util.Date();
    }
    
    private int tnum;
    
    public int getTnum() {
		return tnum;
	}
    
    private Transfromation[] transfromations = new Transfromation[10];
    
    
    public Transfromation[] getTransfromations() {
		return transfromations;
	}

	public Account() {
    	
    }
    
    public Account(int newId, double newBalance,String newName) {
       id = newId;
       balance = newBalance;
       name = newName;
    }
    
    
    
    public String getName() {
		return name;
	}

	public int getId() {
    	return this.id; 
    }
    
    public double getBalance() {
    	return balance;
    }
    
    public static double getAnnualInterestRate() { 
    	return annualInterestRate; 
    }
    
    public void setId(int newId) {
    	id = newId; 
    }
    
    public void setBalance(double newBalance) {
        if(newBalance>0) {
         balance = newBalance;
        }
    }
    
    public static void setAnnualInterestRate(double newAnnualInterestRate) {
         annualInterestRate = newAnnualInterestRate;
    }
    
    public double getMonthlyInterest() { 
    	return balance * (annualInterestRate / 1200); 
    }
    
    public java.util.Date getDateCreated() { 
    	return dateCreated;
    }

    public void withdraw(double amount) {
        this.setBalance(balance-amount);
        Transfromation t = new Transfromation(new Date(System.currentTimeMillis()), 'w', amount, balance);
        transfromations[tnum] = t;
        tnum ++;
        
    }
    
    public void deposit(double amount) {
      if(amount<0) {
    	  return;
      }
      this.setBalance(balance+amount);
      Transfromation t = new Transfromation(new Date(System.currentTimeMillis()), 'd', amount, balance);
      transfromations[tnum] = t;
      tnum ++;
    }
 }

class Transfromation{
	
	private Date date;
	
	private char type;
	
	private double amount;
	
	private double balance;

	public Transfromation(Date date, char type, double amount, double balance) {
		super();
		this.date = date;
		this.type = type;
		this.amount = amount;
		this.balance = balance;
	}

	public Date getDate() {
		return date;
	}

	public char getType() {
		return type;
	}

	public double getAmount() {
		return amount;
	}

	public double getBalance() {
		return balance;
	}
	
	
}
