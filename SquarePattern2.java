//This program prints a Square Star Pattern without using nested loops in Java

public class SquarePattern2 {
    public static void main(String args[])
    {
        int n = 5;
        for(int i=1;i<=n*n;i++)
        {
            System.out.print("* ");
            if(i%n==0)
            {
                System.out.println();
            }
        }
    }
}