


public class NewThread extends Thread{
//Thread worker = new Thread();
private String word;
private int delay;

public NewThread(String whatToSay, int delayTime){
	word = whatToSay;
	delay = delayTime;
}
public void run(){
	try{
		for(;;){
			System.out.println(word + " ");
			Thread.sleep(delay);//wait until next time
		}
	}catch(InterruptedException e){
		return; //end this Thread
	}
}
public static void main(String[] args){
	new NewThread("PING",33).start();
	new NewThread("PONG",100).start();
	
}

}
