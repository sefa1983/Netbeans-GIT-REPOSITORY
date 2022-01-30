/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package git_package;

/**
 *
 * @author Orenda
 */
public class GitClass {

    static {
        Runnable r = () -> {
            System.out.println("Init thread....");
        };
        Thread t = new Thread(r);
        t.start();
    }

    public void greet(String name) {
        System.out.println("Hi there.... Mr. " + name);
    }

    public static void main(String[] args) {
        System.out.println("Hello Git and I hope you are good.....");
        Computer computer = new GitClass()::greet;
        computer.sayHello("Raymond");
    }
}
