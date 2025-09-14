package main.java.packages.aircrafts;


import main.java.packages.aircrafts.base.Aircraft;

/**
 * <h1>Stormeagle Orbital Dropship</h1>
 */
public class StormeagleGunship extends Aircraft {
    public StormeagleGunship() {
        super();
        this.vehicleName = "Stormeagle Gunship";
        this.type = "Orbital Dropship";
        this.forgeWorldOfOrigin = "Exact Provenance is Unknown";
        this.patterns = null;
        this.crew = new String[]{
                "Pilot"
        };
        this.powerplant = new String[]{
                "Combination Rocket / Afterburning Turbofan",
                "Combination Rocket / Afterburning Turbofan"
        };
        this.weight = 68;
        this.length = 18;
        this.wingspan = 11.8F;
        this.height = 7.2F;
        this.transportCapacity = "20 Space Marines";
        this.operationalCeiling = "N/A";
        this.maxSpeed = 2000;
        this.range = 30000;
        this.mainArmament = new String[]{
                "Vengeance launcher"
        };
        this.mainAmmunition = 48;
        this.secondaryArmament = new String[]{
                "Twin-linked Heavy Bolters"
        };
        this.secondaryAmmunition = 2000;
        this.superstructureThickness = 45;
        this.hullThickness = 55;
        this.accessPorts = null;
    }
}
