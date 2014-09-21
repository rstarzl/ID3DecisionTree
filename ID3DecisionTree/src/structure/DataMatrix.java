package structure;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
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
		
        FileReader fileReader;
		try {
			fileReader = new FileReader(filename);
	        BufferedReader bufferedReader = new BufferedReader(fileReader);
	        List<String> lines = new ArrayList<String>();
	        String line = null;
	        while ((line = bufferedReader.readLine()) != null) {
	            lines.add(line);
	            setDim1(getDim1()+1);
	        }

			setDim2(lines.get(0).split(",").length);

	        
	        bufferedReader.close();
	        return lines.toArray(new String[lines.size()]);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		

    }
	
	public static void InitializeMatrix() {
		matrix = new double[getDim1()][getDim2()];
	}
	
	public void PopulateMatrix(String[] inputData) {
		
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
