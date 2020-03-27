package app.core.model;

import java.time.LocalDateTime;

public class EmailExtractionsStatus {

    private int id;
    private String emailBoxAddress;
    private LocalDateTime emailLocalDateTime;

    public EmailExtractionsStatus() {
    }

    public EmailExtractionsStatus(int id, String emailBoxAddress, LocalDateTime emailLocalDateTime) {
        this.id = id;
        this.emailBoxAddress = emailBoxAddress;
        this.emailLocalDateTime = emailLocalDateTime;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmailBoxAddress() {
        return emailBoxAddress;
    }

    public void setEmailBoxAddress(String emailBoxAddress) {
        this.emailBoxAddress = emailBoxAddress;
    }

    public LocalDateTime getEmailLocalDateTime() {
        return emailLocalDateTime;
    }

    public void setEmailLocalDateTime(LocalDateTime emailLocalDateTime) {
        this.emailLocalDateTime = emailLocalDateTime;
    }

}
