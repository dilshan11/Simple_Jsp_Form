package lk.tusker.hibernate;

import lk.tusker.Dto.User;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
  public static SessionFactory sessionFactory;

  public static SessionFactory buildSessionFactory(){
      StandardServiceRegistry registry=new StandardServiceRegistryBuilder().loadProperties("application.properties").build();
      Metadata metadata = new MetadataSources(registry)
              .addAnnotatedClass(User.class)
              .buildMetadata();
      return metadata.getSessionFactoryBuilder().build();
  }
  public static SessionFactory getSessionFactory(){
      if(sessionFactory==null){
          sessionFactory=buildSessionFactory();
      }
      return sessionFactory;
  }




}
