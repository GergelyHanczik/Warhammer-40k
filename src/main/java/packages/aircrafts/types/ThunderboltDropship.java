package main.java.packages.aircrafts.types;


import main.java.packages.aircrafts.types.base.Aircraft;

/**
 * Thunderbolt Dropship
 */
public class ThunderboltDropship extends Aircraft {
    public ThunderboltDropship() {
        super();
        this.vehicleName = "Thunderbolt Dropship";
        this.type = "Transport";
        this.forgeWorldOfOrigin = null;
        this.patterns = null;
        this.crew = null;
        this.powerplant = null;
        this.weight = -1;
        this.length = -1;
        this.wingspan = -1;
        this.height = -1;
        this.transportCapacity = "4 Land Raider";
        this.operationalCeiling = null;
        this.maxSpeed = -1;
        this.range = -1;
        this.mainArmament = new String[]{
                "Turreted Plasma Cannon"
        };
        this.mainAmmunition = -1;
        this.secondaryArmament = null;
        this.secondaryAmmunition = -1;
        this.superstructureThickness = -1;
        this.hullThickness = -1;
        this.accessPorts = null;
    }
}
