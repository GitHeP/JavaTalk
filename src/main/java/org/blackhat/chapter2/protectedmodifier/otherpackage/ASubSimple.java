package org.blackhat.chapter2.protectedmodifier.otherpackage;


import org.blackhat.chapter2.protectedmodifier.ASub;

/**
 * @author blackhat
 */
public class ASubSimple {

    public static void main(String[] args) {
        ASub aSub = new ASub();
//        aSub.invokeSuperPrintNum(); // Compile Time Error
//        System.out.println(aSub.getNum()); // Compile Time Error
    }
}
