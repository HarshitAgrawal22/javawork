import java.util.Scanner;
public class simplecalulator {
    public static void main(String args[]){
        int a,b;
        char c;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number:");
        a=sc.nextInt();
        
        System.out.println("Enter the second number:");

        b=sc.nextInt();
        
        System.out.println("Enter the operation:");
        c=sc.next().charAt(0);
        System.out.println(calculator(a,b,c));
        System.out.print(c);
    }
    static String calculator(int num1,int num2,char op){
        if(op=='%')
        {
            return (num1%num2)+"";
        }
        else if(op=='*')
        {
            return (num1*num2)+"";
        }

        else if(op=='-')
        {
            return (num1-num2)+"";
        }
        else if(op=='/')
        {
            return (num1/num2)+"";
        }
        else if(op=='+')
        {
            return (num1+num2)+"";
        }
else
{return "invalid input";}
    }


}
