public class TestNine {
      public static void main(String[] args){
    	 
    	  
      }
}
class Student{
	   private final  int  id;
	   private final  BirthDate  birthDate;
	   private final  String name;
	   public Student(int ssn ,BirthDate date,String name){
	     id = ssn;
	     birthDate =date;
	     this.name = name;
	   }
	   public int getId(){
	      return id;
	   }
	   public BirthDate getBirthDate(){
	      return birthDate;
	   }
	   public String getName() {
		   return name;
	   }
	@Override
	  public String toString() {
		return "Student [id=" + id + ", birthDate=" + birthDate + ", name=" + name + "]";
	 }
	   
	}
	class BirthDate{
	  private int year;
	  private int month;
	  private int day;
	  public BirthDate(int newYear,int newMonth, int newDay){
	    this.year = newYear;
	    this.month = newMonth;
	    this.day = newDay;
	 }
	public void setYear(int newYear){  
		this.year = newYear; 
	} 
	public int getYear( ){   
		return this.year;     
	}
	public void setMonth(int newMonth){    
		this.month = newMonth; 
	}
	public int getMonth( ){   
		return this.month;  
	}
	public void setDay(int newDay){  
		day = newDay; 
	}
	public int getDay( ){  
		return this.day;
	}
	@Override
	public String toString() {
		return "BirthDate [year=" + year + ", month=" + month + ", day=" + day + "]";
	}
	
}
	
class Time{
	
	private int hour;
	
	private int minute;
	
	private int second;

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}
	
	public Time(){
		long m = System.currentTimeMillis();
		long totalSeconds = m / 1000;
		second = (int)(totalSeconds % 60);
		long totalMinutes = totalSeconds / 60;
		minute = (int)(totalMinutes % 60);
		long totalHours = (int)(totalMinutes / 60);
		hour = (int)(totalHours % 24);

	}
	
	public Time(long m){
		long totalSeconds = m / 1000;
		second = (int)(totalSeconds % 60);
		long totalMinutes = totalSeconds / 60;
		minute = (int)(totalMinutes % 60);
		long totalHours = (int)(totalMinutes / 60);
		hour = (int)(totalHours % 24);

	}
	
	public Time(int hour,int minute, int second ){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public void setTime(long elapsedTime){
		long totalSeconds = elapsedTime / 1000;
		int second1 = (int)(totalSeconds % 60);
		long totalMinutes = totalSeconds / 60;
	    int minute1 = (int)(totalMinutes % 60);
		long totalHours = (int)(totalMinutes / 60);
		int hour1 = (int)(totalHours % 24);
        hour += hour1;
        minute += minute1;
        second += second1;
        if(second >= 60){
        	second -= 60;
        	minute += 1;
        }
        if(minute >= 60){
        	minute -= 60;
        	hour += 1;
        }
        if(hour >= 24){
        	hour -= 24;
        }
	}
	
	public void setTime(int hour,int minute,int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	@Override
	public String toString() {
		return "Time [hour=" + hour + ", minute=" + minute + ", second="
				+ second + "]";
	}
	
	
}
