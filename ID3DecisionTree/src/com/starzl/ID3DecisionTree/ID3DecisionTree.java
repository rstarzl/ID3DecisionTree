package com.starzl.ID3DecisionTree;

public class ID3DecisionTree {

	public static void main(String[] args) {
		
		if(args.length == 0) {
			System.out.println("Usage: program [inputFile]");
			try {
				throw new Exception("Insufficient arguments");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		String inputFile = args[0];
		
		
		//Load the data into an array of strings
		String[] inputData = com.starzl.ID3DecisionTree.DataMatrix.dataIntake(inputFile);

		//Populate the data matrix with the input data
		com.starzl.ID3DecisionTree.DataMatrix.InitializeMatrix(inputData);
		
		
		//Create a new decision tree
		Tree dt = new Tree();
		
		//Create the root node
		Node root = new Node(dt);
		
		dt.addNode(root.getNodeID(),root);
		
		System.out.println(dt.getNumberOfNodes());
		
		
	}

}
