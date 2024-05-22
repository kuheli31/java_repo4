import java.util.Scanner;

public class j4 
{
 public static void main(String[] args)
 {
    Scanner sc=new Scanner(System.in);
    int a[][]=new int[3][3];
    int r,c,x;
    System.out.println("Enter Array:");
    for(r=0;r<3;r++)
    {
        for(c=0;c<3;c++)
        {
            a[r][c]=sc.nextInt();
        }
    } 
    for(r=0;r<3;r++)
    {
        for(c=r;c<3;c++)
        {
            x=a[r][c];
            a[r][c]=a[c][r];
            a[c][r]=x;
        }
    }   
    System.out.println("Original array:");
    for(r=0;r<3;r++)
    {
        for(c=0;c<3;c++)
        {
            System.out.print(a[r][c]+" ");
        }
        System.out.println();
    }
    System.out.println("Transposed array:");
    for(r=0;r<3;r++)
    {
        for(c=0;c<3;c++)
        {
            System.out.print(a[c][r]+" ");
        }
        System.out.println();
    }
}
}
