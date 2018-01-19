class EvenOdd {
  private static void printYesIfIsOddElseNo(int num) {
    if (num % 2 != 0)
      System.out.println("Yes");
    else
      System.out.println("No");
  }
  private static void printYesIfIsEvenElseNo(int num) {
    if (num % 2 == 0E)
      System.out.println("Yes");
    else
      System.out.println("No");
  }
  public static void main(String [] args) {
    printYesIfIsOddElseNo(8);
    printYesIfIsOddElseNo(9);
    printYesIfIsEvenElseNo(9);
    printYesIfIsEvenElseNo(8);
  }
}
