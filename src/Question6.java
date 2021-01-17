import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Question6 {
    public static void main(String args []) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        Stack<Integer> s = new Stack<>();
        while (a!=0){
            s.push(a%2);
            a/=2;
        }
        while (!s.isEmpty()){
            System.out.print(s.pop());
        }
    }
}
