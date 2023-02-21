package it.unibo.AstroParty.GeneralInterfaces;

public interface Map {
	boolean IsOccupied(Position pos);
	Entity GetEntity(Position pos);
}
