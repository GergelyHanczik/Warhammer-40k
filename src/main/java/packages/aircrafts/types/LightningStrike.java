package main.java.packages.aircrafts.types;

import main.java.packages.aircrafts.types.base.Aircraft;

import java.util.stream.IntStream;


/**
 * Lightning Strike Fighter
 */
public class LightningStrike extends Aircraft {
    public LightningStrike() {
        super();
        this.vehicleName = "Lightning Strike";
        this.type = "Ground Attack Fighter - Small";
        this.forgeWorldOfOrigin = "Cypra-Mundi";
        this.patterns = IntStream.rangeClosed(3, 11).toArray();
        this.crew = new String[]{"Pilot"};
        this.powerplant = new String[]{
                "F100-XB Afterburning Turbofan",
                "F100-XB Afterburning Turbofan"};
        this.weight = 9.8F;
        this.length = 10.8F;
        this.wingspan = 13.75F;
        this.height = 3.4F;
        this.transportCapacity = "N/A";
        this.operationalCeiling = "36,000m, with jet engines";
        this.maxSpeed = 2400;
        this.range = 8000;
        this.mainArmament = new String[]{
                "Wing-mounted Lascannon",
                "Wing-mounted Lascannon"
        };
        this.mainAmmunition = 30;
        this.secondaryArmament = new String[]{
                "Hellstrike Missile",
                "Hellstrike Missile",
                "Hellstrike Missile",
                "Hellstrike Missile",
                "Hellstrike Missile",
                "Hellstrike Missile"
        };
        this.secondaryAmmunition = 0;
        this.superstructureThickness = 45;
        this.hullThickness = 30;
        this.accessPorts = new String[]{"1 Cockpit"};
    }
}
