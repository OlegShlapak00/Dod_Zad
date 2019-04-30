import java.util.Scanner;
public class DZ16 {

   
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter count of array");
        int  n= s.nextInt();
        int[] mas=new int[n];
        
        for (int i=0; i<n;i++){
            mas[i] =  (int) (Math.random()*15+1);
            System.out.print(mas[i]+"  ");
        }
        int pz;
        System.out.println();
        for(int i=0;i<n;i++){
            pz=mas[i];
            for(int j=i+1;j<n;j++){
                if(mas[j]>mas[i]){
                    mas[i]=mas[j];
                    break;
                }
            }
            if(mas[i]==pz){
                mas[i]=0;
            }
        }
        for(int i=0;i<n;i++){
           System.out.print(mas[i]+"  ");  
        }
        
    }
    
}
