package fnlManager.Models;


import org.hibernate.validator.constraints.Length;

import javax.persistence.*;

@Entity
@Table(name = "team")
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "team_id")
    private int teamId;
    @Column(name = "team_name")
    private String teamName;
    @Column(name = "team_abbr")
    @Length(min = 3, max = 3)
    private  String teamAbbr;
}
