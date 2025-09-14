package main.java.packages.aircrafts.base;


import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Objects;

/**
 * <h1>Imperial Navy Aircraft Scheme</h1>
 * <p>
 * Contains methods & data of Individual Aircraft
 * <p>
 * !!! UNKNOWN data are indicated by -1 & null values.!!!
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
 * <p>
 *     Aircraft Type Data:
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
 */
public abstract class Aircraft {
    protected String aircraftNickname = null;
    protected String pilot = null;
    protected Affiliation affiliation = null;
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

    public String getAircraftNickname() {
        return aircraftNickname;
    }

    public void setAircraftNickname(String aircraftNickname) {
        this.aircraftNickname = aircraftNickname;
    }

    public String getPilot() {
        return pilot;
    }

    public void setPilot(String pilot) {
        this.pilot = pilot;
    }

    public Affiliation getAffiliation() {
        return this.affiliation;
    }

    public void setAffiliation(Affiliation affiliation) {
        this.affiliation = affiliation;
    }

    public int getAirKillCount() {
        return airKillCount;
    }

    public void setAirKillCount(int airKillCount) {
        this.airKillCount = airKillCount;
    }

    public int getSuccessfulMissionCount() {
        return successfulMissionCount;
    }

    public void setSuccessfulMissionCount(int successfulMissionCount) {
        this.successfulMissionCount = successfulMissionCount;
    }

    public int getMissionCount() {
        return missionCount;
    }

    public void setMissionCount(int missionCount) {
        this.missionCount = missionCount;
    }

    public short getPattern() {
        return pattern;
    }

    public void setPattern(short pattern) {
        this.pattern = pattern;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public String getType() {
        return type;
    }

    public String getForgeWorldOfOrigin() {
        return forgeWorldOfOrigin;
    }

    public int[] getPatterns() {
        return patterns;
    }

    public String[] getCrew() {
        return crew;
    }

    public String[] getPowerplant() {
        return powerplant;
    }

    public float getWeight() {
        return weight;
    }

    public float getLength() {
        return length;
    }

    public float getWingspan() {
        return wingspan;
    }

    public float getHeight() {
        return height;
    }

    public String getTransportCapacity() {
        return transportCapacity;
    }

    public String getOperationalCeiling() {
        return operationalCeiling;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getRange() {
        return range;
    }

    public String[] getMainArmament() {
        return mainArmament;
    }

    public int getMainAmmunition() {
        return mainAmmunition;
    }

    public String[] getSecondaryArmament() {
        return secondaryArmament;
    }

    public int getSecondaryAmmunition() {
        return secondaryAmmunition;
    }

    public short getSuperstructureThickness() {
        return superstructureThickness;
    }

    public short getHullThickness() {
        return hullThickness;
    }

    public String[] getAccessPorts() {
        return accessPorts;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) return false;
        if (obj == this) return true;

        Aircraft aircraft = (Aircraft) obj;
        Field[] attributes = aircraft.getClass().getDeclaredFields();
        for (Field attribute : attributes) {
            Class currentClass = attribute.getType();
            try {
                Object attributeObject = attribute.get(aircraft);
                Object attributeThis = attribute.get(this);
                if (attributeObject != attributeThis) {
                    return false;
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAircraftNickname(),
                getPilot(),
                getAffiliation(),
                getAirKillCount(),
                getSuccessfulMissionCount(),
                getMissionCount(),
                getPattern(),
                getVehicleName(),
                getType(),
                getForgeWorldOfOrigin(),
                Arrays.hashCode(getPatterns()),
                Arrays.hashCode(getCrew()),
                Arrays.hashCode(getPowerplant()),
                getWeight(),
                getLength(),
                getWingspan(),
                getHeight(),
                getTransportCapacity(),
                getOperationalCeiling(),
                getMaxSpeed(),
                getRange(),
                Arrays.hashCode(getMainArmament()),
                getMainAmmunition(),
                Arrays.hashCode(getSecondaryArmament()),
                getSecondaryAmmunition(),
                getSuperstructureThickness(),
                getHullThickness(),
                Arrays.hashCode(getAccessPorts()));
    }

    @Override
    public String toString() {
        return getVehicleName();
    }
}
