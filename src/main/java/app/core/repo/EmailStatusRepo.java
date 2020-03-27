package app.core.repo;


import app.core.model.EmailExtractionsStatus;
import app.core.repo.mapper.EmailRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmailStatusRepo {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public EmailExtractionsStatus checkStatus(String emailBoxName) {
        String sql = "select from post.email where email=?";
        return jdbcTemplate.queryForObject(sql, new Object[]{emailBoxName},new EmailRowMapper());
    }

    public int insert(EmailExtractionsStatus status) {
        return jdbcTemplate.update("INSERT  INTO post.email (id,email,emailtime) values (?,?,?)",
                status.getId(), status.getEmailBoxAddress(),status.getEmailLocalDateTime());

    }


}
