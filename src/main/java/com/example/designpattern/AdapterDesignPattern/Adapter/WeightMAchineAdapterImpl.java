package com.example.designpattern.AdapterDesignPattern.Adapter;

import com.example.designpattern.AdapterDesignPattern.Adaptee.WeightMachine;

public class WeightMAchineAdapterImpl implements WeightMachineAdapter{

    WeightMachine weightMachine;

    public WeightMAchineAdapterImpl(WeightMachine weightMachine){
        this.weightMachine = weightMachine;
    }

    @Override
    public double getWeightInKg() {
        
        double weightInPound = weightMachine.getWeightInPound();
        //Convert it to KGs
        double weightInKg = weightInPound * 0.45;

        return weightInKg;
    }
    
}
