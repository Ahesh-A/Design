package org.ahesh.singleton;

public class Worker1 extends Thread {

    @Override
    public void run() {
        System.out.println("This is worker 1");
    }

}
