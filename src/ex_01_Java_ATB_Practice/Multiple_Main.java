package ex_01_Java_ATB_Practice;

public class Multiple_Main {
    public static void main(String[] args) {

    }

//    public static void main(String[] args) {
//
//    }
// The signature / syntax of both the methods are same so here JVM is getting confused

    public static void main(int args) {
        // Not recognized by JVM so that's why Green executable symbol is not coming same as the above method
    }

    public static void main(String args) {
        // Not recognized by JVM so that's why Green executable symbol is not coming same as the above method
    }

    // Rule: There can be multiple main methods but only one main method will JVM recognize
    /* There can be multiple main functions but only one main function will this syntax Public static void main(String[] args)
    will be recognized by the JVM
    The Concept of the multiple main function in the program is called Method Overloading

     */

}
