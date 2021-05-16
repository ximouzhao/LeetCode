package com.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTest {
    private Lock lock=new ReentrantLock();

    public static void main(String[] args) {
        new ReentrantLockTest().methodA();
    }
    public void methodA(){
        lock.lock();
        lock.lock();
        lock.lock();
        System.out.println(111);
        MyService myService=new MyService();
        ThreadA a=new ThreadA(myService);
        a.start();
        ThreadB b=new ThreadB(myService);
        b.start();
    }
}
