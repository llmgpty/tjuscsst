package TestMain;
import static org.junit.Assert.*;
import org.junit.Test;

public class Test1 {
	
		Main main = new Main();
		String canGive = "可以付";
		String canNotGive = "不能付";
		String result;
		
		@Test
		public void test1() {
			String result = main.testMoney(54);
			assertEquals(canNotGive, result);
		}
		
		@Test
		public void test2() {
			String result = main.testMoney(23);
			assertEquals(canGive, result);
		}
		
		@Test
		public void test3() {
			String result = main.testMoney(0);
			assertEquals(canGive, result);
		}
}
