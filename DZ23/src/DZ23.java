import java.util.Scanner;
public class DZ23 {

    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter numbers");
        int n=5;
        int[] mas = new int[n];
        for (int i=0; i<n;i++){
            mas[i] =  s.nextInt();
            //System.out.print(mas[i]+"  ");
        }
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
        if(mas[0]==mas[1]&&mas[1]==mas[2]&&mas[2]==mas[3]&&mas[3]==mas[4]){
            System.out.println("Impossible");
        }
        else if((mas[0]==mas[1]&&mas[1]==mas[2]&&mas[2]==mas[3])||(mas[1]==mas[2]&&mas[2]==mas[3]&&mas[3]==mas[4])){
            System.out.println("Four of a Kind");
        }
        else if((mas[0]==mas[1]&&mas[1]==mas[2]&&mas[3]==mas[4])||(mas[0]==mas[1]&&mas[2]==mas[3]&&mas[3]==mas[4])){
            System.out.println("Full House");
        }
        else if(mas[0]-mas[1]==1&&mas[1]-mas[2]==1&&mas[2]-mas[3]==1&&mas[3]-mas[4]==1){
            System.out.println("Straight");
        }
        else if((mas[0]==mas[1]&&mas[1]==mas[2])||(mas[1]==mas[2]&&mas[2]==mas[3])||(mas[2]==mas[3]&&mas[3]==mas[4])){
            System.out.println("Three of a Kind");
        }
        else if((mas[0]==mas[1]&&mas[2]==mas[3])||(mas[0]==mas[1]&&mas[3]==mas[4])||(mas[1]==mas[2]&&mas[3]==mas[4])){
            System.out.println("Two Pairs");
        }
        else if((mas[0]==mas[1])||(mas[1]==mas[2])||(mas[2]==mas[3])||(mas[3]==mas[4])){
            System.out.println("One Pair");
        }
        else {
            System.out.println("Nothing");
        }
    }
    
}