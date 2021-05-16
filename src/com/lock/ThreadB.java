package com.lock;

public class ThreadB extends Thread {
    private MyService service;
    public ThreadB(MyService myService){
        this.service=myService;
    }
    @Override
    public void run(){
        service.methodA();
    }
}
