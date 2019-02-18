package test;

import domain.User;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class RoleManagement {
	private LinkedHashMap<String, User> data;
	private Integer numOfUsers;

	public LinkedHashMap<String, User> getData() {
		return data;
	}

	public void setData(LinkedHashMap<String, User> data) {
		this.data = data;
	}

	public Integer getNumOfUsers() {
		return numOfUsers;
	}

	public void setNumOfUsers(Integer numOfUsers) {
		this.numOfUsers = numOfUsers;
	}

	public RoleManagement() {
		data = new LinkedHashMap<>();
		numOfUsers = -1;
	}

	public static void printOutput(LinkedHashMap<String, User> r) {

	}

	public static void main(String... args) {
		RoleManagement r = new RoleManagement();
		Scanner sc = new Scanner(System.in);
		int count = -2;// for position of user
		boolean inputManager = false;
		while (true) {
			String input = sc.nextLine();

			if ((input).equalsIgnoreCase("output")) {
				printOutput(r.getData());
				break;
			}
			
			if (input.equalsIgnoreCase("CEO")) inputManager = true;

			if (inputManager) { //input manager
				count++;
				r.getData().get("User" + count).setManager(input);
				if (count == 6) {
					System.out.println("end");
				}
			} else {
				count++;
				if (r.getNumOfUsers() < 0) {
					r.setNumOfUsers(Integer.parseInt(input));
				} else {
					User user = new User(); //user CEO
					user.setPermissions(input);
					if (count == 0) {
						r.getData().put("CEO", user);
					} else {
						r.getData().put("User" + count, user);
					}
				}

				if (r.getData().size() - 1 == r.getNumOfUsers()) {
					count = 0;
				}
			}
		}

	}
}
