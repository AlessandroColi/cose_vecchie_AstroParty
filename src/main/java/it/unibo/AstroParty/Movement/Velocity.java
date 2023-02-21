package it.unibo.AstroParty.Movement;

public class Velocity {

	private double x,y,angle;
	
	public Velocity(double x, double y) {
		this.x = x;
		this.y = y;
	}

	double GetX() {
		return this.x;
	}

	double GetY() {
		return this.y;
	}
	
	void Update(double time) {			// aggiorno l'angolo e calcolo di quanto si sposta ad ogni update
		
		this.angle += time;
		
		this.x = Math.cos(angle);
		this.y = Math.sin(angle);
	}

}
