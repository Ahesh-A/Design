package org.ahesh.singleton;

public class Singleton {
    static Singleton singleton;
    private Singleton() {}
    public static synchronized Singleton getInstance() {
        if(singleton == null) {
           singleton = new Singleton();
        }
        return singleton;
    }
}
