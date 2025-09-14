package main.java.packages.aircrafts.types;


import main.java.packages.aircrafts.types.base.Aircraft;

/**
 * Fury Interceptor
 */
public class FuryInterceptor extends Aircraft {
    public FuryInterceptor() {
        super();
        this.vehicleName = "Arvus";
        this.type = "Starfighter";
        this.forgeWorldOfOrigin = null;
        this.patterns = null;
        this.crew = new String[]{
                "Pilot",
                "Navigator",
                "Gunner",
                "Astropath (OPTIONAL)"
        };
        this.powerplant = null;
        this.weight = -1;
        this.length = 70;
        this.wingspan = -1;
        this.height = -1;
        this.transportCapacity = "N/A";
        this.operationalCeiling = "N/A";
        this.maxSpeed = -1;
        this.range = -1;
        this.mainArmament = new String[]{
                "Wing-mounted Lascannon",
                "Wing-mounted Lascannon"
        };
        this.mainAmmunition = -1;
        this.secondaryArmament = new String[]{
                "Anti-Starfighter Missile",
                "Anti-Starfighter Missile",
                "Anti-Starfighter Missile",
                "Anti-Starfighter Missile"
        };
        this.secondaryAmmunition = -1;
        this.superstructureThickness = -1;
        this.hullThickness = -1;
        this.accessPorts = null;
    }
}
