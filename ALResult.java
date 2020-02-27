package marks;

public interface ALResult {
	
	public void selectStream();
	public void maksForSubject( Subject[] subject );
	public double calculateTotal();
	public double calculateAverage();
	public double calculateStandardMedian();
	public void printResult();
}
