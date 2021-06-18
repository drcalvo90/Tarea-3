package uh.ac.cr;

import java.sql.SQLOutput;
import java.util.Scanner;

public class InteractiveControl {
    int constantNumber;
    int numberOperator;
    private int optionSelected;
    Scanner scanner = new Scanner(System.in);

    //constructor
    public InteractiveControl(){
        numberOperator =0;
        constantNumber =1;


        // void method, so it show options to the user
    public void scannerSelection(){
        System.out.println("How many times you Wish to Print hello world on the screen");
        optionSelected= scanner.nextInt();

    }
    for (optionSelected=constantNumber;optionSelected<= numberOperator;optionSelected++){
        System.out.println("hello world");
    }
    }
}
