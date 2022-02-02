/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package methodreference;

import java.util.logging.Level;
import java.util.logging.Logger;

@FunctionalInterface  //It is optional  
interface Drawable {

    public void draw();
}

public class LambdaExpressionExample2 implements Runnable {

    public static void main(String[] args) {
        Runnable r1 = () -> {
            try {
                System.out.println("Thread1 Sleep started ....");
                Thread.sleep(1000);
                System.out.println("Thread1 Sleep Completed....");
            } catch (InterruptedException ex) {
                Logger.getLogger(LambdaExpressionExample2.class.getName()).log(Level.SEVERE, null, ex);
            }
        };
        Thread t1 = new Thread(r1);
        t1.start();
        Runnable r2 = () -> {
            try {
                System.out.println("Thread2 Sleep started ....");
                Thread.sleep(2000);
                System.out.println("Thread2 Sleep Completed....");
            } catch (InterruptedException ex) {
                Logger.getLogger(LambdaExpressionExample2.class.getName()).log(Level.SEVERE, null, ex);
            }
        };
        Thread t2 = new Thread(r2);
        t2.start();
        Runnable r3 = () -> {
            try {
                System.out.println("Thread3 Sleep Started....");
                Thread.sleep(3000);
                System.out.println("Thread3 Sleep Completed....");
            } catch (InterruptedException ex) {
                Logger.getLogger(LambdaExpressionExample2.class.getName()).log(Level.SEVERE, null, ex);
            }
        };
        Thread t3 = new Thread(r3);
        t3.start();

        Thread t4 = new ThreadClass();
        t4.start();
        RunnableImplementor r5 = new RunnableImplementor();
        Thread t5 = new Thread(r5);
        t5.start();

        Thread t6 = new Thread(new LambdaExpressionExample2());
        t6.start();
    }

    @Override
    public void run() {
        try {
            System.out.println("Thread6 Sleep Started....");
            Thread.sleep(6000);
            System.out.println("Thread6 Sleep Completed....");
        } catch (InterruptedException ex) {
            Logger.getLogger(LambdaExpressionExample2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
