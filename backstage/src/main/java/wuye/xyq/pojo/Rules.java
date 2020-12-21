package wuye.xyq.pojo;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Rules {
    private Integer ruid;
    private String rutitle;
    private String rucontent;
    private Integer ruclassify;
    private Integer rustate;
    private Timestamp ruestablishtime;
    private String rukeyword;

    @Id
    @Column(name = "ruid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getRuid() {
        return ruid;
    }

    public void setRuid(Integer ruid) {
        this.ruid = ruid;
    }

    @Basic
    @Column(name = "rutitle")
    public String getRutitle() {
        return rutitle;
    }

    public void setRutitle(String rutitle) {
        this.rutitle = rutitle;
    }

    @Basic
    @Column(name = "rucontent")
    public String getRucontent() {
        return rucontent;
    }

    public void setRucontent(String rucontent) {
        this.rucontent = rucontent;
    }

    @Basic
    @Column(name = "ruclassify")
    public Integer getRuclassify() {
        return ruclassify;
    }

    public void setRuclassify(Integer ruclassify) {
        this.ruclassify = ruclassify;
    }

    @Basic
    @Column(name = "rustate")
    public Integer getRustate() {
        return rustate;
    }

    public void setRustate(Integer rustate) {
        this.rustate = rustate;
    }

    @Basic
    @Column(name = "ruestablishtime")
    public Timestamp getRuestablishtime() {
        return ruestablishtime;
    }

    public void setRuestablishtime(Timestamp ruestablishtime) {
        this.ruestablishtime = ruestablishtime;
    }

    @Basic
    @Column(name = "rukeyword")
    public String getRukeyword() {
        return rukeyword;
    }

    public void setRukeyword(String rukeyword) {
        this.rukeyword = rukeyword;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rules rules = (Rules) o;
        return ruid == rules.ruid &&
                Objects.equals(rutitle, rules.rutitle) &&
                Objects.equals(rucontent, rules.rucontent) &&
                Objects.equals(ruclassify, rules.ruclassify) &&
                Objects.equals(rustate, rules.rustate) &&
                Objects.equals(ruestablishtime, rules.ruestablishtime) &&
                Objects.equals(rukeyword, rules.rukeyword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ruid, rutitle, rucontent, ruclassify, rustate, ruestablishtime, rukeyword);
    }
}
