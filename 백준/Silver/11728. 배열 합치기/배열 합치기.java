import java.io.*;
import java.util.*;


class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

		String[] input=br.readLine().split(" "); // 첫 번째 개행 읽기
		int n=Integer.parseInt(input[0]), m=Integer.parseInt(input[1]);
		int size=n+m;
		int[] result=new int[size];
		
		String[] arrayA=br.readLine().split(" "); // 두 번째 줄 읽기
		String[] arrayB=br.readLine().split(" "); // 세 번째 줄 읽기
		
		int idx=0;
		for(int i=0;i<n;i++) { 
			result[idx++]=Integer.parseInt(arrayA[i]);
		}
		for(int i=0;i<m;i++) {
			result[idx++]=Integer.parseInt(arrayB[i]);
		}
		Arrays.sort(result); 
		
		for(int r:result) {
			bw.write(String.valueOf(r)+" ");
		}
		
		bw.flush();
		bw.close();
	}
    
}
