package fr.formation.inti.exceptions;

public class ErrConstr extends Exception {
	public int x,y;
	public ErrConstr(int x, int y) {
		this.x = x;
		this.y = y;
	}

}
