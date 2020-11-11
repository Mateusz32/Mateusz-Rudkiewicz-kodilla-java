package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator(5,3);
        int add=calculator.add();
        System.out.print("Test of add: ");
        if(add==8){
            System.out.println("test OK");
        }else {
            System.out.println("Error");
        }

        System.out.print("Test of substract: ");
        int substract=calculator.substract();
        if(substract==2){
            System.out.println("test OK");
        }else {
            System.out.println("Error");
        }

    }




    }

