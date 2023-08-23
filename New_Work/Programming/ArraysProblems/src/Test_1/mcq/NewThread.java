package Test_1.mcq;

 class NewThread extends Thread{

     Thread t1,t2;
     NewThread(){
         t1= new Thread(this,"Thread_1");
         t2= new Thread(this,"Thread_2");
         t1.start();
         t2.start();
     }

     @Override
     public void run() {
        t2.setPriority(Thread.MAX_PRIORITY);
         System.out.println(t1.equals(t2));
     }
 }

class Multi{
    public static void main(String[] args) {
        new NewThread();
    }
}