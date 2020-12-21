package wuye.xyq.pojo;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Tunit {
    private Integer tuid;
    private String tubh;
    private String tuname;
    private Integer tufstart;
    private Integer tufend;
    private Integer turstart;
    private Integer turend;
    private Integer tustate;
    private Tfloor tfloor;
    private List<Troom> trooms;
    private List<Visit> visits;

    @Id
    @Column(name = "tuid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getTuid() {
        return tuid;
    }

    public void setTuid(Integer tuid) {
        this.tuid = tuid;
    }

    @Basic
    @Column(name = "tubh")
    public String getTubh() {
        return tubh;
    }

    public void setTubh(String tubh) {
        this.tubh = tubh;
    }

    @Basic
    @Column(name = "tuname")
    public String getTuname() {
        return tuname;
    }

    public void setTuname(String tuname) {
        this.tuname = tuname;
    }

    @Basic
    @Column(name = "tufstart")
    public Integer getTufstart() {
        return tufstart;
    }

    public void setTufstart(Integer tufstart) {
        this.tufstart = tufstart;
    }

    @Basic
    @Column(name = "tufend")
    public Integer getTufend() {
        return tufend;
    }

    public void setTufend(Integer tufend) {
        this.tufend = tufend;
    }

    @Basic
    @Column(name = "turstart")
    public Integer getTurstart() {
        return turstart;
    }

    public void setTurstart(Integer turstart) {
        this.turstart = turstart;
    }

    @Basic
    @Column(name = "turend")
    public Integer getTurend() {
        return turend;
    }

    public void setTurend(Integer turend) {
        this.turend = turend;
    }

    @Basic
    @Column(name = "tustate")
    public Integer getTustate() {
        return tustate;
    }

    public void setTustate(Integer tustate) {
        this.tustate = tustate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tunit tunit = (Tunit) o;
        return tuid == tunit.tuid &&
                Objects.equals(tubh, tunit.tubh) &&
                Objects.equals(tuname, tunit.tuname) &&
                Objects.equals(tufstart, tunit.tufstart) &&
                Objects.equals(tufend, tunit.tufend) &&
                Objects.equals(turstart, tunit.turstart) &&
                Objects.equals(turend, tunit.turend) &&
                Objects.equals(tustate, tunit.tustate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tuid, tubh, tuname, tufstart, tufend, turstart, turend, tustate);
    }

    @ManyToOne
    @JoinColumn(name = "tfid", referencedColumnName = "tfid")
    public Tfloor getTfloor() {
        return tfloor;
    }

    public void setTfloor(Tfloor tfloor) {
        this.tfloor = tfloor;
    }

    @OneToMany(mappedBy = "tunit")
    public List<Troom> getTrooms() {
        return trooms;
    }

    public void setTrooms(List<Troom> trooms) {
        this.trooms = trooms;
    }

    @OneToMany(mappedBy = "tunit")
    public List<Visit> getVisits() {
        return visits;
    }

    public void setVisits(List<Visit> visits) {
        this.visits = visits;
    }
}
