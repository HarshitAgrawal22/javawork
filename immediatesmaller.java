import java.util.Scanner;
public class immediatesmaller {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size and target here: ");
        int max=0,size=sc.nextInt(),target=sc.nextInt(),arr[]=new int[size];
        
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
            if(arr[i]>max && arr[i]<target){
                max=arr[i];
            }
        }
        System.out.println(max);
        sc.close();

    
    
    
    }
    
}
