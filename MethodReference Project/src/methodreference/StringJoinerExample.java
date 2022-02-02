/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package methodreference;

import java.util.HashMap;
import java.util.StringJoiner;
import java.util.Vector;

public class StringJoinerExample {

    public static void main(String[] args) {
        /*
        StringJoiner joinNames = new StringJoiner(","); // passing comma(,) as delimiter   
        // Adding values to StringJoiner  
        joinNames.add("Rahul");
        joinNames.add("Raju");
        joinNames.add("Peter");
        joinNames.add("Raheem");
        System.out.println(joinNames);
         */
        StringJoinerExample s = new StringJoinerExample();
        var keys = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        var values = new String[]{"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
        String json = s.json(keys, values, ",", "{\n\t", "\n}");
        System.out.println(json);

        HashMap keyValuePairs = s.keyValuesPairs(json);
        System.out.println("Key value Pair");
        keyValuePairs.forEach((a, b) -> {
            System.out.print(a + "\t");
            System.out.print(b);
            System.out.println();
        });
    }

    StringJoiner keyValuePair(String key, String value) {
        StringJoiner sj = new StringJoiner(":");
        sj.add("\"" + key + "\"");
        sj.add("\"" + value + "\"");
        return sj;
    }

    String json(String[] keys, String[] values, String separator, String delimiter1, String delimiter2) {
        StringJoiner jsonStringJoiner = new StringJoiner(separator, delimiter1, delimiter2);
        for (int i = 0; i < keys.length; i++) {
            StringJoiner keyValuePair = keyValuePair(keys[i], values[i]);
            jsonStringJoiner.add(keyValuePair.toString());
        }
        return jsonStringJoiner.toString();
    }

    HashMap keyValuesPairs(String json) {
        HashMap<String, String> hashMap = new HashMap();
        var preprocessedJson = json.replace("{", "").replace("}", "").replace("\n", "").replace("\t", "").replace("\"", "");
        String[] stringArrayFromCommas = stringArrayFromCommas(preprocessedJson, ',');
        for (String st : stringArrayFromCommas) {
            String[] keyValuePair = stringArrayFromCommas(st, ':');
            String key = keyValuePair[0].replace(":", "");
            String value = keyValuePair[1].replace(":", "");
            hashMap.put(key, value);
        }
        return hashMap;
    }

    String[] stringArrayFromCommas(String message, char splitCharacter) {
        var messageList = new Vector<String>();
        long commas = message.chars().filter(ch -> ch == splitCharacter).count();
        for (int i = 0; i < commas; i++) {
            var extracted = message.substring(0, message.indexOf(splitCharacter));
            message = message.replaceFirst(extracted, "");
            messageList.add(extracted);
            if (message.charAt(0) == ',' || message.charAt(0) == ' ') {
                message = message.substring(1);
            }
        }
        if (message.length() > 0) {
            messageList.add(message);
        }
        String[] strings = new String[messageList.size()];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = messageList.get(i);
        }
        return strings;
    }

    void typicalUse(String json) {
        HashMap keyValuePairs = keyValuesPairs(json);
        System.out.println("Key value Pair");
        keyValuePairs.forEach((a, b) -> {
            System.out.print(a + "\t");
            System.out.print(b);
            System.out.println();
        });
    }
}
