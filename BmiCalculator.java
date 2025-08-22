package org.example;
import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Weight: ");
        double weight;
        weight=input.nextDouble();

        input.nextLine();

        System.out.print("Height: ");
        String height;
        height=input.nextLine();

       double convertedHeight = convertHeight(height);
       double bmi = weight/(convertedHeight*convertedHeight);

       String category = bmiCatagory(bmi);
       print(bmi,category);

        }

    public static double convertHeight(String height){

        height = height.replace(" ", "");

       int i= height.indexOf("ft");
       int j= height.indexOf("in");

        double ft = 0,in = 0;
        if(i!=-1){
            ft= Double.parseDouble(height.substring(0,i));
        }

        if(j!=-1){
            if(i!=-1){
                in= Double.parseDouble(height.substring(i+2,j));
            }
            else {
                in = Double.parseDouble(height.substring(0, j));
            }
        }

        return (((ft*12)+(in))*(0.0254));
    }


    public static String bmiCatagory(double bmi){
        if (bmi < 18.5)
            return "Underweight";
        else if (bmi <= 24.99)
            return "Normal Weight";
        else if (bmi <= 29.99)
            return "Overweight";
        else return "Obese";
    }

    public static void print(double bmi,String category){
        int numOfStar = (int)bmi;
        printStars(numOfStar);
        System.out.printf("\nYour BMI is: %.2f%n", bmi);
        System.out.println("Category: "+category);
        printStars(numOfStar);
    }
    public static void printStars(int n) {
        if (n == 0)
            return;
        System.out.print("*");
        printStars(n-1);
    }

    }



