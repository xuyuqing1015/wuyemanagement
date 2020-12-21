package wuye.xyq.pojo;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;
import java.util.Objects;

@Entity
public class Owners {
    private Integer owid;
    private String owname;
    private String owsex;
    private Date owbirthday;
    private String ownation;
    private String owcetype;
    private String owcenumber;
    private Integer owstate;
    private String owphone;
    private String owpostcode;
    private String owaddress;
    private String owcontacts;
    private String owcophone;
    private String owcoaddress;
    private String owremarks;
    private List<Car> cars;
    private List<Houses> houses;
    private List<Visit> visits;
    private List<Carjc> carjcsByOwid;

    @Override
    public String toString() {
        return "Owners{" +
                "owid=" + owid +
                ", owname='" + owname + '\'' +
                ", owsex='" + owsex + '\'' +
                ", owbirthday=" + owbirthday +
                ", ownation='" + ownation + '\'' +
                ", owcetype='" + owcetype + '\'' +
                ", owcenumber='" + owcenumber + '\'' +
                ", owstate=" + owstate +
                ", owphone='" + owphone + '\'' +
                ", owpostcode='" + owpostcode + '\'' +
                ", owaddress='" + owaddress + '\'' +
                ", owcontacts='" + owcontacts + '\'' +
                ", owcophone='" + owcophone + '\'' +
                ", owcoaddress='" + owcoaddress + '\'' +
                ", owremarks='" + owremarks + '\'' +
                ", cars=" + cars +
                ", houses=" + houses +
                ", visits=" + visits +
                '}';
    }

    public Owners() {
    }

    public Owners(Integer owid, String owname, String owsex, Date owbirthday, String ownation, String owcetype, String owcenumber, Integer owstate, String owphone, String owpostcode, String owaddress, String owcontacts, String owcophone, String owcoaddress, String owremarks) {
        this.owid = owid;
        this.owname = owname;
        this.owsex = owsex;
        this.owbirthday = owbirthday;
        this.ownation = ownation;
        this.owcetype = owcetype;
        this.owcenumber = owcenumber;
        this.owstate = owstate;
        this.owphone = owphone;
        this.owpostcode = owpostcode;
        this.owaddress = owaddress;
        this.owcontacts = owcontacts;
        this.owcophone = owcophone;
        this.owcoaddress = owcoaddress;
        this.owremarks = owremarks;
    }

    @Id
    @Column(name = "owid", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getOwid() {
        return owid;
    }

    public void setOwid(Integer owid) {
        this.owid = owid;
    }

    @Basic
    @Column(name = "owname", nullable = true, length = 100)
    public String getOwname() {
        return owname;
    }

    public void setOwname(String owname) {
        this.owname = owname;
    }

    @Basic
    @Column(name = "owsex", nullable = true, length = 10)
    public String getOwsex() {
        return owsex;
    }

    public void setOwsex(String owsex) {
        this.owsex = owsex;
    }

    @Basic
    @Column(name = "owbirthday", nullable = true)
    public Date getOwbirthday() {
        return owbirthday;
    }

    public void setOwbirthday(Date owbirthday) {
        this.owbirthday = owbirthday;
    }

    @Basic
    @Column(name = "ownation", nullable = true, length = 100)
    public String getOwnation() {
        return ownation;
    }

    public void setOwnation(String ownation) {
        this.ownation = ownation;
    }

    @Basic
    @Column(name = "owcetype", nullable = true, length = 100)
    public String getOwcetype() {
        return owcetype;
    }

    public void setOwcetype(String owcetype) {
        this.owcetype = owcetype;
    }

    @Basic
    @Column(name = "owcenumber", nullable = true, length = 200)
    public String getOwcenumber() {
        return owcenumber;
    }

    public void setOwcenumber(String owcenumber) {
        this.owcenumber = owcenumber;
    }

    @Basic
    @Column(name = "owstate", nullable = true)
    public Integer getOwstate() {
        return owstate;
    }

    public void setOwstate(Integer owstate) {
        this.owstate = owstate;
    }

    @Basic
    @Column(name = "owphone", nullable = true, length = 11)
    public String getOwphone() {
        return owphone;
    }

    public void setOwphone(String owphone) {
        this.owphone = owphone;
    }

    @Basic
    @Column(name = "owpostcode", nullable = true, length = 100)
    public String getOwpostcode() {
        return owpostcode;
    }

    public void setOwpostcode(String owpostcode) {
        this.owpostcode = owpostcode;
    }

    @Basic
    @Column(name = "owaddress", nullable = true, length = 200)
    public String getOwaddress() {
        return owaddress;
    }

    public void setOwaddress(String owaddress) {
        this.owaddress = owaddress;
    }

    @Basic
    @Column(name = "owcontacts", nullable = true, length = 100)
    public String getOwcontacts() {
        return owcontacts;
    }

    public void setOwcontacts(String owcontacts) {
        this.owcontacts = owcontacts;
    }

    @Basic
    @Column(name = "owcophone", nullable = true, length = 11)
    public String getOwcophone() {
        return owcophone;
    }

    public void setOwcophone(String owcophone) {
        this.owcophone = owcophone;
    }

    @Basic
    @Column(name = "owcoaddress", nullable = true, length = 200)
    public String getOwcoaddress() {
        return owcoaddress;
    }

    public void setOwcoaddress(String owcoaddress) {
        this.owcoaddress = owcoaddress;
    }

    @Basic
    @Column(name = "owremarks", nullable = true, length = 1000)
    public String getOwremarks() {
        return owremarks;
    }

    public void setOwremarks(String owremarks) {
        this.owremarks = owremarks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Owners owners = (Owners) o;
        return owid == owners.owid &&
                Objects.equals(owname, owners.owname) &&
                Objects.equals(owsex, owners.owsex) &&
                Objects.equals(owbirthday, owners.owbirthday) &&
                Objects.equals(ownation, owners.ownation) &&
                Objects.equals(owcetype, owners.owcetype) &&
                Objects.equals(owcenumber, owners.owcenumber) &&
                Objects.equals(owstate, owners.owstate) &&
                Objects.equals(owphone, owners.owphone) &&
                Objects.equals(owpostcode, owners.owpostcode) &&
                Objects.equals(owaddress, owners.owaddress) &&
                Objects.equals(owcontacts, owners.owcontacts) &&
                Objects.equals(owcophone, owners.owcophone) &&
                Objects.equals(owcoaddress, owners.owcoaddress) &&
                Objects.equals(owremarks, owners.owremarks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(owid, owname, owsex, owbirthday, ownation, owcetype, owcenumber, owstate, owphone, owpostcode, owaddress, owcontacts, owcophone, owcoaddress, owremarks);
    }

    @OneToMany(mappedBy = "owners")
    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    @OneToMany(mappedBy = "owners")
    public List<Houses> getHouses() {
        return houses;
    }

    public void setHouses(List<Houses> houses) {
        this.houses = houses;
    }

    @OneToMany(mappedBy = "owners")
    public List<Visit> getVisits() {
        return visits;
    }

    public void setVisits(List<Visit> visits) {
        this.visits = visits;
    }

    @OneToMany(mappedBy = "ownersByOwid")
    public List<Carjc> getCarjcsByOwid() {
        return carjcsByOwid;
    }

    public void setCarjcsByOwid(List<Carjc> carjcsByOwid) {
        this.carjcsByOwid = carjcsByOwid;
    }
}
