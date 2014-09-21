package structure;

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
		
		structure.DataMatrix.dataIntake(inputFile);
		
		structure.DataMatrix.InitializeMatrix();
		
	}

	
}
