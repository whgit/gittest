public class Test004{
	public static void main(String args[]){
			char a= 'ºº';
			System.out.println(a);
			fuction1();
			fuction1(a);
			fuction2();
		}
	
	public static void fuction1(){
			boolean b = false;
			boolean c = true;
			//boolean d = 0;
			System.out.println("boolean false = " + b);
			System.out.println("boolean true = " + c);
			//System.out.prinln("boolean 0 = " + d);
		} 
	
	public static void fuction1(char param){
			System.out.println("char×Ö·û´òÓ¡:"+param);
		} 
	
	public static void fuction2(){
			byte b = 0;
			short s = 0;
			int i = 0;
			long l = 0;
			float f = 0.1f;
			double d = 0;
			int j = (int)(0.5*10);
			
		
			System.out.println("j="+j);
		} 
		
		
		
	}
	
	