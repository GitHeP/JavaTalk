package org.blackhat.chapter2.otherpackage;

import org.blackhat.chapter2.OuterSuper;

/**
 * @author blackhat
 */
public class OtherOuter extends OuterSuper {

    private int a = 100;
    int b = 200;
    protected int c = 300;

    private class Inner1 {

        void fun() {
            System.out.println("Outer.a = " + OtherOuter.this.a
                    + " , Outer.b = " + OtherOuter.this.b
                    + " ,  Outer.c = " + OtherOuter.this.c
//                    + ", OuterSuper.defaultNum = " + OtherOuter.super.defaultNum // Compile Time Error
                    + ", OuterSuper.protectedNum = " + OtherOuter.super.protectedNum);
        }
    }

    class Inner2 {

        void fun() {
            System.out.println("Outer.a = " + OtherOuter.this.a
                    + " , Outer.b = " + OtherOuter.this.b
                    + " ,  Outer.c = " + OtherOuter.this.c
//                    + ", OuterSuper.defaultNum = " + OtherOuter.super.defaultNum // Compile Time Error
                    + ", OuterSuper.protectedNum = " + OtherOuter.super.protectedNum);
        }
    }

    protected class Inner3 {

        void fun() {
            System.out.println("Outer.a = " + OtherOuter.this.a
                    + " , Outer.b = " + OtherOuter.this.b
                    + " ,  Outer.c = " + OtherOuter.this.c
//                    + ", OuterSuper.defaultNum = " + OtherOuter.super.defaultNum // Compile Time Error
                    + ", OuterSuper.protectedNum = " + OtherOuter.super.protectedNum);
        }
    }
}
