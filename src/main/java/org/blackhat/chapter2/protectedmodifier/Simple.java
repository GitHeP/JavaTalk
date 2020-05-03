package org.blackhat.chapter2.protectedmodifier;

/**
 * @author blackhat
 */
public class Simple {

    public static void main(String[] args) {
        A a = new A();
        a.printNum();
        System.out.println(a.num);
    }
}
