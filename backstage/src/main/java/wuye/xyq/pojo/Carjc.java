package wuye.xyq.pojo;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Carjc {
    private Integer jcid;
    private Integer owid;
    private Timestamp jcjin;
    private Timestamp jcchu;
    private String jccarno;
    private Tfloor tfloor;
    private Emp emp;

    @Id
    @Column(name = "jcid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getJcid() {
        return jcid;
    }

    public void setJcid(int jcid) {
        this.jcid = jcid;
    }

    @Basic
    @Column(name = "owid")
    public Integer getOwid() {
        return owid;
    }

    public void setOwid(Integer owid) {
        this.owid = owid;
    }

    @Basic
    @Column(name = "jcjin")
    public Timestamp getJcjin() {
        return jcjin;
    }

    public void setJcjin(Timestamp jcjin) {
        this.jcjin = jcjin;
    }

    @Basic
    @Column(name = "jcchu")
    public Timestamp getJcchu() {
        return jcchu;
    }

    public void setJcchu(Timestamp jcchu) {
        this.jcchu = jcchu;
    }

    @Basic
    @Column(name = "jccarno")
    public String getJccarno() {
        return jccarno;
    }

    public void setJccarno(String jccarno) {
        this.jccarno = jccarno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carjc carjc = (Carjc) o;
        return jcid == carjc.jcid &&
                Objects.equals(owid, carjc.owid) &&
                Objects.equals(jcjin, carjc.jcjin) &&
                Objects.equals(jcchu, carjc.jcchu) &&
                Objects.equals(jccarno, carjc.jccarno);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jcid, owid, jcjin, jcchu, jccarno);
    }

    @ManyToOne
    @JoinColumn(name = "tfid", referencedColumnName = "tfid")
    public Tfloor getTfloor() {
        return tfloor;
    }

    public void setTfloor(Tfloor tfloor) {
        this.tfloor = tfloor;
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
