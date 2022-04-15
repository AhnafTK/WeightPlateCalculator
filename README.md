# WeightPlateCalculator
* By: Ahnaf Kamal
* Project time: On and off between Jan and April 2022 during school time.
  1) Coding for the calculations done in a week during the month of Jan.
  2) Coding for the UI done in a few days during April.

## What is Weight plate calculator?
Weight Plate Calculator is an excercise tool that calculates the number of weight plates needed for a given weight. 
For example, The user wants to load their barbell for a 135 lbs bench press. They'd need to input the total weight of 135 and the barbell weight of 45.
Using these two numbers, the program calculates the weight of plates, and how many the user needs.

## What does it use?
* Written in Java
  - Uses Arrays, while loops
  - Swing
 
## How does it work?
First, it gathers the user inputs for both the total weight and barbell weight from the JTextFields. If one or both are empty, nothing happens. When the inputs contain double values, it is passed onto the main calculation, which takes into account the barbell weight in the total weight. The result of barbell weight - total weight is divided by 2 for the weight needed on each side, which goes through while loops to determine the number of plates from an array of weights, ranging from 45-2.5 lbs weights. For each iteration of the while loop, the # needed for that weight goes up, which is later used to display the # of plates needed for each weight plate in the UI window.

## Screenshots of the program running
### No input. The Java Swing UI upon starting the program.
![weightplate1](https://user-images.githubusercontent.com/91911908/163633313-08e01a4a-55c9-4dc2-866f-4c4e76e43425.png)

### In use, with total weight and barbell weight input.
![weightplate2](https://user-images.githubusercontent.com/91911908/163633610-fd77340c-30ba-4067-910e-c9abf635e8e2.png)

