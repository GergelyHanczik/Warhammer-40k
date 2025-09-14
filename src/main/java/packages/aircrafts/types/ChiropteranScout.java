package main.java.packages.aircrafts.types;


import main.java.packages.aircrafts.base.Aircraft;

/**
 * <h1>Chiropteran Scout Aircraft</h1>
 * <a href="https://wh40k.lexicanum.com/wiki/Chiropteran_Scout">Lexicanum</a>
 */
public class ChiropteranScout extends Aircraft {
    public ChiropteranScout() {
        super();
        this.vehicleName = "Chiropteran Scout";
        this.type = "Reconnaissance Aircraft - Small";
        this.forgeWorldOfOrigin = null;
        this.patterns = null;
        this.crew = null;
        this.powerplant = null;
        this.weight = -1;
        this.length = -1;
        this.wingspan = -1;
        this.height = -1;
        this.transportCapacity = "N/A";
        this.operationalCeiling = "N/A";
        this.maxSpeed = 1200;
        this.range = -1;
        this.mainArmament = new String[]{};
        this.mainAmmunition = 0;
        this.secondaryArmament = new String[]{};
        this.secondaryAmmunition = 0;
        this.superstructureThickness = 20;
        this.hullThickness = 20;
        this.accessPorts = null;
    }
}
