import java.util.*;
public class amicablePair {
    public static void isPair(int n1,int n2)
    {
        int sum1=0,sum2=0;
        for(int i=1;i<n1;i++)
        {
            if(n1%i==0)
            {
                sum1+=i;  
            }
        }
        for(int i=1;i<n2;i++)
        {
            if(n2%i==0)
            {
                sum2+=i;
                
            }
        }
       

        if(sum1==n2 && sum2==n1)
        {
            System.out.println("It is an amicable pair");
        }
        else
        {
            System.out.println("Not an amicable pair");

        }
        
       
       
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the pair: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        isPair(a,b);

       
        
    }
    
}
