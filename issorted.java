import java.util.Scanner;
public class issorted {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("enter the size of array: ");
        int size=sc.nextInt();

        int[] lis=new int[size];
        boolean issor=true;
        
        for(int i=0;i<size;i++){
            lis[i]=sc.nextInt();
            }

        for(int i=1;i<size;i++){
            if(lis[i]<lis[i-1]){
                issor=false;
            }
        }
        sc.close();
        if(issor){
            System.out.println("sorted");

        }
        else{
            System.out.println("not sorted");
        }
    }
    
}
