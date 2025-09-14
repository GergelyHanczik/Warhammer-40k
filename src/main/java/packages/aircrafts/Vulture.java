package main.java.packages.aircrafts;


import main.java.packages.aircrafts.base.Aircraft;

/**
 * <h1>Vulture Gunship</h1>
 */
public class Vulture extends Aircraft {
    public Vulture() {
        super();
        this.vehicleName = "Vulture";
        this.type = "Gunship";
        this.forgeWorldOfOrigin = null;
        this.patterns = null;
        this.crew = null;
        this.powerplant = null;
        this.weight = -1;
        this.length = 18.5F;
        this.wingspan = 16.9F;
        this.height = 4.8F;
        this.transportCapacity = "N/A";
        this.operationalCeiling = null;
        this.maxSpeed = -1;
        this.range = -1;
        this.mainArmament = null;
        this.mainAmmunition = -1;
        this.secondaryArmament = null;
        this.secondaryAmmunition = -1;
        this.superstructureThickness = 75;
        this.hullThickness = 75;
        this.accessPorts = new String[]{"2 Cockpit"};
    }
}
