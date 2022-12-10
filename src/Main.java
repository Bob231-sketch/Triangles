import java.util.Scanner;

class terribleTriangles
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows >2 : ");
        int myRows = scanner.nextInt();
        System.out.println(" Here is your triangle 1");

        for (int m = 1; m <= myRows; m++) {
            for (int n = 1; n <= m; n++) {
                System.out.print("X");
            }
            System.out.println();

        }

        System.out.println("Here is your triangle 2 ");
        for (int m = 1; m <= myRows; m++) {
            for (int n = myRows; n >= m; n--) {
                System.out.print("X");
            }
            System.out.println();
        }

        System.out.println("Here is your triangle 3");
        for (int m = 0; m < myRows; m++) {
            for (int n = 2 * (myRows - m); n >= 0; n--) {
                System.out.print(" ");
            }
            for (int n = 0; n <= m; n++) {
                System.out.print("X ");
            }
            System.out.println();
        }

        System.out.println("Here is your triangle 4 ");
        {
            int m = 1;
            while (m <= myRows) {
                for (int n = 1; n < m; n++) {
                    System.out.print(" ");
                }
                for (int p = myRows; p >= m; p--) {
                    System.out.print("X");
                }
                System.out.println();
                m++;
            }
        }

        System.out.println("Here is your triangle 5 ");
        for (int m = myRows; m >= 1; m--) {

            for (int n = 1; n <= (m * 2) - 1; n++) {
                System.out.print("X");
            }
            System.out.println();
            for (int p = myRows; p >= m; p--) {
                System.out.print(" ");
            }
        }

        System.out.println("Here is your diamond");
        for (int m = 1; m<=myRows; m++)
        {
            for (int n=myRows; n > m; n--)
            {
                System.out.print(" ");
            }
            for (int p = 1; p <= (m * 2) -1; p++)
            {
                System.out.print("X");
            }
            System.out.println();
        }
        for (int m = myRows-1; m >= 1; m--)
        {
            for (int n = myRows-1; n >= m; n--)
            {
                System.out.print(" ");
            }
            for (int p = 1; p <= (m * 2) -1; p++)
            {
                System.out.print("X");
            }
            System.out.println();
        }
    }
}