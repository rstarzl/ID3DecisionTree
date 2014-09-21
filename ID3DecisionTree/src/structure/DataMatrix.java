package structure;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataMatrix {

	private static double[][] matrix;
	private static int dim1;
	private static int dim2;
	
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
		matrix = new double[getDim1()][getDim2()];
		
		for(int d1 = 0; d1 < inputData.length; d1++) {
			String[] tokens = inputData[d1].split(",");
			for(int d2 = 0; d2 < tokens.length; d2++) {
				matrix[d1][d2] = Double.parseDouble(tokens[d2]);
			}
		}
	}
	
	

	public static int getDim1() {
		return dim1;
	}

	public static void setDim1(int dim1) {
		DataMatrix.dim1 = dim1;
	}

	public static int getDim2() {
		return dim2;
	}

	public static void setDim2(int dim2) {
		DataMatrix.dim2 = dim2;
	}
	
}
