package po;

import javax.persistence.*;
import java.util.List;

/**
 * Created by ARUN MANI on 5/5/2017.
 */
@Entity
@Table(name = "po")
public class Po implements Comparable<Po> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String ponumber;
    @Column
    private String status;
    @Column
    private String priority;
    @Column
    private String issuedate;
    @Column
    private String duedate;
    @Column
    private String seller;
    @Column
    private String billto;
    @Column
    private String transresp;
    @Column
    private String incoterms;
    @Column
    private String designatedmode;
    @Column
    private String carrier;
    @Column
    private Boolean mustship;

    @OneToMany(cascade = CascadeType.ALL)
    List<Destination> destinationList;


    @OneToMany(cascade = CascadeType.ALL)
    List<Origin> originList;

    public List<Origin> getOriginList() {
        return originList;
    }

    public void setOriginList(List<Origin> originList) {
        this.originList = originList;
    }

    public List<Destination> getDestinationList() {
        return destinationList;
    }

    public void setDestinationList(List<Destination> destinationList) {
        this.destinationList = destinationList;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPonumber() {
        return ponumber;
    }

    public void setPonumber(String ponumber) {
        this.ponumber = ponumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getIssuedate() {
        return issuedate;
    }

    public void setIssuedate(String issuedate) {
        this.issuedate = issuedate;
    }

    public String getDuedate() {
        return duedate;
    }

    public void setDuedate(String duedate) {
        this.duedate = duedate;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public String getBillto() {
        return billto;
    }

    public void setBillto(String billto) {
        this.billto = billto;
    }

    public String getTransresp() {
        return transresp;
    }

    public void setTransresp(String transresp) {
        this.transresp = transresp;
    }

    public String getIncoterms() {
        return incoterms;
    }

    public void setIncoterms(String incoterms) {
        this.incoterms = incoterms;
    }

    public String getDesignatedmode() {
        return designatedmode;
    }

    public void setDesignatedmode(String designatedmode) {
        this.designatedmode = designatedmode;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public Boolean getMustship() {
        return mustship;
    }

    public void setMustship(Boolean mustship) {
        this.mustship = mustship;
    }

    @Override
    public String toString() {
        return "Po{" +
                "id='" + id + '\'' +
                ", ponumber='" + ponumber + '\'' +
                ", status='" + status + '\'' +
                ", priority='" + priority + '\'' +
                ", issuedate='" + issuedate + '\'' +
                ", duedate='" + duedate + '\'' +
                ", seller='" + seller + '\'' +
                ", billto='" + billto + '\'' +
                ", transresp='" + transresp + '\'' +
                ", incoterms='" + incoterms + '\'' +
                ", designatedmode='" + designatedmode + '\'' +
                ", carrier='" + carrier + '\'' +
                ", mustship=" + mustship +
                ", destinationList=" + destinationList +
                ", originList=" + originList +
                '}';
    }

    @Override
    public int compareTo(Po o) {
        return this.priority.compareTo(o.priority);
    }
}
