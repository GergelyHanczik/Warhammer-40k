package main.java.packages.fleets.base;

/**
 * <h1>Enum to keep track of an Imperial Fleet</h1>
 * <p>
 * 3 Types:
 * <ul>
 *     <li>NAVIS_IMPERIALIS</li>
 *     <li>MERCHANT_FLEET</li>
 *     <li>CIVIL_FLEET</li>
 * </ul>
 */
public enum FleetType {
    NAVIS_IMPERIALIS("Navis Imperialis"),
    MERCHANT_FLEET("Merchant Fleet"),
    CIVIL_FLEET("Civil Fleet");

    private final String name;

    FleetType(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
