package app.core.repo;


import app.core.model.EmailExtractionsStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Repository
public class EmailStatusRepo {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public EmailExtractionsStatus checkStatus(String emailBoxName) {
        System.out.println("Thread of proto app 1 sleep");
        String sql = "select from post.email where email_box=?";
        return jdbcTemplate.queryForObject(sql, new Object[]{emailBoxName},new BeanPropertyRowMapper<>(EmailExtractionsStatus.class));
    }

    public int insert(EmailExtractionsStatus status) {
        return jdbcTemplate.update("INSERT  INTO post.email (id,email_box,save_time) values (?,?,?)",
                status.getId(), status.getEmailBox(), Timestamp.valueOf(LocalDateTime.now()));

    }


}
