package wuye.xyq.pojo;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "co_fire", schema = "wuye05", catalog = "")
public class CoFire {
    private Integer frId;
    private String frName;
    private String frModel;
    private String frUnit;
    private Integer frQucntity;
    private String frPath;
    private Timestamp frStar;
    private String frRemarks;
    private String frState;
    private Tfloor tfloor;
    private Emp emp;

    @Id
    @Column(name = "fr_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getFrId() {
        return frId;
    }

    public void setFrId(Integer frId) {
        this.frId = frId;
    }

    @Basic
    @Column(name = "fr_name")
    public String getFrName() {
        return frName;
    }

    public void setFrName(String frName) {
        this.frName = frName;
    }

    @Basic
    @Column(name = "fr_model")
    public String getFrModel() {
        return frModel;
    }

    public void setFrModel(String frModel) {
        this.frModel = frModel;
    }

    @Basic
    @Column(name = "fr_unit")
    public String getFrUnit() {
        return frUnit;
    }

    public void setFrUnit(String frUnit) {
        this.frUnit = frUnit;
    }

    @Basic
    @Column(name = "fr_qucntity")
    public Integer getFrQucntity() {
        return frQucntity;
    }

    public void setFrQucntity(Integer frQucntity) {
        this.frQucntity = frQucntity;
    }

    @Basic
    @Column(name = "fr_path")
    public String getFrPath() {
        return frPath;
    }

    public void setFrPath(String frPath) {
        this.frPath = frPath;
    }

    @Basic
    @Column(name = "fr_star")
    public Timestamp getFrStar() {
        return frStar;
    }

    public void setFrStar(Timestamp frStar) {
        this.frStar = frStar;
    }

    @Basic
    @Column(name = "fr_remarks")
    public String getFrRemarks() {
        return frRemarks;
    }

    public void setFrRemarks(String frRemarks) {
        this.frRemarks = frRemarks;
    }

    @Basic
    @Column(name = "fr_state")
    public String getFrState() {
        return frState;
    }

    public void setFrState(String frState) {
        this.frState = frState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CoFire coFire = (CoFire) o;
        return frId == coFire.frId &&
                Objects.equals(frName, coFire.frName) &&
                Objects.equals(frModel, coFire.frModel) &&
                Objects.equals(frUnit, coFire.frUnit) &&
                Objects.equals(frQucntity, coFire.frQucntity) &&
                Objects.equals(frPath, coFire.frPath) &&
                Objects.equals(frStar, coFire.frStar) &&
                Objects.equals(frRemarks, coFire.frRemarks) &&
                Objects.equals(frState, coFire.frState);
    }

    @Override
    public int hashCode() {
        return Objects.hash(frId, frName, frModel, frUnit, frQucntity, frPath, frStar, frRemarks, frState);
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
