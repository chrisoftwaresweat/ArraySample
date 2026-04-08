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

        //1D Array
        String[] fruits = {"apple", "banana", "mango", "watermelon"};

        //print all using a normal for loop
        System.out.print("Normal for loop: ");
        for(int i = 0; i<fruits.length; i++){
            System.out.printf("%s ", fruits[i]);
        }

        System.out.println("\n"); //don't mind

        //print all using enhanced for loop
        System.out.print("Enhanced for loop: ");
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

        System.out.println(); //don't mind

        //2D Array
        int[][] twoDimensional = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}

        };
        System.out.print("2D Array result: ");
        System.out.printf("%d ", twoDimensional[0][0]); //1
        System.out.printf("%d ", twoDimensional[0][1]); //2
        System.out.printf("%d ", twoDimensional[0][2]); //3
        System.out.printf("%d ", twoDimensional[1][0]); //4
        System.out.printf("%d ", twoDimensional[1][1]); //5
        System.out.printf("%d ", twoDimensional[1][2]); //6
        System.out.printf("%d ", twoDimensional[2][0]); //7
        System.out.printf("%d ", twoDimensional[2][1]); //8
        System.out.printf("%d ", twoDimensional[2][2]); //9

        System.out.println(); //don't mind

        //2D: Traditional FOR LOOP
        System.out.print("Traditional 2D: ");
        for (int i = 0; i< twoDimensional.length; i++){
            for (int j = 0; j< twoDimensional.length; j++){
                System.out.printf("%d ", twoDimensional[i][j]);
            }
        }

        System.out.println(); //don't mind

        //2D: Enhance FOR LOOP
        System.out.print("Enhanced 2D: ");
        for (int[] row : twoDimensional){
            for (int enhanced2D : row){
                System.out.printf("%d ", enhanced2D);
            }
        }

        System.out.println("\n"); //don't mind

        //3D Array
        int[][][] threeDimensional = {
                {
                        {1, 2, 3}
                },
                {
                        {4, 5, 6}
                },
                {
                        {7, 8, 9}
                }
        };

        //Won't dive deep on 3D array but here's a sample indexing
        System.out.print("3D Array sample: ");
        System.out.printf("%d ", threeDimensional[0][0][0]); //1
        System.out.printf("%d ", threeDimensional[1][0][1]); //5
        System.out.printf("%d ", threeDimensional[2][0][2]); //9

        System.out.println(); //don't mind

        //Traditional FOR LOOP
        System.out.print("Traditional 3D: ");
        for (int i = 0; i< threeDimensional.length; i++){
            for (int j = 0; j< threeDimensional[i].length; j++){
                for (int k = 0; k< threeDimensional.length; k++){
                    System.out.printf("%d ", threeDimensional[i][j][k]);
                }
            }
        }

        System.out.println(); //don't mind

        //Enhanced FOR LOOP
        System.out.print("Enhanced 3D: ");
        for (int layer[][] : threeDimensional){
            for (int row[] : layer){
                for (int enhanced3D : row) System.out.printf("%d ", enhanced3D);
            }
        }

        System.out.println("\n"); //don't mind

        //SIZEABLE ARRAY
        System.out.print("Enter the size of your array: "); //user input
        int arrLength = scanner.nextInt();
        int[] sizeable = new int[arrLength]; //size depends on the user
        System.out.printf("Enter %d numbers: \n", arrLength);
        //sizing the array
        for (int i = 0; i<arrLength; i++) sizeable[i] = scanner.nextInt();
        System.out.print("Result: ");
        for (int sizeableSample : sizeable){
            System.out.printf("%d ", sizeableSample);
        }

        scanner.close();
    }
}
