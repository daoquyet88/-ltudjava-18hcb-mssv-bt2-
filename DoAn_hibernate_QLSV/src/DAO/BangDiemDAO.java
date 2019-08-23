/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import entities.*;
import java.util.List;
import javax.swing.JOptionPane;
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
public class BangDiemDAO {
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

    public boolean add(Bangdiem bd) {
        try {          

            Session session=HibernateUtil.getSessionFactory().getCurrentSession();
            Transaction transacsion=session.beginTransaction();
            session.
            save(bd);
            transacsion.commit();
            return  true;
        } catch (Exception e) {
            return false;
        }
    }


    public boolean update(Bangdiem bd) {
        try {           
        
            Session session =HibernateUtil.getSessionFactory().getCurrentSession();
            Transaction transaction =session.beginTransaction();
            session.update(bd);
            transaction.commit();
            return true;
        } catch (HibernateException e) {
            JOptionPane.showMessageDialog(null,"loi: " +e);
            return false;
        }
    }


    public boolean delete(Bangdiem bd) {
        try {
   
        Session session =HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transacsion=session.beginTransaction();
        session.delete(bd);
        transacsion.commit();
        return true;
        } catch (HibernateException e) {
            return false;
        }
    }

   // tra ra 1 dong lop hoc vs ma
    public Sinhvien load(String masv) 
    {
        Session session=HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transaction=session.beginTransaction();
        Sinhvien sv =(Sinhvien) session.get(Sinhvien.class,masv);
        transaction.commit();
        return sv;
    }

 
    public List<Bangdiem> load_danhSach() 
    {
        Session session =HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transacsion=session.beginTransaction();
        // lenh hql
        String hql="from Bangdiem";
        Query query=session.createQuery(hql);
        List<Bangdiem > list_ntt=query.list();
        transacsion.commit();
        return list_ntt;        
    }
    public List<Bangdiem> load_danhSachCB() 
    {
        Session session =HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transacsion=session.beginTransaction();
        // lenh hql
        String hql="SELECT A.maSv , A.stt  FROM Sinhvien A";
        Query query=session.createQuery(hql);
        List<Bangdiem> list_ntt=query.list();
        transacsion.commit();
        return list_ntt;        
    }
    public List<Bangdiem> load_danhSach_DK(String maLop, String maMonHoc) 
    {
        Session session =HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transacsion=session.beginTransaction();
        // lenh hql
        String hql="from Bangdiem bd  where bd.id.maLop='"+maLop+"'"
                + "and bd.id.maMon='"+maMonHoc+"'";
        Query query=session.createQuery(hql);
        List<Bangdiem> list_ntt=query.list();
        transacsion.commit();
        return list_ntt;        
    }
    public List<String> layMaLop(){
        Session session =HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transacsion=session.beginTransaction();
        // lenh hql
        String hql="select distinct s.id.maLop from Bangdiem s";
        Query query=session.createQuery(hql);
        List<String> list_ntt=query.list();
        transacsion.commit();
        return list_ntt;     
    }
    public List<String> layMaMonHoc(String maLop){
        Session session =HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transacsion=session.beginTransaction();
        // lenh hql
        String hql="select distinct s.id.maMon from Bangdiem s where s.id.maLop='"+maLop+"'";
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
    
