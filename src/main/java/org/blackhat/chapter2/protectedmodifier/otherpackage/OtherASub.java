package org.blackhat.chapter2.protectedmodifier.otherpackage;

import org.blackhat.chapter2.protectedmodifier.A;

/**
 * @author blackhat
 */
public class OtherASub extends A {

    void invokeSuperPrintNum() {
        super.printNum();
    }

    int getNum() {
        return super.num;
    }
}
