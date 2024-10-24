package org.ahesh.threads;

import org.ahesh.singleton.Singleton;
import org.ahesh.threads.interfaces.Worker;

public class Worker2 extends Thread implements Worker {
    private Singleton singleton;
    @Override
    public void run() {
        System.out.println("This is the worker 2");
        singleton = Singleton.getInstance();
    }
    @Override
    public Singleton getResult() {
        return singleton;
    }
}
