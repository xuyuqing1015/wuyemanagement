package wuye.xyq.pojo;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "co_drill", schema = "wuye05", catalog = "")
public class CoDrill {
    private Integer drId;
    private Timestamp drStar;
    private Timestamp drEnd;
    private String drDept;
    private Integer drAmount;
    private String drAim;
    private String drAssist;
    private String drContent;
    private String drEffect;
    private String drRemarks;
    private String drState;
    private Tfloor tfloor;

    @Id
    @Column(name = "dr_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getDrId() {
        return drId;
    }

    public void setDrId(Integer drId) {
        this.drId = drId;
    }

    @Basic
    @Column(name = "dr_star")
    public Timestamp getDrStar() {
        return drStar;
    }

    public void setDrStar(Timestamp drStar) {
        this.drStar = drStar;
    }

    @Basic
    @Column(name = "dr_end")
    public Timestamp getDrEnd() {
        return drEnd;
    }

    public void setDrEnd(Timestamp drEnd) {
        this.drEnd = drEnd;
    }

    @Basic
    @Column(name = "dr_dept")
    public String getDrDept() {
        return drDept;
    }

    public void setDrDept(String drDept) {
        this.drDept = drDept;
    }

    @Basic
    @Column(name = "dr_amount")
    public Integer getDrAmount() {
        return drAmount;
    }

    public void setDrAmount(Integer drAmount) {
        this.drAmount = drAmount;
    }

    @Basic
    @Column(name = "dr_aim")
    public String getDrAim() {
        return drAim;
    }

    public void setDrAim(String drAim) {
        this.drAim = drAim;
    }

    @Basic
    @Column(name = "dr_assist")
    public String getDrAssist() {
        return drAssist;
    }

    public void setDrAssist(String drAssist) {
        this.drAssist = drAssist;
    }

    @Basic
    @Column(name = "dr_content")
    public String getDrContent() {
        return drContent;
    }

    public void setDrContent(String drContent) {
        this.drContent = drContent;
    }

    @Basic
    @Column(name = "dr_effect")
    public String getDrEffect() {
        return drEffect;
    }

    public void setDrEffect(String drEffect) {
        this.drEffect = drEffect;
    }

    @Basic
    @Column(name = "dr_remarks")
    public String getDrRemarks() {
        return drRemarks;
    }

    public void setDrRemarks(String drRemarks) {
        this.drRemarks = drRemarks;
    }

    @Basic
    @Column(name = "dr_state")
    public String getDrState() {
        return drState;
    }

    public void setDrState(String drState) {
        this.drState = drState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CoDrill coDrill = (CoDrill) o;
        return drId == coDrill.drId &&
                Objects.equals(drStar, coDrill.drStar) &&
                Objects.equals(drEnd, coDrill.drEnd) &&
                Objects.equals(drDept, coDrill.drDept) &&
                Objects.equals(drAmount, coDrill.drAmount) &&
                Objects.equals(drAim, coDrill.drAim) &&
                Objects.equals(drAssist, coDrill.drAssist) &&
                Objects.equals(drContent, coDrill.drContent) &&
                Objects.equals(drEffect, coDrill.drEffect) &&
                Objects.equals(drRemarks, coDrill.drRemarks) &&
                Objects.equals(drState, coDrill.drState);
    }

    @Override
    public int hashCode() {
        return Objects.hash(drId, drStar, drEnd, drDept, drAmount, drAim, drAssist, drContent, drEffect, drRemarks, drState);
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
