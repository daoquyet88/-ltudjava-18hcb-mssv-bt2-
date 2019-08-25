/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import entities.*;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
/**
 *
 * @author Admin
 */
public class DKMHDAO {
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

    public boolean add(Dkmh dk) {
        try {          

            Session session=HibernateUtil.getSessionFactory().getCurrentSession();
            Transaction transacsion=session.beginTransaction();
            session.
            save(dk);
            transacsion.commit();
            return  true;
        } catch (Exception e) {
            return false;
        }
    }


    public boolean update(Dkmh dk) {
        try {           
        
            Session session =HibernateUtil.getSessionFactory().getCurrentSession();
            Transaction transaction =session.beginTransaction();
            session.update(dk);
            transaction.commit();
            return true;
        } catch (HibernateException e) {
            return false;
        }
    }


    public boolean delete(Dkmh dk) {
        try {
   
        Session session =HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transacsion=session.beginTransaction();
        session.delete(dk);
        transacsion.commit();
        return true;
        } catch (HibernateException e) {
            return false;
        }
    }

   // tra ra 1 dong lop hoc vs ma
    public Dkmh load(DkmhId id) 
    {
        Session session=HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transaction=session.beginTransaction();
        Dkmh sv =(Dkmh) session.get(Dkmh.class,id);
        transaction.commit();
        return sv;
    }

 
    public List<Dkmh> load_danhSach() 
    {
        Session session =HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transacsion=session.beginTransaction();
        // lenh hql
        String hql="from Dkmh";
        Query query=session.createQuery(hql);
        List<Dkmh> list_ntt=query.list();
        transacsion.commit();
        return list_ntt;        
    }
    
    public List<Sinhvien> load_danhSach_DK(String ma) 
    {
        Session session =HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transacsion=session.beginTransaction();
        // lenh hql
        String hql="from Sinhvien s where s.maLop='"+ma+"'";
        Query query=session.createQuery(hql);
        List<Sinhvien> list_ntt=query.list();
        transacsion.commit();
        return list_ntt;        
    }
    public List<String> layMaLop(){
        Session session =HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transacsion=session.beginTransaction();
        // lenh hql
        String hql="select distinct dk.id.maLop from Dkmh dk";
        Query query=session.createQuery(hql);
        List<String> list_ntt=query.list();
        transacsion.commit();
        return list_ntt;     
    }
    public List<String> layTenMonHoc(String maLop){
        Session session =HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transacsion=session.beginTransaction();
        // lenh hql
        String hql="select distinct mh.id.maMon from Monhoc mh  where mh.id.maLop='"+maLop+"'";
        Query query=session.createQuery(hql);
        List<String> list_ntt=query.list();
        transacsion.commit();
        return list_ntt;     
    }
    public static List<Dkmh> layThongTinDangKy(String maLop,String maMonHoc){
         Session session =HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transacsion=session.beginTransaction();
        // lenh hql
        String hql="from Dkmh dk where dk.id.maLop='"+maLop+"'"
                + "and dk.id.maMon='"+maMonHoc+"'";
        Query query=session.createQuery(hql);
        List<Dkmh> list_ntt=query.list();
        transacsion.commit();
        return list_ntt;        
//        List<Object[]> ls=null;
//         Session session = HibernateUtil.getSessionFactory()   
//                 .openSession();
//            try {
//                String hql="select dk "
//                        + " from Monhoc mh , Dkmh dk "
//                        + "where mh.id.maMon=dk.id.maMon"
//                        + " and mh.id.maMon='"+maLop+"'"
//                        + "and mh.tenMh='"+tenMonHoc+"'";
//                Query query=session.createQuery(hql);
//                ls=query.list();
//            } catch (Exception e) {
//                System.out.print(e);
//            }finally{
//                session.close();
//            }                
//         
//        return ls;
    }
    private static final SessionFactory sessionFactory;
    
    static {
        try {
            // Create the SessionFactory from standard (hibernate.cfg.xml) 
            // config file.
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    /**
     *
     * @return
     */
     
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
   
}   
    
