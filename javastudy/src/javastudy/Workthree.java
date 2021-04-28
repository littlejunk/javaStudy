package javastudy;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.print.attribute.standard.PrinterLocation;

public class Workthree {
     public static void main(String[] args) {
        // isValid();
        // Workthreeclass w = new Workthreeclass();
        // w.test3();
        // w.test6();
         //w.test21();
        // w.test30();
    	// MyTriangle mt = new MyTriangle();
    	 //System.out.print(mt.area(1, 1, 1));
//    	 InSum i = new InSum();
//    	 System.out.println(i.sumDigits("5555."));
//    	 System.out.println(MyMath.MaxNumbers(2.0,3.5));
//         System.out.println(MyMath.MaxNumbers(2.0,3.5,9.8));
//         MyMath.displaySortedNumbers(8,3,5);
//         MyMath.displaySortedNumbers(8,3);
    	 //Tempereture.show();
    	 MoneyAccount.show();

	 }
     
     public static void isValid() {
    	 System.out.println("Enter a SNN");
    	 String s1 ;
    	 Scanner s = new Scanner(System.in);
    	 s1 = s.nextLine();
    	 int matchNum = 0;
    	 while(true) {
    		 if(s1.length()==11) {
    			 for(int i = 0;i<11;i++) {
    				 if(i==3||i==6) {
    					 if(s1.charAt(i)!='-') {
    						 break;
    					 }else {
    						 matchNum++;
    					 }
    				 }else {
    					 if(Character.isDigit(s1.charAt(i))){
    						 matchNum++;
    					 }else {
    						 break;
    					 }
    				 }
    			 }
    		 }
    		 if(matchNum == 11) {
    			 System.out.println(s1+" is a valid number");
				 break;
			 }
			 matchNum = 0;
			 System.out.println(s1+" is a invalid number");
			 System.out.println("Enter a SNN again");
			 s1 = s.nextLine();
    	 }
     }
     
}

class MyMath{
    public static double MaxNumbers(double num1,double num2,double num3) {
        double max = num1;
        if (num1 < num2) {
            max = num2;
        }
        if (max > num3) {
            return max;
        } else {
            return num3;
        }
    }

    public static void displaySortedNumbers(double num1,double num2,double num3){
        double t ;
        if(num1<num2){
            t = num1;
            num1 = num2;
            num2 = t;
        }
        if(num1<num3){
            t = num1;
            num1 = num3;
            num3 = t;
        }
        if(num2<num3){
            t = num2;
            num2 =num3;
            num3 = t;
        }
        System.out.println(num3+"  "+num2+"  "+num1);
    }

    public static void displaySortedNumbers(double num1,double num2){
        double t;
        if(num1<num2){
            t = num1;
            num1 = num2;
            num2 = t;
        }
        System.out.println(num2+"   "+num1);
    }

    public static double MaxNumbers(double num1,double num2){
        if(num1>num2){
            return num1;
        }else {
            return num2;
        }
    }
}

class InSum{
    public static int sumDigits(long n){
         return sumDigits(String.valueOf(n));
    }

    public static int sumDigits(String s){
        int sum = 0;
        for(int i = 0;i<s.length();i++){
        	if(Character.isDigit(s.charAt(i))) {
            sum+=s.charAt(i)-48;
        	}else {
        		System.out.println("Input error");
        		return -1;
        	}
        }
        return sum;
    }
}

class MyTriangle{
    public static boolean isValid(double s1,double s2,double s3){
        return ((s1+s2>s3)&&(s1+s3>s2)&&(s2+s3>s1));
    }

    public static double area(double s1,double s2,double s3){
        Scanner s = new Scanner(System.in);
        while (!isValid(s1,s2,s3)){
            System.out.println("this triangel is invalid ,try again");
            s1 = s.nextInt();
            s2 = s.nextInt();
            s3 = s.nextInt();
        }
        double p = (s1+s2+s3)/2.0;
        return Math.pow(p*(p-s1)*(p-s2)*(p-s3),0.5);
    }
}

class Workthreeclass{
	
	public void test3() {
		System.out.println("Enter a,b,c,d,e,f:");
		double a,b,c,d,e,f;
		Scanner s = new Scanner(System.in);
		a = s.nextDouble();
		b = s.nextDouble();
		c = s.nextDouble();
		d = s.nextDouble();
		e = s.nextDouble();
		f = s.nextDouble();
		if((a*d)-(b*c)==0) {
			System.out.println("no solution");
		}else {
			double x , y;
			x = ((e*d)-(b*f))/((a*d)-(b*c));
			y = ((a*f)-(e*c))/((a*d)-(b*c));
			System.out.println("x is "+ x + "  y is "+y);
		}
		
	}
	
