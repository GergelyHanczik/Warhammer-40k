package main.java.packages.aircrafts.types.base;


/**
 * Imperial Navy Aircraft Scheme
 * UNKNOWN data are indicated by -1 & null values.
 * <p>
 * Unique Aircraft Data:
 * <p>
 *     <ul>
 *         <li>aircraftNickname [String]: Nickname of the Vehicle</li>
 *         <li>pilot [String]: Pilot of the Vehicle</li>
 *         <li>affiliation [String]: Affiliation of the Vehicle</li>
 *         <li>airKillCount [int]: Number of Aircraft shot down by the Vehicle</li>
 *         <li>successfulMissionCount [int]: Number of Successful Missions carried out by the Vehicle</li>
 *         <li>missionCount [int]: Number of Missions the Vehicle has taken on</li>
 *         <li>pattern [short]: Pattern number of the Vehicle</li>
 *     </ul>
 * </p>
 * <p>
 *      Aircraft Type Data:
 *     <ul>
 *         <li> vehicleName [String]: Official Name of the Vehicle</li>
 *         <li> type [String]: Role of the Vehicle</li>
 *         <li> forgeWorldOfOrigin [String]: Forgeworld / Forgeworlds of Origin
 *         (Ex: Mars, Voss)</li>
 *         <li> patterns [int]: Range of numbers
 *         (Ex: 3, 4, 5)</li>
 *         <li> crew [ String[] ]: Crew needed to operate the Vehicle
 *         (Ex: {"Pilot", "Co-pilot"})</li>
 *         <li> powerplant [ String[] ]: Powerplants of the Vehicle
 *         (Ex: {"EngineType1", "EngineType1"})</li>
 *         <li> weight [float]: Weight of the Vehicle, in tonns</li>
 *         <li> length [float]: Length of the Vehicle, in meters</li>
 *         <li> wingspan [float]: Wingspan of the Vehicle, in meters</li>
 *         <li> height [float]: Height of the Vehicle, in meters</li>
 *         <li> transportCapacity [String]: Items/Personnel the Vehicle may carry
 *         (Ex: "12 Space Marines / 1 Dreadnought")</li>
 *         <li> operationalCeiling [String]: Area where the Vehicle is able to operate, in meters
 *         (Ex: "12000 with Jets")</li>
 *         <li> maxSpeed [int]: Maximum Speed the Vehicle can sustain, in the atmosphere, in kph</li>
 *         <li> range [int]: Maximum Range in which the Vehicle may return to Base, in kilometers</li>
 *         <li> mainArmament [ String[] ]: Array of main weapons the Vehicle is armed with
 *         (Ex: {"Heavy Bolter", "Heavy Bolter"})</li>
 *         <li> mainAmmunition [int]: Amount of ammunition assigned to the main weapons</li>
 *         <li> secondaryArmament [ String[] ]: Array of secondary weapons the Vehicle is armed with
 *         (Ex: {"Hellfire Missile", "Hellfire Missile"}</li>
 *         <li> secondaryAmmunition [int]: Amount of ammunition assigned to the secondary weapons</li>
 *         <li> superstructureThickness [short]: Thickness of the Vehicles superstructure, in mm</li>
 *         <li> hullThickness [short]: Thickness of the Vehicles hull, in mm</li>
 *         <li> accessPorts [ String[] ]: Access Ports of the Vehicle
 *         (Ex: {"1 Cockpit", "1 Rear"})</li>
 *     </ul>
 * </p>
 * </p>
 */
public abstract class Aircraft {
    protected String aircraftNickname = null;
    protected String pilot = null;
    protected String affiliation = null;
    protected int airKillCount = 0;
    protected int successfulMissionCount = 0;
    protected int missionCount = 0;
    protected short pattern;

    protected String vehicleName;
    protected String type;
    protected String forgeWorldOfOrigin;
    protected int[] patterns;
    protected String[] crew;
    protected String[] powerplant;
    protected float weight;
    protected float length;
    protected float wingspan;
    protected float height;
    protected String transportCapacity;
    protected String operationalCeiling;
    protected int maxSpeed;
    protected int range;
    protected String[] mainArmament;
    protected int mainAmmunition;
    protected String[] secondaryArmament;
    protected int secondaryAmmunition;
    protected short superstructureThickness;
    protected short hullThickness;
    protected String[] accessPorts;

    public Aircraft() {
        this.vehicleName = null;
        this.type = null;
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
        this.mainArmament = null;
        this.mainAmmunition = -1;
        this.secondaryArmament = null;
        this.secondaryAmmunition = -1;
        this.superstructureThickness = -1;
        this.hullThickness = -1;
        this.accessPorts = null;
    }
}
