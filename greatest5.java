import java.util.Scanner;
public class greatest5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size:");
        int size=sc.nextInt(),arr[]=new int[size],fil[]=new int[3];
    
        for(int i=0;i<size;i++){
            System.out.print("Enter:");
            arr[i]=sc.nextInt();
            
            }
        for(int j=0;j<3;j++){
        for(int i=0;i<size;i++){
            
            if(arr[i]>fil[j]){
                fil[j]=arr[i];
                arr[i]=0;
        }}

        }
        
    System.out.print(fil[0]+" "+fil[1]+" " +fil[2]);
    
    sc.close();
    }
    
}
