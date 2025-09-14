package main.java.packages.aircrafts;

import main.java.packages.aircrafts.base.Aircraft;

import java.util.stream.IntStream;


/**
 * <h1>Arvus Lighter Aircraft</h1>
 */
public class ArvusLighter extends Aircraft {
    public ArvusLighter() {
        super();
        this.vehicleName = "Arvus";
        this.type = "General Purpose Cargo Shuttle - Small";
        this.forgeWorldOfOrigin = "Bakka";
        this.patterns = IntStream.rangeClosed(4, 27).toArray();
        this.crew = new String[]{"Pilot"};
        this.powerplant = new String[]{
                "RX-60-22 Rocket Engine",
                "RX-60-22 Rocket Engine"
        };
        this.weight = 15;
        this.length = 8.52F;
        this.wingspan = 8.2F;
        this.height = 3.68F;
        this.transportCapacity = "12 Humans / 6 Ogryns";
        this.operationalCeiling = "N/A";
        this.maxSpeed = 1600;
        this.range = 22000;
        this.mainArmament = new String[]{};
        this.mainAmmunition = 0;
        this.secondaryArmament = new String[]{};
        this.secondaryAmmunition = 0;
        this.superstructureThickness = 15;
        this.hullThickness = 15;
        this.accessPorts = new String[]{"1 Rear Ramp"};
    }
}
