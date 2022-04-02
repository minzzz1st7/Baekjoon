import java.io.*; 
import java.util.Stack; 
public class Main { 

    public static void main(String[] args) throws NumberFormatException, IOException { 

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

        int i, t, sum = 0; 

        /* input */ 

        int N = Integer.parseInt(br.readLine());  

        Stack<Integer> stack = new Stack<Integer>(); 

        /* stack */ 

        for(i = 0; i < N; i++) { 

            t = Integer.parseInt(br.readLine());

            if(t == 0 && !stack.isEmpty()) { 

                stack.pop();

                                           } 

            else if(t != 0){ stack.push(t); } } 

        /* sum */ 

        while(!stack.isEmpty()) {

            sum += stack.pop(); 

      } System.out.println(sum); 

    } }

