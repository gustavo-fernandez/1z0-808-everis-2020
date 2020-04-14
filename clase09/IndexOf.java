public class IndexOf {

  public static void main(String[] args) {
    String phoneNum = "404-543-234-5-23";
    int idx1 = phoneNum.indexOf('-');
    System.out.println("index of first dash: " + idx1);

    int idx2 = phoneNum.indexOf('-', idx1 + 1);
    System.out.println("second dash idx: " + idx2);

    int idx3 = phoneNum.lastIndexOf('-');
    System.out.println("last dash idx: " + idx3);

    int idx4 = phoneNum.indexOf("23");
    System.out.println("first 23 idx: " + idx4);
  }

}