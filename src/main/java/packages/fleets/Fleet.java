package main.java.packages.fleets;

import main.java.packages.aircrafts.base.Aircraft;
import main.java.packages.fleets.base.FleetType;

import java.util.Arrays;
import java.util.Objects;

/**
 * <h1>An Imperial Fleet</h1>
 * <p>
 * Every fleet is a military fleet (Navis Imperialis) by default.
 * <p>
 * Every fleet has 3 Attributes:
 * <ul>
 *     <li>name [String]: Name of the Fleet</li>
 *     <li>type [FleetType]: Type of the Fleet</li>
 *     <li>aircrafts [ Aircraft[] ]: Aircrafts assigned to the Fleet</li>
 * </ul>
 */
public class Fleet {
    private String name;
    private FleetType type;
    private Aircraft[] aircrafts;

    public Fleet() {
        this.name = FleetType.NAVIS_IMPERIALIS.getName();
        this.type = FleetType.NAVIS_IMPERIALIS;
        this.aircrafts = new Aircraft[0];
    }

    public Fleet(String name) {
        this.name = name;
        this.type = FleetType.NAVIS_IMPERIALIS;
        this.aircrafts = new Aircraft[0];
    }

    public Fleet(String name, FleetType type) {
        this.name = name;
        this.type = type;
        this.aircrafts = new Aircraft[0];
    }

    public Fleet(String name, FleetType type, Aircraft[] aircrafts) {
        this.name = name;
        this.type = type;
        this.aircrafts = aircrafts;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FleetType getType() {
        return this.type;
    }

    public void setType(FleetType type) {
        this.type = type;
    }

    public Aircraft[] getAircrafts() {
        return this.aircrafts;
    }

    public void setAircrafts(Aircraft[] aircrafts) {
        this.aircrafts = aircrafts;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) return false;
        if (obj == this) return true;

        Fleet fleet = (Fleet) obj;
        if (Objects.equals(getName(), fleet.getName())) {
            if (getType() == fleet.getType()) {
                if (Objects.deepEquals(getAircrafts(), fleet.getAircrafts())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getType(), Arrays.hashCode(getAircrafts()));
    }

    @Override
    public String toString() {
        return "Fleet name: '" + getName() + '\'' +
                ", Type: '" + getType().getName() + '\'' +
                ", Aircraft Count: [" + getAircrafts().length + ']';
    }
}
