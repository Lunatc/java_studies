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

        //Switch

        int day = 4;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }
}