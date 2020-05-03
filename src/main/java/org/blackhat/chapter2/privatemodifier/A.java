package org.blackhat.chapter2.privatemodifier;

/**
 * @author blackhat
 */
public class A {

    private int num = 100;

    private void printNum() {
        System.out.println("num = " + this.num);
    }

    public static void main(String[] args) {
        new A().printNum();
    }
}

class Simple {

    public static void main(String[] args) {

        A a = new A();
//        a.printNum(); // Compile Time Error
    }
}
