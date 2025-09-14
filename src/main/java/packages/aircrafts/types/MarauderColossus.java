package main.java.packages.aircrafts.types;


import main.java.packages.aircrafts.base.Aircraft;

/**
 * <h1>Marauder Colossus Strategical Bomber</h1>
 * <a href="https://wh40k.lexicanum.com/wiki/Marauder_Bomber#Marauder_Colossus">Lexicanum</a>
 */
public class MarauderColossus extends Aircraft {
    public MarauderColossus() {
        super();
        this.vehicleName = "Marauder Colossus";
        this.type = "Strategical Bomber";
        this.forgeWorldOfOrigin = "Cypra-Mundi";
        this.patterns = null;
        this.crew = new String[]{
                "Pilot",
                "Navigator",
                "Bombardier",
                "Nose Gunner",
                "Tail Gunner"
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
        this.transportCapacity = "N/A";
        this.operationalCeiling = null;
        this.maxSpeed = -1;
        this.range = -1;
        this.mainArmament = new String[]{
                "Nose turret mounted Lascannon",
                "Nose turret mounted Lascannon",
                "Rear turret mounted Heavy Bolter",
                "Rear turret mounted Heavy Bolter"
        };
        this.mainAmmunition = 40;
        this.secondaryArmament = new String[]{
                "10,000kg Colossus Bomb"
        };
        this.secondaryAmmunition = 1;
        this.superstructureThickness = 45;
        this.hullThickness = 30;
        this.accessPorts = null;
    }
}
