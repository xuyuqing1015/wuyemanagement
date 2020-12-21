package wuye.xyq.pojo;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
public class Cgrk {
    private int cgrkid;
    private Integer cwtype;
    private Integer gitype;
    private Integer carlei;
    private String cweizhi;
    private BigDecimal cmianji;
    private Tfloor tfloor;

    @Id
    @Column(name = "cgrkid")
    public int getCgrkid() {
        return cgrkid;
    }

    public void setCgrkid(int cgrkid) {
        this.cgrkid = cgrkid;
    }

    @Basic
    @Column(name = "cwtype")
    public Integer getCwtype() {
        return cwtype;
    }

    public void setCwtype(Integer cwtype) {
        this.cwtype = cwtype;
    }

    @Basic
    @Column(name = "gitype")
    public Integer getGitype() {
        return gitype;
    }

    public void setGitype(Integer gitype) {
        this.gitype = gitype;
    }

    @Basic
    @Column(name = "carlei")
    public Integer getCarlei() {
        return carlei;
    }

    public void setCarlei(Integer carlei) {
        this.carlei = carlei;
    }

    @Basic
    @Column(name = "cweizhi")
    public String getCweizhi() {
        return cweizhi;
    }

    public void setCweizhi(String cweizhi) {
        this.cweizhi = cweizhi;
    }

    @Basic
    @Column(name = "cmianji")
    public BigDecimal getCmianji() {
        return cmianji;
    }

    public void setCmianji(BigDecimal cmianji) {
        this.cmianji = cmianji;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cgrk cgrk = (Cgrk) o;
        return cgrkid == cgrk.cgrkid &&
                Objects.equals(cwtype, cgrk.cwtype) &&
                Objects.equals(gitype, cgrk.gitype) &&
                Objects.equals(carlei, cgrk.carlei) &&
                Objects.equals(cweizhi, cgrk.cweizhi) &&
                Objects.equals(cmianji, cgrk.cmianji);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cgrkid, cwtype, gitype, carlei, cweizhi, cmianji);
    }

    @ManyToOne
    @JoinColumn(name = "tfid", referencedColumnName = "tfid")
    public Tfloor getTfloor() {
        return tfloor;
    }

    public void setTfloor(Tfloor tfloor) {
        this.tfloor = tfloor;
    }
}
