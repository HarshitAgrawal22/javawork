public class swap_i_and_j {
    public static void main(String[] args){
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.println("Enter the value for size ,i and j: ");
        int size=sc.nextInt(),a=sc.nextInt(),b=sc.nextInt(),ar[]=new int[size];
        
        for(int i=0;i<size;i++){
            ar[i]=sc.nextInt();
        }
        int t1=a,t2=b;
        for(int i=a;i<(b+a)/2;i++){int temp=ar[t2];

            ar[t2]=ar[t1];
            ar[t1]=temp;
            t1+=1;
            t2-=1;
                    }            
        
        for(int i=0;i<size;i++){
            System.out.println( ar[i]);
        }
        sc.close();
    
    
    }
}
