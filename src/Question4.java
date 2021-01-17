import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;


public class Question4 {
    public static void main(String [] args) throws IOException
    {
        Queue<Integer> q = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i<5; i++){
            int a = Integer.parseInt(br.readLine());
            q.add(a);
        }

        while (!q.isEmpty()){
            System.out.println(q.poll());
        }


    }
}
