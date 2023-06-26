public class inherit {public static void main(String[] args){
    laptop lenovo= new laptop();
    lenovo.portable();
    lenovo.work();
    pc homepc=new pc();
    homepc.life=10;
    lenovo.life=5;
    
}
    
}
class pc{
    int power_com=40;
    String name;
    double life;
    void work(){
        System.out.println("can perform certain tasks");
    }

}
class laptop extends pc{
    void portable(){
        System.out.println("laptops are portable");
    }


}