package wuye.xyq.pojo;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "co_patrol", schema = "wuye05", catalog = "")
public class CoPatrol {
    private Integer paId;
    private Timestamp paTime;
    private String paPath;
    private String paCondition;
    private String paIdea;
    private String paRemarks;
    private String paState;

    @Id
    @Column(name = "pa_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getPaId() {
        return paId;
    }

    public void setPaId(Integer paId) {
        this.paId = paId;
    }

    @Basic
    @Column(name = "pa_time")
    public Timestamp getPaTime() {
        return paTime;
    }

    public void setPaTime(Timestamp paTime) {
        this.paTime = paTime;
    }

    @Basic
    @Column(name = "pa_path")
    public String getPaPath() {
        return paPath;
    }

    public void setPaPath(String paPath) {
        this.paPath = paPath;
    }

    @Basic
    @Column(name = "pa_condition")
    public String getPaCondition() {
        return paCondition;
    }

    public void setPaCondition(String paCondition) {
        this.paCondition = paCondition;
    }

    @Basic
    @Column(name = "pa_idea")
    public String getPaIdea() {
        return paIdea;
    }

    public void setPaIdea(String paIdea) {
        this.paIdea = paIdea;
    }

    @Basic
    @Column(name = "pa_remarks")
    public String getPaRemarks() {
        return paRemarks;
    }

    public void setPaRemarks(String paRemarks) {
        this.paRemarks = paRemarks;
    }

    @Basic
    @Column(name = "pa_state")
    public String getPaState() {
        return paState;
    }

    public void setPaState(String paState) {
        this.paState = paState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CoPatrol coPatrol = (CoPatrol) o;
        return paId == coPatrol.paId &&
                Objects.equals(paTime, coPatrol.paTime) &&
                Objects.equals(paPath, coPatrol.paPath) &&
                Objects.equals(paCondition, coPatrol.paCondition) &&
                Objects.equals(paIdea, coPatrol.paIdea) &&
                Objects.equals(paRemarks, coPatrol.paRemarks) &&
                Objects.equals(paState, coPatrol.paState);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paId, paTime, paPath, paCondition, paIdea, paRemarks, paState);
    }
}
