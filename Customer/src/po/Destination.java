package po;

import javax.persistence.*;

/**
 * Created by ARUN MANI on 5/5/2017.
 */
@Entity
@Table(name = "destination")
@PrimaryKeyJoinColumn(name = "Id")
public class Destination extends Address {


    public String getDeststartdate() {
        return Deststartdate;
    }

    public void setDeststartdate(String deststartdate) {
        Deststartdate = deststartdate;
    }

    public String getDestenddate() {
        return Destenddate;
    }

    public void setDestenddate(String destenddate) {
        Destenddate = destenddate;
    }
    @Column
    private String Deststartdate;
    @Column
    private String Destenddate;



}
