import java.net.URI;
import java.time.LocalDate;
import java.time.Month;

/**
 * Incorporate description herein.
 * <p>
 * @author Alejandro Gachupin
 * @contact gachae25@wfu.edu
 * @contact cyber@gachupin.io
 * <p>
 * @since 2025-03-11
 */
public class Bill {
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
     * <p>
     * @param id Incorporate description herein.
     * @param sessionId Incorporate description herein.
     * @param committeeId Incorporate description herein.
     * <p>
     * @param congressUrl Incorporate description herein.
     * @param legiscanUrl Incorporate description herein.
     *<p>
     * @param lastAction Incorporate description herein.
     * @param lastActionDate Incorporate description herein.
     * @param status Incorporate description herein.
     * @param statusDate Incorporate description herein.
     */
    public Bill(String number, String title, String description,
                int id, int sessionId, int committeeId,
                URI congressUrl, URI legiscanUrl,
                String lastAction, LocalDate lastActionDate, Status status, LocalDate statusDate) {
        this.number = number;
        this.title = title;
        this.description = description;

        this.id = id;
        this.sessionId = sessionId;
        this.committeeId = committeeId;

        this.congressUrl = congressUrl;
        this.legiscanUrl = legiscanUrl;

        this.lastAction = lastAction;
        this.lastActionDate = lastActionDate;
        this.status = status;
        this.statusDate = statusDate;
    }

    /**
     * Incorporate description herein.
     * <p>
     * @return Incorporate description herein.
     */
    @Override
    public String toString() {
        return """
               %s
               %s
               %4s %s
               """.formatted(Ansi.DIM + number + Ansi.RESET,
                Ansi.BOLD + Ansi.UNDERLINE + title + Ansi.RESET,
                "", description);
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