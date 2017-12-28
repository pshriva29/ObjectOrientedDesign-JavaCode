package myclasses;

public abstract class Building {

protected int squareFootage;

public abstract void calculateCost();

protected int getSquareFootage() {
	return squareFootage;
}
protected void setSquareFootage(int squareFootage) {
	this.squareFootage = squareFootage;
}

public Building() {
	super();
	
}


}
