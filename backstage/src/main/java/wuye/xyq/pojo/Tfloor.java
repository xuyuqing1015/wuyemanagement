package wuye.xyq.pojo;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Tfloor {
    private Integer tfid;
    private String tfbh;
    private String tfname;
    private Integer tfstate;
    private List<Carjc> carjcs;
    private List<Cgrk> cgrks;
    private List<CoAccident> coAccidents;
    private List<CoDrill> coDrills;
    private List<CoFire> coFires;
    private List<CoPatrol> coPatrols;
    private Tresidence tresidence;
    private List<Tunit> tunits;
    private List<Zhiqin> zhiqins;

    @Id
    @Column(name = "tfid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getTfid() {
        return tfid;
    }

    public void setTfid(Integer tfid) {
        this.tfid = tfid;
    }

    @Basic
    @Column(name = "tfbh")
    public String getTfbh() {
        return tfbh;
    }

    public void setTfbh(String tfbh) {
        this.tfbh = tfbh;
    }

    @Basic
    @Column(name = "tfname")
    public String getTfname() {
        return tfname;
    }

    public void setTfname(String tfname) {
        this.tfname = tfname;
    }

    @Basic
    @Column(name = "tfstate")
    public Integer getTfstate() {
        return tfstate;
    }

    public void setTfstate(Integer tfstate) {
        this.tfstate = tfstate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tfloor tfloor = (Tfloor) o;
        return tfid == tfloor.tfid &&
                Objects.equals(tfbh, tfloor.tfbh) &&
                Objects.equals(tfname, tfloor.tfname) &&
                Objects.equals(tfstate, tfloor.tfstate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tfid, tfbh, tfname, tfstate);
    }

    @OneToMany(mappedBy = "tfloor")
    public List<Carjc> getCarjcs() {
        return carjcs;
    }

    public void setCarjcs(List<Carjc> carjcs) {
        this.carjcs = carjcs;
    }

    @OneToMany(mappedBy = "tfloor")
    public List<Cgrk> getCgrks() {
        return cgrks;
    }

    public void setCgrks(List<Cgrk> cgrks) {
        this.cgrks = cgrks;
    }

    @OneToMany(mappedBy = "tfloor")
    public List<CoAccident> getCoAccidents() {
        return coAccidents;
    }

    public void setCoAccidents(List<CoAccident> coAccidents) {
        this.coAccidents = coAccidents;
    }

    @OneToMany(mappedBy = "tfloor")
    public List<CoDrill> getCoDrills() {
        return coDrills;
    }

    public void setCoDrills(List<CoDrill> coDrills) {
        this.coDrills = coDrills;
    }

    @OneToMany(mappedBy = "tfloor")
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

    @ManyToOne
    @JoinColumn(name = "trid", referencedColumnName = "trid")
    public Tresidence getTresidence() {
        return tresidence;
    }

    public void setTresidence(Tresidence tresidence) {
        this.tresidence = tresidence;
    }

    @OneToMany(mappedBy = "tfloor")
    public List<Tunit> getTunits() {
        return tunits;
    }

    public void setTunits(List<Tunit> tunits) {
        this.tunits = tunits;
    }

    @OneToMany(mappedBy = "tfloor")
    public List<Zhiqin> getZhiqins() {
        return zhiqins;
    }

    public void setZhiqins(List<Zhiqin> zhiqins) {
        this.zhiqins = zhiqins;
    }
}
