package Lab11.entity;

import javax.persistence.*;

@Entity
@Table(name = "players")
@NamedQuery(name = "findPlayerByName", query = "SELECT plr FROM Player plr WHERE plr.name = :Name")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public Player() {
    }

    public Player(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
