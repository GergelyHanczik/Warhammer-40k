package main.java.packages.aircrafts;

import main.java.packages.aircrafts.base.Aircraft;

import java.util.stream.IntStream;


/**
 * <h1>Thunderbolt Multi-role Heavy Fighter</h1>
 */
public class Thunderbolt extends Aircraft {
    public Thunderbolt() {
        super();
        this.vehicleName = "Thunderbolt";
        this.type = "Multi-role Heavy Fighter";
        this.forgeWorldOfOrigin = "Cypra-Mundi";
        this.patterns = IntStream.rangeClosed(1, 21).toArray();
        this.crew = new String[]{
                "Pilot"
        };
        this.powerplant = new String[]{
                "F122v Afterburning Turbofan",
                "F122v Afterburning Turbofan"
        };
        this.weight = 14;
        this.length = 14.2F;
        this.wingspan = 16.06F;
        this.height = 3.5F;
        this.transportCapacity = "N/A";
        this.operationalCeiling = "39,000m, with jet engines";
        this.maxSpeed = 2200;
        this.range = 12000;
        this.mainArmament = new String[]{
                "Nose-mounted Lascannon",
                "Nose-mounted Lascannon",
                "Nose-mounted Autocannon",
                "Nose-mounted Autocannon",
                "Nose-mounted Autocannon",
                "Nose-mounted Autocannon"
        };
        this.mainAmmunition = 30;
        this.secondaryArmament = new String[]{
                "Hellstrike Missile",
                "Hellstrike Missile",
                "Hellstrike Missile",
                "Hellstrike Missile",
                "Bomb / Skystrike Missiles",
                "Bomb / Skystrike Missiles",
                "Bomb / Skystrike Missiles",
                "Bomb / Skystrike Missiles"
        };
        this.secondaryAmmunition = 400;
        this.superstructureThickness = 45;
        this.hullThickness = 45;
        this.accessPorts = null;
    }
}
