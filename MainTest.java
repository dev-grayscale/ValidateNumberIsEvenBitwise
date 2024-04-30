import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

  @Test
  public void test() {
    Assertions.assertTrue(Main.isEven(2));
    Assertions.assertTrue(Main.isEven(4));
    Assertions.assertTrue(Main.isEven(6));
    Assertions.assertTrue(Main.isEven(8));
    Assertions.assertTrue(Main.isEven(12));
    Assertions.assertTrue(Main.isEven(24));
    Assertions.assertTrue(Main.isEven(102));
    Assertions.assertTrue(Main.isEven(200));
    Assertions.assertTrue(Main.isEven(1024));
    Assertions.assertTrue(Main.isEven(200000));
    Assertions.assertTrue(Main.isEven(9992));

    Assertions.assertFalse(Main.isEven(1));
    Assertions.assertFalse(Main.isEven(3));
    Assertions.assertFalse(Main.isEven(5));
    Assertions.assertFalse(Main.isEven(7));
    Assertions.assertFalse(Main.isEven(9));
    Assertions.assertFalse(Main.isEven(11));
    Assertions.assertFalse(Main.isEven(13));
    Assertions.assertFalse(Main.isEven(15));
    Assertions.assertFalse(Main.isEven(177));
    Assertions.assertFalse(Main.isEven(231));
    Assertions.assertFalse(Main.isEven(549));
    Assertions.assertFalse(Main.isEven(555));
    Assertions.assertFalse(Main.isEven(1023));
    Assertions.assertFalse(Main.isEven(20001));
  }
}
