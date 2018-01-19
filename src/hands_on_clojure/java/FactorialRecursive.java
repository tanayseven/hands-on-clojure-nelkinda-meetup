class FactorialRecursive {
  private static long factorial (final int num, final long result) {
    if (num == 1) {
      return result;
    }
    return factorial(num - 1, result * num);
  }
  private static long factorial (final int num) {
    return factorial(num, 1);
  }
  public static void main(String [] args) {
    System.out.println(factorial(9));
  }
}

