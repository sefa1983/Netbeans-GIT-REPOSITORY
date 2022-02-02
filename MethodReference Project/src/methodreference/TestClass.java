/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package methodreference;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Optional;
import java.util.regex.Pattern;

/**
 *
 * @author Orenda
 */
public class TestClass {

    public static void main(String[] args) {
        int a = 20;
        int b = 20;
        int max = (a > b) ? a : b;
        String criteria = "\\d*";
        String toMatch = "1234t";
        //Base64.Encoder encoder = Base64.getEncoder();  
        //Base64.Encoder encoder = Base64.getEncoder();  
 
        String str = Base64.getEncoder().encodeToString("JavaTpoint".getBytes());  
        System.out.println("Matcher Says: " + ((Pattern.compile(criteria).matcher(toMatch).matches()) ? "Number" : "NotNumber"));
        
        System.out.println("Maximum: " + ((a > b) ? a : b));
        List<Float> prices = new ArrayList<Float>();
        prices.add(10.3f);
        prices.add(16.3f);
        prices.add(10.7f);
        prices.add(35.3f);
        prices.add(9.0f);
        prices.add(1.2f);
        prices.add(10.3f);
        Optional<Float> nullableMaximum = prices.stream().reduce((item1, item2) -> item1 > item2 ? item1 : item2);
        System.out.println("Maximum With Reduce: "+nullableMaximum.get());
        //System.out.println("With Stream");
        //System.out.println("Max Price: "+);
        System.out.println("Min Price: "+prices.stream().min((item1, item2) -> item1 > item2 ? 1 : -1).get());
        System.out.println("Min Price: "+prices.stream().min((item1, item2) -> item1 > item2 ? 1 : -1).get());
    }
}
