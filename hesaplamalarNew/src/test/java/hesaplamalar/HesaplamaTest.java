package hesaplamalar;

import org.junit.Test;

import junit.framework.Assert;

public class HesaplamaTest {
	@Test
	public void testTopla25ve14() {
		int gercekSonuc = Hesaplamalar.topla(25, 14);
		Assert.assertEquals(39, gercekSonuc);
	}
}
