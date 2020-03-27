package app.core.model;

import java.time.LocalDateTime;

public class EmailExtractionsStatus {

    private int id;
    private String emailBox;
    private LocalDateTime saveTime;

    public EmailExtractionsStatus() {
    }

    public EmailExtractionsStatus(int id, String emailBox, LocalDateTime saveTime) {
        this.id = id;
        this.emailBox = emailBox;
        this.saveTime = saveTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmailBox() {
        return emailBox;
    }

    public void setEmailBox(String emailBox) {
        this.emailBox = emailBox;
    }

    public LocalDateTime getSaveTime() {
        return saveTime;
    }

    public void setSaveTime(LocalDateTime saveTime) {
        this.saveTime = saveTime;
    }
}
