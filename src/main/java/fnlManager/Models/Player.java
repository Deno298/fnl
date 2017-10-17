package fnlManager.Models;


import org.hibernate.validator.constraints.Length;

import javax.persistence.*;

@Entity
@Table(name = "player")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "player_id")
    private int playerId;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "off_pos")
    private String offPos;
    @Column(name = "def_pos")
    private String defPos;
    /*
    @Column(name = "team_id")
    private int teamId;
    @Column(name = "throwing")
    private int throwing;
    @Column(name = "vision")
     private int vision;
    @Column(name = "precision")
    private int precision;
    @Column(name = "speed")
    private int speed;
    @Column(name = "acceleration")
    private int acceleration;
    @Column(name = "catching")
    private int catching;
    @Column(name = "route_running")
    private int routeRunning;
    @Column(name = "blitzing")
    private int blitzing;
    @Column(name = "man_coverage")
    private int manCoverage;
    @Column(name = "zone_coverage")
    private int zoneCoverage;

    public Player() {
    }

    public Player(String firstName, String lastName, String offPos, String defPos, int throwing, int vision, int precision, int speed, int acceleration, int catching, int routeRunning, int blitzing, int manCoverage, int zoneCoverage) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.offPos = offPos;
        this.defPos = defPos;
        this.throwing = throwing;
        this.vision = vision;
        this.precision = precision;
        this.speed = speed;
        this.acceleration = acceleration;
        this.catching = catching;
        this.routeRunning = routeRunning;
        this.blitzing = blitzing;
        this.manCoverage = manCoverage;
        this.zoneCoverage = zoneCoverage;
    }


    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getOffPos() {
        return offPos;
    }

    public void setOffPos(String offPos) {
        this.offPos = offPos;
    }

    public String getDefPos() {
        return defPos;
    }

    public void setDefPos(String defPos) {
        this.defPos = defPos;
    }

    public int getThrowing() {
        return throwing;
    }

    public void setThrowing(int throwing) {
        this.throwing = throwing;
    }

    public int getVision() {
        return vision;
    }

    public void setVision(int vision) {
        this.vision = vision;
    }

    public int getPrecision() {
        return precision;
    }

    public void setPrecision(int precision) {
        this.precision = precision;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(int acceleration) {
        this.acceleration = acceleration;
    }

    public int getCatching() {
        return catching;
    }

    public void setCatching(int catching) {
        this.catching = catching;
    }

    public int getRouteRunning() {
        return routeRunning;
    }

    public void setRouteRunning(int routeRunning) {
        this.routeRunning = routeRunning;
    }

    public int getBlitzing() {
        return blitzing;
    }

    public void setBlitzing(int blitzing) {
        this.blitzing = blitzing;
    }

    public int getManCoverage() {
        return manCoverage;
    }

    public void setManCoverage(int manCoverage) {
        this.manCoverage = manCoverage;
    }

    public int getZoneCoverage() {
        return zoneCoverage;
    }

    public void setZoneCoverage(int zoneCoverage) {
        this.zoneCoverage = zoneCoverage;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerId=" + playerId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", offPos='" + offPos + '\'' +
                ", defPos='" + defPos + '\'' +
                ", throwing=" + throwing +
                ", vision=" + vision +
                ", precision=" + precision +
                ", speed=" + speed +
                ", acceleration=" + acceleration +
                ", catching=" + catching +
                ", routeRunning=" + routeRunning +
                ", blitzing=" + blitzing +
                ", manCoverage=" + manCoverage +
                ", zoneCoverage=" + zoneCoverage +
                '}';
    }
    */
}
