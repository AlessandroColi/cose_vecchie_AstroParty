package it.unibo.AstroParty.Movement;

import it.unibo.AstroParty.GeneralInterfaces.Position;

public class PositionImpl implements Position {
	
	final static double epsilon = 0.000001;
	private double x,y;

	public PositionImpl(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public Position Move(Velocity v) {										//ad ogni update aggiungo alla posizione attuale il punto di arrivo
		return new PositionImpl( this.x+v.GetX() , this.y+v.GetX() );
	}

	@Override
	public double GetX() {
		return this.x;
	}

	@Override
	public double GetY() {
		return this.y;
	}
	
	public boolean Equals(Position pos) {					
		return Math.abs( pos.GetX() - this.GetX() ) < epsilon 
				&& Math.abs( pos.GetY() - this.GetY() ) < epsilon;
	}
	
}