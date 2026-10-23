class NumberThread extends Thread {
    @Override public void run() {
        for (int i = 1; i <= 5; i++) System.out.println("Thread class: " + i);
    }
}
class MessageTask implements Runnable {
    @Override public void run() {
        for (int i = 1; i <= 5; i++) System.out.println("Runnable: " + i);
    }
}
class exp11 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new NumberThread();
        Thread t2 = new Thread(new MessageTask());
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Both threads completed.");
    }
}
