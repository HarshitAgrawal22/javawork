package DSA;
public class  Upgraded_Bubble{
    public static void main(String[] pilla){
        int[] arr=new int[100000];
        int j=0;
        for(int i=100000;i>0;i--){
            arr[i-1]=j++;
        }
        

        for (int i : Bubble_upgraded(arr) ) {
            System.out.println(i);
        }

    }
    public static int[] Bubble_upgraded(int[] data){
        
        for(int i=0;i<data.length;i++){
            for(int j=0;j<data.length-i-1;j++){
                if(data[j] > data[j+1]){
                    int temp=data[j];
                    data[j]=data[j+1];
                    data[j+1]=temp;
                               }

            }
            
        }
        return data; 
        
    }
}