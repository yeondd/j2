package com.j2.state.gumballstate;

public class GumballMachineTestDrive {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);
        
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertBrokenQuarter();
//        gumballMachine.insertQuarter();
//        gumballMachine.turnCrank();
    }
}