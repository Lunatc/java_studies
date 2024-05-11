public class Types {
    public static void main(String[] args){
        
        String name = "Jonh";
        System.out.println(name);

        int myNum = 15;
        System.out.println(myNum);

        boolean myBool = true;
        System.out.println(myBool);

        float myFloatNum = 5.99f;
        System.out.println(myFloatNum);

        System.out.println("Hello " + name);
        String lastName = "Doe";

        String fullName = name + lastName;
        System.out.println(fullName);

        //Declare Many Variables

        int x = 5, y = 6, z = 60;
        System.out.println(x + y + z);

        //One value to multiple variables

        x = y = z = 50;
        System.out.println(x + y + z);

    }
}