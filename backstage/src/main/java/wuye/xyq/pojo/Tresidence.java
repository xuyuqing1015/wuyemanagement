package wuye.xyq.pojo;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Tresidence {
    private Integer trid;
    private String trbh;
    private String trname;
    private String traddress;
    private Integer trstate;
    private List<Tfloor> tfloors;

    @Id
    @Column(name = "trid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getTrid() {
        return trid;
    }

    public void setTrid(Integer trid) {
        this.trid = trid;
    }

    @Basic
    @Column(name = "trbh")
    public String getTrbh() {
        return trbh;
    }

    public void setTrbh(String trbh) {
        this.trbh = trbh;
    }

    @Basic
    @Column(name = "trname")
    public String getTrname() {
        return trname;
    }

    public void setTrname(String trname) {
        this.trname = trname;
    }

    @Basic
    @Column(name = "traddress")
    public String getTraddress() {
        return traddress;
    }

    public void setTraddress(String traddress) {
        this.traddress = traddress;
    }

    @Basic
    @Column(name = "trstate")
    public Integer getTrstate() {
        return trstate;
    }

    public void setTrstate(Integer trstate) {
        this.trstate = trstate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tresidence that = (Tresidence) o;
        return trid == that.trid &&
                Objects.equals(trbh, that.trbh) &&
                Objects.equals(trname, that.trname) &&
                Objects.equals(traddress, that.traddress) &&
                Objects.equals(trstate, that.trstate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trid, trbh, trname, traddress, trstate);
    }

    @OneToMany(mappedBy = "tresidence")
    public List<Tfloor> getTfloors() {
        return tfloors;
    }

    public void setTfloors(List<Tfloor> tfloors) {
        this.tfloors = tfloors;
    }
}
