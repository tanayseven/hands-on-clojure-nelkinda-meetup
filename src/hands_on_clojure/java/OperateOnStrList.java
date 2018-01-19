import java.util.List;
import java.util.ArrayList;
class OperateOnStrList {
  private static long sumOfAllOddElements(final List<String> strList) {
    return strList.stream()
      .mapToInt(Integer::parseInt)
      .filter(num -> num % 2 != 0)
      .reduce(0, (a, b) -> a + b);
  }
  public static void main(String [] args) {
    List<String> strList = new ArrayList<String>() {{
      add("1");
      add("2");
      add("3");
      add("4");
      add("5");
    }};
    System.out.println(sumOfAllOddElements(strList));
  }
}
