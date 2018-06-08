
public class Square {
	
	// variabele // 

	private boolean isBomb;
	private boolean isTested;
	private boolean isMarked;
	private int nrOfBombsAround;


	public Square() {
		
		// initialized //
		
		isBomb = false;
		isTested = false;
		isMarked = false;
		nrOfBombsAround = 0;
	}

	public boolean isBomb() {
		return isBomb;
	}

	public void setBomb(boolean isBomb) {
		this.isBomb = isBomb;
	}

	public boolean isTested() {
		return isTested;
	}

	public void setTested(boolean isTested) {
		this.isTested = isTested;
	}
	
	public boolean isMarked() {
		return isMarked;
	}

	public void setMarked(boolean isMarked) {
		this.isMarked = isMarked;
	}

	public int getNrOfBombsAround() {
		return nrOfBombsAround;
	}

	public void setNrOfBombsAround(int nrOfBombsAround) {
		this.nrOfBombsAround = nrOfBombsAround;
	}
	
	public void print() {
		
	}
	
	
}
