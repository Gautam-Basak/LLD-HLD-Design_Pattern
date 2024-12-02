package com.example.designpattern.AdapterDesignPattern.Client;

import com.example.designpattern.AdapterDesignPattern.Adaptee.WeightMachineForBabies;
import com.example.designpattern.AdapterDesignPattern.Adapter.WeightMAchineAdapterImpl;
import com.example.designpattern.AdapterDesignPattern.Adapter.WeightMachineAdapter;

public class Main {
    public static void main(String[] args) {
        
        WeightMachineAdapter wma = new WeightMAchineAdapterImpl(new WeightMachineForBabies());
        System.out.println("Weight in Kg : " + wma.getWeightInKg());

    }
}
