package inc.codeman.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App 
{
    public static void main( String[] args )
    {
    	
        Codeman cm1 = new Codeman();
        Codeman cm2 = null;
        CName cname1 = new CName();
        cname1.setfName("Rakesh");
        cname1.setlName("Yadav");
        cm1.setCid(1);        
        cm1.setCname(cname1);
        cm1.setMarried(false);
        cm1.setSpeciality("Business Analyst");
        Configuration conf = new Configuration().configure().addAnnotatedClass(Codeman.class);
        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(conf.getProperties()).buildServiceRegistry();
        SessionFactory sf = conf.buildSessionFactory(reg);
        Session session = sf.openSession();
        Transaction tc = session.beginTransaction();
        session.save(cm1);
        cm2 = (Codeman)session.get(Codeman.class, 1);
        tc.commit();
        System.out.println(cm2);
    }
}
