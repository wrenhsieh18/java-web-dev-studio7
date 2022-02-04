package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        CD aNewCD = new CD("750 MB");
        DVD aNewDVD = new DVD("4.5 GB");

        System.out.println(aNewCD.getCapacity());
        System.out.println(aNewCD.read());
        aNewCD.spinDisc();

        System.out.println(aNewDVD.getCapacity());
        System.out.println(aNewDVD.read());
        aNewDVD.spinDisc();



        // TODO: Call each CD and DVD method to verify that they work as expected.

    }
}
