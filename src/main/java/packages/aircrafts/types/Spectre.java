package main.java.packages.aircrafts.types;


import main.java.packages.aircrafts.types.base.Aircraft;

/**
 * Imperial Navy Aircraft Scheme
 * UNKNOWN data are indicated by -1 & null values.
 * <ul>
 *     <li> vehicleName[String]: Official Name of the Vehicle
 *     <li> type[String]: Role of the Vehicle
 *     <li> forgeWorldOfOrigin [String]: Forgeworld / Forgeworlds of Origin
 *      (Ex: Mars, Voss)
 *     <li> patterns [int]: Range of numbers
 *      (Ex: 3, 4, 5)
 *     <li> crew [ String[] ]: Crew needed to operate the Vehicle
 *      (Ex: {"Pilot", "Co-pilot"})
 *     <li> powerplant [ String[] ]: Powerplants of the Vehicle
 *      (Ex: {"EngineType1", "EngineType1"})
 *     <li> weight [float]: Weight of the Vehicle, in tonns
 *     <li> length [float]: Length of the Vehicle, in meters
 *     <li> wingspan [float]: Wingspan of the Vehicle, in meters
 *     <li> height [float]: Height of the Vehicle, in meters
 *     <li> transportCapacity [String]: Items/Personnel the Vehicle may carry
 *      (Ex: "12 Space Marines / 1 Dreadnought")
 *     <li> operationalCeiling [String]: Area where the Vehicle is able to operate, in meters
 *      (Ex: "12000 with Jets")
 *     <li> maxSpeed [int]: Maximum Speed the Vehicle can sustain, in the atmosphere, in kph
 *     <li> range [int]: Maximum Range in which the Vehicle may return to Base, in kilometers
 *     <li> mainArmament [ String[] ]: Array of main weapons the Vehicle is armed with
 *      (Ex: {"Heavy Bolter", "Heavy Bolter"})
 *     <li> mainAmmunition [int]: Amount of ammunition assigned to the main weapons
 *     <li> secondaryArmament [ String[] ]: Array of secondary weapons the Vehicle is armed with
 *      (Ex: {"Hellfire Missile", "Hellfire Missile"}
 *     <li> secondaryAmmunition [int]: Amount of ammunition assigned to the secondary weapons
 *     <li> superstructureThickness [short]: Thickness of the Vehicles superstructure, in mm
 *     <li> hullThickness [short]: Thickness of the Vehicles hull, in mm
 *     <li> accessPorts [ String[] ]: Access Ports of the Vehicle
 *      (Ex: {"1 Cockpit", "1 Rear"})
 * </ul>
 */
public class Spectre implements Aircraft {
    private final String vehicleName;
    private final String type;
    private final String forgeWorldOfOrigin;
    private final int[] patterns;
    private final String[] crew;
    private final String[] powerplant;
    private final float weight;
    private final float length;
    private final float wingspan;
    private final float height;
    private final String transportCapacity;
    private final String operationalCeiling;
    private final int maxSpeed;
    private final int range;
    private final String[] mainArmament;
    private final int mainAmmunition;
    private final String[] secondaryArmament;
    private final int secondaryAmmunition;
    private final short superstructureThickness;
    private final short hullThickness;
    private final String[] accessPorts;


    public Spectre() {
        this.vehicleName = "Spectre-class Valkyrie";
        this.type = "Armored Assault Carrier";
        this.forgeWorldOfOrigin = null;
        this.patterns = null;
        this.crew = null;
        this.powerplant = new String[]{
                "F75-MV Afterburning Vector-Turbojet",
                "F75-MV Afterburning Vector-Turbojet",
                "F75-MV Afterburning Vector-Turbojet",
                "F75-MV Afterburning Vector-Turbojet"
        };
        this.weight = -1;
        this.length = -1;
        this.wingspan = -1;
        this.height = -1;
        this.transportCapacity = "Multiple Vehicles";
        this.operationalCeiling = null;
        this.maxSpeed = -1;
        this.range = -1;
        this.mainArmament = new String[]{
                "Nose-mounted Autocannon",
                "Door-mounted Heavy Bolter",
                "Door-mounted Heavy Bolter",
                "Door-mounted Heavy Bolter",
                "Door-mounted Heavy Bolter"
        };
        this.mainAmmunition = -1;
        this.secondaryArmament = new String[]{
                "Auspex",
                "Missile-Lock Warning System",
                "Flare Countermeasures",
                "Hardpoint",
                "Hardpoint",
                "Hardpoint",
                "Hardpoint"
        };
        this.secondaryAmmunition = -1;
        this.superstructureThickness = -1;
        this.hullThickness = -1;
        this.accessPorts = null;
    }
}
