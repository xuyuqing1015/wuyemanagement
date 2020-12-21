package wuye.xyq.pojo;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "co_accident", schema = "wuye05", catalog = "")
public class CoAccident {
    private Integer acId;
    private Date acDate;
    private String acPath;
    private String acReason;
    private String acPeople;
    private String acResule;
    private String acLoss;
    private String acRemarks;
    private String acState;
    private Tfloor tfloor;

    @Id
    @Column(name = "ac_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getAcId() {
        return acId;
    }

    public void setAcId(Integer acId) {
        this.acId = acId;
    }

    @Basic
    @Column(name = "ac_date")
    public Date getAcDate() {
        return acDate;
    }

    public void setAcDate(Date acDate) {
        this.acDate = acDate;
    }

    @Basic
    @Column(name = "ac_path")
    public String getAcPath() {
        return acPath;
    }

    public void setAcPath(String acPath) {
        this.acPath = acPath;
    }

    @Basic
    @Column(name = "ac_reason")
    public String getAcReason() {
        return acReason;
    }

    public void setAcReason(String acReason) {
        this.acReason = acReason;
    }

    @Basic
    @Column(name = "ac_people")
    public String getAcPeople() {
        return acPeople;
    }

    public void setAcPeople(String acPeople) {
        this.acPeople = acPeople;
    }

    @Basic
    @Column(name = "ac_resule")
    public String getAcResule() {
        return acResule;
    }

    public void setAcResule(String acResule) {
        this.acResule = acResule;
    }

    @Basic
    @Column(name = "ac_loss")
    public String getAcLoss() {
        return acLoss;
    }

    public void setAcLoss(String acLoss) {
        this.acLoss = acLoss;
    }

    @Basic
    @Column(name = "ac_remarks")
    public String getAcRemarks() {
        return acRemarks;
    }

    public void setAcRemarks(String acRemarks) {
        this.acRemarks = acRemarks;
    }

    @Basic
    @Column(name = "ac_state")
    public String getAcState() {
        return acState;
    }

    public void setAcState(String acState) {
        this.acState = acState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CoAccident that = (CoAccident) o;
        return acId == that.acId &&
                Objects.equals(acDate, that.acDate) &&
                Objects.equals(acPath, that.acPath) &&
                Objects.equals(acReason, that.acReason) &&
                Objects.equals(acPeople, that.acPeople) &&
                Objects.equals(acResule, that.acResule) &&
                Objects.equals(acLoss, that.acLoss) &&
                Objects.equals(acRemarks, that.acRemarks) &&
                Objects.equals(acState, that.acState);
    }

    @Override
    public int hashCode() {
        return Objects.hash(acId, acDate, acPath, acReason, acPeople, acResule, acLoss, acRemarks, acState);
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
