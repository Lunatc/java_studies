public class Strings {
    public static void main(String[] args){

        //String length

        String txt = "abcdefghijklmnopqrstuvwxyz";
        System.out.println("The length of the txt string is: " + txt.length());

        // Upper and Lower Case

        String txt2 = "Hello World";
        System.out.println(txt2.toUpperCase());
        System.out.println(txt2.toLowerCase());

        // Finding a character in a String

        String txt3 = "Please locate where 'locate' occurs!";
        System.out.println(txt3.indexOf("locate"));

        
    }
}