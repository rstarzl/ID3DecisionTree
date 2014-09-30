package com.starzl.ID3DecisionTree;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataMatrix {

	private static Double[][] matrix;
	private static Double[] labels;
	private static Integer dim1;
	private static Integer dim2;
	
	public static String[] dataIntake(String filename) {
		setDim1(0);
		setDim2(0);
		
        FileReader fileReader = null;
		try {
			fileReader = new FileReader(filename);
		} catch (IOException e) {
			e.printStackTrace();
		}
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        List<String> lines = new ArrayList<String>();
        String line = null;
        try { //Calculate the first dimension of the data matrix
			while ((line = bufferedReader.readLine()) != null) {
			    lines.add(line);
			    setDim1(getDim1()+1);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

        //Calculate the second dimension of the data matrix
		setDim2(lines.get(0).split(",").length);
        
        try {
			bufferedReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
        
        return lines.toArray(new String[lines.size()]);
    }
	
	public static void InitializeMatrix(String[] inputData) {
		//Presume last column of matrix is the label, so we capture it in its own array
		matrix = new Double[getDim1()][getDim2()-1];
		labels = new Double[getDim1()];
		
		for(int d1 = 0; d1 < inputData.length; d1++) {
			String[] tokens = inputData[d1].split(",");
			for(int d2 = 0; d2 < tokens.length-1; d2++) {
				matrix[d1][d2] = Double.parseDouble(tokens[d2]);
			}
			labels[d1] = Double.parseDouble(tokens[tokens.length-1]);
		}
	}
	
	

	public static int getDim1() {
		return dim1;
	}

	public static void setDim1(Integer dim1) {
		DataMatrix.dim1 = dim1;
	}

	public static int getDim2() {
		return dim2;
	}

	public static void setDim2(Integer dim2) {
		DataMatrix.dim2 = dim2;
	}
	
	public static Double[][] getMatrix() {
		return matrix;
	}
	
	public static Double getData(Integer d1, Integer d2) {
		return matrix[d1][d2];
	}
	
	public static void setDataInstance(Integer d1, Integer d2, Double newValue) {
		matrix[d1][d2] = newValue;
	}
	
	public static ArrayList<Integer> getMatrixIndices() {
		ArrayList<Integer> indices = new ArrayList<Integer>();
		for(int i=0;i<getDim1();i++)
			indices.add(i);
		return indices;
	}
}
