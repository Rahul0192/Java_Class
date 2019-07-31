public class Car{

    // class is blueprint of object
    //constructor is a instance method which name same as class name and it reference the object
    //object is refer of class
    // method is a function where you can do activities
    //object.method();
    //primitive data type and objective data type.
    /*in java program create many object which is interact by invoking method. object is reference data type which hold
    address.
     */
    int myAge =24;
    String myName="Rahul";


    public static void main(String[]args){

        Car myCar= new Car();
        System.out.println("I will buy a car");
        myCar.toyota();
    }
    public void toyota(){

        String condition=" It is very nice car";

        System.out.println(condition);

    }



}
