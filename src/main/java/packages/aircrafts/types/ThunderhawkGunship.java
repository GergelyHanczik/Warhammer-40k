package main.java.packages.aircrafts.types;

import main.java.packages.aircrafts.base.Aircraft;

import java.util.stream.IntStream;


/**
 * <h1>Thunderhawk Orbital Dropship</h1>
 * <a href="https://wh40k.lexicanum.com/wiki/Thunderhawk">Lexicanum</a>
 */
public class ThunderhawkGunship extends Aircraft {
    public ThunderhawkGunship() {
        super();
        this.vehicleName = "Thunderhawk Gunship";
        this.type = "(Space Marine / Sisters of Battle) Orbital Dropship";
        this.forgeWorldOfOrigin = "Mars";
        this.patterns = IntStream.rangeClosed(1, 21).toArray();
        this.crew = new String[]{
                "Pilot (Space Marine / Sister of Battle)",
                "Co-pilot (Space Marine / Sister of Battle)",
                "Gunner (Space Marine / Sister of Battle",
                "Navigator (Space Marine / Sister of Battle"
        };
        this.powerplant = new String[]{
                "RX-92-00 Combination Rocket/Afterburning Turbofan",
                "RX-92-00 Combination Rocket/Afterburning Turbofan",
                "RX-92-00 Combination Rocket/Afterburning Turbofan"
        };
        this.weight = 121;
        this.length = 26.6F;
        this.wingspan = 26.65F;
        this.height = 9.8F;
        this.transportCapacity = "30 Space Marines / " +
                "15 Terminator Space Marines / " +
                "1 Dreadnought per -5 Space Marine / " +
                "1 Space Marine Bike / -3 Space Marine / " +
                "1 Space Marine Attack Bike / -4 Space Marine";
        this.operationalCeiling = "N/A";
        this.maxSpeed = 2000;
        this.range = 28000;
        this.mainArmament = new String[]{
                "Attack Wing-mounted Lascannon",
                "Attack Wing-mounted Lascannon",
                "Hull-mounted Twin-linked Heavy Bolters",
                "Hull-mounted Twin-linked Heavy Bolters",
                "Limited Traverse Dorsal-mounted Turbo-laser Destructor",
                "Limited Traverse Dorsal-mounted Modified Battle Cannon"
        };
        this.mainAmmunition = 28;
        this.secondaryArmament = new String[]{
                "(OPTIONAL) Heavy Bolter",
                "(OPTIONAL) Heavy Bolter",
                "(OPTIONAL) Heavy Bolter",
                "(OPTIONAL) Heavy Bolter",
                "Hellstrike Missile / Bomb / Smart Bomb / External Fuel Pod (6 Missile / 18 Bombs)",
                "Hellstrike Missile / Bomb / Smart Bomb / External Fuel Pod (6 Missile / 18 Bombs)",
                "Hellstrike Missile / Bomb / Smart Bomb / External Fuel Pod (6 Missile / 18 Bombs)"
        };
        this.secondaryAmmunition = 2400;
        this.superstructureThickness = 55;
        this.hullThickness = 65;
        this.accessPorts = new String[]{"1 Forward Assault Ramp", "2 Access Doors"};
    }
}
