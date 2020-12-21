package wuye.xyq.pojo;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Dept {
    private Integer deptno;
    private String deptname;
    private List<Emp> emps;

    @Id
    @Column(name = "deptno")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    @Basic
    @Column(name = "deptname")
    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dept dept = (Dept) o;
        return deptno == dept.deptno &&
                Objects.equals(deptname, dept.deptname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deptno, deptname);
    }

    @OneToMany(mappedBy = "dept")
    public List<Emp> getEmps() {
        return emps;
    }

    public void setEmps(List<Emp> emps) {
        this.emps = emps;
    }
}
