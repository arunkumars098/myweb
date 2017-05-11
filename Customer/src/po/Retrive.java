package po;

import po.Po;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Created by ARUN MANI on 4/29/2017.
 */
public class Retrive extends org.apache.struts.action.Action {
    private final static String SUCCESS="success";
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
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {

        Session session=getSession();

        Transaction transaction= session.beginTransaction();
        String sql="FROM Po";
        org.hibernate.query.Query query = session.createQuery(sql);
        query.setFirstResult(Insert2DB.count*3);
        Insert2DB.count++;
        System.out.println("haiiii");
        query.setMaxResults(3);
                List<Po> gets = query.list();
                List<Po> po = new ArrayList<>();
                for(int i=0;i<gets.size();i++) {

                    System.out.println("hai : "+i);
                    Po fb=(Po)gets.get(i);
                    po.add(fb);
                    /*for (Po Get : gets) {
                   *//* Collections.sort(gets, Collections.reverseOrder());
                    Iterator itr=gets.iterator();*//*
                        System.out.println(Get.toString());
                    }*/
                }
              Collections.sort(po);

         transaction.commit();
        session.close();


        request.setAttribute("gets", gets);
        return mapping.findForward(SUCCESS);
    }
}
