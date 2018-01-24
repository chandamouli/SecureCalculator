public class Addition implements ICalculateOperation {
	public int getResult(int[] Operands) {
		int result;
		result = Operands[0] + Operands[1];
		return result;
	}

	@Override
	public void printOutput(int[] Operands) {
		System.out.println("Sum is " + this.getResult(Operands));
	}
}
