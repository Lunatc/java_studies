import java.util.Scanner;

class UserInput {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username, age, salary");

        //String input
        String userName = myObj.nextLine();

        //Numerical input
        int age = myObj.nextInt();
        double salary = myObj.nextDouble();

        System.out.println("Username is: " + userName);
        System.out.println("Age: " + age);
        System.out.println("Salary " + salary);
    }
}