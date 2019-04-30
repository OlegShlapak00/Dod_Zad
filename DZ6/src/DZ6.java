import java.util.Scanner;
public class DZ6 {

  
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter count of array");
        int  n= s.nextInt();
        int[] mas=new int[n];
        
        for (int i=0; i<n;i++){
            mas[i] =  (int) (Math.random()*30+1);
            System.out.print(mas[i]+"  ");
        }
        System.out.println();
        int tmp;
        for(int j = 0; j < n - 1; j++){
            for(int i = 0; i < n - 1; i++){
                if (mas[i] < mas[i + 1]) {  
                    tmp = mas[i];         
                    mas[i] = mas[i + 1];  
                    mas[i + 1] = tmp;     
                } 
            }
        }
        int K1=mas[0],K2=mas[1];
        for(int i=2;i<n;i++){
            if(K1<=K2){
                K1+=mas[i];
            }
            else {
                K2+=mas[i];
            }
            
        }
        if(K1-K2-K2>0||K2-K1-K1>0){
            System.out.println("IMPOSSIBLE");
        }
        else{
            System.out.println(K1 + " " + K2);
        }
    }
    
}
