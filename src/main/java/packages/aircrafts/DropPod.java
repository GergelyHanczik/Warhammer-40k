package main.java.packages.aircrafts;


import main.java.packages.aircrafts.base.Aircraft;

/**
 * <h1>Drop Pod</h1>
 */
public class DropPod extends Aircraft {
    public DropPod() {
        super();
        this.vehicleName = "Drop Pod";
        this.type = "Drop Pod";
        this.forgeWorldOfOrigin = null;
        this.patterns = null;
        this.crew = null;
        this.powerplant = null;
        this.weight = -1;
        this.length = -1;
        this.wingspan = -1;
        this.height = -1;
        this.transportCapacity = "12 Space Marine / 1 Dreadnought / 1 Thunderfire Cannon / Supplies";
        this.operationalCeiling = null;
        this.maxSpeed = -1;
        this.range = -1;
        this.mainArmament = new String[]{
                "Array of Stormbolters / Deathwind Missile Launchers"
        };
        this.mainAmmunition = -1;
        this.secondaryArmament = null;
        this.secondaryAmmunition = -1;
        this.superstructureThickness = -1;
        this.hullThickness = -1;
        this.accessPorts = null;
    }
}
