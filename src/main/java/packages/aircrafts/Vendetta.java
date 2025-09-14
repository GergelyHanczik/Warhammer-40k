package main.java.packages.aircrafts;


import main.java.packages.aircrafts.base.Aircraft;

/**
 * <h1>Vendetta Heavy Gunship</h1>
 * <a href="https://wh40k.lexicanum.com/wiki/Valkyrie#Vendetta">Lexicanum</a>
 */
public class Vendetta extends Aircraft {
    public Vendetta() {
        super();
        this.vehicleName = "Vendetta";
        this.type = "Heavy Gunship";
        this.forgeWorldOfOrigin = null;
        this.patterns = null;
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
        this.weight = -1;
        this.length = 18.5F;
        this.wingspan = 16.9F;
        this.height = 4.8F;
        this.transportCapacity = "12 Guardsmen";
        this.operationalCeiling = null;
        this.maxSpeed = -1;
        this.range = -1;
        this.mainArmament = new String[]{
                "Twin-linked Lascannon",
                "Twin-linked Lascannon / Hellfury Missiles",
                "Twin-linked Lascannon / Hellfury Missiles",
                "Door-mounted Heavy bolters",
                "Door-mounted Heavy bolters"
        };
        this.mainAmmunition = -1;
        this.secondaryArmament = new String[]{};
        this.secondaryAmmunition = 0;
        this.superstructureThickness = -1;
        this.hullThickness = -1;
        this.accessPorts = new String[]{"2 Cockpit", "1 Rear"};
    }
}
