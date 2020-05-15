public class TwoDimensionalArray {

  public static void main(String args[]) {
    int[][] ints;
    ints = new int[][]{ {1, 3}, {2, 4, 6} };
    int sum = 0;
    //sum += ints[0][0];
    //sum += ints[0][1];
    //sum += ints[1][0];
    //sum += ints[1][1];
    /*for (int[] array : ints) {
      for (int elementOfArray : array) {
        sum += elementOfArray;
      }
    }*/
    for (int i = 0; i < ints.length; i++) {
      for (int j = 0; j < ints[i].length; j++) {
        sum += ints[i][j];
      }
    }
    System.out.println(sum);

    if(true);
  }

}