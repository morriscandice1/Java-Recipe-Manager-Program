
package RecipeBox;
import java.util.Scanner;

/**
 * @author Candice Morris
 * @version 1.0
 * The ingredient class contains the details of individual ingredients in a recipe.
 * The basic attributes: name, amount, unit of measure, and calories.
 */

public class Ingredient {

    private String nameOfIngredient; //Name of ingredient
    private String unitMeasurement; //Unit of measurement for ingredient
    private double ingredientAmount; //Ingredient amount in a recipe
    private int numberCaloriesPerUnit; //Number of calories per unit
    private double totalCalories; //Calories in a serving * amount of ingredient

    /**
     * @return the nameOfIngredient
     */
    public String getNameOfIngredient() {
        return nameOfIngredient;
    }

    /**
     * Mutator
     * @param nameOfIngredient
     */
    public void setNameOfIngredient(String nameOfIngredient) {
        this.nameOfIngredient = nameOfIngredient;
    }

    /**
     * @return the unitMeasurement
     */
    public String unitMeasurement() {
        return unitMeasurement;
    }

    /**
     * Mutator
     * @param unitMeasurement
     */
    public void numberOfCups(float numberOfCups) {
        this.unitMeasurement = unitMeasurement;
    }

    /**
     * @return ingredientAmount
     */
    public double ingredientAmount() {
        return ingredientAmount;
    }

    /**
     * Mutator
     *@param ingredientAmount
     */
    public void ingredientAmount(float ingredientAmount) {
        this.ingredientAmount = ingredientAmount;
    }

    /**
     * @return the numberCaloriesPerUnit
     */
    public int getNumberCaloriesPerUnit() {
        return numberCaloriesPerUnit;
    }

    /**
     * Mutator
     * @param numberCaloriesPerUnit
     */
    public void setNumberCaloriesPerUnit(int numberCaloriesPerUnit) {
        this.numberCaloriesPerUnit = numberCaloriesPerUnit;
    }

    /**
     * @return totalCalories
     */
    public double getTotalCalories() {
        return totalCalories;
    }

    /**
     * Mutator
     * @param totalCalories
     */
    public void setTotalCalories(double totalCalories) {
        this.totalCalories = totalCalories;
    }

    /**
     * Initial constructor Ingredient
     * creates new object Ingredient with initialized fields
     */
    public Ingredient() {
        this.nameOfIngredient = "";
        this.unitMeasurement = "";
        this.ingredientAmount = 0;
        this.numberCaloriesPerUnit = 0;
        this.totalCalories = 0.0;
    }

    //Overloaded Constructor
    public void Ingredient(String nameOfIngredient, String unitMeasurement,
                           double ingredientAmount, int numberCaloriesPerUnit, double totalCalories) {
        this.nameOfIngredient = nameOfIngredient;
        this.unitMeasurement = unitMeasurement;
        this.ingredientAmount = ingredientAmount;
        this.numberCaloriesPerUnit = numberCaloriesPerUnit;
        this.totalCalories = totalCalories;
    }

