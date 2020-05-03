package org.blackhat.chapter2.protectedmodifier;

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
