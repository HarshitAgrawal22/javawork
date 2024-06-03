public class duplicateremove {
    public static void main(String[] args){
        int[] ar={1,1,2,2,3,3,4,4};
        remover(ar);
    }
    public static void remover(int[] ar){
        int len=ar.length,newar[]=new int[len],c=1;

        for(int i=0;i<len;i++){
            if(ar[i]!=newar[c-1]){
                newar[c]=ar[i];
                c+=1;


            }
            
        }
        for(int i=0;i<len;i++){
            System.out.println(newar[i]);
        }

    }
}
