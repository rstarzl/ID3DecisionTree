package com.starzl.ID3DecisionTree;

public class Node {

	private Double threshold;
	private Integer child0;
	private Integer child1;
	private Integer parent;
	
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
	
}
