package ArraysArraysList;

import java.util.*;

class ArrayListDuplicateElementError {

    static ArrayList<String> myList = new ArrayList<String> ();

    public static void main (String[]args){
        Scanner input = new Scanner (System.in);
        int counter = 0;

        System.out.println("Please add fruit:");
        while (counter < 5) {

            if (input.hasNextInt()) {
                System.out.println("Wrong input type, String requested. Please add fruit:");
                input.nextLine();
            }

            else{
                String s1 = input.nextLine();
                if (!isOnList(s1)) {
                    System.out.println("You entered " + "'" + s1 + "'. Fruit is not on the list. Adding fruit...");
                    myList.add(s1);
                    System.out.println("Done. Now the list contains: " + myList.toString().replace("[", "").replace("]", "") + ".");
                    counter++;
                } else {
                    System.out.println("You entered " + "'" + s1 + "'. Fruit is already on the list.");
                }
                //input.nextLine();     // nu este nevoie, da erori. Trebuia doar daca aveam Integer, ArrayList de Integer
            }
        }
        System.out.println("This is the final list.");
        input.close();
    }

    public static boolean isOnList (String strng){

        // for (int i = 0; i < myList.size(); i++)
        // if (myList.get(i).equals(fruit)) {
        // return true;
        // }

        for (String elem : myList){
            if (elem.equals(strng)){
                return true;
            }
        }
        return false;
    }
}