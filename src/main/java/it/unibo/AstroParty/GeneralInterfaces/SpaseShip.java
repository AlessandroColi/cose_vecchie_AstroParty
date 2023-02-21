package it.unibo.AstroParty.GeneralInterfaces;

public interface SpaseShip extends Entity {
	Projectile Shoot();
	boolean Equip(PowerUp up);
}
