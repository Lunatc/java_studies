public class Arrays{
    public static void main(String[] args){
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        int[] myNum = {10,20,30,40};

        //Access the Elements of an Array
        System.out.println(cars[0]);

        //Change an Array Element
        cars[0] = "Opel";

        //Array Length
        System.out.println(cars.length);

        //Loop Through an Array
        for (int i = 0; i < cars.length; i++){
            System.out.println(cars[i]);
        }

        //Loop Through an Array with For-Each
        for(String n : cars) {
            System.out.println(n);
        }

        //Multidimensional Arrays

        int[][] myNumbers = { {1,2,3,4}, {5,6,7}};

        System.out.println(myNumbers[1][2]);

        //Loop Through a Multi-Dimensional Array

        for (int x = 0; x < myNumbers.length; ++x){
            for (int y = 0; y < myNumbers[x].length; ++y){
                System.out.println(myNumbers[x][y]);
            }
        }
    }
}