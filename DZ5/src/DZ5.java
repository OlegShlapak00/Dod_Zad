import java.util.Scanner;


public class DZ5 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter count of array");
        int  n= s.nextInt();
        int[] mas=new int[n];
        
        for (int i=0; i<n;i++)
        {
            mas[i] =  (int) (Math.random()*15+1);
            System.out.print(mas[i]+"  ");
        }
        System.out.println();
        int g=1,mg=0,mn=0;
        for (int i=1;i<n;i++)
        {
            if(mas[i]%mas[i-1]==0)
            {
                g++;
            }
            else 
            {
                g=1;
            }
            if(g>mg)
            {
                mg=g;
                mn=i;
            }
            
        }
        if(mg==1){
           System.out.println("NO");  
        }
        else
        {
            int k=mn-mg;
            System.out.print("longest is  ");
            for (int i=k+1;i<=mn;i++)
            {
                System.out.print(mas[i]+" ");
            }
            
       }
    }
    
}
