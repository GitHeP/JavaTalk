package org.blackhat.chapter2.defaultmodifier;

/**
 * @author blackhat
 */
public class ASub extends A {

    void invokeSuperPrintNum() {
        super.printNum();
    }

    int getNum() {
       return super.num;
    }
}
