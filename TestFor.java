
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
		System.out.println("���н�����");
		}

	/**
	for ѭ����ϰ
	*/
	public static String fuction1(double score){
		System.out.println("for ѭ����ϰ ��");
		int sum = 0 ;
		for(int i = 0 ; i < 5; i++){
			 sum += i ; 
			 System.out.println("i = "+i+" ; sum = "+sum);
			}
		return null;
}

	
	/**
	while ѭ����ϰ
	*/
	public static String fuction2(double score){
		System.out.println("while ѭ����ϰ ��");
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
	do_while ѭ����ϰ
	*/
	public static String fuction3(double score){
		System.out.println("do_while ѭ����ϰ ��");
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
	������ӡ ��ϰ
	*/
	public static String fuction4(double score){
		System.out.println("������ӡ ��ϰ ��");
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
				System.out.println(sum + " Ϊ���� ��");
				}
			sum++;
			}while(sum<200);
		return null;
}
	/**
	����ϰ
	*/
	public static String fuction5(int r){
		//System.out.println("������ӡ ��ϰ ��");
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