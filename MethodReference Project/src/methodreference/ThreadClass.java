/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package methodreference;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Orenda
 */
public class ThreadClass extends Thread{
    @Override
    public void run(){
        try {
            System.out.println("Thread4 Sleep Started.....");
            Thread.sleep(4000);
            System.out.println("Thread4 Sleep Finished....");
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
