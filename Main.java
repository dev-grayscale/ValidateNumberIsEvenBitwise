/**
 * Validate if a number is even
 */
public class Main {

  /**
   * Originating from the proofs that:
   *
   * An even number is expressed as <b>2n</b> and an odd number is expressed as <b>2n + 1</b>,
   * where n is an integer, and every position in the bit vector represents a factor of 2 value except 2^0 = 1,
   * which means that if the 0-th position hold a bit of 1, the value is odd.
   *
   * To prove that, we can arrive to the following outcomes:
   *
   * 1. no 1s bits - 0 (even)
   * 2. 1 or more 1s bits, none of which is at 0-th position - 2n + 2n + 2n + 2n + ... = 2(n + n + n + n + ...), which equals 2u (where u is a substitute for the sum of
   * n + n + n + ...) which is an integer and conforms to the even number formula, therefore the result will always be even.
   * 3. 1 or more 1s bits, one of which is at 0-th position - if we don't account for the 0-th bit initially, we'll always receive an even number as in point 2.,
   * but once the 1 is added, it will always result to 2n + 1, conforming to the odd number formula, therefore it will always be odd.
   *
   * We can make the conclusion that if 0-th position does not hold a bit of 1, the value is always even.
   */
  public static boolean isEven(int n) {
    return (n & 1) == 0;
  }
}
