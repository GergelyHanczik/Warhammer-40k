package main.java.packages.aircrafts.types;


import main.java.packages.aircrafts.base.Aircraft;

/**
 * <h1>Stormraven Gunship</h1>
 * <a href="https://wh40k.lexicanum.com/wiki/Stormraven_Gunship">Lexicanum</a>
 */
public class StormravenGunship extends Aircraft {
    public StormravenGunship() {
        super();
        this.vehicleName = "Stormraven Gunship";
        this.type = "(Space Marine) Gunship";
        this.forgeWorldOfOrigin = null;
        this.patterns = null;
        this.crew = null;
        this.powerplant = null;
        this.weight = -1;
        this.length = -1;
        this.wingspan = -1;
        this.height = -1;
        this.transportCapacity = "12 Space Marines / " +
                "Half-dozen Jump Pack-equipped Assault Marines / " +
                "1 Dreadnought";
        this.operationalCeiling = null;
        this.maxSpeed = -1;
        this.range = -1;
        this.mainArmament = new String[]{
                "Twin-linked Heavy Bolter / Typhoon Missile Launcher / Twin-linked Multi-Melta",
                "Twin-linked Assault Cannon / Twin-linked Plasma Cannon / Lascannons",
                "(OPTIONAL) Pair of Hurricane Bolters on side Sponsons"
        };
        this.mainAmmunition = -1;
        this.secondaryArmament = new String[]{
                "Bloodstrike Missile / Stormstrike Missile",
                "Bloodstrike Missile / Stormstrike Missile",
                "Bloodstrike Missile / Stormstrike Missile",
                "Bloodstrike Missile / Stormstrike Missile"
        };
        this.secondaryAmmunition = -1;
        this.superstructureThickness = -1;
        this.hullThickness = -1;
        this.accessPorts = null;
    }
}
