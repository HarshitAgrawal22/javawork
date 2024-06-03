
public class rotatingarr {
    public static void main(String[]arr){

        java.util.Scanner sc=new java.util.Scanner(System.in);
        int size=sc.nextInt(),torot=sc.nextInt();

        
        int[] cont=new int[size];

        for(int i=0;i<size;i++){
            if(i<torot){
                cont[size-1+i-torot]=sc.nextInt();
            }
            else{
                cont[i-torot]=sc.nextInt();
            }

        }
        for(int i=0;i<size;i++){
            System.out.println(cont[i]);
        }
        sc.close();

    }
    
}
