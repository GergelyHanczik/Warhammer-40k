package main.java.packages.aircrafts.types;

import main.java.packages.aircrafts.types.base.Aircraft;

import java.util.stream.IntStream;


/**
 * Marauder Destroyer Ground Attack Bomber
 */
public class MarauderDestroyer extends Aircraft {
    public MarauderDestroyer() {
        super();
        this.vehicleName = "Marauder Destroyer";
        this.type = "Ground Attack Bomber";
        this.forgeWorldOfOrigin = "Cypra-Mundi";
        this.patterns = IntStream.rangeClosed(1, 7).toArray();
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
        this.weight = 43;
        this.length = 19.2F;
        this.wingspan = 24.6F;
        this.height = 4.8F;
        this.transportCapacity = "N/A";
        this.operationalCeiling = "41,000m, with jet engines";
        this.maxSpeed = 1800;
        this.range = 15000;
        this.mainArmament = new String[]{
                "Nose mounted Autocannon",
                "Nose mounted Autocannon",
                "Nose mounted Autocannon",
                "Nose mounted Autocannon",
                "Nose mounted Autocannon",
                "Nose mounted Autocannon",
                "Rear turret mounted Assault Cannon",
                "Rear turret mounted Assault Cannon",
                "Dorsal turret mounted Heavy Bolter",
                "Dorsal turret mounted Heavy Bolter"
        };
        this.mainAmmunition = 300;
        this.secondaryArmament = new String[]{
                "3000lbs internal payload",
                "Hellstrike Missile",
                "Hellstrike Missile",
                "Hellstrike Missile",
                "Hellstrike Missile",
                "Hellstrike Missile",
                "Hellstrike Missile",
                "Hellstrike Missile",
                "Hellstrike Missile"
        };
        this.secondaryAmmunition = 2000;
        this.superstructureThickness = 45;
        this.hullThickness = 30;
        this.accessPorts = null;
    }
}
