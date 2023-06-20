public class classworker {
    public static void main(String args[]){
        student samosa=new student();
        samosa.numbers=10;
        samosa.percentage=98.7f;
        samosa.lifetime=123.767768754;
        samosa.name="samosa";
        samosa.grade='a';
        System.out.println(""+samosa.numbers+"  "+samosa.percentage+" "+samosa.lifetime+"  "+samosa.name+"  "+samosa.grade);


        student billa=new student();
        billa.numbers=20;
        billa.percentage=90.7f;
        billa.lifetime=156723153.767768754;
        billa.name="billa";
        billa.grade='b';
        System.out.println(""+billa.numbers+"  "+billa.percentage+" "+billa.lifetime+"  "+samosa.name+"  "+billa.grade);

        student tiwari=new student();
        tiwari.numbers=101;
        tiwari.percentage=9832.7f;
        tiwari.lifetime=123.32767768754;
        tiwari.name="tiwari";
        tiwari.grade='O';
        System.out.println(""+tiwari.numbers+"  "+tiwari.percentage+" "+tiwari.lifetime+"  "+tiwari.name+"  "+tiwari.grade);
    }
}
class student{
    int numbers;
    float percentage;
    double lifetime;
    String name;
    char grade;
    
}
