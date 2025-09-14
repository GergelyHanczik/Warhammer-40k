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
public class ThunderhawkGunship implements Aircraft {
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


    public ThunderhawkGunship() {
        this.vehicleName = "Thunderhawk Gunship";
        this.type = "(Space Marine / Sisters of Battle) Orbital Dropship";
        this.forgeWorldOfOrigin = "Mars";
        this.patterns = IntStream.rangeClosed(1, 21).toArray();
        this.crew = new String[]{
                "Pilot (Space Marine / Sister of Battle)",
                "Co-pilot (Space Marine / Sister of Battle)",
                "Gunner (Space Marine / Sister of Battle",
                "Navigator (Space Marine / Sister of Battle"
        };
        this.powerplant = new String[]{
                "RX-92-00 Combination Rocket/Afterburning Turbofan",
                "RX-92-00 Combination Rocket/Afterburning Turbofan",
                "RX-92-00 Combination Rocket/Afterburning Turbofan"
        };
        this.weight = 121;
        this.length = 26.6F;
        this.wingspan = 26.65F;
        this.height = 9.8F;
        this.transportCapacity = "30 Space Marines / " +
                "15 Terminator Space Marines / " +
                "1 Dreadnought per -5 Space Marine / " +
                "1 Space Marine Bike / -3 Space Marine / " +
                "1 Space Marine Attack Bike / -4 Space Marine";
        this.operationalCeiling = "N/A";
        this.maxSpeed = 2000;
        this.range = 28000;
        this.mainArmament = new String[]{
                "Attack Wing-mounted Lascannon",
                "Attack Wing-mounted Lascannon",
                "Hull-mounted Twin-linked Heavy Bolters",
                "Hull-mounted Twin-linked Heavy Bolters",
                "Limited Traverse Dorsal-mounted Turbo-laser Destructor",
                "Limited Traverse Dorsal-mounted Modified Battle Cannon"
        };
        this.mainAmmunition = 28;
        this.secondaryArmament = new String[]{
                "(OPTIONAL) Heavy Bolter",
                "(OPTIONAL) Heavy Bolter",
                "(OPTIONAL) Heavy Bolter",
                "(OPTIONAL) Heavy Bolter",
                "Hellstrike Missile / Bomb / Smart Bomb / External Fuel Pod (6 Missile / 18 Bombs)",
                "Hellstrike Missile / Bomb / Smart Bomb / External Fuel Pod (6 Missile / 18 Bombs)",
                "Hellstrike Missile / Bomb / Smart Bomb / External Fuel Pod (6 Missile / 18 Bombs)"
        };
        this.secondaryAmmunition = 2400;
        this.superstructureThickness = 55;
        this.hullThickness = 65;
        this.accessPorts = new String[]{"1 Forward Assault Ramp", "2 Access Doors"};
    }
}
