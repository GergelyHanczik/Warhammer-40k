package main.java.packages.aircrafts.types;


import main.java.packages.aircrafts.base.Aircraft;

/**
 * <h1>Marauder Nightstalker Nightfighter</h1>
 * <a href="https://wh40k.lexicanum.com/wiki/Marauder_Bomber#Marauder_Nightstalker">Lexicanum</a>
 */
public class MarauderNightstalker extends Aircraft {
    public MarauderNightstalker() {
        super();
        this.vehicleName = "Marauder Nightstalker";
        this.type = "Nightfighter";
        this.forgeWorldOfOrigin = "Cypra-Mundi";
        this.patterns = null;
        this.crew = new String[]{
                "Pilot",
                "Auspex Operator"
        };
        this.powerplant = new String[]{
                "J79-CS Afterburning Ramjet",
                "J79-CS Afterburning Ramjet",
                "J79-CS Afterburning Ramjet",
                "J79-CS Afterburning Ramjet"
        };
        this.weight = -1;
        this.length = 19.2F;
        this.wingspan = 24.6F;
        this.height = 4.8F;
        this.transportCapacity = null;
        this.operationalCeiling = null;
        this.maxSpeed = -1;
        this.range = -1;
        this.mainArmament = new String[]{
                "Volcano Cannon"
        };
        this.mainAmmunition = 6;
        this.secondaryArmament = new String[]{
                "Whisker Antennae"
        };
        this.secondaryAmmunition = 0;
        this.superstructureThickness = -1;
        this.hullThickness = -1;
        this.accessPorts = null;
    }
}
