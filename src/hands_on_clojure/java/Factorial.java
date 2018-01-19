class Factorial {
  private static long factorial (final int num) {
    long result = 1;
    for (int i = num ; i > 1; i--) {
      result *= i;
    }
    return result;
  }
  public static void main(String [] args) {
    System.out.println(factorial(9));
  }
}

