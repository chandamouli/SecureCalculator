
public class Operations {
	// public String opType;
	public ICalculateOperation OperationType;

	public Operations() {
		this.OperationType = OperationType;
	}

	public int getResult(int[] Operands) {

		return OperationType.getResult(Operands);
	}

}