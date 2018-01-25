package Operations;
import java.lang.reflect.Method;

public class SecuredCalculator {
	private ICalculateOperation operation;
	private int[] operands;
	private int result;

	public ICalculateOperation getOperation() {
		return operation;
	}

	public void setOperation(ICalculateOperation operation) {
		this.operation = operation;
	}

	public int[] getOperands() {
		return operands;
	}

	public void setOperands(int[] operands) {
		this.operands = operands;
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		if(args.length==0)
		{
			throw new Exception("Operator and Operand parameters are required"); 
		}
		else
		{
			String argu1 = args[0];// java.lang.;IllegalArgumentException
			//String argu2 = args[1];
			SecuredCalculator test = new SecuredCalculator();
			// Method.class.getMethod("Addition").
			//int opCode = ISecureCalculatorConstants.OpTypes.SUBTRACT.ordinal();
			ICalculateOperation operation;
			switch (ISecureCalculatorConstants.OpTypes.valueOf(argu1)) {
			case ADD:
				System.out.println("Add");
				operation = new Addition();
				break;
			case SUBTRACT:
				operation = new Subtraction();
				System.out.println("Sub");
				break;
			default:
				throw new Exception("Unknown op code string");
			}
			test.setOperation(operation);
			test.setOperands(new int[] {});
			test.calculate();
			test.printResult();
		} 
		
		// Test.OperationType = new Subtraction();
		// int[] Operand = { 4, 1 };
		//System.out.println(operation.getResult(Operand));

	}

	private void printResult() {
		this.operation.printOutput(this.operands);
	}

	private void calculate() {
		this.result = this.operation.getResult(this.operands);
	}

}
