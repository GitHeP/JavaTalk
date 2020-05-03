package org.blackhat.chapter2.protectedmodifier;

/**
 * @author blackhat
 */
public class ASubSimple {

    public static void main(String[] args) {
        ASub aSub = new ASub();
        aSub.invokeSuperPrintNum();
        System.out.println(aSub.getNum());
    }
}
