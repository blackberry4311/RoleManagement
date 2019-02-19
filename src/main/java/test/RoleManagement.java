package test;

import domain.TreeNode;
import domain.User;
import utils.OrderUniqueAwareArrayList;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class RoleManagement {
	public LinkedHashMap<String, User> data;
	public Integer numOfUsers;

	public RoleManagement() {
		data = new LinkedHashMap<>();
		numOfUsers = -1000;
	}

	public List<List<String>> processOutput() {
		List<List<String>> result = new ArrayList<>();
		//push into tree for easy to iterator in the future
		TreeNode root = new TreeNode(data.get("CEO"));
		for (int i = 1; i < data.size(); i++) {
			User current = data.get("User" + i);
			TreeNode parent = root.findParentNode(current);
			if (parent != null) parent.addChild(current);
		}

		for (int i = 0; i < data.size(); i++) {
			TreeNode element = root.findTreeNode(data.get(i == 0 ? "CEO" : "User" + i));
			if (element != null) {
				result.add(root.deptFirst(element).data);
			}
		}
		return result;
	}

	public void prettyPrint(List<List<String>> input) {
		for (List<String> list : input) {
			for (int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i));
				if (i + 1 != list.size()) System.out.print(", ");
			}
			System.out.println();
		}
	}

	public static void main(String... args) {
		RoleManagement r = new RoleManagement();
		Scanner sc = new Scanner(System.in);
		int countUser = 0;// for position of user
		int countManager = 0;
		boolean endInput = false;
		while (true) {
			String input = sc.nextLine();

			if ((input).equalsIgnoreCase("output")) {
				r.prettyPrint(r.processOutput());
				break;
			}

			if (endInput) {
				System.out.println("type `output` to print result");
				continue;
			}

			if (countUser - 1 == r.numOfUsers) { //input manager
				countManager++;
				r.data.get("User" + countManager).setManagedBy(input.equalsIgnoreCase("CEO") ? input : "User" + input);
				if (countManager == r.numOfUsers) {
					endInput = true;
					System.out.println("end input");
				}
			} else {
				if (r.numOfUsers < 0) {
					r.numOfUsers = Integer.parseInt(input);
				} else {
					User user = new User();
					user.setPermissions(input);
					String name = countUser == 0 ? "CEO" : "User" + countUser;
					user.setName(name);
					r.data.put(name, user);
					countUser++;
				}
			}
		}

	}
}
