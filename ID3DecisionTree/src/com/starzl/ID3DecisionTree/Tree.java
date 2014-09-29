package com.starzl.ID3DecisionTree;

import java.util.HashMap;

public class Tree {

	private Integer numberOfNodes;
	private Integer numberOfLeaves;
	private Integer nodeID = 0;
	
	private static HashMap<Integer,Node> Nodes = new HashMap<Integer,Node>();
	private static HashMap<Integer,Leaf> Leaves = new HashMap<Integer,Leaf>();
	
	public Integer getNumberOfNodes() {
		return numberOfNodes;
	}
	public void setNumberOfNodes(Integer numberOfNodes) {
		this.numberOfNodes = numberOfNodes;
	}
	public Integer getNumberOfLeaves() {
		return numberOfLeaves;
	}
	public void setNumberOfLeaves(Integer numberOfLeaves) {
		this.numberOfLeaves = numberOfLeaves;
	}
	
	
	public Integer getCurrentNodeID() {
		return nodeID;
	}
	public Integer getNewNodeID() {
		setNodeID(getCurrentNodeID()+1);
		return nodeID;
	}
	public void setNodeID(Integer nodeID) {
		this.nodeID = nodeID;
	}

	
	public HashMap<Integer,Node> getNodes() {
		return Nodes;
	}
	public void addNode(Integer nID, Node n) {
		Nodes.put(nID,n);
	}
	public void removeNode(Integer nID) {
		Nodes.remove(nID);
	}
	public static HashMap<Integer,Leaf> getLeaves() {
		return Leaves;
	}
	public void addLeaf(Integer nID, Leaf l) {
		Leaves.put(nID,l);
	}
	public void removeLeaf(Integer nID) {
		Leaves.remove(nID);
	}
	
}
