/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entities.Sinhvien;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import entities.*;
import DAO.*;
import java.util.List;
import org.hibernate.Query;
/**
 *
 * @author Admin
 */
public class TaiKhoanDAO {
     public boolean add(Taikhoan sv) {
        try {          

            Session session=HibernateUtil.getSessionFactory().getCurrentSession();
            Transaction transacsion=session.beginTransaction();
            session.
            save(sv);
            transacsion.commit();
            return  true;
        } catch (Exception e) {
            return false;
        }
    }


    public boolean update(Taikhoan sv) {
        try {           
        
            Session session =HibernateUtil.getSessionFactory().getCurrentSession();
            Transaction transaction =session.beginTransaction();
            session.update(sv);
            transaction.commit();
            return true;
        } catch (HibernateException e) {
            return false;
        }
    }


    public boolean delete(Sinhvien sv) {
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
    public Taikhoan load(String id) 
    {
        Session session=HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transaction=session.beginTransaction();
        Taikhoan bd =(Taikhoan) session.get(Taikhoan.class,id);
        transaction.commit();
        return bd;
    }
   // tra ra 1 dong lop hoc vs ma
    public List<Taikhoan> load_danhSach( String useName, String passWord) 
    {
        try{
            Session session =HibernateUtil.getSessionFactory().getCurrentSession();
            Transaction transacsion=session.beginTransaction();
            // lenh hql
            String hql="from Taikhoan sv where sv.useName='"+useName+"'"
                    + " and sv.passWord='"+passWord+"'";
            Query query=session.createQuery(hql);
            List<Taikhoan> list_ntt=query.list();
            transacsion.commit();
            return list_ntt;        
        }catch(Exception e){
            return null;  
        }
    }

}
