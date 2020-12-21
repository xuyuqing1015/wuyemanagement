package wuye.xyq.pojo;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.Objects;

@Entity
public class Approval {
    private Integer apid;
    private String apopinion;
    private BigDecimal apmoney;
    private Date apdate;
    private Emp emp;
    private Renovation renovation;

    @Id
    @Column(name = "apid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getApid() {
        return apid;
    }

    public void setApid(Integer apid) {
        this.apid = apid;
    }

    @Basic
    @Column(name = "apopinion")
    public String getApopinion() {
        return apopinion;
    }

    public void setApopinion(String apopinion) {
        this.apopinion = apopinion;
    }

    @Basic
    @Column(name = "apmoney")
    public BigDecimal getApmoney() {
        return apmoney;
    }

    public void setApmoney(BigDecimal apmoney) {
        this.apmoney = apmoney;
    }

    @Basic
    @Column(name = "apdate")
    public Date getApdate() {
        return apdate;
    }

    public void setApdate(Date apdate) {
        this.apdate = apdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Approval approval = (Approval) o;
        return apid == approval.apid &&
                Objects.equals(apopinion, approval.apopinion) &&
                Objects.equals(apmoney, approval.apmoney) &&
                Objects.equals(apdate, approval.apdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apid, apopinion, apmoney, apdate);
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
    @JoinColumn(name = "reid", referencedColumnName = "reid")
    public Renovation getRenovation() {
        return renovation;
    }

    public void setRenovation(Renovation renovation) {
        this.renovation = renovation;
    }
}
