/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package methodreference;

class GenericClass<P> {

    <Z> GenericClass(Z z) {
        System.out.println(z);
    }
}

public class TypeInference {

    public static void main(String[] args) {
        var gc2 = new GenericClass<String>("Hello");
    }
}
