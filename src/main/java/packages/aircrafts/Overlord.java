package main.java.packages.aircrafts;


import main.java.packages.aircrafts.base.Aircraft;

/**
 * <h1>Overlord Primaris Space Marine Aircraft</h1>
 * <a href="https://wh40k.lexicanum.com/wiki/Overlord_Gunship">Lexicanum</a>
 */
public class Overlord extends Aircraft {
    public Overlord() {
        super();
        this.vehicleName = "Overlord";
        this.type = "Primaris Space Marine Aircraft";
        this.forgeWorldOfOrigin = null;
        this.patterns = null;
        this.crew = null;
        this.powerplant = null;
        this.weight = 250;
        this.length = -1;
        this.wingspan = -1;
        this.height = -1;
        this.transportCapacity = "80 Primaris Space Marines / Vehicles (2 Repulsor)";
        this.operationalCeiling = null;
        this.maxSpeed = -1;
        this.range = -1;
        this.mainArmament = null;
        this.mainAmmunition = -1;
        this.secondaryArmament = null;
        this.secondaryAmmunition = -1;
        this.superstructureThickness = -1;
        this.hullThickness = -1;
        this.accessPorts = new String[]{"2 Rear Ramp"};
    }
}
