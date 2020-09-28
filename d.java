import java.io.*;
class a {
  int num[] = new int[3];
  void myget() throws IOException {
    BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
    for (int i = 0 ; i < 3 ; i++){
      num[i] = Integer.parseInt(inp.readLine());
    }
  }
}
class b extends a {
  static int c(int c1 , int c2) {return (c1+c2);}
  static int c(int c1 , int c2 ,int c3) {return (c1*c2*c3);}
  public static void main(String args[]) throws IOException{
    b sum = new b();
    sum.myget();
    System.out.println(c(sum.num[0] , sum.num[1]));
    System.out.println(c(sum.num[0] , sum.num[1] , sum.num[2]));
  }
}

	