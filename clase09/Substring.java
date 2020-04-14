public class Substring {

  public static void main(String[] args) {
    String message = "Hello World!";
    String sub1 = message.substring(0);
    String sub2 = message.substring(0, message.length());

    System.out.println("'" + sub1 + "' | '" + sub2 + "'");

    String sub3 = message.substring(1);
    String sub4 = message.substring(1, message.length());

    System.out.println("'" + sub3 + "' | '" + sub4 + "'");

    // endIndex - beginIndex = substring length
    // 012345678910
    // Hello World!
    String sub5 = message.substring(1, 4);
    System.out.println("'" + sub5 + "'");
  }

}