class Dome extends Thread
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

public class Dome02 
{
	public static void main(String[] args) 
	{
		Dome d1= new Dome("xiancheng1");
		Dome d2= new Dome("xiancheng2");
		Dome d3= new Dome("xiancheng3");
		d1.run();
		d2.run();
		d3.run();
		
	}
}
