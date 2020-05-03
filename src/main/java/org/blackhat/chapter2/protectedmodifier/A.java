package org.blackhat.chapter2.protectedmodifier;

/**
 * @author blackhat
 */
public class A {

    protected int num = 100;

    protected void printNum() {
        System.out.println("num = " + this.num);
    }

    public static void main(String[] args) {
        new A().printNum();
    }
}
