package main.java.packages.aircrafts.types;


import main.java.packages.aircrafts.types.base.Aircraft;

/**
 * Stormhawk Interceptor
 */
public class StormhawkInterceptor extends Aircraft {
    public StormhawkInterceptor() {
        super();
        this.vehicleName = "Stormhawk Interceptor";
        this.type = "(Space Marine) Interceptor / Aerial Superiority Aircraft - Small";
        this.forgeWorldOfOrigin = null;
        this.patterns = null;
        this.crew = null;
        this.powerplant = null;
        this.weight = -1;
        this.length = -1;
        this.wingspan = -1;
        this.height = -1;
        this.transportCapacity = null;
        this.operationalCeiling = null;
        this.maxSpeed = -1;
        this.range = -1;
        this.mainArmament = new String[]{
                "Twin Assault Cannons",
                "Icarus Storm Cannon / Las-Talon",
                "Twin Heavy Bolters"
        };
        this.mainAmmunition = -1;
        this.secondaryArmament = new String[]{
                "Typhoon Missile Launchers / Skyhammer Missile Launchers",
                "Infernum Halo Launcher"
        };
        this.secondaryAmmunition = -1;
        this.superstructureThickness = -1;
        this.hullThickness = -1;
        this.accessPorts = new String[]{"1 Cockpit"};
    }
}
