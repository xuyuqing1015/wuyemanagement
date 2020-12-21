package wuye.xyq.pojo;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Notice {
    private Integer noid;
    private String notitle;
    private Integer noclassify;
    private Timestamp nobegintime;
    private Timestamp noendtime;
    private Integer nostate;
    private Timestamp noinputtime;
    private String nocontent;



    @Id
    @Column(name = "noid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getNoid() {
        return noid;
    }

    public void setNoid(Integer noid) {
        this.noid = noid;
    }

    @Basic
    @Column(name = "notitle")
    public String getNotitle() {
        return notitle;
    }

    public void setNotitle(String notitle) {
        this.notitle = notitle;
    }

    @Basic
    @Column(name = "noclassify")
    public Integer getNoclassify() {
        return noclassify;
    }

    public void setNoclassify(Integer noclassify) {
        this.noclassify = noclassify;
    }

    @Basic
    @Column(name = "nobegintime")
    public Timestamp getNobegintime() {
        return nobegintime;
    }

    public void setNobegintime(Timestamp nobegintime) {
        this.nobegintime = nobegintime;
    }

    @Basic
    @Column(name = "noendtime")
    public Timestamp getNoendtime() {
        return noendtime;
    }

    public void setNoendtime(Timestamp noendtime) {
        this.noendtime = noendtime;
    }

    @Basic
    @Column(name = "nostate")
    public Integer getNostate() {
        return nostate;
    }

    public void setNostate(Integer nostate) {
        this.nostate = nostate;
    }

    @Basic
    @Column(name = "noinputtime")
    public Timestamp getNoinputtime() {
        return noinputtime;
    }

    public void setNoinputtime(Timestamp noinputtime) {
        this.noinputtime = noinputtime;
    }

    @Basic
    @Column(name = "nocontent")
    public String getNocontent() {
        return nocontent;
    }

    public void setNocontent(String nocontent) {
        this.nocontent = nocontent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notice notice = (Notice) o;
        return noid == notice.noid &&
                Objects.equals(notitle, notice.notitle) &&
                Objects.equals(noclassify, notice.noclassify) &&
                Objects.equals(nobegintime, notice.nobegintime) &&
                Objects.equals(noendtime, notice.noendtime) &&
                Objects.equals(nostate, notice.nostate) &&
                Objects.equals(noinputtime, notice.noinputtime) &&
                Objects.equals(nocontent,notice.nocontent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(noid, notitle, noclassify, nobegintime, noendtime, nostate, noinputtime,nocontent);
    }
}
