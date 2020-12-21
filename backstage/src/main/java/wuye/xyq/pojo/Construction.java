package wuye.xyq.pojo;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
public class Construction {
    private Integer conid;
    private String concompany;
    private String confzr;
    private String confzrphone;
    private Date conksdate;
    private Date conjsdate;
    private Date conysdate;
    private String conopinion;
    private String conremarks;
    private Emp emp;
    private Renovation renovation;

    @Id
    @Column(name = "conid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getConid() {
        return conid;
    }

    public void setConid(Integer conid) {
        this.conid = conid;
    }

    @Basic
    @Column(name = "concompany")
    public String getConcompany() {
        return concompany;
    }

    public void setConcompany(String concompany) {
        this.concompany = concompany;
    }

    @Basic
    @Column(name = "confzr")
    public String getConfzr() {
        return confzr;
    }

    public void setConfzr(String confzr) {
        this.confzr = confzr;
    }

    @Basic
    @Column(name = "confzrphone")
    public String getConfzrphone() {
        return confzrphone;
    }

    public void setConfzrphone(String confzrphone) {
        this.confzrphone = confzrphone;
    }

    @Basic
    @Column(name = "conksdate")
    public Date getConksdate() {
        return conksdate;
    }

    public void setConksdate(Date conksdate) {
        this.conksdate = conksdate;
    }

    @Basic
    @Column(name = "conjsdate")
    public Date getConjsdate() {
        return conjsdate;
    }

    public void setConjsdate(Date conjsdate) {
        this.conjsdate = conjsdate;
    }

    @Basic
    @Column(name = "conysdate")
    public Date getConysdate() {
        return conysdate;
    }

    public void setConysdate(Date conysdate) {
        this.conysdate = conysdate;
    }

    @Basic
    @Column(name = "conopinion")
    public String getConopinion() {
        return conopinion;
    }

    public void setConopinion(String conopinion) {
        this.conopinion = conopinion;
    }

    @Basic
    @Column(name = "conremarks")
    public String getConremarks() {
        return conremarks;
    }

    public void setConremarks(String conremarks) {
        this.conremarks = conremarks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Construction that = (Construction) o;
        return conid == that.conid &&
                Objects.equals(concompany, that.concompany) &&
                Objects.equals(confzr, that.confzr) &&
                Objects.equals(confzrphone, that.confzrphone) &&
                Objects.equals(conksdate, that.conksdate) &&
                Objects.equals(conjsdate, that.conjsdate) &&
                Objects.equals(conysdate, that.conysdate) &&
                Objects.equals(conopinion, that.conopinion) &&
                Objects.equals(conremarks, that.conremarks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(conid, concompany, confzr, confzrphone, conksdate, conjsdate, conysdate, conopinion, conremarks);
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
