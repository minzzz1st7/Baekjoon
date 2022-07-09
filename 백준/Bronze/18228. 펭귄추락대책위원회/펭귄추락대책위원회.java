import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int lmin=Integer.MAX_VALUE,rmin=Integer.MAX_VALUE;
		boolean chk=false;
		while(st.hasMoreTokens())
		{
			int tmp=Integer.parseInt(st.nextToken());
			if(tmp==-1) {
				chk=true;
				continue;
			}
			if(!chk) {
				if(tmp<lmin)
					lmin=tmp;
			}
			else {
				if(tmp<rmin)
					rmin=tmp;
			}
		}
		System.out.println(rmin+lmin);
	}
}