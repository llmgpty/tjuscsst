package TestMain;

public class Main {
	
	public static String testMoney(int x) {
		String canGive = "���Ը�";
		String canNotGive = "���ܸ�";
		int [] coin = {50,20,5,5,1,1,1};
		for (int i=0;i<coin.length;i++) {
			if (x >= coin[i]) {
				x = x - coin[i];
			}
		}
		if (x == 0) {
			return canGive;
		}
		return canNotGive;
	}
}
