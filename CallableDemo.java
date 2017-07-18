package TherdRelearn;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {
	class TaskCallable implements Callable<String>{
		int id;
		TaskCallable(int id){
			this.id=id;
		}
		@Override
		public String call() throws Exception {
			// TODO Auto-generated method stub
			return "xxx"+id;
		}
		
	}
	public static void main(String[] args) {
		CallableDemo test= new CallableDemo();
		ArrayList<Future<String>> arrFuture= new ArrayList<Future<String>>();
		ExecutorService executorServer =Executors.newCachedThreadPool();
		try{
			for(int i=0;i<10;i++){
				Future<String> future = executorServer.submit(test.new TaskCallable(i));
				arrFuture.add(future);
				
			}
			for(Future<String> future:arrFuture){
				System.out.println(future.get());
			}
			
		}catch(InterruptedException  e){
			e.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			executorServer.shutdown();
		}
		
	}
	
}
