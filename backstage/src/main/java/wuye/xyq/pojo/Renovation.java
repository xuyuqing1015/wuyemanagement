package wuye.xyq.pojo;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;
import java.util.Objects;

@Entity
public class Renovation {
    private Integer reid;
    private String rephone;
    private Date redate;
    private Integer restate;
    private BigDecimal remoney;
    private Date recjdate;
    private String reidentification;
    private String recontent;
    private String reoride;
    private List<Approval> approvals;
    private Emp emp;
    private Troom troom;
    private List<Construction> contructions;

    @Id
    @Column(name = "reid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getReid() {
        return reid;
    }

    public void setReid(Integer reid) {
        this.reid = reid;
    }

    @Basic
    @Column(name = "rephone")
    public String getRephone() {
        return rephone;
    }

    public void setRephone(String rephone) {
        this.rephone = rephone;
    }

    @Basic
    @Column(name = "redate")
    public Date getRedate() {
        return redate;
    }

    public void setRedate(Date redate) {
        this.redate = redate;
    }

    @Basic
    @Column(name = "restate")
    public Integer getRestate() {
        return restate;
    }

    public void setRestate(Integer restate) {
        this.restate = restate;
    }

    @Basic
    @Column(name = "remoney")
    public BigDecimal getRemoney() {
        return remoney;
    }

    public void setRemoney(BigDecimal remoney) {
        this.remoney = remoney;
    }

    @Basic
    @Column(name = "recjdate")
    public Date getRecjdate() {
        return recjdate;
    }

    public void setRecjdate(Date recjdate) {
        this.recjdate = recjdate;
    }

    @Basic
    @Column(name = "reidentification")
    public String getReidentification() {
        return reidentification;
    }

    public void setReidentification(String reidentification) {
        this.reidentification = reidentification;
    }

    @Basic
    @Column(name = "recontent")
    public String getRecontent() {
        return recontent;
    }

    public void setRecontent(String recontent) {
        this.recontent = recontent;
    }

    @Basic
    @Column(name = "reoride")
    public String getReoride() {
        return reoride;
    }

    public void setReoride(String reoride) {
        this.reoride = reoride;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Renovation that = (Renovation) o;
        return reid == that.reid &&
                Objects.equals(rephone, that.rephone) &&
                Objects.equals(redate, that.redate) &&
                Objects.equals(restate, that.restate) &&
                Objects.equals(remoney, that.remoney) &&
                Objects.equals(recjdate, that.recjdate) &&
                Objects.equals(reidentification, that.reidentification) &&
                Objects.equals(recontent, that.recontent) &&
                Objects.equals(reoride, that.reoride);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reid, rephone, redate, restate, remoney, recjdate, reidentification, recontent, reoride);
    }

    @OneToMany(mappedBy = "renovation")
    public List<Approval> getApprovals() {
        return approvals;
    }

    public void setApprovals(List<Approval> approvals) {
        this.approvals = approvals;
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

    @OneToMany(mappedBy = "renovation")
    public List<Construction> getContructions() {
        return contructions;
    }

    public void setContructions(List<Construction> contructions) {
        this.contructions = contructions;
    }
}
