/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package methodreference;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class TypeInferenceExample {

    public static void showList(List list) {
        if (!list.isEmpty()) {
            list.forEach(System.out::println);
        } else {
            System.out.println("list is empty");
        }
        //var total = list.stream().reduce(0.0, (a,b)->a+b);
         list.forEach(System.out::println);
        /*
        list.forEach(new Consumer() {
            @Override
            public void accept(Object t) {
                System.out.println(t);
            }
        });
        */
    }

    public static void main(String[] args) {
        // An old approach(prior to Java 7) to create a list  
        List list1 = new ArrayList();
        list1.add(11);
        showList(list1);
        // Java 7    
        List list2 = new ArrayList<>(); // You can left it blank, compiler can infer type  
        list2.add(12);
        //showList(list2);
        // Compiler infers type of ArrayList, in Java 8  
        //showList(list2);
    }
}
