import animals.Puppy;
import utils.*;
public class Driver {
  public static void main(String[] args) {
    Puppy Joey = new Puppy("Joey");
    Puppy Chandler = new Puppy("Chandler");
    Puppy Ross = new Puppy("Ross");



  System.out.println(Joey.getName());
  System.out.println(Chandler.getName());
  System.out.println(Ross.getName());

  int[] hakarak = {9, 20, 3, 44, 88, 300};
  System.out.println(ArrayUtils.stringifyArray(ArrayUtils.reverse(hakarak)));


double n = 15.4;
System.out.println(utils.Math.factorial((int)n));
  }

}
