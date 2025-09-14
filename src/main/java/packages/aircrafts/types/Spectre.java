package main.java.packages.aircrafts.types;


import main.java.packages.aircrafts.base.Aircraft;

/**
 * <h1>Spectre-class Valkyrie</h1>
 * <a href="https://wh40k.lexicanum.com/wiki/Valkyrie#Spectre">Lexicanum</a>
 */
public class Spectre extends Aircraft {
    public Spectre() {
        super();
        this.vehicleName = "Spectre-class Valkyrie";
        this.type = "Armored Assault Carrier";
        this.forgeWorldOfOrigin = null;
        this.patterns = null;
        this.crew = null;
        this.powerplant = new String[]{
                "F75-MV Afterburning Vector-Turbojet",
                "F75-MV Afterburning Vector-Turbojet",
                "F75-MV Afterburning Vector-Turbojet",
                "F75-MV Afterburning Vector-Turbojet"
        };
        this.weight = -1;
        this.length = -1;
        this.wingspan = -1;
        this.height = -1;
        this.transportCapacity = "Multiple Vehicles";
        this.operationalCeiling = null;
        this.maxSpeed = -1;
        this.range = -1;
        this.mainArmament = new String[]{
                "Nose-mounted Autocannon",
                "Door-mounted Heavy Bolter",
                "Door-mounted Heavy Bolter",
                "Door-mounted Heavy Bolter",
                "Door-mounted Heavy Bolter"
        };
        this.mainAmmunition = -1;
        this.secondaryArmament = new String[]{
                "Auspex",
                "Missile-Lock Warning System",
                "Flare Countermeasures",
                "Hardpoint",
                "Hardpoint",
                "Hardpoint",
                "Hardpoint"
        };
        this.secondaryAmmunition = -1;
        this.superstructureThickness = -1;
        this.hullThickness = -1;
        this.accessPorts = null;
    }
}
