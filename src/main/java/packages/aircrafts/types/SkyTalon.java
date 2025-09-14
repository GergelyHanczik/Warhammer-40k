package main.java.packages.aircrafts.types;


import main.java.packages.aircrafts.base.Aircraft;

/**
 * <h1>Sky Talon Airborne Assault Carrier</h1>
 * <a href="https://wh40k.lexicanum.com/wiki/Valkyrie#Sky_Talon">Lexicanum</a>
 */
public class SkyTalon extends Aircraft {
    public SkyTalon() {
        super();
        this.vehicleName = "Valkyrie Sky Talon";
        this.type = "Airborne Assault Carrier";
        this.forgeWorldOfOrigin = null;
        this.patterns = null;
        this.crew = new String[]{
                "Pilot"
        };
        this.powerplant = new String[]{
                "F75-MV Afterburning Vector-Turbojet",
                "F75-MV Afterburning Vector-Turbojet"
        };
        this.weight = -1;
        this.length = 18.5F;
        this.wingspan = 16.9F;
        this.height = -1;
        this.transportCapacity = "1 light or few Smaller Vehicles";
        this.operationalCeiling = null;
        this.maxSpeed = -1;
        this.range = -1;
        this.mainArmament = new String[]{
                "Nose-mounted Heavy Bolter Turret"
        };
        this.mainAmmunition = -1;
        this.secondaryArmament = new String[]{
                "Searchlight",
                "Magna-Grapples",
                "Rocket Pod / Hellstrike Missile",
                "Rocket Pod / Hellstrike Missile"
        };
        this.secondaryAmmunition = -1;
        this.superstructureThickness = -1;
        this.hullThickness = -1;
        this.accessPorts = new String[]{"1 Cockpit"};
    }
}
