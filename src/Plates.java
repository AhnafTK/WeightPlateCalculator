


public class Plates {
	
	protected double inputWeight;
	protected  double barWeight;
	protected double weightWithoutBar;
	protected double eachside;
	protected int fortyfneeded = 0;
	protected int thirtyfneeded = 0;
	protected int twentyfneeded = 0;
	protected int tenneeded = 0;
	protected int fiveneeded = 0;
	protected int twohalfneeded = 0;
	private double weights [] = {45,35,25,10,5,2.5};
	//////////////////////////// 0  1  2  3  4  5
	
	protected void resetVariables() {
		fortyfneeded = 0;
		thirtyfneeded = 0;
		twentyfneeded = 0;
		tenneeded = 0;
		fiveneeded = 0;
		twohalfneeded = 0;
	}
	
	protected void calculateWeight(double barWeight, double inputWeight) {
		
		weightWithoutBar = inputWeight - barWeight;
		eachside = weightWithoutBar / 2;
		
		if (eachside > 0 && (eachside % 1) != 0) {
			eachside = eachside - (weights[5]);
			twohalfneeded++;
		}
		
		
		while (eachside >= weights[0]) {
			eachside = eachside - 45;
			fortyfneeded++;
		}
			
		while (eachside >= (weights[1])){
			eachside = eachside - 35;
			thirtyfneeded++;
		}
		
		while (eachside >= (weights[2])){
			eachside = eachside - 25;
			twentyfneeded++;
		}
			
		while (eachside >= (weights[3])){
			eachside = eachside - 10;
			tenneeded++;
		}
			
		while (eachside >= (weights[4])){
			eachside = eachside - 5;
			fiveneeded++;
		}
		
		
}


}