package fr.formation.inti.exceptions;

public class ErrConst extends Exception {
	
	private int errSaisie;
	public ErrConst() {
		System.out.println("Attention, une valeur saisie  est incorrecte");
	}
	
	public ErrConst(int errSaisie) {
		this.errSaisie = errSaisie;
	}
	
	
	public int getErrSaisie() {
		return errSaisie;
	}

	@Override
	public String getMessage() {
		return "Attention, la valeur saisie est incorrecte";
	}
}
