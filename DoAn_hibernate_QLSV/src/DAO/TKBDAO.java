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
public class TKBDAO {
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

    public boolean add(Monhoc mh) {
        try {          

            Session session=HibernateUtil.getSessionFactory().getCurrentSession();
            Transaction transacsion=session.beginTransaction();
            session.
            save(mh);
            transacsion.commit();
            return  true;
        } catch (Exception e) {
            return false;
        }
    }


    public boolean update(Monhoc mh) {
        try {           
        
            Session session =HibernateUtil.getSessionFactory().getCurrentSession();
            Transaction transaction =session.beginTransaction();
            session.update(mh);
            transaction.commit();
            return true;
        } catch (HibernateException e) {
            return false;
        }
    }


    public boolean delete(Monhoc mh) {
        try {
   
        Session session =HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transacsion=session.beginTransaction();
        session.delete(mh);
        transacsion.commit();
        return true;
        } catch (HibernateException e) {
            return false;
        }
    }

   // tra ra 1 dong lop hoc vs ma
    public Monhoc load(String maMH) 
    {
        Session session=HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transaction=session.beginTransaction();
        Monhoc mh=(Monhoc) session.get(Monhoc.class,maMH);
        transaction.commit();
        return mh;
    }

 
    public List<Monhoc> load_danhSach() 
    {
        Session session =HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transacsion=session.beginTransaction();
        // lenh hql
        String hql="from Monhoc";
        Query query=session.createQuery(hql);
        List<Monhoc> list_ntt=query.list();
        transacsion.commit();
        return list_ntt;        
    }
    public List<Monhoc> load_danhSachCB() 
    {
        Session session =HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transacsion=session.beginTransaction();
        // lenh hql
        String hql="SELECT A.maSv , A.stt  FROM Sinhvien A";
        Query query=session.createQuery(hql);
        List<Monhoc> list_ntt=query.list();
        transacsion.commit();
        return list_ntt;        
    }
    public List<Monhoc> load_danhSach_DK(String ma) 
    {
        Session session =HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transacsion=session.beginTransaction();
        // lenh hql
        String hql="from Sinhvien s where s.maLop='"+ma+"'";
        Query query=session.createQuery(hql);
        List<Monhoc> list_ntt=query.list();
        transacsion.commit();
        return list_ntt;        
    }
    public List<String> layMaLop(){
        Session session =HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transacsion=session.beginTransaction();
        // lenh hql
        String hql="select distinct s.maLop from Sinhvien s";
        Query query=session.createQuery(hql);
        List<String> list_ntt=query.list();
        transacsion.commit();
        return list_ntt;     
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
    
