package org.launchcode.studio7;

import java.util.ArrayList;
import java.util.Arrays;

public class CD extends BaseDisc {

    private ArrayList<String> data = new ArrayList<>( Arrays.asList("Java", "JavaScript", "Python") );

    public CD(String aCapacity) {
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
        System.out.println("A CD spins at a rate of 200 - 500 rpm.");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
