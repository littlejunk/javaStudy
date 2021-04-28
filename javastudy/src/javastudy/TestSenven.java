package jjj;

public class TestSenven {
     public static void main(String[] args) {
		//testPoint();
    	 testA();
	}
     
     public static void testPoint(){
    	 Point p1 = new Point(0, 0);
    	 Point p2 = new Point(10,30.5);
    	 p1.translate(3, 5);
    	 System.out.println("the location of p1 is ("+p1.getX()+","+p1.getY()+")");
    	 System.out.println(Point.distance(0, 0, 10, 30.5));
     }
     
     public static void  testA() {
    	 A.setB(100);
 		 A.inputB();
 		 A cat = new A();
 		 A dog = new A();
 		 cat.setA(200);
 		 cat.setB(400);
 		 dog.setA(150);
 		 dog.setB(300);
 		 cat.inputA();
 		 cat.inputB();
 		 dog.inputA();
 		 dog.inputB();
	}
}

class Point{
	private double x;
	
	private double y;
	
	public Point() {
		// TODO 自动生成的构造函数存根
	   x = 0;
	   y = 0;
	}
	
	public Point(double x,double y){
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		
		return x;
		
	}
	
	public double getY(){
		
		return y;
	}
	
	public void setLocation(double newx,double newy){
		x = newx;
		y = newy;
	}
	
	public double distanceFromOrigin() {
		
		return Math.sqrt((x*x)+(y*y));
	}
	
	public void translate(int dx,int dy){
		x += dx;
		y += dy;
	}
	
	public static double distance(double x1,double y1,double x2,double y2){
		return Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
	}
	
}

class A{
	private float a;
	
	private static float b;
	
	void setA(float newa){
		a = newa;
	}
	
	static void setB(float newb){
		b = newb;

	}
	float getA(){
		return a;
	}
	static float getB(){
		return b;
	}
	void inputA(){
		System.out.println(a);
	}
	static void inputB(){
		System.out.println(b);
	}
}
