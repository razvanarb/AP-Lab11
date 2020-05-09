package Lab11.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "games")
public class Game {
    private Long id;
    private Date date;
    private Player player1;
    private Player player2;

    @Id
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "date")
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
