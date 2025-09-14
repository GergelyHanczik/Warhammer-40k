package main.java.packages.aircrafts.types;

import main.java.packages.aircrafts.base.Aircraft;

import java.util.stream.IntStream;


/**
 * <h1>Marauder Bomber</h1>
 * <a href="https://wh40k.lexicanum.com/wiki/Marauder_Bomber">Lexicanum</a>
 */
public class MarauderBomber extends Aircraft {
    public MarauderBomber() {
        super();
        this.vehicleName = "Marauder Bomber";
        this.type = "Tactical Bomber";
        this.forgeWorldOfOrigin = "Cypra-Mundi";
        this.patterns = IntStream.rangeClosed(1, 16).toArray();
        this.crew = new String[]{
                "Pilot",
                "Navigator",
                "Bombardier",
                "Nose Gunner",
                "Tail Gunner",
                "Turret Gunner"
        };
        this.powerplant = new String[]{
                "J79-CS Afterburning Ramjet",
                "J79-CS Afterburning Ramjet",
                "J79-CS Afterburning Ramjet",
                "J79-CS Afterburning Ramjet"
        };
        this.weight = 41;
        this.length = 19.2F;
        this.wingspan = 24.6F;
        this.height = 4.8F;
        this.transportCapacity = "N/A";
        this.operationalCeiling = "41,000m, with jet engines";
        this.maxSpeed = 1800;
        this.range = 15000;
        this.mainArmament = new String[]{
                "Nose turret mounted Lascannon",
                "Nose turret mounted Lascannon",
                "Rear turret mounted Heavy Bolter",
                "Rear turret mounted Heavy Bolter",
                "Dorsal turret mounted Heavy Bolter",
                "Dorsal turret mounted Heavy Bolter"
        };
        this.mainAmmunition = 40;
        this.secondaryArmament = new String[]{
                "6000lbs internal payload",
                "6000lbs external payload"
        };
        this.secondaryAmmunition = 4000;
        this.superstructureThickness = 45;
        this.hullThickness = 30;
        this.accessPorts = null;
    }
}
