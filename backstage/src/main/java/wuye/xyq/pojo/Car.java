package wuye.xyq.pojo;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Car {
    private Integer carid;
    private Integer cgrkid;
    private String carno;
    private Owners owners;

    @Id
    @Column(name = "carid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getCarid() {
        return carid;
    }

    public void setCarid(Integer carid) {
        this.carid = carid;
    }

    @Basic
    @Column(name = "cgrkid")
    public Integer getCgrkid() {
        return cgrkid;
    }

    public void setCgrkid(Integer cgrkid) {
        this.cgrkid = cgrkid;
    }

    @Basic
    @Column(name = "carno")
    public String getCarno() {
        return carno;
    }

    public void setCarno(String carno) {
        this.carno = carno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return carid == car.carid &&
                Objects.equals(cgrkid, car.cgrkid) &&
                Objects.equals(carno, car.carno);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carid, cgrkid, carno);
    }

    @ManyToOne
    @JoinColumn(name = "owid", referencedColumnName = "owid")
    public Owners getOwners() {
        return owners;
    }

    public void setOwners(Owners owners) {
        this.owners = owners;
    }
}
