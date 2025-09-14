package main.java.packages.aircrafts;

import main.java.packages.aircrafts.base.Aircraft;

import java.util.stream.IntStream;


/**
 * <h1>Caestus Assault Ram</h1>
 * <a href="https://wh40k.lexicanum.com/wiki/Caestus_Assault_Ram">Lexicanum</a>
 */
public class CaestusAssaultRam extends Aircraft {
    public CaestusAssaultRam() {
        super();
        this.vehicleName = "Caestus Assault Ram";
        this.type = "(Space Marine) Assault Ram";
        this.forgeWorldOfOrigin = "Mars";
        this.patterns = IntStream.rangeClosed(1, 11).toArray();
        this.crew = new String[]{
                "Pilot",
                "Gunner"
        };
        this.powerplant = new String[]{
                "RX-98-25 combination rocket/afterburning turbofan",
                "RX-98-25 combination rocket/afterburning turbofan",
                "RX-98-25 combination rocket/afterburning turbofan"
        };
        this.weight = 85;
        this.length = 16.8F;
        this.wingspan = 12.5F;
        this.height = 6.5F;
        this.transportCapacity = "1 Space Marine Squad";
        this.operationalCeiling = "N/A";
        this.maxSpeed = 1800;
        this.range = 22000;
        this.mainArmament = new String[]{
                "Dual-mounted Haephestus pattern Magna-Melta"
        };
        this.mainAmmunition = 24;
        this.secondaryArmament = new String[]{
                "Firefury Missile Launcher",
                "Firefury Missile Launcher"
        };
        this.secondaryAmmunition = 0;
        this.superstructureThickness = 60;
        this.hullThickness = 60;
        this.accessPorts = null;
    }
}
