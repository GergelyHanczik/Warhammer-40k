package main.java.packages.aircrafts;

import main.java.packages.aircrafts.base.Aircraft;

import java.util.stream.IntStream;


/**
 * <h1>Aquila Lander Aircraft</h1>
 */
public class AquilaLander extends Aircraft {
    public AquilaLander() {
        super();
        this.vehicleName = "Aquila Lander";
        this.type = "Atmosphere-Capable Transport Shuttle - Small";
        this.forgeWorldOfOrigin = "Cypra-Mundi";
        this.patterns = IntStream.rangeClosed(1, 6).toArray();
        this.crew = new String[]{"Pilot"};
        this.powerplant = new String[]{
                "RX-40-08 Rocket Engine",
                "RX-40-08 Rocket Engine"
        };
        this.weight = 42;
        this.length = 11.8F;
        this.wingspan = 21.45F;
        this.height = 8.1F;
        this.transportCapacity = "7 Humans";
        this.operationalCeiling = "N/A (Void Capable)";
        this.maxSpeed = 1900;
        this.range = 24000;
        this.mainArmament = new String[]{"Nose-Mounted Heavy Bolter"};
        this.mainAmmunition = 400;
        this.secondaryArmament = new String[]{};
        this.secondaryAmmunition = 0;
        this.superstructureThickness = 65;
        this.hullThickness = 65;
        this.accessPorts = new String[]{"1 Rear"};
    }
}
