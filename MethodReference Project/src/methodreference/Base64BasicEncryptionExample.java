/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package methodreference;

import java.util.Base64;

public class Base64BasicEncryptionExample {

    public static void main(String[] args) {
        // Getting encoder  
        var bytes = new byte[]{1, 2};
        System.out.println("Bytes After Encoding....");
        for (byte b : bytes) {
            System.out.println(b);
        }
        byte encodedByteArray[] = Base64.getEncoder().encode(bytes);
        System.out.println("Encoded byte array: " + encodedByteArray);
        for (byte b : encodedByteArray) {
            System.out.println(b);
        }
        byte[] y = Base64.getDecoder().decode(encodedByteArray);

        System.out.println("Bytes After Decoding: ");
        for (byte b : y) {
            System.out.println(b);
        }
        //System.out.println("Encoded byte array written to another array: " + new byte[4]);
        //System.out.println("Number of bytes written: " + x);
        // Encoding string  and Decoding a String
        String stringToEncode = Base64.getEncoder().encodeToString("Raymond Orenda".getBytes());
        System.out.println("Encoded string: " + stringToEncode);
        String decodedString = new String(Base64.getDecoder().decode(stringToEncode));
        System.out.println("Decoded string: " + decodedString);
    }
}
