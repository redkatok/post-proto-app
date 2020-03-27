package app.core.repo.mapper;

import app.core.model.EmailExtractionsStatus;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmailRowMapper implements RowMapper<EmailExtractionsStatus> {
    @Override
    public EmailExtractionsStatus mapRow(ResultSet rs, int rowNum) throws SQLException {
        EmailExtractionsStatus emailExtractionsStatus=new EmailExtractionsStatus();
        emailExtractionsStatus.setId(rs.getInt("id"));
        emailExtractionsStatus.setEmailLocalDateTime(rs.getTimestamp("emailtime").toLocalDateTime());
        emailExtractionsStatus.setEmailBoxAddress(rs.getString("email"));
        return emailExtractionsStatus;
    }
}
