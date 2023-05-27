package gl.g4b1.transactions.main;

import gl.g4b1.transactions.dataoftransactions.Transactions;
import gl.g4b1.transactions.node.Node;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Transactions transactions = new Transactions();
		transactions.root = new Node(50);
		transactions.root.left = new Node(30);
		transactions.root.right = new Node(60);
		transactions.root.left.left = new Node(10);
		transactions.root.right.left = new Node(55);
		transactions.root.left.right = new Node(35);

		transactions.convertBSTToRightSkew(transactions.root);
		transactions.printRightSkew(transactions.newRoot);
	}

}
