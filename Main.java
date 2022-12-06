import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("enter a number: ");
    int num = scanner.nextInt();

    int dotsRemains = 0;
    // the loop
    for (int i = 1; i <= num; i++) {
      dotsRemains = i - 1;
      
      for (int j = 1; j <= num - i; j++) {
        System.out.print(".");
      }
      System.out.print(i);
      // #1
      while (dotsRemains > 0) {
        System.out.print(".");
        dotsRemains--;
      }
      //// or #2 using for loop
      // for(int fdotsRemains = i -1; fdotsRemains > 0; fdotsRemains--){
      //   System.out.print(".");
      // }
      
      // System.out.println();

    
    }
  }
}
