import java.net.URI;
import java.time.LocalDate;
import java.time.Month;

public class Bill {
    public enum Status {
        UNKNOWN, // Incorporate description herein.
        INTRODUCED, // Incorporate description herein.
        ENGROSSED, // Incorporate description herein.
        ENROLLED, // Incorporate description herein.
        PASSED, // Incorporate description herein.
        VETOED, // Incorporate description herein.
        SCHEDULED // Incorporate description herein.
    }

    // Incorporate description herein:
    private static final LocalDate MINIMUM_DATE = LocalDate.of(1789, Month.JUNE, 1);

    private final String number; // Incorporate description herein.
    private final String title; // Incorporate description herein.
    private final String description; // Incorporate description herein.

    private final int id; // Incorporate description herein.
    private final int sessionId; // Incorporate description herein.
    private final int committeeId; // Incorporate description herein.

    private final URI congressUrl; // Incorporate description herein.
    private final URI legiscanUrl; // Incorporate description herein.

    private final String lastAction; // Incorporate description herein.
    private final LocalDate lastActionDate; // Incorporate description herein.
    private final Status status; // Incorporate description herein.
    private final LocalDate statusDate; // Incorporate description herein.

    /**
     * Incorporate description herein.
     * <p>
     * @param number Incorporate description herein.
     * @param title Incorporate description herein.
     * @param description Incorporate description herein.
     * @param id Incorporate description herein.
     * @param sessionId Incorporate description herein.
     * @param committeeId Incorporate description herein.
     * @param congressUrl Incorporate description herein.
     * @param legiscanUrl Incorporate description herein.
     * @param lastAction Incorporate description herein.
     * @param lastActionDate Incorporate description herein.
     * @param status Incorporate description herein.
     * @param statusDate Incorporate description herein.
     */
    public Bill(String number, String title, String description,
                int id, int sessionId, int committeeId,
                URI congressUrl, URI legiscanUrl,
                String lastAction, LocalDate lastActionDate, Status status, LocalDate statusDate) {
        //...
    }

    /**
     * Incorporate description herein.
     * <p>
     * @return Incorporate description herein.
     */
    public String getNumber() {
        return number;
    }

    /**
     * Incorporate description herein.
     * <p>
     * @return Incorporate description herein.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Incorporate description herein.
     * <p>
     * @return Incorporate description herein.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Incorporate description herein.
     * <p>
     * @return Incorporate description herein.
     */
    public int getId() {
        return id;
    }

    /**
     * Incorporate description herein.
     * <p>
     * @return Incorporate description herein.
     */
    public int getSessionId() {
        return sessionId;
    }

    /**
     * Incorporate description herein.
     * <p>
     * @return Incorporate description herein.
     */
    public int getCommitteeId() {
        return committeeId;
    }

    /**
     * Incorporate description herein.
     * <p>
     * @return Incorporate description herein.
     */
    public URI getCongressUrl() {
        return congressUrl;
    }

    /**
     * Incorporate description herein.
     * <p>
     * @return Incorporate description herein.
     */
    public URI getLegiscanUrl() {
        return legiscanUrl;
    }

    /**
     * Incorporate description herein.
     * <p>
     * @return Incorporate description herein.
     */
    public String getLastAction() {
        return lastAction;
    }

    /**
     * Incorporate description herein.
     * <p>
     * @return Incorporate description herein.
     */
    public LocalDate getLastActionDate() {
        return lastActionDate;
    }

    /**
     * Incorporate description herein.
     * <p>
     * @return Incorporate description herein.
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Incorporate description herein.
     * <p>
     * @return Incorporate description herein.
     */
    public LocalDate getStatusDate() {
        return statusDate;
    }
}