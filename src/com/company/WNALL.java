package com.company;

public class WNALL {
    public void A() throws InterruptedException {
         wait();
        boolean a= true;
        boolean b = false;
        boolean c = false;
        System.out.println("A");
        if(a=true){
            notify();
            wait();
            notify();
           notifyAll();
        }
    }
    public void B() throws InterruptedException {
        wait();
        boolean a= false;
        boolean b = true;
        boolean c = false;
        if(b=true){
            notify();
            wait();
            notify();
            notifyAll();
        }
        System.out.println("B");
    }
    public void C() throws InterruptedException {
         wait();
        boolean a= false;
        boolean b = false;
        boolean c = true;
        if(c=true){
            notify();
            wait();
            notify();
            notifyAll();
        }
        System.out.println("C");
    }
}
