public class House {

    public static void main(String[]args){

        House newHouse= new House();
        String location,value;
        location ="Buffalo";
        value ="45000";
        System.out.println("I brought my first house "+location+value);

        newHouse.owner();
    }


    public void owner (){

        System.out.println("I borught it for business purpose" );
    }


}