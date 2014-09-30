package com.starzl.ID3DecisionTree;
import java.util.ArrayList;

public class Leaf {

	private ArrayList<Integer> instanceIndices = new ArrayList<Integer>();
	private Integer parent;
	private Integer leafClass;
	private Boolean growing;
	private Integer nodeID;

	
	public Leaf(Tree tree,Integer parent,ArrayList<Integer> instanceIndices) {
		setNodeID(tree.getNewNodeID());
		this.parent = parent;
		this.instanceIndices = instanceIndices;
		setGrowing(true);
	}
	
	
	public ArrayList<Integer> getInstanceIndices() {
		return instanceIndices;
	}

	public void setInstanceIndices(ArrayList<Integer> instanceIndices) {
		this.instanceIndices = instanceIndices;
	}
	
	public void addToInstanceIndices(Integer instanceID) {
		this.instanceIndices.add(instanceID);
	}
	
	public void removeFromInstanceIndices(Integer instanceID) {
		this.instanceIndices.remove(instanceID);
	}

	public Integer getParent() {
		return parent;
	}

	public void setParent(Integer parent) {
		this.parent = parent;
	}

	public Integer getLeafClass() {
		return leafClass;
	}

	public void setLeafClass(Integer leafClass) {
		this.leafClass = leafClass;
	}

	public Boolean getGrowing() {
		return growing;
	}

	public void setGrowing(Boolean growing) {
		this.growing = growing;
	}

	public Integer getNodeID() {
		return nodeID;
	}

	public void setNodeID(Integer nodeID) {
		this.nodeID = nodeID;
	}
	
}
