import java.io.*;

public class bk11021_ano {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine().trim());

        for(int i=1; i<=n; i++){
            String a = br.readLine();
            String[] al = a.split(" ");
            int b = Integer.parseInt(al[0]);
            int b1 = Integer.parseInt(al[1]);
            bw.write("Case #"+i+": "+b+" + "+b1+"= "+(b+b1)+"\n");
        }
        bw.flush();
        bw.close();
    }
}
