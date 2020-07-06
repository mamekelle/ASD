package Lab11_1;

import java.util.HashMap;

public class DisplayNodeVisitor implements NodeVisitor {
	private HashMap<String, Integer> rightHashMap;
	private HashMap<String, Integer> leftHashMap;

	private Composite currentNode;

	public DisplayNodeVisitor() {
		rightHashMap = new HashMap<>();
		leftHashMap = new HashMap<>();
	}

	public HashMap<String, Integer> getRightHashMap() {
		return rightHashMap;
	}

	public HashMap<String, Integer> getLeftHashMap() {
		return leftHashMap;
	}

	// Visiting a Node
	@Override
	public void visit(Node node) {

		if (node.getSide() == Side.RIGHT) {
			rightHashMap.put(currentNode.getName(), rightHashMap.get(currentNode.getName()) + 1);
		}
		if (node.getSide() == Side.LEFT) {
			leftHashMap.put(currentNode.getName(), leftHashMap.get(currentNode.getName()) + 1);
		}
		for (Composite childNode : node.getChilds()) {
			childNode.accept(this);
		}

	}

	// For visiting a Root
	@Override
	public void visit(Root root) {
		for (Composite node : root.getChilds()) {
			currentNode = node;
			if (node.getSide() == Side.RIGHT) {
				rightHashMap.put(node.getName(), 1);
				for (Composite childNode : node.getChilds()) {
					childNode.accept(this);
				}

			} else if (node.getSide() == Side.LEFT) {
				leftHashMap.put(node.getName(), 1);
				for (Composite childNode : node.getChilds()) {
					childNode.accept(this);
				}
			}
		}
	}

}
