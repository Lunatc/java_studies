public class Conditions {
    public static void main(String[] args){

        if (20 > 18) {
            System.out.println("20 is greater than 18");
        }

        int time = 22;
        
        if (time < 10) {
            System.out.println("Good morning");
        } else if(time < 18){
            System.out.println("Good day");
        } else {
            System.out.println("Good evening");
        }


        //Java Short Hand If...Else (Ternary Operator)

        time = 20;

        String result = (time < 18) ? "Good day" : "Good evening";
        System.out.println(result);
    }
}