package main.java.packages.aircrafts.types;

import main.java.packages.aircrafts.base.Aircraft;

import java.util.stream.IntStream;


/**
 * <h1>Thunderbolt Fury Multi-role Heavy Fighter</h1>
 * <a href="https://wh40k.lexicanum.com/wiki/Thunderbolt#Thunderbolt_Fury">Lexicanum</a>
 */
public class ThunderboltFury extends Aircraft {
    public ThunderboltFury() {
        super();
        this.vehicleName = "Thunderbolt Fury";
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
        this.weight = -1;
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
                "Nose-mounted Twin-linked Avenger Bolt Cannon",
                "Nose-mounted Twin-linked Avenger Bolt Cannon"
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
