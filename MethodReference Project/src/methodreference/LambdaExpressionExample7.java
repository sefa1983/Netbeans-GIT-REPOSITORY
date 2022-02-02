/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package methodreference;

import java.util.*;
import java.util.function.Consumer;
import javax.swing.JButton;

public class LambdaExpressionExample7 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("ankit");
        list.add("mayank");
        list.add("irfan");
        list.add("jai");
        System.out.println("With Lambda");
        list.forEach(s -> {
            System.out.println(s);
        });

        //Or
        System.out.println("\nWithout Lambda");
        list.forEach(new Consumer() {
            @Override
            public void accept(Object t) {
                System.out.println(t);
            }
        });
        new JButton().addActionListener(e -> {
            System.out.println("You clicked Me");
        });
    }
}
