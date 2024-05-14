public class Parameters{
    static void myMethod(String fname, int age){
        System.out.println(fname + " Refsnes is " + age);
    }

    public static void main(String[] args){
        myMethod("Jenny", 10);
        myMethod("Anna", 23);
    }
}