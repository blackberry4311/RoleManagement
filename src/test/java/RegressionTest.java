import domain.User;
import org.junit.Assert;
import org.junit.Test;
import test.RoleManagement;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

public class RegressionTest {
	private RoleManagement role = new RoleManagement();

	@Test
	public void testWithDefaultData() {
		User ceo = new User(null, "CEO", Arrays.asList("1", "6"));
		User user1 = new User("CEO", "User1", Arrays.asList("1", "2"));
		User user2 = new User("CEO", "User2", Arrays.asList("1", "3", "5"));
		User user3 = new User("User1", "User3", Arrays.asList("1"));
		User user4 = new User("User1", "User4", Arrays.asList("4"));
		User user5 = new User("User1", "User5", Arrays.asList("1", "3"));
		User user6 = new User("User2", "User6", Arrays.asList("1", "2"));

		LinkedHashMap<String, User> data = new LinkedHashMap<>();
		data.put("CEO", ceo);
		data.put("User1", user1);
		data.put("User2", user2);
		data.put("User3", user3);
		data.put("User4", user4);
		data.put("User5", user5);
		data.put("User6", user6);

		role.data = data;
		List<List<String>> result = role.processOutput();
		//Assert that first record in list is CEO permission, so it must have 6 permission
		Assert.assertTrue("Wrong CEO permission", result.get(0).size() == 6);
		//CEO permission must be 6 and exactly order 1 2 3 4 5 6
		List<String> ceoPermissions = result.get(0);
		List<String> verify = Arrays.asList("1", "2", "3", "4", "5", "6");
		for (int i = 0; i < verify.size(); i++) {
			Assert.assertTrue("Wrong CEO permission", ceoPermissions.get(i).equals(verify.get(i)));
		}

		//test random user2 with permission 1 2 3 5
		
	}
}
