class Dome implements Runnable
{
    public  void fun()
	{
		System.out.println(Thread.currentThread().getName()+"��������");
	}

	public void run()
	{
		for (int i=0;i<10 ;i++ )
		{
			this.fun();
		}
	}  
}

public class Dome05 
{
	public static void main(String[] args) 
	{
		Dome d= new Dome();

		Thread t1=new Thread (d,"�߳�1");
		Thread t2=new Thread (d,"�߳�2");
		Thread t3=new Thread (d,"�߳�3");
		t1.setName("�߳�1");
		t2.setName("�߳�2");
		t3.setName("�߳�3");

		t1.start();
		t2.start();
		t3.start();


		
	}
}
