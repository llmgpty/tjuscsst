import static org.junit.Assert.*;

import org.junit.Test;

public class BackPackTest {
	@Test
	public void test() {
		int m = 10;
        int n = 3;
        int w[] = {3, 4, 5};
        int p[] = {4, 5, 6};
        int c[][] = BackPack.BackPack_Solution(m, n, w, p);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                //System.out.print(c[i][j] + " ");
                if (j == m && i==3) {
                	System.out.print(c[i][j]);
                	assertEquals(c[i][j],11);
                }
            }
        }
	}

}
