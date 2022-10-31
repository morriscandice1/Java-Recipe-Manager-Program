
package RecipeBox;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * @author Candice Morris
 * version 1.0
 * This is a program to collect user entered recipe information.
 */

//Recipe method
public class Recipe {
    //Variables
    String recipeName;	//name of recipe
    private int servings; //servings

    //Arraylists
    private ArrayList<Ingredient> recipeIngredients = new ArrayList(); //array for recipe ingredients

    private ArrayList<String> recipeInstructions; //array list for recipe instructions

    /**
     * @param recipeName
     */

    //Mutator
    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    /**
     * @return the recipeName
     */

    public String getRecipeName() {
        return recipeName;
    }

    /**
     * @param servings
     */
    //Mutator
    public void setServings(int servings) {
        this.servings = servings;
    }

    /**
     * @return servings
     */
    public int getServings() {
        return servings;
    }

    /**
     * @param recipeIngredients
     */
    public void setRecipeIngredients(ArrayList<Ingredient> recipeIngredients) {
        this.recipeIngredients = recipeIngredients;
    }

    /**
     * @return recipeIngredients
     */
    public ArrayList<Ingredient> getRecipeIngredients() {
        return recipeIngredients;
    }

    /**
     * @param recipeInstructions
     */
    public void setRecipeInstructions(ArrayList<String> recipeInstructions) {
        this.recipeInstructions = recipeInstructions;
    }

    /*
     * @return recipeInstructions
     */
    public ArrayList<String> getRecipeInstructions() {
        return recipeInstructions;
    }

    /**
     * Initial constructor
     * creates new object Recipe with initialized fields
     */
    public Recipe() {
        /*
         * the this keyword is used to convey the difference between local
         * variables and instance variables. The variables listed below with this
         * are referencing instance variables.
         */
        this.recipeName = ""; //user input, name of recipe
        this.servings = 0; //amount of servings
        this.recipeIngredients = new ArrayList<>();
        this.recipeInstructions = new ArrayList<>();
    }

    //Overload Constructor
    public Recipe(String recipeName, int servings,
                  ArrayList<Ingredient> recipeIngredients, ArrayList<String> recipeInstructions) {
        this.recipeName = recipeName;
        this.servings = servings;
        this.recipeIngredients = recipeIngredients;
        this.recipeInstructions = recipeInstructions;
    }

    //Add instructions method
    public void addInstructions() {
        /**
         * Declared variables instruction and addMoreInstructions.
         * Taking user input by using Scanner class.
         */
        String instruction = "";

        boolean addMoreInstructions = true;

        Scanner scnr = new Scanner(System.in);

        do {
            System.out.println("Please enter an instruction or type 'end' if you are finished entering instructions: ");
            instruction = scnr.nextLine();

            if (instruction.toLowerCase().equals("end")) {

                addMoreInstructions = false;

            }
            else {
                recipeInstructions.add(instruction);

                addMoreInstructions = true;
            }

        } while (addMoreInstructions == true);
    }

    /**
     * this method prints recipe details
     */

    public void printRecipe() {

        System.out.println("Recipe: " + recipeName);

        System.out.println("Serves: " + servings);

        System.out.println("Ingredients: ");

        //For loop to print each array member
        for (int i = 0; i < recipeIngredients.size(); i++) {
            recipeIngredients.get(i);
            System.out.println(i);
        }

        System.out.println("Instructions: ");
        for (int j = 0; j < recipeInstructions.size(); j++) {
            String instruction = recipeInstructions.get(j);
            System.out.println(j + instruction);
        }
    }
    /**
     * Create new recipe method to create recipes
     * based off of user input
     */
    public Recipe addNewRecipe() {

        ArrayList <Ingredient> recipeIngredients = new ArrayList();
        /**
         * Declared variable addMoreIngredients
         * Taking user input by using Scanner class.
         */
        boolean addMoreIngredients = true;

        Scanner scnr = new Scanner(System.in);

        System.out.println("Please enter the recipe name: ");
        String recipeName = scnr.nextLine();

        System.out.println("Please enter the number of servings: ");
        int servings = scnr.nextInt();

//A do-while loop to add more ingredients.
        do {
            System.out.println("Please enter the ingredient name or type 'end' if you are finished entering ingredients: ");
            String input = scnr.nextLine();

            if (!input.toLowerCase().equals("end")) {
                addMoreIngredients = true;
            }
            else {
                addMoreIngredients = false;
                break;
            }

        } while (addMoreIngredients == true);

        //new variable recipe1, which has details of the user entered recipe.
        Recipe recipe1 = new Recipe(recipeName, servings, recipeIngredients, recipeInstructions);

        recipe1.printRecipe();

        return recipe1;

    }

}
