package main.java.packages.aircrafts.types;

import main.java.packages.aircrafts.base.Aircraft;

import java.util.stream.IntStream;


/**
 * <h1>Avenger Aircraft</h1>
 * <a href="https://wh40k.lexicanum.com/wiki/Avenger">Lexicanum</a>
 */
public class Avenger extends Aircraft {
    public Avenger() {
        super();
        this.vehicleName = "Avenger";
        this.type = "Strike Fighter";
        this.forgeWorldOfOrigin = null;
        this.patterns = IntStream.rangeClosed(1, 3).toArray();
        this.crew = new String[]{
                "Pilot",
                "Co-Pilot"
        };
        this.powerplant = null;
        this.weight = -1;
        this.length = -1;
        this.wingspan = -1;
        this.height = -1;
        this.transportCapacity = null;
        this.operationalCeiling = null;
        this.maxSpeed = -1;
        this.range = -1;
        this.mainArmament = null;
        this.mainAmmunition = -1;
        this.secondaryArmament = null;
        this.secondaryAmmunition = -1;
        this.superstructureThickness = -1;
        this.hullThickness = -1;
        this.accessPorts = null;
    }
}
