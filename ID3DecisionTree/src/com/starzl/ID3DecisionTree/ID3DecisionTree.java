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
		
		String[] inputData = com.starzl.ID3DecisionTree.DataMatrix.dataIntake(inputFile);
		
		com.starzl.ID3DecisionTree.DataMatrix.InitializeMatrix(inputData);
		
		com.starzl.ID3DecisionTree.DataMatrix.getMatrix();
		
	}

}
