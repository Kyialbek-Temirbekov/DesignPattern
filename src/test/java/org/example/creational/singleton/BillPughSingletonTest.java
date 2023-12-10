package org.example.creational.singleton;

import junit.framework.TestCase;

public class BillPughSingletonTest extends TestCase {

    public void testGetInstance() {
        BillPughSingleton ins1 = BillPughSingleton.getInstance();
        BillPughSingleton ins2 = BillPughSingleton.getInstance();
        System.out.println(ins1.hashCode());
        System.out.println(ins2.hashCode());
    }
}