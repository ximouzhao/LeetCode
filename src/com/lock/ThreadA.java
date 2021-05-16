package com.lock;

public class ThreadA extends Thread {
    private MyService service;
    public ThreadA(MyService myService){
        this.service=myService;
    }
    @Override
    public void run(){
        service.methodA();
    }
}
