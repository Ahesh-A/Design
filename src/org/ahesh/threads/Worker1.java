package org.ahesh.threads;

import org.ahesh.singleton.Singleton;
import org.ahesh.threads.interfaces.Worker;

public class Worker1 extends Thread implements Worker {

    private  Singleton singleton;
    @Override
    public void run() {
        System.out.println("This is worker 1");
        singleton = Singleton.getInstance();
    }
    @Override
    public Singleton getResult() {
        return singleton;
    }
}
