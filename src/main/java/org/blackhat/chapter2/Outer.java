package org.blackhat.chapter2;

/**
 * @author blackhat
 */
public class Outer extends OuterSuper {

    private int a = 100;
    int b = 200;
    protected int c = 300;

    private class Inner1 {

        void fun() {
            System.out.println("Outer.a = " + Outer.this.a
                    + " , Outer.b = " + Outer.this.b
                    + " ,  Outer.c = " + Outer.this.c
                    + ", OuterSuper.defaultNum = " + Outer.super.defaultNum
                    + ", OuterSuper.protectedNum = " + Outer.super.protectedNum);
        }
    }

    class Inner2 {

        void fun() {
            System.out.println("Outer.a = " + Outer.this.a
                    + " , Outer.b = " + Outer.this.b
                    + " ,  Outer.c = " + Outer.this.c
                    + ", OuterSuper.defaultNum = " + Outer.super.defaultNum
                    + ", OuterSuper.protectedNum = " + Outer.super.protectedNum);
        }
    }

    protected class Inner3 {

        void fun() {
            System.out.println("Outer.a = " + Outer.this.a
                    + " , Outer.b = " + Outer.this.b
                    + " ,  Outer.c = " + Outer.this.c
                    + ", OuterSuper.defaultNum = " + Outer.super.defaultNum
                    + ", OuterSuper.protectedNum = " + Outer.super.protectedNum);
        }
    }
}
