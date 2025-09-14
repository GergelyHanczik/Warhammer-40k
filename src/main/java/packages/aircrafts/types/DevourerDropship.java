package main.java.packages.aircrafts.types;


import main.java.packages.aircrafts.base.Aircraft;

/**
 * <h1>Devourer Dropship</h1>
 * <a href="https://wh40k.lexicanum.com/wiki/Devourer_Dropship">Lexicanum</a>
 */
public class DevourerDropship extends Aircraft {
    public DevourerDropship() {
        super();
        this.vehicleName = "Devourer Dropship";
        this.type = "General Purpose Cargo Shuttle - Large";
        this.forgeWorldOfOrigin = null;
        this.patterns = null;
        this.crew = null;
        this.powerplant = null;
        this.weight = -1;
        this.length = -1;
        this.wingspan = -1;
        this.height = -1;
        this.transportCapacity = "5000 Guardsmen / 10000 Expendables, ? Vehicles";
        this.operationalCeiling = "N/A";
        this.maxSpeed = -1;
        this.range = -1;
        this.mainArmament = new String[]{
                "Heavy Lascannon",
                "Heavy Lascannon"
        };
        this.mainAmmunition = -1;
        this.secondaryArmament = new String[]{"Missile Launchers"};
        this.secondaryAmmunition = -1;
        this.superstructureThickness = -1;
        this.hullThickness = -1;
        this.accessPorts = null;
    }
}
