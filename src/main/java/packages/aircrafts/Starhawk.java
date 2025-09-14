package main.java.packages.aircrafts;


import main.java.packages.aircrafts.base.Aircraft;

/**
 * <h1>Starhawk Bomber</h1>
 */
public class Starhawk extends Aircraft {
    public Starhawk() {
        super();
        this.vehicleName = "Starhawk";
        this.type = "Bomber";
        this.forgeWorldOfOrigin = null;
        this.patterns = new int[]{1};
        this.crew = new String[]{
                "Pilot",
                "Co-pilot",
                "Techpriest",
                "Gunner",
                "Gunner",
                "Gunner",
                "Gunner",
                "Gunner",
                "Bombardier",
                "Hardwired Servitor"
        };
        this.powerplant = null;
        this.weight = -1;
        this.length = -1;
        this.wingspan = -1;
        this.height = -1;
        this.transportCapacity = null;
        this.operationalCeiling = "N/A";
        this.maxSpeed = 1800;
        this.range = -1;
        this.mainArmament = new String[]{
                "Rear Bays of 40 Plasma Bombs",
                "Forward Rack of 10 Anti-Ship Missiles (Krak Warhead)"
        };
        this.mainAmmunition = 0;
        this.secondaryArmament = new String[]{
                "Forward Lascannon",
                "Twin-linked Multi-Laser Turret",
                "Twin-linked Multi-Laser Turret",
                "Wing-mounted Twin-linked Heavy Bolter",
                "Wing-mounted Twin-linked Heavy Bolter"
        };
        this.secondaryAmmunition = -1;
        this.superstructureThickness = -1;
        this.hullThickness = -1;
        this.accessPorts = null;
    }
}
