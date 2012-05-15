
public class Test007{
	public static void main(String args[]){
		double s = 83;
		String str = new String();
		str = fuction1(s);
		System.out.println("小明的考试结果是："+str);
		}

	
	public static String fuction1(double score){
		if(score < 60){
				return "不及格";
		}
		else if(score>=90){
				return "优秀";
		}
		else if(score>=80){
				return "良";
		}
		else if(score>=60){
				return "及格";
		}
		else return "没有考试或找不到分数或分数出错";
			//return null;
		}

}