package main.java.packages.aircrafts;


import main.java.packages.aircrafts.base.Aircraft;

/**
 * <h1>Marauder (Voidboerne Variant) Void Combat Tactical Bomber</h1>
 */
public class MarauderVoidborneVariant extends Aircraft {
    public MarauderVoidborneVariant() {
        super();
        this.vehicleName = "Marauder Voidborne variant";
        this.type = "Void Combat Tactical Bomber";
        this.forgeWorldOfOrigin = "Cypra-Mundi";
        this.patterns = null;
        this.crew = new String[]{
                "Flight Commander",
                "Bombardier",
                "Mechanicus Tech-Adept",
                "First Class Gunner",
                "Second Class Gunner",
                "Second Class Gunner"
        };
        this.powerplant = new String[]{
                "J79-CS Afterburning Ramjet",
                "J79-CS Afterburning Ramjet",
                "J79-CS Afterburning Ramjet",
                "J79-CS Afterburning Ramjet"
        };
        this.weight = 190;
        this.length = 79.248F;
        this.wingspan = 109.728F;
        this.height = -1;
        this.transportCapacity = "N/A";
        this.operationalCeiling = "41,000m, with jet engines";
        this.maxSpeed = 286;
        this.range = 4000;
        this.mainArmament = new String[]{
                "Nose turret mounted Vulcan Pattern Lascannon",
                "Nose turret mounted Vulcan Pattern Lascannon",
                "Rear turret mounted Heavy Bolter",
                "Rear turret mounted Heavy Bolter",
                "Dorsal turret mounted Twin Autocannons",
                "Dorsal turret mounted Twin Autocannons"
        };
        this.mainAmmunition = 40;
        this.secondaryArmament = new String[]{
                "Wingslung Flail Missile",
                "Wingslung Flail Missile",
                "Wingslung Flail Missile",
                "Wingslung Flail Missile",
                "Wingslung Flail Missile",
                "Wingslung Flail Missile",
                "14,500 ilbs of explosives / incendiaries"
        };
        this.secondaryAmmunition = 4000;
        this.superstructureThickness = 45;
        this.hullThickness = 30;
        this.accessPorts = null;
    }
}
