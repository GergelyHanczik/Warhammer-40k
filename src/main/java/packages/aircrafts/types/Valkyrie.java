package main.java.packages.aircrafts.types;

import main.java.packages.aircrafts.types.base.Aircraft;

import java.util.stream.IntStream;


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
public class Valkyrie implements Aircraft {
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


    public Valkyrie() {
        this.vehicleName = "Valkyrie";
        this.type = "Airborne Assault Carrier";
        this.forgeWorldOfOrigin = "Mars," +
                "Voss," +
                "Artemia," +
                "Estaban VII," +
                "Agripinaa," +
                "Phaeton," +
                "Lucius";
        this.patterns = IntStream.rangeClosed(1, 10).toArray();
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
        this.weight = 13;
        this.length = 18.5F;
        this.wingspan = 16.9F;
        this.height = 4.8F;
        this.transportCapacity = "12 Guardsmen";
        this.operationalCeiling = "13,000m";
        this.maxSpeed = 1100;
        this.range = 2000;
        this.mainArmament = new String[]{
                "Hull-mounted Multi-laser",
                "Door-mounted Heavy bolters",
                "Door-mounted Heavy bolters"
        };
        this.mainAmmunition = 150;
        this.secondaryArmament = new String[]{
                "Hellstrike Missile",
                "Hellstrike Missile",
                "Rocket Pods"
        };
        this.secondaryAmmunition = 1000;
        this.superstructureThickness = 75;
        this.hullThickness = 75;
        this.accessPorts = new String[]{"2 Cockpit", "1 Rear"};
    }
}
