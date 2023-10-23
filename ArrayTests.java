import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void reverseInPlaceTest2() {
    int[] input = {1, 2, 3, 4};
    ArrayExamples.reverseInPlace(input);
    assertArrayEquals(new int[]{4, 3, 2, 1},input);
  }

  @Test
  public void reversedTest2() {
    int[] input = {1, 2, 3, 4};
    int[] output = ArrayExamples.reversed(input);
    assertArrayEquals(new int[]{4, 3, 2, 1}, output);
  }
}
