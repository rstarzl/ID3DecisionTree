package com.starzl.ID3DecisionTree;

public class Node {

	private Integer splitFeature;
	private Double threshold;
	private Integer child0;
	private Integer child1;
	private Integer parent;
	private Integer nodeID;
	
	public Node(Tree tree) {
		setNodeID(tree.getNewNodeID());
	}
	public Node(Integer nodeID) {
		setNodeID(nodeID);
	}
	
	public Double getThreshold() {
		return threshold;
	}
	public void setThreshold(Double threshold) {
		this.threshold = threshold;
	}
	public Integer getChild0() {
		return child0;
	}
	public void setChild0(Integer child0) {
		this.child0 = child0;
	}
	public Integer getChild1() {
		return child1;
	}
	public void setChild1(Integer child1) {
		this.child1 = child1;
	}
	public Integer getParent() {
		return parent;
	}
	public void setParent(Integer parent) {
		this.parent = parent;
	}
	public Integer getNodeID() {
		return nodeID;
	}
	public void setNodeID(Integer nodeID) {
		this.nodeID = nodeID;
	}
	public Integer getSplitFeature() {
		return splitFeature;
	}
	public void setSplitFeature(Integer splitFeature) {
		this.splitFeature = splitFeature;
	}
	
}
