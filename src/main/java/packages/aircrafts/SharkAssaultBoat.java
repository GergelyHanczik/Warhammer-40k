package main.java.packages.aircrafts;


import main.java.packages.aircrafts.base.Aircraft;

/**
 * <h1>Shark Assault Boat</h1>
 * <a href="https://wh40k.lexicanum.com/wiki/Shark_Assault_Boat">Lexicanum</a>
 */
public class SharkAssaultBoat extends Aircraft {
    public SharkAssaultBoat() {
        super();
        this.vehicleName = "Shark Assault Boat";
        this.type = "Assault Boat";
        this.forgeWorldOfOrigin = null;
        this.patterns = null;
        this.crew = null;
        this.powerplant = null;
        this.weight = -1;
        this.length = 55;
        this.wingspan = -1;
        this.height = -1;
        this.transportCapacity = null;
        this.operationalCeiling = "N/A";
        this.maxSpeed = -1;
        this.range = -1;
        this.mainArmament = new String[]{
                "Boarding Modifications (Magnetic Clamps, Melta-Charges, Las-Breaches)"
        };
        this.mainAmmunition = 1;
        this.secondaryArmament = new String[]{};
        this.secondaryAmmunition = 0;
        this.superstructureThickness = -1;
        this.hullThickness = -1;
        this.accessPorts = null;
    }
}
