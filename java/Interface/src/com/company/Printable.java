package com.company;

/**
 * like abstract class, interface cannot be instantiated (new Printable()) - error!
 * NOT like abstract class, in interface ALL THE METHODS will be abstract!
 * because all the methods are abstract methods, there is no need to type abstract.
 */
public interface Printable {

    public void print();

}
