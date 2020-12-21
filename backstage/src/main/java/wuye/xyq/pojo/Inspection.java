package wuye.xyq.pojo;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
public class Inspection {
    private Integer inid;
    private Date inysdate;
    private Date inqrdate;
    private String inproject;
    private Integer instate;
    private String inopinion;
    private String inremarks;
    private Emp emp;
    private Troom troom;

    @Id
    @Column(name = "inid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getInid() {
        return inid;
    }

    public void setInid(Integer inid) {
        this.inid = inid;
    }

    @Basic
    @Column(name = "inysdate")
    public Date getInysdate() {
        return inysdate;
    }

    public void setInysdate(Date inysdate) {
        this.inysdate = inysdate;
    }

    @Basic
    @Column(name = "inqrdate")
    public Date getInqrdate() {
        return inqrdate;
    }

    public void setInqrdate(Date inqrdate) {
        this.inqrdate = inqrdate;
    }

    @Basic
    @Column(name = "inproject")
    public String getInproject() {
        return inproject;
    }

    public void setInproject(String inproject) {
        this.inproject = inproject;
    }

    @Basic
    @Column(name = "instate")
    public Integer getInstate() {
        return instate;
    }

    public void setInstate(Integer instate) {
        this.instate = instate;
    }

    @Basic
    @Column(name = "inopinion")
    public String getInopinion() {
        return inopinion;
    }

    public void setInopinion(String inopinion) {
        this.inopinion = inopinion;
    }

    @Basic
    @Column(name = "inremarks")
    public String getInremarks() {
        return inremarks;
    }

    public void setInremarks(String inremarks) {
        this.inremarks = inremarks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Inspection that = (Inspection) o;
        return inid == that.inid &&
                Objects.equals(inysdate, that.inysdate) &&
                Objects.equals(inqrdate, that.inqrdate) &&
                Objects.equals(inproject, that.inproject) &&
                Objects.equals(instate, that.instate) &&
                Objects.equals(inopinion, that.inopinion) &&
                Objects.equals(inremarks, that.inremarks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inid, inysdate, inqrdate, inproject, instate, inopinion, inremarks);
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
    @JoinColumn(name = "rid", referencedColumnName = "rid")
    public Troom getTroom() {
        return troom;
    }

    public void setTroom(Troom troom) {
        this.troom = troom;
    }
}
