import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args){

        HashMap<String, String> capitalCities = new HashMap<String, String>();

        //Add keys and values
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        
        System.out.println(capitalCities);
        System.out.println(capitalCities.get("England"));

        capitalCities.remove("England");

        //remove all
        capitalCities.clear();

        System.out.println(capitalCities.size());

        //Loop through a HashMap

            //Print keys
        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }

            //Print values
        for (String i : capitalCities.values()) {
            System.out.println(i);
        }
    }   
}
