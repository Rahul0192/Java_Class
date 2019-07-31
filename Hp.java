public class Hp {

    public Hp(){

        System.out.println("it is a nice laptop");
    }

    public Hp(String color){
        System.out.println(color);
    }
    public Hp(int size){
        System.out.println(size);
    }

    public static void main(String[]args){

        Hp myHp= new Hp();
        String mac,hp;
        //assing
        mac="apple";
        hp="windows";
        System.out.println(mac+" " +hp);
        myHp.laptop();
        // creating Hp type coreI5 reference variable by invoking Hp() constructor by the help of new keyword
        Hp coreI5 = new Hp("black");
        Hp range=new Hp(5);

        coreI5.work();
        range.condition();

    }

    public void laptop(){

        System.out.println("Hp is one type of laptop");
    }
public void work(){
        int price=200;

        System.out.println(price);
}
public void condition(){
        System.out.println("It is good condition");

}


}