	public void test6() {
		double weight , height , BMI;
		System.out.println("Enter weight in kg ");
		Scanner s = new Scanner(System.in);
		weight = s.nextDouble();
		System.out.println("Enter height in meter");
		height = s.nextDouble();
		BMI = weight/height/height*1.0;
		System.out.println("your BMI is "+BMI);
		if(BMI<18.5) {
			System.out.println("you are too silm");
			
		}else if(BMI<=23.9) {
			System.out.println("you are fit");
		}else {
			System.out.println("you are too heavy");
		}
		
	}
	
	public void test21() {
		int h , year , month , day;
		System.out.println("Enter the year month  day");
		Scanner s = new Scanner(System.in);
		year = s.nextInt();
		month = s.nextInt();
		day = s.nextInt();
		if(month==1||month==2) {
			month +=12;
			year += 1;
		}
		h = (int)(day+(26*(month+1)/10.0)+((year%100)*1.25)+Math.abs(year/400)+(5*Math.abs(year/20)))%7;
		System.out.print("today is ");
		switch(h) {
		case 0: System.out.println("Sunday");
		break;
		case 1: System.out.println("Monday");
		break;
		case 2: System.out.println("Tuesday");
		break;
		case 3: System.out.println("Wednesay");
		break;
		case 4: System.out.println("Thursday");
		break;
		case 5: System.out.println("Friday");
		break;
		case 6: System.out.println("Saturday");
		break;
		default:
		break;
		}
	
	}
	
	public void test30() {
		 long totalMillisecends = System.currentTimeMillis();
	        long totalSecends = totalMillisecends/1000;
	        long currentSecends = totalSecends%60;
	        long totalMinus = totalSecends/60;
	        long currentMinus = totalMinus%60;
	        long totalHours = totalMinus/60;
	        long currentHours = totalHours%24;
	        System.out.println("Enter the time zone offset to GMT :");
	        Scanner s = new Scanner(System.in);
	        int offsetHours = s.nextInt();
	        String string = new String();
	        currentHours+=offsetHours;
	        if(currentHours>23){
	            currentHours-=24;
	        }
	        if(currentHours>12){
	            currentHours-=12;
	            string = "下午";
	        }else {
	            string = "上午";
	        }
	        System.out.println("Current time is "+currentHours+":"+currentMinus+":"+currentSecends+ "  "+string);
	}
	
	
}
class Tempereture{

    public static double celsiusToFahrenheit(double celsius){
        return (9.0/5)*celsius+32;
    }

    public static double fahrenheitToCelsius(double fahreheit){
        return (5.0/9)*(fahreheit-32);
    }

    public static void show(){
        System.out.println("摄氏度          华氏度                            华氏度          摄氏度");
        System.out.println("_____________________________________________________");
        double celsius = 40.0;
        double fahrenheit = 120.0;
        for(int i=0;i<10;i++){
        	System.out.println(" "+celsius+"       "+String.format("%-5s",Double.valueOf(String.format("%5.1f",celsiusToFahrenheit(celsius))))+"                "
                    +String.format("%-5s",Double.valueOf(String.format("%5.1f", fahrenheit)))+"       "+Double.valueOf(String.format("%5.2f",fahrenheitToCelsius(fahrenheit))));
            celsius-=1.0;
            fahrenheit-=10.0;
        }
    }

}

class MoneyAccount{

    public static double computeCommission(double salesAmount){
        double tic = 0.0;
        if(salesAmount>10000){
            tic+= ((salesAmount-10000)*0.12 + (5000*0.1) + (5000*0.08));
        }else if(salesAmount>5000){
            tic+= ((salesAmount-5000)*0.1 + (5000*0.08));
        }else {
            tic+= (salesAmount*0.08);
        }
        return tic;
    }

    public static void show(){
        System.out.println("销售总额                              酬金");
        System.out.println("____________________________");
        double salesAmount = 10000;
        double AA=1;
        while (salesAmount<=100000){
            System.out.println(String.format("%-7s",(int)salesAmount)+"              "+String.format("%8s",
                    Double.valueOf(String.format("%.1f",computeCommission(salesAmount)))));
            salesAmount+=5000;
        }
       
    }


}