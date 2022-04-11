import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main{
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N  = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		List<Integer> list = new ArrayList<Integer>();
		int[] check = new int[8001];
		int max = 0;
		int sum = 0;
		
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
			check[arr[i] + 4000]++;
		}
		
		System.out.println((int)Math.round((double)sum/N));
		Arrays.sort(arr);
		System.out.println(arr[N/2]);
		
		for (int i = 0; i < 8001; i++) max = Math.max(max, check[i]);
		for (int i = 0; i < 8001; i++) if(check[i] == max) list.add(i - 4000);
		
		System.out.println(list.size() > 1 ? list.get(1) : list.get(0));
		System.out.println(arr[arr.length-1] - arr[0]);
		
	}
}