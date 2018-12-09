/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package audi_threadpool;

/**
 *
 * @author Claudia.DK
 */
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Threadpool implements Runnable{
 
private int audi;

public Threadpool (int numb){
    this.audi=numb;
}
@Override
public void run(){
    System.out.println("Counting Odd 1 up to 100 = " +audi);
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e){
        e.printStackTrace();
    }
}
}   
