package com.starzl.ID3DecisionTree;

import java.util.ArrayList;


public class Information {

	public static Double GetInformationGain() {
		throw new UnsupportedOperationException("Method not implemented");
			
	}
	
	public static Integer MaxInformationGainFeature(ArrayList<Integer> dataIndices) {
		Double min = null;
		Double max = null;		
		Double bestIG = null;
		Integer bestFeature = null;
		
		//Iterate over each attribute
		for(int i=0;i<DataMatrix.getDim2();i++) {  
			//Find the min and max of the attribute
			for(Integer di : dataIndices) {
				if(min == null)
					min = DataMatrix.getData(di, i);
				if(max == null)
					max = DataMatrix.getData(di, i);
				else if(DataMatrix.getData(di, i)<min)
					min = DataMatrix.getData(di, i);
				else if(DataMatrix.getData(di, i)>max)
					max = DataMatrix.getData(di, i);
			}
			
			//Conduct a binary search for a good splitting threshold
			
			
			
			//Calculate the information gain
			
			
			//Check against and update the best feature
			
		}
		
		
		return null;
	}

	public static Integer[] EvaluateLeaf(Leaf l) {
		
		Integer featureToSplit = MaxInformationGainFeature(l.getInstanceIndices());
		
		//Returns an array with the node IDs of the leaves this leaf creates if it becomes a node. The array contains the same NodeID as this leaf if it remains a leaf.
		throw new UnsupportedOperationException("Method not implemented");
		
	}
	
}
