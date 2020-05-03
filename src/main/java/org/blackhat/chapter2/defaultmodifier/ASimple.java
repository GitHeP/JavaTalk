package org.blackhat.chapter2.defaultmodifier;

/**
 * @author blackhat
 */
public class ASimple {

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.num);
        a.printNum();
    }
}
