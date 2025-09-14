package main.java.packages.aircrafts.types;


import main.java.packages.aircrafts.base.Aircraft;

/**
 * <h1>Fire Raptor Orbital Dropship</h1>
 * <a href="https://wh40k.lexicanum.com/wiki/Fire_Raptor_Gunship">Lexicanum</a>
 */
public class FireRaptorGunship extends Aircraft {
    public FireRaptorGunship() {
        super();
        this.vehicleName = "Fire Raptor Gunship";
        this.type = "Orbital Dropship";
        this.forgeWorldOfOrigin = "Exact Provenance is Unknown";
        this.patterns = null;
        this.crew = new String[]{
                "Pilot"
        };
        this.powerplant = new String[]{
                "Combination Rocket / Afterburning Turbofan",
                "Combination Rocket / Afterburning Turbofan"
        };
        this.weight = -1;
        this.length = 18;
        this.wingspan = 11.8F;
        this.height = 7.2F;
        this.transportCapacity = "N/A";
        this.operationalCeiling = "N/A";
        this.maxSpeed = 2000;
        this.range = 30000;
        this.mainArmament = new String[]{
                "Twin-linked Avenger Bolt Cannons",
                "Waist-mounted Ball Turret with Repeater Batteries, Quad-heavy Bolters, Lascannons",
                "Waist-mounted Ball Turret with Repeater Batteries, Quad-heavy Bolters, Lascannons"
        };
        this.mainAmmunition = 48;
        this.secondaryArmament = new String[]{
                "Hellstrike Missile",
                "Hellstrike Missile",
                "Hellstrike Missile",
                "Hellstrike Missile"
        };
        this.secondaryAmmunition = 2000;
        this.superstructureThickness = 45;
        this.hullThickness = 55;
        this.accessPorts = null;
    }
}
