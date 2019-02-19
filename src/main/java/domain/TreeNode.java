package domain;

import utils.OrderUniqueAwareArrayList;

import java.util.LinkedList;
import java.util.List;

public class TreeNode {

	public User data;
	public TreeNode parent;
	public List<TreeNode> children;

	public boolean isRoot() {
		return parent == null;
	}

	public boolean isLeaf() {
		return children.size() == 0;
	}

	private List<TreeNode> elementsIndex;

	public TreeNode(User data) {
		this.data = data;
		this.children = new LinkedList<>();
		this.elementsIndex = new LinkedList<>();
		this.elementsIndex.add(this);
	}

	public TreeNode addChild(User child) {
		TreeNode childNode = new TreeNode(child);
		childNode.parent = this;
		this.children.add(childNode);
		this.registerChildForSearch(childNode);
		return childNode;
	}

	public int getLevel() {
		if (this.isRoot()) return 0;
		else return parent.getLevel() + 1;
	}

	private void registerChildForSearch(TreeNode node) {
		elementsIndex.add(node);
		if (parent != null) parent.registerChildForSearch(node);
	}

	public TreeNode findTreeNode(User input) {
		for (TreeNode element : this.elementsIndex) {
			User elData = element.data;
			if (elData.getName().equalsIgnoreCase(input.getName())) return element;
		}

		return null;
	}

	public TreeNode findParentNode(User input) {
		for (TreeNode element : this.elementsIndex) {
			User elData = element.data;
			if (elData.getName().equalsIgnoreCase(input.getManagedBy())) return element;
		}

		return null;
	}

	public OrderUniqueAwareArrayList deptFirst(TreeNode node) {
		OrderUniqueAwareArrayList result = new OrderUniqueAwareArrayList();
		for (TreeNode element : node.children) {
			if (element.isLeaf()) {
				result.add(element.data.getPermissions());
			} else {
				result.add(deptFirst(element).data);
			}
		}
		result.add(node.data.getPermissions());
		return result;
	}
}
