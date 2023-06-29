//rotate the image, 2d array, matrix



public class Rotator_2d{
    public static void main(String args[]){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter the row");
        int row =sc.nextInt(),arr1[][]=new int[row][row],arr[][]=new int[row][row],col=row;
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print("enter the "+(row-1-j)+" "+i+" :  ");
                int temp=sc.nextInt();
                
                arr1[row-1-j][i]=temp;
                
                arr[i][j]=temp;
            }
        }
        System.out.println("Expexted output: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(" "+arr1[i][j]);
                
            }
            System.out.println();
    }   
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("original array: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(" "+arr[i][j]);
                
            }
            System.out.println();
    }
}


}