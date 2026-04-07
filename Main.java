import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        /* What is an array?
            -An array is a data structure that stores multiple values of the same type in a single variable.
             Instead of making many variables, you use one array to hold all values.
         */

        //ARRAY SAMPLES
        //REMEMBER: index starts @ 0, length starts @ 1

        String[] fruits = {"apple", "banana", "mango", "watermelon"}; //the array itself

        //print all using a normal for loop
        System.out.print("Normal for loop: ");
        for(int i = 0; i<fruits.length; i++){
            System.out.printf("%s ", fruits[i]);
        }
        System.out.println("\n"); //don't mind

        //print all using enhanced for loop
        System.out.print("Enhance for loop: ");
        for(String fruitBasket : fruits){
            System.out.printf("%s ", fruitBasket);
        }
        System.out.println("\n"); //don't mind

        //print each fruit in the array
        System.out.println("Each fruit: ");
        System.out.println(fruits[0]);
        System.out.println(fruits[1]);
        System.out.println(fruits[2]);
        System.out.println(fruits[3]);

        scanner.close();
    }
}