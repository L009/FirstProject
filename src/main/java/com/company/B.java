                         package com.company;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * THis code print <code>HelloWorld!</code>
 *
 * @author Samburskiy Leonid
 * @version 1.0
 */
public class B {

    /**
     * Program entry point
     *
     * @param cmdLineArgs command-line arguments
     */
    public static void main(String[] cmdLineArgs) {
        //String text = cmdLineArgs[0].replaceAll("[A-Za-z1-9]+","");
        int[] res = mergeArrays(new int[]{0,2}, new int[]{1,3});

        String oldText = cmdLineArgs[0].replaceAll("[\\W_]+", "");

        String newText = new StringBuilder(oldText).reverse().toString();

        System.out.println(oldText);
        double dd = 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1;
        System.out.println(dd);
        //Возвращение кода ошибки операционной системе
        System.exit(0);

        /*7.5
         0x0.Fp3*/
    }


    public static BigInteger factorial(int value) {
        BigInteger integer = BigInteger.valueOf(1);

        while (value >= 0) {
            integer = integer.multiply(BigInteger.valueOf(value--));
        }
        return integer; // your implementation here
    }


    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] allArr=new int [a1.length + a2.length];
        System.arraycopy(a1, 0, allArr, 0, a1.length);
        System.arraycopy(a2, 0, allArr, a1.length, a2.length);
        Arrays.sort(allArr);

        return allArr; // your implementation here
    }

}