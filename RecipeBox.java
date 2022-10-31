
import java.util.Scanner;

import java.util.ArrayList;
/**
 * This is a program to help manage a collection of recipes.
 * @author Candice Morris
 * @version 1.0
 * This class creates a menu that lets users execute various operations
 * that are defined by the methods below.
 */

//Main class
public class RecipeBox {

    ArrayList<Recipe> listOfRecipes = new ArrayList<>();

    /**
     * @param listOfRecipes
     */

    //Mutator
    public void setListOfRecipes(ArrayList<Recipe> listOfRecipes) {
        this.listOfRecipes = listOfRecipes;
    }

    /**
     * @return listOfRecipes
     */
    public ArrayList<Recipe>ListOfRecipes() {
        return listOfRecipes;
    }

    //Initial constructor to start arrayList
    public void RecipeBox() {
        this.listOfRecipes = listOfRecipes;
    }

    //Overloaded constructor
    public void RecipeBox(ArrayList<Recipe> listOfRecipes) {
        listOfRecipes = listOfRecipes;
    }

    //User-defined methods
    public void printAllRecipeNames() {

        for (int i = 0; i < listOfRecipes.size(); i++) {
            System.out.println(listOfRecipes.get(i));
        }
    }

    /**
     * printAllRecipeDetails(Recipe)
     * This method should accept a recipe from the listOfRecipes ArrayList
     * recipeName and use the Recipe.printRecipe() method
     * to print the recipe.
     */
    public void printAllRecipeDetails() {

        for (int j = 0; j < listOfRecipes.size(); j++) {

            Recipe tempRecipe = new Recipe();

            tempRecipe = listOfRecipes.get(j);

            tempRecipe.printRecipe();

        }
    }

    /**
     * Add recipe method
     */

    public void addNewRecipe() {

        Recipe tempRecipe2 = new Recipe();

        listOfRecipes.add(tempRecipe2.addNewRecipe());

    }

    /**
     * This method allows user to delete a recipe
     * If the input matches a recipe in listOfRecipes,
     * that recipe will be deleted.
     */

    public void deleteRecipe() {

        Scanner deleteScnr = new Scanner(System.in);

        String recipeToDelete = deleteScnr.next();

        for(int k = 0; k < listOfRecipes.size(); k++) {

            if (listOfRecipes.get(k).recipeName.equals(recipeToDelete)) {

                listOfRecipes.remove(k);
                break;
            }
        }
    }

    /**
     * The main driver method
     * The Menu
     */
    public static void main(String[] args) {

        RecipeBox finalRecipeBox = new RecipeBox();

        Scanner menuScnr = new Scanner(System.in);

        /**
         * Print menu for the user to select one of four menu options.
         */

        System.out.println("Menu\n" + "1. Add a recipe\n" + "2. Print all recipe details\n" + "3. Print all recipe names\n" + "4. Delete a recipe\n");

        while (menuScnr.hasNextInt() || menuScnr.hasNextLine()) {

            int input = menuScnr.nextInt();

            if (input == 1) {

                finalRecipeBox.addNewRecipe();
            }

            else if (input == 2) {

                finalRecipeBox.printAllRecipeDetails();
            }

            else if (input == 3) {

                finalRecipeBox.printAllRecipeNames();
            }

            else if (input == 4) {
                finalRecipeBox.deleteRecipe();
            }
            else {
                System.out.println("Menu\n" + "1. Add Recipe\n" + "2. Print All Recipe Details\n" + "3. Print All Recipe Names\n" + "4. Delete a Recipe\n");
            }

        }

    }

}
