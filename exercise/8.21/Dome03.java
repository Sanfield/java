class Dome implements Runnable
{
	private String info;
	public Dome(String info)
	{
		this.info = info; 
	}
	public void run()
	{
		for (int i=0;i<10 ;i++ )
		{
			System.out.println(this.info+":i="+i);
		}
	}  
}

public class Dome03 
{
	public static void main(String[] args) 
	{
		Dome d1= new Dome("xiancheng1");
		Dome d2= new Dome("xiancheng2");
		Dome d3= new Dome("xiancheng3");
		Thread t1 = new Thread(d1);
		Thread t2 = new Thread(d2);
		Thread t3 = new Thread(d3);
		t1.start();
		t2.start();
		t3.start();
		
	}
}
