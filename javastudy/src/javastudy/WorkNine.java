package javastudy;

import com.sun.media.sound.DirectAudioDeviceProvider;
import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;
import com.sun.prism.Presentable;
import com.sun.webkit.ThemeClient;

import javafx.util.converter.PercentageStringConverter;

public class WorkNine {
    public static void main(String[] args) {
//		Stock stock = new Stock("ORCL", "Oracle Corporation");
//		stock.setPreviousClosingPrice(34.5);
//		stock.setCurrentPrice(34.35);
//		System.out.println("the price had changed "+stock.getChangePercent()+"%");
	
    	
//    	Fan fan1 = new Fan();
//    	fan1.setSpeed(Fan.FAST);
//    	fan1.setRadius(10);
//    	fan1.setColor("yellow");
//    	fan1.setOn(true);
//    	Fan fan2 = new Fan();
//    	fan2.setSpeed(Fan.MEDIUM);
//    	fan2.setRadius(5);
//    	fan2.setColor("blue");
//    	fan2.setOn(false);
//    	System.out.println(fan1.toString());
//    	System.out.println(fan2.toString());
    	
    	
    	RegularPolygon r1 = new RegularPolygon();
    	RegularPolygon r2 = new RegularPolygon(6, 4);
    	RegularPolygon r3 = new RegularPolygon(10, 4, 5.6, 7.8);
    	System.out.println(r1.toString());
    	System.out.println(r2.toString());
    	System.out.println(r3.toString());
    	
    	
    }
}

class Stock{
	private String symbol;
	
	private String name;
	
	private double previousClosingPrice;
	
	private double currentPrice;
	

	public double getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}

	public double getPreviousClosingPrice() {
		return previousClosingPrice;
	}

	public void setPreviousClosingPrice(double previousClosingPrice) {
		this.previousClosingPrice = previousClosingPrice;
	}

	public Stock(String symbol, String name) {
		this.name = name;
		this.symbol = symbol;
	}
    
	public double getChangePercent() {
		double percent;
		percent = (currentPrice-previousClosingPrice)/previousClosingPrice*100.0;
		return percent;
	}
}

class Fan{
	public final static int SLOW = 1;
	
	public final static int MEDIUM = 2;
	
	public final static int FAST = 3;
	
	private int speed;
	
	private boolean on;
	
	private double radius;
	
	private String color;
	
	public Fan() {
		
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if(speed!=1&&speed!=2&&speed!=3) {
			System.out.print("Error");
		}else {
			this.speed = speed;
		}
		
	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString() {
		if(on) {
			return("speed = "+Integer.toString(speed)+"  color = "+color+"  radius = "+Double.toString(radius));
		}else {
			return("fan is off "+"  color = "+color+"  radius = "+Double.toString(radius));
		}
	}
}

class RegularPolygon{
	private int n;
	
	private double side;
	
	private double x;
	
	private double y;
	
	public RegularPolygon() {
		n = 3;
		side = 1;
		x = 0;
		y = 0;
	}

	public RegularPolygon(int n, double side) {
		this.n = n;
		this.side = side;
		this.x = 0;
		this.y = 0;
	}

	public RegularPolygon(int n, double side, double x, double y) {
		this.n = n;
		this.side = side;
		this.x = x;
		this.y = y;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public double getPerimeter() {
		return n*side;
	}
	
	public double getArea() {
		return (n*side*side)/(4*Math.tan(Math.PI/n));
	}
	
	public String toString() {
		return "the perimeter= "+getPerimeter()+"  the area="+getArea();
	}
	
}