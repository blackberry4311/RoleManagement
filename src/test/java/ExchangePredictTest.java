//import model.History;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import test.RoleManagement;
//
//import java.util.HashMap;
//
//import static org.mockito.BDDMockito.given;
//
//public class ExchangePredictTest {
//	@Mock
//	private OpenExchangeApiClient apiClient;
//
//	@InjectMocks
//	private RoleManagement exchangePredict;
//
//	@Before
//	public void initMocks() {
//		MockitoAnnotations.initMocks(this);
//	}
//
//	@Test
//	public void shouldWorkWellWithMockApiCall() throws Throwable {
//		String from = "USD";
//		String to = "TRY";
//		given(apiClient.getHistory("2016-01-15", from, to))
//				.willReturn(new History(from, new HashMap<String, Double>() {{
//					put(to, 3.04359);
//				}}, null));
//		given(apiClient.getHistory("2016-02-15", from, to))
//				.willReturn(new History(from, new HashMap<String, Double>() {{
//					put(to, 2.945926);
//				}}, null));
//		given(apiClient.getHistory("2016-03-15", from, to))
//				.willReturn(new History(from, new HashMap<String, Double>() {{
//					put(to, 2.893866);
//				}}, null));
//		given(apiClient.getHistory("2016-04-15", from, to))
//				.willReturn(new History(from, new HashMap<String, Double>() {{
//					put(to, 2.854589);
//				}}, null));
//		given(apiClient.getHistory("2016-05-15", from, to))
//				.willReturn(new History(from, new HashMap<String, Double>() {{
//					put(to, 2.970913);
//				}}, null));
//		given(apiClient.getHistory("2016-06-15", from, to))
//				.willReturn(new History(from, new HashMap<String, Double>() {{
//					put(to, 2.925991);
//				}}, null));
//		given(apiClient.getHistory("2016-07-15", from, to))
//				.willReturn(new History(from, new HashMap<String, Double>() {{
//					put(to, 2.990882);
//				}}, null));
//		given(apiClient.getHistory("2016-08-15", from, to))
//				.willReturn(new History(from, new HashMap<String, Double>() {{
//					put(to, 2.944941);
//				}}, null));
//		given(apiClient.getHistory("2016-09-15", from, to))
//				.willReturn(new History(from, new HashMap<String, Double>() {{
//					put(to, 2.970704);
//				}}, null));
//		given(apiClient.getHistory("2016-10-15", from, to))
//				.willReturn(new History(from, new HashMap<String, Double>() {{
//					put(to, 3.089218);
//				}}, null));
//		given(apiClient.getHistory("2016-11-15", from, to))
//				.willReturn(new History(from, new HashMap<String, Double>() {{
//					put(to, 3.284672);
//				}}, null));
//		given(apiClient.getHistory("2016-12-15", from, to))
//				.willReturn(new History(from, new HashMap<String, Double>() {{
//					put(to, 3.503773);
//				}}, null));
//
//		Double result = exchangePredict.predict("USD", "TRY", 12, 13);
//		Assert.assertTrue("Predict fail", result == 3.263);
//	}
//}
