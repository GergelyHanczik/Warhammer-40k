package main.java.packages.aircrafts.types;


import main.java.packages.aircrafts.base.Aircraft;

/**
 * <h1>Space Marine Landing Craft (Orbital-Assault Vehicle)</h1>
 * <a href="https://wh40k.lexicanum.com/wiki/Space_Marine_Landing_Craft">Lexicanum</a>
 */
public class SpaceMarineLandingCraft extends Aircraft {
    public SpaceMarineLandingCraft() {
        super();
        this.vehicleName = "Space Marine Landing Craft";
        this.type = "Orbital-Assault Vehicle - Large";
        this.forgeWorldOfOrigin = null;
        this.patterns = null;
        this.crew = null;
        this.powerplant = null;
        this.weight = -1;
        this.length = -1;
        this.wingspan = -1;
        this.height = -1;
        this.transportCapacity = "Space Marine Tanks";
        this.operationalCeiling = null;
        this.maxSpeed = -1;
        this.range = -1;
        this.mainArmament = null;
        this.mainAmmunition = -1;
        this.secondaryArmament = null;
        this.secondaryAmmunition = -1;
        this.superstructureThickness = -1;
        this.hullThickness = -1;
        this.accessPorts = null;
    }
}
