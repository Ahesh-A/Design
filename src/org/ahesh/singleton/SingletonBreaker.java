package org.ahesh.singleton;

import java.lang.reflect.Constructor;
public class SingletonBreaker {
    Singleton instance2 = null;

    public Singleton createFakeInstanceOfSingleton() {

        try {
            Constructor[] constructors = Singleton.class.getDeclaredConstructors();
            System.out.println(constructors);
            for(Constructor c : constructors) {
                c.setAccessible(true);
                instance2 = (Singleton)c.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return instance2;
    }

    public void breakSingleton() {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = createFakeInstanceOfSingleton();

        System.out.println(instance1.equals(instance));
    }

}
