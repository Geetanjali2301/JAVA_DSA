/*
    * 
   * * 
  * * * 
 * * * * 
* * * * *

 */
public class pattern_26 {
    public static void main(String[] args) {

        int n=6;
        for(int i=1;i<=n;i++)
        {
            int space=n-i;
            
            for(int j=1;j<=space;j++)
            {
                System.out.print(" ");
            }
            for(int j=n;j>space;j--)
            {
                System.out.print("* ");
            }
           
            System.out.println();
            
        }
        
    }
    
}
