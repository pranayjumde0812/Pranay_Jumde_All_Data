package Synchronization;

public class ThreadSend implements Runnable {

    String message;
    Sender sender;

    public ThreadSend(Sender sender , String message) {
        this.message = message;
        this.sender = sender;
    }

    @Override
    public void run() {
        synchronized (sender){
            Sender.sendMessage(message);
            try {
                Thread.sleep(5000);
            }catch (InterruptedException e ){
                e.printStackTrace();
            }
        }
    }
}
