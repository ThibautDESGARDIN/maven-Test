package fr.formation.inti.exceptions;

public class Point {
	
	private int x,y;
	
	public Point(int x,int y) throws ErrConstr {
		if(x < 0 || y < 0) throw new ErrConstr(x,y);
		this.x = x;
		this.y = y;
	}
	public void affiche() {
		System.out.println(x+","+y);
	}
	public void deplace(int dx,int dy) throws ErrDep {
		if((x+dx) < 0 || (y+dy) < 0 ) throw new ErrDep("Erreur de deplacement:"+dx+","+dy );
			
		x+=dx;
		y+=dy;
	}
//	
	
}
