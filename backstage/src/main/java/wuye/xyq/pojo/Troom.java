package wuye.xyq.pojo;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Troom {
    private Integer rid;
    private String rbh;
    private String rname;
    private String rnorms;
    private Integer rtype;
    private List<Renovation> renovations;
    private List<Houses> houses;
    private List<Inspection> inspections;
    private Tunit tunit;

    @Id
    @Column(name = "rid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    @Basic
    @Column(name = "rbh")
    public String getRbh() {
        return rbh;
    }

    public void setRbh(String rbh) {
        this.rbh = rbh;
    }

    @Basic
    @Column(name = "rname")
    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    @Basic
    @Column(name = "rnorms")
    public String getRnorms() {
        return rnorms;
    }

    public void setRnorms(String rnorms) {
        this.rnorms = rnorms;
    }

    @Basic
    @Column(name = "rtype")
    public Integer getRtype() {
        return rtype;
    }

    public void setRtype(Integer rtype) {
        this.rtype = rtype;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Troom troom = (Troom) o;
        return rid == troom.rid &&
                Objects.equals(rbh, troom.rbh) &&
                Objects.equals(rname, troom.rname) &&
                Objects.equals(rnorms, troom.rnorms) &&
                Objects.equals(rtype, troom.rtype);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rid, rbh, rname, rnorms, rtype);
    }

    @OneToMany(mappedBy = "troom")
    public List<Renovation> getRenovations() {
        return renovations;
    }

    public void setRenovations(List<Renovation> renovations) {
        this.renovations = renovations;
    }

    @OneToMany(mappedBy = "troom")
    public List<Houses> getHouses() {
        return houses;
    }

    public void setHouses(List<Houses> houses) {
        this.houses = houses;
    }

    @OneToMany(mappedBy = "troom")
    public List<Inspection> getInspections() {
        return inspections;
    }

    public void setInspections(List<Inspection> inspections) {
        this.inspections = inspections;
    }

    @ManyToOne
    @JoinColumn(name = "tuid", referencedColumnName = "tuid")
    public Tunit getTunit() {
        return tunit;
    }

    public void setTunit(Tunit tunit) {
        this.tunit = tunit;
    }
}
