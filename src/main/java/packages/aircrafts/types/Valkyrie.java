package main.java.packages.aircrafts.types;

import main.java.packages.aircrafts.base.Aircraft;

import java.util.stream.IntStream;


/**
 * <h1>Valkyrie Airborne Assault Carrier</h1>
 * <a href="https://wh40k.lexicanum.com/wiki/Valkyrie">Lexicanum</a>
 */
public class Valkyrie extends Aircraft {
    public Valkyrie() {
        super();
        this.vehicleName = "Valkyrie";
        this.type = "Airborne Assault Carrier";
        this.forgeWorldOfOrigin = "Mars," +
                "Voss," +
                "Artemia," +
                "Estaban VII," +
                "Agripinaa," +
                "Phaeton," +
                "Lucius";
        this.patterns = IntStream.rangeClosed(1, 10).toArray();
        this.crew = new String[]{
                "Pilot",
                "Navigator",
                "Door Gunner",
                "Door Gunner"
        };
        this.powerplant = new String[]{
                "F75-MV Afterburning Vector-Turbojet",
                "F75-MV Afterburning Vector-Turbojet"
        };
        this.weight = 13;
        this.length = 18.5F;
        this.wingspan = 16.9F;
        this.height = 4.8F;
        this.transportCapacity = "12 Guardsmen";
        this.operationalCeiling = "13,000m";
        this.maxSpeed = 1100;
        this.range = 2000;
        this.mainArmament = new String[]{
                "Hull-mounted Multi-laser",
                "Door-mounted Heavy bolters",
                "Door-mounted Heavy bolters"
        };
        this.mainAmmunition = 150;
        this.secondaryArmament = new String[]{
                "Hellstrike Missile",
                "Hellstrike Missile",
                "Rocket Pods"
        };
        this.secondaryAmmunition = 1000;
        this.superstructureThickness = 75;
        this.hullThickness = 75;
        this.accessPorts = new String[]{"2 Cockpit", "1 Rear"};
    }
}
