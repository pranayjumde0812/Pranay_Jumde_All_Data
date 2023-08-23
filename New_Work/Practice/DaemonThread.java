class DaemonThread extends Thread{

	DaemonThread(String name){

       super(name);

	}

	public void run(){

		if(Thread.currentThread().isDaemon()){
			System.out.println(getName()+" is a DAEMON thread");
		}else{
			System.out.println(getName()+" is a USER thread");
		}
	}


public static void main(String[] args){

   DaemonThread t1 = new DaemonThread("t1");
   DaemonThread t2 = new DaemonThread("t2");
   DaemonThread t3 = new DaemonThread("t3");


     t1.setDaemon(true);
     t1.start();

     t2.start();

     t3.setDaemon(false);
     t3.start();
 }

}