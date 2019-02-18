package domain;

import java.util.Arrays;
import java.util.List;

public class User {
	private String manager;
	private List<String> permissions;

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public List<String> getPermissions() {
		return permissions;
	}

	public void setPermissions(List<String> permissions) {
		this.permissions = permissions;
	}

	public void setPermissions(String permissions) {
		String[] split = permissions.split(" ");
		this.permissions = Arrays.asList(split);
	}
}
