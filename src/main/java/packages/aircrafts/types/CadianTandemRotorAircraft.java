package main.java.packages.aircrafts.types;


import main.java.packages.aircrafts.types.base.Aircraft;

/**
 * Cadian Tandem Rotor Aircraft
 */
public class CadianTandemRotorAircraft extends Aircraft {
    public CadianTandemRotorAircraft() {
        super();
        this.vehicleName = "Cadian Tandem-Rotor Aircraft";
        this.type = "General Purpose Cargo Helicopter - Small";
        this.forgeWorldOfOrigin = null;
        this.patterns = null;
        this.crew = new String[]{
                "Pilot",
                "Co-Pilot"
        };
        this.powerplant = null;
        this.weight = -1;
        this.length = -1;
        this.wingspan = -1;
        this.height = -1;
        this.transportCapacity = null;
        this.operationalCeiling = null;
        this.maxSpeed = -1;
        this.range = -1;
        this.mainArmament = new String[]{"Storm Bolter"};
        this.mainAmmunition = -1;
        this.secondaryArmament = new String[]{"UNKNOWN number of Missile Launchers"};
        this.secondaryAmmunition = -1;
        this.superstructureThickness = -1;
        this.hullThickness = -1;
        this.accessPorts = new String[]{"2 Side Doors, 1 Rear Ramp"};
    }
}
