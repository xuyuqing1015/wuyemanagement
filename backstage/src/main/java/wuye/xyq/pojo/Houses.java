package wuye.xyq.pojo;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.Objects;

@Entity
public class Houses {
    private Integer hoid;
    private String honumber;
    private Date howxdate;
    private BigDecimal howxmoney;
    private Integer howxjstate;
    private Integer hostate;
    private Date horzdate;
    private Owners owners;
    private Troom troom;

    @Id
    @Column(name = "hoid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getHoid() {
        return hoid;
    }

    public void setHoid(Integer hoid) {
        this.hoid = hoid;
    }

    @Basic
    @Column(name = "honumber")
    public String getHonumber() {
        return honumber;
    }

    public void setHonumber(String honumber) {
        this.honumber = honumber;
    }

    @Basic
    @Column(name = "howxdate")
    public Date getHowxdate() {
        return howxdate;
    }

    public void setHowxdate(Date howxdate) {
        this.howxdate = howxdate;
    }

    @Basic
    @Column(name = "howxmoney")
    public BigDecimal getHowxmoney() {
        return howxmoney;
    }

    public void setHowxmoney(BigDecimal howxmoney) {
        this.howxmoney = howxmoney;
    }

    @Basic
    @Column(name = "howxjstate")
    public Integer getHowxjstate() {
        return howxjstate;
    }

    public void setHowxjstate(Integer howxjstate) {
        this.howxjstate = howxjstate;
    }

    @Basic
    @Column(name = "hostate")
    public Integer getHostate() {
        return hostate;
    }

    public void setHostate(Integer hostate) {
        this.hostate = hostate;
    }

    @Basic
    @Column(name = "horzdate")
    public Date getHorzdate() {
        return horzdate;
    }

    public void setHorzdate(Date horzdate) {
        this.horzdate = horzdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Houses houses = (Houses) o;
        return hoid == houses.hoid &&
                Objects.equals(honumber, houses.honumber) &&
                Objects.equals(howxdate, houses.howxdate) &&
                Objects.equals(howxmoney, houses.howxmoney) &&
                Objects.equals(howxjstate, houses.howxjstate) &&
                Objects.equals(hostate, houses.hostate) &&
                Objects.equals(horzdate, houses.horzdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hoid, honumber, howxdate, howxmoney, howxjstate, hostate, horzdate);
    }

    @ManyToOne
    @JoinColumn(name = "owid", referencedColumnName = "owid")
    public Owners getOwners() {
        return owners;
    }

    public void setOwners(Owners owners) {
        this.owners = owners;
    }

    @ManyToOne
    @JoinColumn(name = "rid", referencedColumnName = "rid")
    public Troom getTroom() {
        return troom;
    }

    public void setTroom(Troom troom) {
        this.troom = troom;
    }
}
