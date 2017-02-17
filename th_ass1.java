import java.util.Scanner;


class thread_demo extends Thread
{

	public void run() {
		// TODO Auto-generated method stub
		super.run();
		int time_out,i;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the time out period for timer");
		time_out=sc.nextInt();
		
		for(i=time_out;i>=0;i--)
		try
		{
			System.out.println("Time elapsed ="+i);
			Thread.sleep(500);
		}catch(Exception e)
		{
			System.out.println("Exception occured");
		}
	}
	
	
	
}


public class th_ass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		thread_demo td = new thread_demo();
		td.start();
	}

}
