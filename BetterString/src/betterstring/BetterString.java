package betterstring;
import java.util.function.BiPredicate;
import java.util.function.Predicate;


public class BetterString {

    
    public static String betterString(String s1,String s2,BiPredicate<String, String> bi){
       if(bi.test(s1,s2)){
           return s1;
       }else{
           return s2;
       }
//        return s1;
    }
    
    public static boolean AllStringIsLetter(String s1,Predicate<Character> bi){
        // convert string to `char[]` array
        char[] chars = s1.toCharArray();
        // iterate over `char[]` array using enhanced for-loop
        for (char ch: chars) {
            if(bi.test(ch) == false){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        String string1 = "Ahmed";
        String string2 = "Mahmoud";
        
        String Longer = betterString(string1,string2,(String s1,String s2) -> s1.length() > s2.length());
        System.out.print(Longer+"\n");
        String first = betterString(string1,string2,(String s1,String s2) -> true);
        System.out.print(first+"\n");
        
        String LetterCointainer = "Ahmed123";
        
        //implement all string is letter method by applying prdicate interface with lambda experssion as argument for static function
        boolean Stringchecker = AllStringIsLetter(LetterCointainer,(Character c) -> Character.isLetter(c));
        System.out.println(Stringchecker+"\n");
        
        //implement all string is letter method by block of code in lambda experssion
        Predicate<String> AllStringIsLetter = (s1) -> {
            // convert string to `char[]` array
            char[] chars = s1.toCharArray();
            // iterate over `char[]` array using enhanced for-loop
            for (char ch: chars) {
                if(Character.isLetter(ch) == false){
                    return false;
                }
            }
            return true;
        } ;
        System.out.println(AllStringIsLetter.test(LetterCointainer));
    }
    
}
