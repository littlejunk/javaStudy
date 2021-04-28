package javastudy;

public class Workone {
        public static void main(String[] args) {
			Workoneclass w = new Workoneclass();
			w.homework1();
			w.homework2();
			w.homework3();
			w.homework4();
			w.homework5();
			w.homework6();
		}
}

class Workoneclass{
		
		public void homework1(){
			 System.out.println("Welcome to Java");
		      
		     System.out.println("Welcome to Computer Science");
		      
		     System.out.println("Programming is fun");
		}
		
		public void homework2(){
			for(int i = 0; i<5; i++){
				System.out.println("Welcome to Java");
		      }
		}
		
		public void homework3(){
			System.out.println("a    a^2    a^3");
			for(int i = 1; i < 5; i++){
				System.out.println(String.format("%-2s", Integer.toString(i))+"    "+String.format("%-2s", Integer.toString(i*i))+
						"    "+String.format("%-2s", Integer.toString(i*i*i)));
			}
			
		}
		
		public void homework4(){
			System.out.println(((9.5*4.5)-(2.5*3))/(45.5-3.5));
		}
		
		public void homework5(){
			double a=1.0;
			double sum=0.0;
			for(int i = 0; i < 6;i++){
				if(i%2==0){
					sum+=1.0/a;
				}else{
					sum-=1.0/a;
				}
				a+=2.0;
			}
			
			System.out.println(4*sum);
			
			a=1.0;
			sum=0.0;
			for(int i = 0; i < 7;i++){
				if(i%2==0){
					sum+=1.0/a;
				}else{
					sum-=1.0/a;
				}
				a+=2.0;
				
			}
			System.out.println(4.0*sum);
			
		}
		
		public void homework6(){
			double length = 4.5;
			double height = 7.9;
			System.out.println("area="+length*height+"   zhouchang="+((length*2)+(height*2)));
		}
	
}