package entities;
// Generated Aug 20, 2019 9:52:04 PM by Hibernate Tools 4.3.1



/**
 * Taikhoan generated by hbm2java
 */
public class Taikhoan  implements java.io.Serializable {


     private String useName;
     private int stt;
     private String passWord;
     private int quyen;

    public Taikhoan() {
    }

    public Taikhoan(int stt, String passWord, int quyen) {
       this.stt = stt;
       this.passWord = passWord;
       this.quyen = quyen;
    }
   
    public String getUseName() {
        return this.useName;
    }
    
    public void setUseName(String useName) {
        this.useName = useName;
    }
    public int getStt() {
        return this.stt;
    }
    
    public void setStt(int stt) {
        this.stt = stt;
    }
    public String getPassWord() {
        return this.passWord;
    }
    
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
    public int getQuyen() {
        return this.quyen;
    }
    
    public void setQuyen(int quyen) {
        this.quyen = quyen;
    }




}

