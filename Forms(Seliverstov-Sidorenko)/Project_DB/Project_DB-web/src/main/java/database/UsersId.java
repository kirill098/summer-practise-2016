package database;
// Generated 15.07.2016 9:53:11 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * UsersId generated by hbm2java
 */
@Embeddable
public class UsersId  implements java.io.Serializable {


     private int iduser;
     private int idevent;

    public UsersId() {
    }

    public UsersId(int iduser, int idevent) {
       this.iduser = iduser;
       this.idevent = idevent;
    }
   


    @Column(name="iduser", nullable=false)
    public int getIduser() {
        return this.iduser;
    }
    
    public void setIduser(int iduser) {
        this.iduser = iduser;
    }


    @Column(name="idevent", nullable=false)
    public int getIdevent() {
        return this.idevent;
    }
    
    public void setIdevent(int idevent) {
        this.idevent = idevent;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof UsersId) ) return false;
		 UsersId castOther = ( UsersId ) other; 
         
		 return (this.getIduser()==castOther.getIduser())
 && (this.getIdevent()==castOther.getIdevent());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIduser();
         result = 37 * result + this.getIdevent();
         return result;
   }   


}

