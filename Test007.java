
public class Test007{
	public static void main(String args[]){
		double s = 83;
		String str = new String();
		str = fuction1(s);
		System.out.println("С���Ŀ��Խ���ǣ�"+str);
		}

	
	public static String fuction1(double score){
		if(score < 60){
				return "������";
		}
		else if(score>=90){
				return "����";
		}
		else if(score>=80){
				return "��";
		}
		else if(score>=60){
				return "����";
		}
		else return "û�п��Ի��Ҳ����������������";
			//return null;
		}

}