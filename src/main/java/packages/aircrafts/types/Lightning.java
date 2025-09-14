package main.java.packages.aircrafts.types;

import main.java.packages.aircrafts.types.base.Aircraft;

import java.util.stream.IntStream;


/**
 * Lightning Fighter
 */
public class Lightning extends Aircraft {
    public Lightning() {
        super();
        this.vehicleName = "Lightning";
        this.type = "Air Superiority Fighter - Small";
        this.forgeWorldOfOrigin = "Cypra-Mundi";
        this.patterns = IntStream.rangeClosed(3, 9).toArray();
        this.crew = new String[]{"Pilot"};
        this.powerplant = new String[]{
                "F100-XB Afterburning Turbofan",
                "F100-XB Afterburning Turbofan"};
        this.weight = 10;
        this.length = 10.8F;
        this.wingspan = 13.75F;
        this.height = 3.4F;
        this.transportCapacity = "N/A";
        this.operationalCeiling = "36,000m, with jet engines";
        this.maxSpeed = 2400;
        this.range = 8000;
        this.mainArmament = new String[]{
                "Wing-mounted Lascannon",
                "Wing-mounted Lascannon",
                "Ventral-mounted long barrelled Autocannon"
        };
        this.mainAmmunition = 30;
        this.secondaryArmament = new String[]{
                "Hellstrike Missile",
                "Hellstrike Missile",
                "Hellstrike Missile",
                "Hellstrike Missile"
        };
        this.secondaryAmmunition = 100;
        this.superstructureThickness = 45;
        this.hullThickness = 30;
        this.accessPorts = new String[]{"1 Cockpit"};
    }
}
