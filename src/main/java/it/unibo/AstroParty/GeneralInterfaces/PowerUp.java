package it.unibo.AstroParty.GeneralInterfaces;

public interface PowerUp extends Entity {
	boolean Create();
	boolean Use();
	boolean PickUP(SpaseShip owner);
}
