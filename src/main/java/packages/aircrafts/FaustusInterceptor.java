package main.java.packages.aircrafts;


import main.java.packages.aircrafts.base.Aircraft;

/**
 * <h1>Faustus Interceptor</h1>
 */
public class FaustusInterceptor extends Aircraft {
    public FaustusInterceptor() {
        super();
        this.vehicleName = "Faustus";
        this.type = "Interceptor";
        this.forgeWorldOfOrigin = null;
        this.patterns = null;
        this.crew = new String[]{
                "Pilot",
                "Observation Officer",
                "Astropath",
                "Flight Engineer",
                "Gunner Servitor"
        };
        this.powerplant = null;
        this.weight = -1;
        this.length = 76.2F;
        this.wingspan = -1;
        this.height = -1;
        this.transportCapacity = "N/A";
        this.operationalCeiling = "N/A";
        this.maxSpeed = -1;
        this.range = -1;
        this.mainArmament = new String[]{
                "Forward-Firing Plasma Gun Array",
                "Chin/Rear-Turreted Twin Hypervelocity Autocannons /" +
                        "Chin-Mounted Heavy Bolters (1000rpm)"
        };
        this.mainAmmunition = -1;
        this.secondaryArmament = new String[]{
                "Target-Lock Warnings",
                "Vox",
                "Sensor System",
                "Autoloaders per Weapons"
        };
        this.secondaryAmmunition = 0;
        this.superstructureThickness = -1;
        this.hullThickness = -1;
        this.accessPorts = null;
    }
}
