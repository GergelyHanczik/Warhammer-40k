package main.java.packages.aircrafts;

import main.java.packages.aircrafts.base.Aircraft;

import java.util.stream.IntStream;


/**
 * <h1>Thunderhawk Orbital Transporter</h1>
 * <a href="https://wh40k.lexicanum.com/wiki/Thunderhawk#Thunderhawk_Transporter">Lexicanum</a>
 */
public class ThunderhawkTransporter extends Aircraft {
    public ThunderhawkTransporter() {
        super();
        this.vehicleName = "Thunderhawk Transporter";
        this.type = "(Space Marine / Sisters of Battle) Orbital Transporter";
        this.forgeWorldOfOrigin = "Mars";
        this.patterns = IntStream.rangeClosed(1, 11).toArray();
        this.crew = new String[]{
                "Pilot (Space Marine / Sister of Battle)",
                "Co-pilot (Space Marine / Sister of Battle)"
        };
        this.powerplant = new String[]{
                "RX-92-00 Combination Rocket/Afterburning Turbofan",
                "RX-92-00 Combination Rocket/Afterburning Turbofan",
                "RX-92-00 Combination Rocket/Afterburning Turbofan",
                "RX-92-00 Combination Rocket/Afterburning Turbofan"
        };
        this.weight = 105;
        this.length = 28.8F;
        this.wingspan = 26.65F;
        this.height = 8.6F;
        this.transportCapacity = "2 Rhino / 1 Land Raider / 1 Under-slung Pod for Supplies";
        this.operationalCeiling = "N/A";
        this.maxSpeed = 2000;
        this.range = 28000;
        this.mainArmament = new String[]{
                "Twin-linked Heavy Bolter",
                "Twin-linked Heavy Bolter",
                "Twin-linked Heavy Bolter",
                "Twin-linked Heavy Bolter"
        };
        this.mainAmmunition = 2200;
        this.secondaryArmament = new String[]{
                "Winch (Drop pod recovery)",
                "Hellstrike missile",
                "Hellstrike missile",
                "Hellstrike missile",
                "Hellstrike missile",
                "Hellstrike missile",
                "Hellstrike missile"
        };
        this.secondaryAmmunition = 0;
        this.superstructureThickness = 45;
        this.hullThickness = 45;
        this.accessPorts = new String[]{"1 Cockpit"};
    }
}
