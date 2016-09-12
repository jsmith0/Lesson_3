package com.company;

public class Main {

    public static void main(String[] args) {
	    String a1 = "Hello";
        String a2 = "It's me ";
        System.out.print(a1 + " " + a2);
        // the above is known as catenating
        //another way to output the same???
        int times = 45;
        String a3 = a1 + "" + a2 + " " + times;
        System.out.println(a3);

        String name = "smith";
        //we can tap into a method called length
        //returns the value of characters
        //only going to return an int
        int len = name.length();
        System.out.println(len );
        //the . taps into the method associated with String

        //next up... mr. P's favorite method
        //substring
        // abbreviated as ss by Mr. P

        /*
        String word = "dog";
        word.SubString (0);
        returns ---> dog
        word.SubString (1);
        returns ----> og
        word.SubString (2);
        returns ----> g

        d | o | g
        0 | 1 | 2

        the beginning is 0 bc its the origin, when you are born you are zero...

        the start parameter is another
         */

        String word = "dog";
        word.substring(0); // dog
        word.substring(1); // og
        word.substring(2); // g
        word.substring(0,1); // d
        word.substring(1,2); // o
        word.substring(2,3); // g
        //word.substring(3,4); ----> index out of bounds

        String id = "123456";
        String last3
                    = id.substring
                    ((id.length()-3), id.length());
        System.out.println(last3);

        

    }
}
