/**
 * Compute the sum and average for running integers using loop.
 */
public class SumAverage {


  /**
   * Computes sum of running integers from a lower bound to an upper bound.
   *
   * @param lowerBound lower bound
   * @param upperBound upper bound
   * @return sum of integers
   */
  public static int sum(int lowerBound, int upperBound) {
    int sum = 0;
    for (int i = lowerBound; i <= upperBound; i++) {
      sum +=i;
    }
    return sum;
    // TODO fill in code here using for loop and replace the return statement
    }



  /**
   * Computes sum of running integers from a lower bound to an upper bound within an array.
   *
   * @param numbers running integers array
   * @return sum of integers
   */
  public static int sum(int[] numbers) {
    int sum = 0;
    for (int h : numbers) {
      sum += h;
    }
    return sum;
    // TODO fill in code here using FOR EACH loop and replace the return statement
  }

  /**
   * Computes average of running integers from a lower bound to an upper bound.
   *
   * @param lowerBound lower bound
   * @param upperBound upper bound
   * @return average of integers
   */
  public static double average(int lowerBound, int upperBound) {
    double count = 0;
    double sum = 0;
    int i = lowerBound;
    while (i <= upperBound) {
      sum +=i;
      count++;
      i++;
    }
    double average = sum/count;
    return average;
    // TODO fill in code here using while loop and replace the return statement
  }

  /**
   * Computes average of running integers from a lower bound to an upper bound within an array.
   *
   * @param numbers running integers array
   * @return average of integers
   */
  public static double average(int[] numbers) {
    double sum = 0;
    int i = 0;
    do {
      sum += numbers[i];
      i++;
    } while (i < numbers.length);

    double average = sum / numbers.length;
    return average;
    // TODO fill in code here using do-while loop and replace the return statement

  }
}