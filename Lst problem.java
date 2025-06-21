import java.util.*;
public class Main{
    public static void main(String a[]){
        Scanner sc=new Scanner(System.in);
        if(sc.hasNextInt()){
            int n=sc.nextInt();
            if(n>=1 && n<=1000000){
                int sum=0;
                int temp=n;
                while(temp>0){
                    sum+=temp%10;
                    temp/=10;
                }
                if(n%sum==0){
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }
                
            }else{
            System.out.println("Invalid input:Number of allowed range");
                
            }
        }else{
            System.out.println("invalid input:please enter an valid integer");
            
        }
        sc.close();
        }
    }