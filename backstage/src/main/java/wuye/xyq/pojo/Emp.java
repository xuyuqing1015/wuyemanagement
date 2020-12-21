package wuye.xyq.pojo;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;
import java.util.Objects;

@Entity
public class Emp {
    private Integer empno;
    private String empname;
    private Integer empsex;
    private String empphone;
    private Date empbirth;
    private String empwechat;
    private List<Approval> approvals;
    private List<Renovation> renovations;
    private Dept dept;
    private List<Carjc> carjcs;
    private List<CoFire> coFires;
    private List<CoPatrol> coPatrols;
    private List<Construction> construction;
    private List<Inspection> inspections;
    private List<Opinions> opinions;
    private List<Visit> visits;
    private List<Zhiqin> zhiqins;

    @Id
    @Column(name = "empno")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getEmpno() {
        return empno;
    }

    public void setEmpno(Integer empno) {
        this.empno = empno;
    }

    @Basic
    @Column(name = "empname")
    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    @Basic
    @Column(name = "empsex")
    public Integer getEmpsex() {
        return empsex;
    }

    public void setEmpsex(Integer empsex) {
        this.empsex = empsex;
    }

    @Basic
    @Column(name = "empphone")
    public String getEmpphone() {
        return empphone;
    }

    public void setEmpphone(String empphone) {
        this.empphone = empphone;
    }

    @Basic
    @Column(name = "empbirth")
    public Date getEmpbirth() {
        return empbirth;
    }

    public void setEmpbirth(Date empbirth) {
        this.empbirth = empbirth;
    }

    @Basic
    @Column(name = "empwechat")
    public String getEmpwechat() {
        return empwechat;
    }

    public void setEmpwechat(String empwechat) {
        this.empwechat = empwechat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emp emp = (Emp) o;
        return empno == emp.empno &&
                Objects.equals(empname, emp.empname) &&
                Objects.equals(empsex, emp.empsex) &&
                Objects.equals(empphone, emp.empphone) &&
                Objects.equals(empbirth, emp.empbirth) &&
                Objects.equals(empwechat, emp.empwechat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empno, empname, empsex, empphone, empbirth, empwechat);
    }

    @OneToMany(mappedBy = "emp")
    public List<Approval> getApprovals() {
        return approvals;
    }

    public void setApprovals(List<Approval> approvals) {
        this.approvals = approvals;
    }

    @OneToMany(mappedBy = "emp")
    public List<Renovation> getRenovations() {
        return renovations;
    }

    public void setRenovations(List<Renovation> renovations) {
        this.renovations = renovations;
    }

    @ManyToOne
    @JoinColumn(name = "deptno", referencedColumnName = "deptno")
    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @OneToMany(mappedBy = "emp")
    public List<Carjc> getCarjcs() {
        return carjcs;
    }

    public void setCarjcs(List<Carjc> carjcs) {
        this.carjcs = carjcs;
    }

    @OneToMany(mappedBy = "emp")
    public List<CoFire> getCoFires() {
        return coFires;
    }

    public void setCoFires(List<CoFire> coFires) {
        this.coFires = coFires;
    }

    @OneToMany
    public List<CoPatrol> getCoPatrols() {
        return coPatrols;
    }

    public void setCoPatrols(List<CoPatrol> coPatrols) {
        this.coPatrols = coPatrols;
    }

    @OneToMany(mappedBy = "emp")
    public List<Construction> getConstruction() {
        return construction;
    }

    public void setConstruction(List<Construction> construction) {
        this.construction = construction;
    }

    @OneToMany(mappedBy = "emp")
    public List<Inspection> getInspections() {
        return inspections;
    }

    public void setInspections(List<Inspection> inspections) {
        this.inspections = inspections;
    }

    @OneToMany(mappedBy = "emp")
    public List<Opinions> getOpinions() {
        return opinions;
    }

    public void setOpinions(List<Opinions> opinions) {
        this.opinions = opinions;
    }

    @OneToMany(mappedBy = "emp")
    public List<Visit> getVisits() {
        return visits;
    }

    public void setVisits(List<Visit> visits) {
        this.visits = visits;
    }

    @OneToMany(mappedBy = "emp")
    public List<Zhiqin> getZhiqins() {
        return zhiqins;
    }

    public void setZhiqins(List<Zhiqin> zhiqins) {
        this.zhiqins = zhiqins;
    }
}
