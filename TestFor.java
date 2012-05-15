
public class TestFor{
	public static void main(String args[]){
		double s = 83;
		int r = 45 ;
		String str = new String();
		str = fuction1(s);
		str = fuction2(s);
		str = fuction3(s);
		str = fuction4(s);
		str = fuction5(r);
		System.out.println("‘À––Ω· ¯£°");
		}

	/**
	for —≠ª∑¡∑œ∞
	*/
	public static String fuction1(double score){
		System.out.println("for —≠ª∑¡∑œ∞ £∫");
		int sum = 0 ;
		for(int i = 0 ; i < 5; i++){
			 sum += i ; 
			 System.out.println("i = "+i+" ; sum = "+sum);
			}
		return null;
}

	
	/**
	while —≠ª∑¡∑œ∞
	*/
	public static String fuction2(double score){
		System.out.println("while —≠ª∑¡∑œ∞ £∫");
		int sum = 0 ;
		int i = 0;
		while(i<5){
			sum += i ; 
			System.out.println("i = "+i+" ; sum = "+sum);
			i++;
			}
		return null;
}

	
	/**
	do_while —≠ª∑¡∑œ∞
	*/
	public static String fuction3(double score){
		System.out.println("do_while —≠ª∑¡∑œ∞ £∫");
		int sum = 0 ;
		int i = 0;
		do{
			sum += i ; 
			System.out.println("i = "+i+" ; sum = "+sum);
			i++;
			}while(i<5);
		return null;
}
	/**
	Àÿ ˝¥Ú”° ¡∑œ∞
	*/
	public static String fuction4(double score){
		System.out.println("Àÿ ˝¥Ú”° ¡∑œ∞ £∫");
		int sum = 100 ;
		int i = 0;
		do{
			i=2;
			boolean b = false;
			do{
				if(0==sum%i){
					b = true;
					}
				i++;
				}while(i<sum/2);
				if(!b){
				System.out.println(sum + " Œ™Àÿ ˝ £ª");
				}
			sum++;
			}while(sum<200);
		return null;
}
	/**
	¥Úª®¡∑œ∞
	*/
	public static String fuction5(int r){
		//System.out.println("Àÿ ˝¥Ú”° ¡∑œ∞ £∫");
		int i = 1;
		for (;i<r;i++){
		int j = 1;
			for(;j<r-i;j++){
				System.out.print(" ");
			}
			j=1;
			for(;j<=i;j++){
				System.out.print("* ");
			}
			//System.out.print("")
			System.out.println("");
			}
			return null;
}

}