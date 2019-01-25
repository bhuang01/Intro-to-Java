import java.util.Scanner;

public class StarsTester {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner scan = new Scanner(System.in);
        Stars star = new Stars();

        boolean cond = false;

        do {
            System.out.println("---MENU---");
            System.out.println("What would you like to see?");
            System.out.println("1) Star Square");
            System.out.println("2) Star Triangle");
            System.out.println("3) Inverted Triangle");
            System.out.println("4) Star Pyramid");
            System.out.println("5) Star Diamond");
            System.out.println("6) QUIT");
            System.out.print("-----> ");

            String menuChoice = scan.next();

            if (menuChoice.equals("1")) {
                System.out.println("Star Square: Input a number");
                int n = scan.nextInt();
                star.printStarSquare(n);
            }
            else if (menuChoice.equals("2")) {
                System.out.println("Star Triangle: Input a number");
                int n = scan.nextInt();
                star.printStarTriangle(n);
            }
            else if (menuChoice.equals("3")) {
                System.out.println("Inverted Triangle: Input a number");
                int n = scan.nextInt();
                star.printStarInvertedTriangle(n);
            }
            else if (menuChoice.equals("4")) {
                System.out.println("Pyramid Triangle: Input a number");
                int n = scan.nextInt();
                star.printStarPyramid(n);
            }
            else if (menuChoice.equals("5")) {
                System.out.println("Pyramid Diamond: Input a number");
                int n = scan.nextInt();
                star.printStarDiamond(n);
            }
            else if (menuChoice.equals("6")) {
                System.out.println("~~EXIT~~");
                System.exit(0);
            }
            System.out.println("Would you like to leave?");
            String choice1 = scan.next();
            if (choice1.equals("yes"))
                cond = true;
            else if (choice1.equals("no"))
                cond = false;
        } while(!cond);
    }
//		int x = scan.nextInt();
//		star.printStars(x);
}