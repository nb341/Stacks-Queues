import java.util.Stack;

public class Question5 {
    public static void main(String [] args){
        Stack<Character> s = new Stack<>();
        String p = "civica";
        int i;
        for(i = 0; i<p.length(); i++){
            s.push(p.charAt(i));
        }
        boolean flag=true;
        i=0;
        while (!s.isEmpty()){
            if(s.pop()!= p.charAt(i)){
                flag = false;
                break;
            }
            ++i;
        }
        System.out.println( flag ? "Is palindrome" : "Not palindrome" );
    }
}
