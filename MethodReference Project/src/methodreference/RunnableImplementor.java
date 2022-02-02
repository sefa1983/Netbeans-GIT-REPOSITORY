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
public class RunnableImplementor implements Runnable {

    @Override
    public void run() {
        try {
            System.out.println("Thread5 Sleep Started");
            Thread.sleep(5000);
            System.out.println("Thread5 Sleep Completed");
        } catch (InterruptedException ex) {
            Logger.getLogger(RunnableImplementor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
