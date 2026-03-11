/**
 * Incorporate description herein.
 * <p>
 * @author Alejandro Gachupin
 * @contact gachae25@wfu.edu
 * @contact cyber@gachupin.io
 * <p>
 * @since 2025-03-11
 */
public enum Status {
    UNKNOWN(""), // Incorporate description herein.
    INTRODUCED(""), // Incorporate description herein.
    ENGROSSED(""), // Incorporate description herein.
    ENROLLED(""), // Incorporate description herein.
    PASSED(""), // Incorporate description herein.
    VETOED(""), // Incorporate description herein.
    SCHEDULED(""); // Incorporate description herein.

    private final String description; // Incorporate description herein.

    /**
     * Incorporate description herein.
     * <p>
     * @param description Incorporate description herein.
     */
    Status(String description) {
        this.description = description;
    }

    /**
     * Incorporate description herein.
     * <p>
     * @return Incorporate description herein.
     */
    public String toString() {
        return description;
    }
}