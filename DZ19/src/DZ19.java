//оптимизаія наше все
public class DZ19 {


    public static void main(String[] args) {
        int q=0;
        for(int i=100000;i<=999999;i++){
            int ch=i,sum1=0,sum2=0,z;
            for(int j=0;j<3;j++){
                z=ch%10;
                ch=ch/10;
                sum1+=z;
            }
            for(int j=0;j<3;j++){
                z=ch%10;
                ch/=10;
                sum2+=z;
            }
            if(sum1==sum2){
                System.out.println(i);
                q++;
            }
            sum1=0;
            sum2=0;
        }
         System.out.println(q);
    }
         

    
}
