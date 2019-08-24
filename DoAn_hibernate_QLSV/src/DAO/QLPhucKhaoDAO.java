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
public class QLPhucKhaoDAO {
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

    public boolean add(Svphuckhao svpk) {
        try {          

            Session session=HibernateUtil.getSessionFactory().getCurrentSession();
            Transaction transacsion=session.beginTransaction();
            session.
            save(svpk);
            transacsion.commit();
            return  true;
        } catch (Exception e) {
            return false;
        }
    }


    public boolean update(Svphuckhao svpk) {
        try {           
        
            Session session =HibernateUtil.getSessionFactory().getCurrentSession();
            Transaction transaction =session.beginTransaction();
            session.update(svpk);
            transaction.commit();
            return true;
        } catch (HibernateException e) {
            return false;
        }
    }


    public boolean delete(Svphuckhao sv) {
        try {
   
        Session session =HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transacsion=session.beginTransaction();
        session.delete(sv);
        transacsion.commit();
        return true;
        } catch (HibernateException e) {
            return false;
        }
    }

   // tra ra 1 dong lop hoc vs ma
    public Svphuckhao load(String masv) 
    {
        Session session=HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transaction=session.beginTransaction();
        Svphuckhao sv =(Svphuckhao) session.get(Svphuckhao.class,masv);
        transaction.commit();
        return sv;
    }

 
    public List<Svphuckhao> load_danhSach() 
    {
        Session session =HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transacsion=session.beginTransaction();
        // lenh hql
        String hql="from Svphuckhao";
        Query query=session.createQuery(hql);
        List<Svphuckhao> list_ntt=query.list();
        transacsion.commit();
        return list_ntt;        
    }
    public List<Svphuckhao> load_danhSach_SV(String ma) 
    {
        Session session =HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transacsion=session.beginTransaction();
        // lenh hql
        String hql="from Svphuckhao s where s.id.maSv='"+ma+"'";
        Query query=session.createQuery(hql);
        List<Svphuckhao> list_ntt=query.list();
        transacsion.commit();
        return list_ntt;        
    }
    public List<Sinhvien> load_danhSachCB() 
    {
        Session session =HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transacsion=session.beginTransaction();
        // lenh hql
        String hql="SELECT A.maSv , A.stt  FROM Sinhvien A";
        Query query=session.createQuery(hql);
        List<Sinhvien> list_ntt=query.list();
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
    
