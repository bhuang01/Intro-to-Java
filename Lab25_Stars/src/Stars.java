
/*
 * Author: Bryan H.
 * Date: 1/23/19
 * Description: Prints out a number of stars, based on user input
 * Version: 2.0
 * Version Notes: Added feature that asks user to exit or not ("yes": continue browsing options, "no": exit program)
 */

import java.util.Scanner;

public class Stars {

    public void printStars(int x) {
        if (x > 0) {
            do {
                System.out.print("*");
                x--;
            } while (x > 0);
        }
    }

    //Prints a square formation of stars
    public void printStarSquare(int n) {
        int rows = n;
        int numStars = n;
        if (n > 0) {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < numStars; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
    }

    //Prints a traingle formation of stars
    public void printStarTriangle(int rows){
        if (rows > 0) {
            for (int i = 1; i <= rows; i++) {
                int numStars = i;
                for (int j = 0; j < numStars; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
    }

    //Prints an inverted triangle of stars
    public void printStarInvertedTriangle(int rows) {
        if (rows > 0) {
            for (int i = rows; i > 0; i--) {
                for (int j = 0; j < i - 1; j++) {
                    System.out.print(" ");
                }

                for (int z = 0; z < rows + 1 - i; z++) {
                    System.out.print("*");
                }
                System.out.print("\n");
            }
        }
    }

    //Prints a pyramid of stars (isosceles triangle)
    public void printStarPyramid(int rows) {
        if (rows > 0) {
            for (int i = 1; i < rows + 1; i++) {
                for (int j = 0; j < rows - i; j++) System.out.print(" ");
                for (int k = 0; k < 2 * i - 1; k++) System.out.print("*");
                System.out.println("");
            }
        }
    }

    //Prints a diamond formation of stars
    public void printStarDiamond(int rows) {
        if (rows % 2 != 0) {
            rows++;
            rows /= 2;
            if (rows > 0) {
                for (int i = 1; i < rows + 1; i++) {
                    for (int j = 0; j < rows - i; j++) System.out.print(" ");
                    for (int k = 0; k < 2 * i - 1; k++) System.out.print("*");
                    System.out.println("");
                }
                for (int i = rows - 1; i > 0; i--) {
                    for (int j = rows - i; j > 0; j--) System.out.print(" ");
                    for (int k = 2 * i - 1; k > 0; k--) System.out.print("*");
                    System.out.println("");
                }
            }
        }
        else if (rows % 2 == 0) {
            rows /= 2;
            if (rows > 0) {
                for (int i = 1; i < rows + 1; i++) {
                    for (int j = 0; j < rows - i; j++) System.out.print(" ");
                    for (int k = 0; k < 2 * i - 1; k++) System.out.print("*");
                    System.out.println("");
                }
                for (int i = rows; i > 0; i--) {
                    for (int j = rows - i; j > 0; j--) System.out.print(" ");
                    for (int k = 2 * i - 1; k > 0; k--) System.out.print("*");
                    System.out.println("");
                }
            }
        }
    }
}