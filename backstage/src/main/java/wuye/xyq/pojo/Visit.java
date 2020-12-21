package wuye.xyq.pojo;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Visit {
    private Integer vid;
    private String vname;
    private Timestamp vtime;
    private Timestamp vtimego;
    private String vthing;
    private Emp emp;
    private Owners owners;
    private Tunit tunit;

    @Id
    @Column(name = "vid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }

    @Basic
    @Column(name = "vname")
    public String getVname() {
        return vname;
    }

    public void setVname(String vname) {
        this.vname = vname;
    }

    @Basic
    @Column(name = "vtime")
    public Timestamp getVtime() {
        return vtime;
    }

    public void setVtime(Timestamp vtime) {
        this.vtime = vtime;
    }

    @Basic
    @Column(name = "vtimego")
    public Timestamp getVtimego() {
        return vtimego;
    }

    public void setVtimego(Timestamp vtimego) {
        this.vtimego = vtimego;
    }

    @Basic
    @Column(name = "vthing")
    public String getVthing() {
        return vthing;
    }

    public void setVthing(String vthing) {
        this.vthing = vthing;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Visit visit = (Visit) o;
        return vid == visit.vid &&
                Objects.equals(vname, visit.vname) &&
                Objects.equals(vtime, visit.vtime) &&
                Objects.equals(vtimego, visit.vtimego) &&
                Objects.equals(vthing, visit.vthing);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vid, vname, vtime, vtimego, vthing);
    }

    @ManyToOne
    @JoinColumn(name = "empno", referencedColumnName = "empno")
    public Emp getEmp() {
        return emp;
    }

    public void setEmp(Emp emp) {
        this.emp = emp;
    }

    @ManyToOne
    @JoinColumn(name = "owid", referencedColumnName = "owid")
    public Owners getOwners() {
        return owners;
    }

    public void setOwners(Owners owners) {
        this.owners = owners;
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