    /**
     * Declared variable addIngredient
     * Taking user input by using Scanner class.
     */
    public Ingredient addIngredient(String tempNameOfIngredient) {

        Scanner scnr = new Scanner(System.in);

        // This creates a new ingredient under the class ingredient
        Ingredient newIngredient = new Ingredient();

        //Print statement to get the name of the ingredient a user wishes to enter
        System.out.println("Please enter the ingredient name: ");

        nameOfIngredient = scnr.nextLine();

        //Print statement to get measurement from user
        System.out.println("Please enter the unit of measurement for this ingredient. These are the options:");
        System.out.println("Cup(s)");
        System.out.println("Tbsp(s)");
        System.out.println("Tsp(s)");

        System.out.println("Type a unit of measurement as it appears in the list above.");

        if (scnr.hasNext()) {
            unitMeasurement = scnr.next();

            if (!"Cup(s)".equals(unitMeasurement) && !"Tbsp(s)".equals(unitMeasurement) && !"Tsp(s)".equals(unitMeasurement)) {
                System.out.println("Please enter one of the above options:");
            }

            else {
                System.out.println("Thank you. You selected " + unitMeasurement);
            }
        }

        else {
            System.out.println("Please enter one of the above options:");

            if (scnr.hasNext()) {
                unitMeasurement = scnr.next();

                if (!"Cup(s)".equals(unitMeasurement) && !"Tbsp(s)".equals(unitMeasurement) && !"Tsp(s)".equals(unitMeasurement)) {
                    System.out.println("Error! The unit you entered is incorrect. Please start over");
                }

                else {
                    System.out.println("Thank you. You selected " + unitMeasurement);
                }
            }
        }

        //Print statement to get number of units from user
        System.out.println("Please enter the number of " + unitMeasurement + " of " + nameOfIngredient + " required (between 1 and 100: )");

        if (scnr.hasNextInt()) {
            ingredientAmount = scnr.nextInt();

            if ((ingredientAmount >= 1) && (ingredientAmount <= 100)) {
                System.out.println(ingredientAmount + " is a correct amount. Any recipes using this "
                        + "ingredient will need " + ingredientAmount + " "
                        + unitMeasurement + " of " + nameOfIngredient);
            }
            else {
                System.out.println(ingredientAmount + " is not a correct amount.");
                System.out.println("Please try again. Enter a valid number of units between 1 and 100: ");
                if (scnr.hasNextInt()) {
                    ingredientAmount = scnr.nextInt();

                    if ((ingredientAmount >= 1) && (ingredientAmount <= 100)) {
                        System.out.println(ingredientAmount + " is a correct amount.");
                    }
                    else if (ingredientAmount < 1) {
                        System.out.println(ingredientAmount + " is less than 1. You are out of attempts.");
                    }
                    else {
                        System.out.println(ingredientAmount + " is over 100 units. You are out of attempts.");
                    }
                }
            }
        }

        else {
            System.out.println("Error: That is not a number. You have no more attempts.");
        }

//Print statement to get calories per unit from user
        System.out.println("Please enter the number of calories per " + unitMeasurement + " of " + nameOfIngredient + " between 1 and 5000: ");

        if (scnr.hasNextInt()) {
            numberCaloriesPerUnit = scnr.nextInt();

            if ((numberCaloriesPerUnit >= 1) && (numberCaloriesPerUnit <= 5000)) {
                System.out.println(numberCaloriesPerUnit + " is a correct number of calories. Thank you");
            }
            else {
                System.out.println(numberCaloriesPerUnit + " is not a correct number of calories.");
                System.out.println("Please enter the number of calories per unit between 1 and 5000: ");

                if (scnr.hasNextInt()) {
                    numberCaloriesPerUnit = scnr.nextInt();

                    if ((numberCaloriesPerUnit >= 1) && (numberCaloriesPerUnit <= 5000)) {
                        System.out.println(numberCaloriesPerUnit + " is a correct number of calories. Thank you!");
                    }

                    else if (numberCaloriesPerUnit < 1) {
                        System.out.println(numberCaloriesPerUnit + " is less than 1. You are out of attempts.");
                    }

                    else {
                        System.out.println(numberCaloriesPerUnit + " is greater than 5000. You are out of attempts.");
                    }
                }
            }
        }

        else {
            System.out.println("Invalid entry: You did not enter a number. "
                    + "Please start over");
        }

        //Calculation for total calories
        totalCalories = ingredientAmount * numberCaloriesPerUnit;

        System.out.println("Thank you!");
        System.out.println("A recipe that utilizes " + nameOfIngredient + " uses " + ingredientAmount +
                unitMeasurement + " of " + ingredientAmount + " and has " + totalCalories + " total calories.");

        System.out.println("This ingredient has been added.");

        return newIngredient;
    }
}