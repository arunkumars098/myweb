import org.hibernate.*;
import org.hibernate.query.Query;
import org.hibernate.cfg.Configuration;
import po.Address;
import po.Destination;
import po.Origin;
import po.Po;

import javax.persistence.metamodel.EntityType;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by ARUN MANI on 5/5/2017.
 */
public class Main {
    private static final SessionFactory ourSessionFactory;

    static {
        try {
            Configuration configuration = new Configuration();
            configuration.configure();

            ourSessionFactory = configuration.buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession() throws HibernateException {
        return ourSessionFactory.openSession();
    }

    public static void main(final String[] args) throws Exception {
        final Session session = getSession();
        Transaction tr= session.beginTransaction();
        try {
            System.out.println("querying all the managed entities...");
            /*List<Origin> or=new ArrayList<>();
            Origin origin=new Origin();
            origin.getId();
            origin.getPickupenddate();
            origin.getPickupstartdate();
            or.add(origin);

            List<Destination>dr=new ArrayList<>();
            Destination destination = new Destination();
            destination.getId();
            destination.getDestenddate();
            destination.getDeststartdate();
            dr.add(destination);

            List<Address> addres = new ArrayList<>();
            Address address=new Address();
            address.getCity();
            address.getCountry();
            address.getDestinations();
            address.getId();
            address.getName();
            address.getOrigins();
            address.getState();
            address.getStreet();
            addres.add(address);
            address.setOrigins(or);
            address.setDestinations(dr);
            session.save(addres);



            Po po=new Po();
            po.getAddresses();
            po.getBillto();
            po.getCarrier();
            po.getDesignatedmode();
            po.getDuedate();
            po.getId();
            po.getIncoterms();
            po.getIssuedate();
            po.getMustship();
            po.getPonumber();
            po.getPriority();
            po.getSeller();
            po.getStatus();
            po.getTransresp();
            po.setCusaddress(addres);
            session.save(po);
*/


        } finally {
            session.close();
        }
    }
}