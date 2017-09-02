class Demo implements Runnable
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+"-->在运行");
	}
}
public class Dome6
{
	public static void main(String[] args) 
	{
		Demo d = new Demo();
		Thread t1 = new Thread(d,"线程1");
		System.out.println("线程启动之前："+t1.isAlive());
		t1.start();
		System.out.println("线程启动之后："+t1.isAlive());
		for (int i=0;i<100000 ;i++ )
		{
			//一个延迟
		}
		System.out.println("延迟线程之后："+t1.isAlive());
	}
}
