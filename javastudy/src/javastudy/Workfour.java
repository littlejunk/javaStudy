package javastudy;

import java.util.Scanner;

public class Workfour {
	public static void main(String[] args) {
		Workfourclass w = new Workfourclass();
		//w.test1();
		w.test2();
		//w.test3();
		//w.test4();
	}

}
class Workfourclass{
    public void test1(){
        System.out.println("Enter the lenght from the center to a vertex : ");
        Scanner s = new Scanner(System.in);
        double length = s.nextDouble();
        double s1 = 2*length*Math.sin(Math.PI/5);
        double area = 5*s1*s1/(4*Math.tan(Math.PI/5));
        System.out.println("The area of the pentagon is "+area);
    }

    public void test2(){
        System.out.println("Enter a hex digit:");
        Scanner scanner = new Scanner(System.in);
        String string,result="" ;
        string = scanner.nextLine();
        boolean flag = true;
        for(int i=0;i<string.length();i++){
            if((string.charAt(i)>=48&&string.charAt(i)<=57)||(string.charAt(i)>=65&&string.charAt(i)<=70)){
                flag = true;
            }else{
                flag = false;
                break;
            }
        }
        if(flag){
            for(int i=0;i<string.length();i++) {
            	if(string.charAt(i)>='0'&&string.charAt(i)<='9') {
            		result+=Integer.toBinaryString(string.charAt(i)-48);
            	}else {
            		result+=Integer.toBinaryString(string.charAt(i)-55);
            	}
            }
            System.out.println(result);
        }else {
            System.out.println(string+" is invalid input");
        }
    }

    public void test3(){
    	System.out.println("outout a random A-Z");
        int num = 65+(int)(Math.random()*26);
        System.out.println((char) num);
    }

    public void test4(){
        class Employee{
            private String name;
            private double workTime;
            private double money;
            private double stateRate;
            private double federalRate;
            private double totalmoney;
            private double lastmoney;
            private double federmoney;
            private double statemoney;
            private double totaltax;

            public void inIt(){
                this.totalmoney = money*workTime;
                this.federmoney = this.totalmoney*federalRate;
                this.statemoney = this.totalmoney*stateRate;
                this.totaltax = this.federmoney+statemoney;
                this.lastmoney = this.totalmoney-this.totaltax;
            }

            public void setName(String name) {
                this.name = name;
            }

            public void setWorkTime(double workTime) {
                this.workTime = workTime;
            }

            public void setMoney(double money) {
                this.money = money;
            }

            public void setStateRate(double stateRate) {
                this.stateRate = stateRate;
            }

            public void setFederalRate(double federalRate) {
                this.federalRate = federalRate;
            }

            public String getName() {
                return name;
            }

            public double getWorkTime() {
                return workTime;
            }

            public double getMoney() {
                return money;
            }

            public double getStateRate() {
                return stateRate;
            }

            public double getFederalRate() {
                return federalRate;
            }

            public double getTotalmoney() {
                return totalmoney;
            }

            public double getLastmoney() {
                return lastmoney;
            }

            public double getFedermoney() {
                return federmoney;
            }

            public double getStatemoney() {
                return statemoney;
            }

            public double getTotaltax() {
                return totaltax;
            }
        }
        Scanner scanner = new Scanner(System.in);
        Employee employee = new Employee();
        System.out.println("Enter employee's name:");
        employee.setName(scanner.nextLine());
        System.out.println("Enter number of hours worked in a week :");
        employee.setWorkTime(scanner.nextDouble());
        System.out.println("Enter hourly pay rate:");
        employee.setMoney(scanner.nextDouble());
        System.out.println("Enter federal tax rate:");
        employee.setFederalRate(scanner.nextDouble());
        System.out.println("Enter state tax rate:");
        employee.setStateRate(scanner.nextDouble());
        employee.inIt();
        System.out.println("Employee Name: "+employee.getName());
        System.out.println("Hours Worked: "+employee.getWorkTime());
        System.out.println("Pay Rate: $"+employee.getMoney());
        System.out.println("Gross Pay: $"+employee.getTotalmoney());
        System.out.println("Deductions:");
        System.out.println("   Federal Withholding : $"+employee.getFedermoney());
        System.out.println("   State Withholding: $"+employee.getStatemoney());
        System.out.println("   Total Deduction: $"+employee.getTotaltax());
        System.out.println("Net Pay: $"+employee.getLastmoney());

    }
}