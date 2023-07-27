package com.epam.rd.autotasks.snail;

import java.util.Scanner;

public class Snail
{
    public static void main(String[] args)
    {
        //Write a program that reads a,b and h (line by lyne in this order) and prints
        //the number of days for which the snail reach the top of the tree.
        //a - feet that snail travels up each day, b - feet that slides down each night, h - height of the tree

        Scanner input = new Scanner(System.in);
        //System.out.println("travel");
        int travelEachDay = input.nextInt();
        //System.out.println("slides down");
        int slidesDownEachDay = input.nextInt();
        //System.out.println("height of the tree");
        int heightOfTheTree = input.nextInt();



        int numberOfDays = 0;

        int distance = 0;

       /* if ((travelEachDay == slidesDownEachDay) && (heightOfTheTree > 1))  {

            System.out.println("Impossible");
        } else {*/


            while (distance < heightOfTheTree) {
                numberOfDays++;
                distance = distance + travelEachDay;
                if (distance >= heightOfTheTree) {
                    System.out.println(numberOfDays);
                    break;
                }
                distance = distance - slidesDownEachDay;

                if (distance == 0){
                    System.out.println("Impossible");break;
                }

            }
        //}





    }
}
