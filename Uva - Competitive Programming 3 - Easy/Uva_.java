import java.io.*;
import java.util.*;
class Uva_{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
    BufferedWriter bw = new BufferedWriter (new OutputStreamWriter (System.out));
    Scanner sc = new Scanner(System.in);
    int test = Integer.parseInt(br.readLine());
    String s;
    String pair [] = new String [2];
    String name [] = new String [10];
    int value [] = new int [10];
    int max, n;
    for(int t = 1; t <= test; t++){
      max = 0;
      for(int i = 0; i < 10; i++){
        pair = br.readLine().split(" ");
        n = Integer.parseInt(pair[1]); 
        if(n > max){
          max = n;
        }
        name[i] = pair[0];
        value[i] = n;
      }
      System.out.println("Case #"+t+":");
      for(int i = 0; i < 10; i++){
        if(value[i] == max){
          System.out.println(name[i]);
        }
      }
    }
    bw.flush();
  }
}