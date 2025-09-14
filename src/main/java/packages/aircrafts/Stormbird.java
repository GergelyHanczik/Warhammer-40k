package main.java.packages.aircrafts;


import main.java.packages.aircrafts.base.Aircraft;

/**
 * <h1>Stormbird Dropship / Assault & Transport Aircraft</h1>
 * <a href="https://wh40k.lexicanum.com/wiki/Stormbird">Lexicanum</a>
 */
public class Stormbird extends Aircraft {
    public Stormbird() {
        super();
        this.vehicleName = "Stormbird";
        this.type = "(Space Marine) Dropship / Assault & Transport Aircraft";
        this.forgeWorldOfOrigin = null;
        this.patterns = null;
        this.crew = new String[]{
                "Pilot (Space Marine)",
                "Co-pilot (Space Marine)",
                "Hard-wired Servitor",
                "Hard-wired Servitor"
        };
        this.powerplant = null;
        this.weight = -1;
        this.length = -1;
        this.wingspan = -1;
        this.height = -1;
        this.transportCapacity = "50 Space Marines / " +
                "5 Dreadnoughts (Including Leviathan D.) / " +
                "1 Rhino";
        this.operationalCeiling = null;
        this.maxSpeed = -1;
        this.range = -1;
        this.mainArmament = new String[]{
                "Turret-mounted Twin-linked Lascannon",
                "Turret-mounted Twin-linked Lascannon",
                "Turret-mounted Twin-linked Lascannon",
                "Turret-mounted Twin-linked Lascannon",
                "Twin-linked Heavy Bolter",
                "Twin-linked Heavy Bolter",
                "Twin-linked Heavy Bolter"
        };
        this.mainAmmunition = -1;
        this.secondaryArmament = new String[]{
                "Dreadstrike Missile",
                "Dreadstrike Missile",
                "Dreadstrike Missile",
                "Dreadstrike Missile",
                "Dreadstrike Missile",
                "Dreadstrike Missile"
        };
        this.secondaryAmmunition = -1;
        this.superstructureThickness = -1;
        this.hullThickness = -1;
        this.accessPorts = null;
    }
}
