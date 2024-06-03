public class polymor {public static void main(String[] args){
    intro billa=new intro();
    billa.printer("shivam");
    billa.printer(18);
    billa.printer(60.8);
}
    
}

class intro{
    void printer(int num){
        System.out.println("your age is "+num);

    }
    void printer(String name){
        System.out.println("your name is "+name);
        
    }
    void printer(double weight){
        System.out.println("your weight is "+weight);
        
    }


}