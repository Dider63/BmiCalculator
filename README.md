 BMI Calculator
 
Summary:
Write a Java program that will take weight and height as input and calculate BMI (Body Mass Index) and print the result.

Input Details
weight : A real number in unit Kilogram (kg)
height : A string of the format <int>ft<space><int>in 
space is optional.
Example: 4ft 2in, 5ft10in, 10in, 5ft, 5ft 0in etc.

Output
Format of the output
************************
Your BMI is: <value>
Category: <category>
************************
Where,
Number of * should be equal to integer converted BMI value.
value means BMI value, and 
category means BMI category.

Constraints
Convert the string height to meter using a function. (20%)
Use a function for printing the final output. (10%)
For printing the top and bottom line having *, use a recursive function. (20%)

Formula
BMI formula:
BMI = weight(kg)​ / height(m)^2

Unit conversion:
1 inch = 0.0254m
1 ft = 12inch

BMI Category
Underweight: less than 18.5
Normal Weight: 18.5 - 24.9
Overweight: 25 - 29.9
Obese: Greater or equal to 30
