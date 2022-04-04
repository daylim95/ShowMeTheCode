import java.util.*;
import java.io.*;

public class C {
  
  private static int power(int a, int b){
    int result = 1;
    for(int i=0;i<b;i++){
      result *= a;
    }
    return result;
  }

  public static void main(String[] args)throws IOException{
    Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = "";
    str = br.readLine();

    int countE = 0;
    String[] arr;
    arr = str.split("");
    for(int i=0;i<arr.length;i++) { //출력
      if(arr[i].equals("E")){
        ++countE;
      }
    }

    int countW = 0;
    int result = 0;
    for(int i=0;i<N;i++){
      var count = 0;
      if(arr[i].equals("W")){
        ++countW;
      }else if(arr[i].equals("H")){
        count = countW * (power(2, countE) - countE - 1);
      }else if(arr[i].equals("E")){
        --countE;
      }
      result += count%1000000007;
    }
    System.out.println(result);
    sc.close();
  }
}
