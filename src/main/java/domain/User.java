package domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class User {
	private String managedBy;
	private String name;
	private List<String> permissions;

	public User() {
		super();
		permissions = new ArrayList<>();
	}

	public User(String managedBy, String name, List<String> permissions) {
		this.managedBy = managedBy;
		this.name = name;
		this.permissions = permissions;
	}

	public String getManagedBy() {
		return managedBy;
	}

	public void setManagedBy(String managedBy) {
		this.managedBy = managedBy;
	}

	public List<String> getPermissions() {
		return permissions;
	}

	public void setPermissions(List<String> permissions) {
		this.permissions = permissions;
	}

	public void setPermissions(String permissions) {
		if (permissions.length() > 0) {
			String[] split = permissions.trim().split(" ");
			this.permissions.addAll(Arrays.asList(split));
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
