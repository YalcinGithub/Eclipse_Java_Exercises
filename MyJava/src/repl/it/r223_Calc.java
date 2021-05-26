package repl.it;

public class r223_Calc {

	private int x, y, result;

	public void plus() {
		result = x + y;
	}

	public void minus() {
		result = x -y;
	}

	public int getResult() {
		return result;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
}
