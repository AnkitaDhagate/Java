import java.util.*;
class Prime
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int a = sc.nextInt();
        
        for(int i=2;i<a;i++)
        {
            int j;
            for(j=2;j<=i;j++)
            {
                if(i%j==0)
                {
                    break;
                }
            }
            if(i==j)
            {
                System.out.println(i);
            }
        }
    }
}