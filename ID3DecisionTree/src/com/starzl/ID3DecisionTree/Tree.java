package com.starzl.ID3DecisionTree;

import java.util.HashMap;

public class Tree {

	private Integer numberOfNodes;
	private Integer numberOfLeaves;
	private Integer nodeID = 0;
	
	private static HashMap<Integer,Node> nodes = new HashMap<Integer,Node>();
	private static HashMap<Integer,Leaf> leaves = new HashMap<Integer,Leaf>();
	
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
		Integer currentNodeID = getCurrentNodeID();
		setNodeID(getCurrentNodeID()+1);
		return currentNodeID;
	}
	public void setNodeID(Integer nodeID) {
		this.nodeID = nodeID;
	}

	
	public HashMap<Integer,Node> getNodes() {
		return nodes;
	}
	public void addNode(Integer nID, Node n) {
		nodes.put(nID,n);
		setNumberOfNodes(nodes.size());
	}
	public void removeNode(Integer nID) {
		nodes.remove(nID);
		setNumberOfNodes(nodes.size());
	}
	public static HashMap<Integer,Leaf> getLeaves() {
		return leaves;
	}
	public void addLeaf(Integer nID, Leaf l) {
		leaves.put(nID,l);
		setNumberOfLeaves(leaves.size());
	}
	public void removeLeaf(Integer nID) {
		leaves.remove(nID);
		setNumberOfLeaves(leaves.size());
	}
	
}
