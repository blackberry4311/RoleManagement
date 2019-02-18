//import model.Stored;
//import org.junit.Assert;
//import org.junit.Test;
//
//import java.util.LinkedHashMap;
//
//public class RegressionTest {
//	private Regression regression = new Regression();
//
//	@Test
//	public void testWithDefaultData() {
//		//this test case data i got from they way they implement linear regression at https://www.easycalculation.com/statistics/learn-regression.php
//		Stored a = new Stored(60, 3.1);
//		Stored b = new Stored(61, 3.6);
//		Stored c = new Stored(62, 3.8);
//		Stored d = new Stored(63, 4d);
//		Stored e = new Stored(65, 4.1);
//
//		LinkedHashMap<Integer, Stored> data = new LinkedHashMap<>();
//		data.put(1, a);
//		data.put(2, b);
//		data.put(3, c);
//		data.put(4, d);
//		data.put(5, e);
//
//		Double result = regression.linearRegression(data, 64);
//		Assert.assertTrue("Regression fail", result == 4.058);
//	}
//
//	@Test
//	public void testCustomData() {
//		LinkedHashMap<Integer, Stored> data = new LinkedHashMap<>();
//		data.put(1, new Stored(1, 3.04359));
//		data.put(2, new Stored(2, 2.945926));
//		data.put(3, new Stored(3, 2.893866));
//		data.put(4, new Stored(4, 2.854589));
//		data.put(5, new Stored(5, 2.970913));
//		data.put(6, new Stored(6, 2.925991));
//		data.put(7, new Stored(7, 2.990882));
//		data.put(8, new Stored(8, 2.944941));
//		data.put(9, new Stored(9, 2.970704));
//		data.put(10, new Stored(10, 3.089218));
//		data.put(11, new Stored(11, 3.284672));
//		data.put(12, new Stored(12, 3.503773));
//
//		Double result = regression.linearRegression(data, 13);
//		Assert.assertTrue("Regression fail", result == 3.263);
//	}
//}
