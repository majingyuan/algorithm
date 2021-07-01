package concurrent;

import java.util.ArrayList;
import java.util.List;

public class WaitNotify {

    private List<Object> als = new ArrayList<>();
    // 一次性申请所有资源
    synchronized void apply(
            Object from, Object to){
        // 经典写法
        while(als.contains(from) ||
                als.contains(to)){
            try{
                wait();
            }catch(Exception e){
            }
        }
        als.add(from);
        als.add(to);
    }
    // 归还资源
    synchronized void free(
            Object from, Object to){
        als.remove(from);
        als.remove(to);
        notifyAll();
    }
    void t() throws InterruptedException {
        wait();
    }

    public static void main(String args[]) {

        Object a=  new Object();
        Object b=  new Object();
        Object c=  new Object();
        Object e=  new Object();
        Object f=  new Object();
        WaitNotify wt =  new WaitNotify();
        new Thread(new Runnable() {
            @Override
            public void run() {
                wt.apply(a,b);
                try {
                    System.out.println(1+"........");
                    Thread.sleep(5000L);
                    wt.free(a,b);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                wt.apply(b,c);

                System.out.println(2+"........");
                wt.free(b,c);
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                wt.apply(e,f);

                System.out.println(3+"........");
                wt.free(e,f);
            }
        }).start();

    }
}
