package test.com;

public class Ticket implements Runnable{
    private static int ticket=10;
    @Override
    public void run() {
        for(int i=1;i<=100;i++){
            try {
                Thread.sleep(500); //线程休眠500毫秒，以便观察输出
            } catch (InterruptedException e) { //需要处理异常
                e.printStackTrace();
            }
             
            synchronized(this){ //同步代码块+对象锁（this表示对象锁）
                if(ticket<=0){break;}
                System.out.println(Thread.currentThread().getName()+" 买了第"+ticket+"张票");
                ticket--;
            }
        }
    }
}