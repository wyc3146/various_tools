package com.wyc.tools.java_byte_code.javassist;/**
 * Created by wyc on 2017/01/20.
 */

import java.io.File;
import java.io.IOException;

/**
 * @author wangyongcan
 * @Date 2017/01/20 16:28
 */
public class SimpleClass {

    public static void main(String[] args) throws IOException {
        printTest("message");
    }

    public static void printTest(String message) {
        System.out.println(message);
    }

    public static void printTest() {
        System.out.println("hello");
    }

}
