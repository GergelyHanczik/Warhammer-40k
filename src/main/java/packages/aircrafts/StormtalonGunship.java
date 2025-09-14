package main.java.packages.aircrafts;


import main.java.packages.aircrafts.base.Aircraft;

/**
 * <h1>Stormtalon Light Gunship & Interceptor Aircraft</h1>
 * <a href="https://wh40k.lexicanum.com/wiki/Stormtalon_Gunship">Lexicanum</a>
 */
public class StormtalonGunship extends Aircraft {
    public StormtalonGunship() {
        super();
        this.vehicleName = "Stormtalon Gunship";
        this.type = "(Space Marine) Light Gunship & Interceptor Aircraft";
        this.forgeWorldOfOrigin = null;
        this.patterns = null;
        this.crew = new String[]{
                "Pilot (Space Marine)"
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
        this.mainArmament = new String[]{
                "Set of Nose-mounted Twin-linked Assault Cannons",
                "Hull-mounted Twin-linked Heavy Bolter / " +
                        "Hull-mounted Twin-linked Lascannon / " +
                        "Hull-mounted Typhoon Missile Launcher / " +
                        "Hull-mounted Skyhammer Missile Launcher"
        };
        this.mainAmmunition = -1;
        this.secondaryArmament = null;
        this.secondaryAmmunition = -1;
        this.superstructureThickness = -1;
        this.hullThickness = -1;
        this.accessPorts = null;
    }
}
