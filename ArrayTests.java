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

  @Test
  public void averageWithoutLowestTest() {
    double[] input = {2.3, 4.5, 6.5, 1.2, 0.6};
    double output = ArrayExamples.averageWithoutLowest(input);
    assertEquals(3.625, output, 0.0001);
  }

  @Test
  public void averageWithoutLowestTest2() {
    double[] input = {};
    double output = ArrayExamples.averageWithoutLowest(input);
    assertEquals(0, output, 0.0001);
  }

  @Test
  public void averageWithoutLowestTest3() {
    double[] input = {4.0};
    double output = ArrayExamples.averageWithoutLowest(input);
    assertEquals(0, output, 0.0001);
  }

  @Test
  public void averageWithoutLowestTest4() {
    double[] input = {1.2, 1.2, 1.2};
    double output = ArrayExamples.averageWithoutLowest(input);
    assertEquals(1.2, output, 0.0001);
  }
}
