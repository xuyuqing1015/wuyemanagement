package wuye.xyq.pojo;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Zhiqin {
    private Integer zqid;
    private Timestamp zqtime;
    private String zqtype;
    private String zqtext;
    private Emp emp;
    private Tfloor tfloor;

    @Id
    @Column(name = "zqid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getZqid() {
        return zqid;
    }

    public void setZqid(Integer zqid) {
        this.zqid = zqid;
    }

    @Basic
    @Column(name = "zqtime")
    public Timestamp getZqtime() {
        return zqtime;
    }

    public void setZqtime(Timestamp zqtime) {
        this.zqtime = zqtime;
    }

    @Basic
    @Column(name = "zqtype")
    public String getZqtype() {
        return zqtype;
    }

    public void setZqtype(String zqtype) {
        this.zqtype = zqtype;
    }

    @Basic
    @Column(name = "zqtext")
    public String getZqtext() {
        return zqtext;
    }

    public void setZqtext(String zqtext) {
        this.zqtext = zqtext;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Zhiqin zhiqin = (Zhiqin) o;
        return zqid == zhiqin.zqid &&
                Objects.equals(zqtime, zhiqin.zqtime) &&
                Objects.equals(zqtype, zhiqin.zqtype) &&
                Objects.equals(zqtext, zhiqin.zqtext);
    }

    @Override
    public int hashCode() {
        return Objects.hash(zqid, zqtime, zqtype, zqtext);
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
    @JoinColumn(name = "tfid", referencedColumnName = "tfid")
    public Tfloor getTfloor() {
        return tfloor;
    }

    public void setTfloor(Tfloor tfloor) {
        this.tfloor = tfloor;
    }
}
