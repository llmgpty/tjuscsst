import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Arrays;

public class BubbleSortTest {
	@Test
	public void test() {
		int arr[] = { 3, 60, 35, 2, 45, 320, 5 };
		int sortarr[] = { 2, 3, 5, 35, 45, 60, 320};
		assertEquals(Arrays.toString(sortarr),Arrays.toString(BubbleSort.BubbleSort(arr)));
	}
}
