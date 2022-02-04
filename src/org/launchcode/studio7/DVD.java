package org.launchcode.studio7;

import java.util.ArrayList;
import java.util.Arrays;

public class DVD extends BaseDisc {

    private ArrayList<String> data = new ArrayList<>( Arrays.asList("C++", "Ruby's", "PHP") );


    public DVD(String aCapacity) {
        super(aCapacity);
    }

    @Override
    public String read() {
        String output = "";
        for (String eachData : data) {
            output += eachData + " ";
        }
        return output;
    }

    @Override
    public void write(String aData) {
        data.add(aData);
    }

    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of 570 - 1600 rpm.");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
