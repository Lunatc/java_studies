import java.util.ArrayList;
import java.util.Collections;

public class ArraysList {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        
        
        cars.add(0,"Mazda");
        System.out.println(cars);

        //Loop through an arraylist

        for (int i = 0; i < cars.size(); i++){
            System.out.println(cars.get(i));
        }

        cars.set(0,"Opel");
        cars.remove(0);
        cars.clear(); //remove all elements

        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(30);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(10);

        System.out.println(myNumbers);
        //Sort alphabetically or numerically

        Collections.sort(myNumbers);

        System.out.println(myNumbers);
    }
}