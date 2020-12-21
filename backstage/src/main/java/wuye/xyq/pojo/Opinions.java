package wuye.xyq.pojo;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Opinions {
    private Integer opid;
    private String opname;
    private String oprange;
    private String opremarks;
    private Emp emp;

    @Id
    @Column(name = "opid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getOpid() {
        return opid;
    }

    public void setOpid(Integer opid) {
        this.opid = opid;
    }

    @Basic
    @Column(name = "opname")
    public String getOpname() {
        return opname;
    }

    public void setOpname(String opname) {
        this.opname = opname;
    }

    @Basic
    @Column(name = "oprange")
    public String getOprange() {
        return oprange;
    }

    public void setOprange(String oprange) {
        this.oprange = oprange;
    }

    @Basic
    @Column(name = "opremarks")
    public String getOpremarks() {
        return opremarks;
    }

    public void setOpremarks(String opremarks) {
        this.opremarks = opremarks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Opinions opinions = (Opinions) o;
        return opid == opinions.opid &&
                Objects.equals(opname, opinions.opname) &&
                Objects.equals(oprange, opinions.oprange) &&
                Objects.equals(opremarks, opinions.opremarks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(opid, opname, oprange, opremarks);
    }

    @ManyToOne
    @JoinColumn(name = "empno", referencedColumnName = "empno")
    public Emp getEmp() {
        return emp;
    }

    public void setEmp(Emp emp) {
        this.emp = emp;
    }
}
