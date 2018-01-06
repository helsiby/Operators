package com.udemy;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;

        result = result - 1;
        System.out.println("result - 1: " + result);

        previousResult = result;

        result = result * 10;
        System.out.println("result * 10: " + result);

        previousResult = result;

        result = result % 3;
        System.out.println("leftover of result devided by 3: " + result);

        previousResult = result;

        result++;
        System.out.println("result + 1: " + result);

        previousResult = result;

        result *= 10;
        System.out.println("result * 10: " + result);

        boolean isAlien = false;
        if (isAlien == false)
            System.out.println("It is not an alien!");

        int topScore = 80;
        if (topScore < 100)
            System.out.println("You got the not the highest score!");

        int secontTopScore = 60;
        if ((topScore > secontTopScore) && (topScore < 100))
            System.out.println("Greater than second top score and less then top score!");

        if ((topScore > 90) || (secontTopScore <= 100))
            System.out.println("One of these tests is true");

        int newValue = 50;
        if (newValue == 50)
            System.out.println("This is true");

        boolean isCar = false;
        if (isCar == true)
            System.out.println("This is not supposed to happen");

        boolean wasCar = isCar ? true : false;
        if (wasCar)
            System.out.println("wacCar is true");

        double chVar1 = 20;
        double chVar2 = 80;
        double myMath = (chVar1 + chVar2) * 25;
        double myRemain = myMath % 40;
        if (myRemain <= 20);
            System.out.println("Remains: " + myRemain);
            System.out.println("Total was over the limit");

        }

	}
