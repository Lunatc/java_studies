public class Attributes{
    int x = 5;
    int y = 3;


    public static void main(String[] args){
        Attributes myObject = new Attributes();
        System.out.println(myObject.y);
        System.out.println(myObject.x);
        
        //Modify Attributes
        myObject.x = 40;
        System.out.println(myObject.x);

        //Multiple objects
        Attributes myObject2 = new Attributes();
        myObject2.x = 25;

    }
}