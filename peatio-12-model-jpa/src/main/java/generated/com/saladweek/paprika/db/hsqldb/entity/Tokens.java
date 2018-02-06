package generated.com.saladweek.paprika.db.hsqldb.entity;
// Generated 2018. 2. 7 오전 6:10:08 by Hibernate Tools 5.0.6.Final


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Tokens generated by hbm2java
 */
@Entity
@Table(name="tokens"
)
public class Tokens  implements java.io.Serializable {


     private int id;
     private String token;
     private Date expireAt;
     private Integer memberId;
     private Boolean isUsed;
     private String type;
     private Date createdAt;
     private Date updatedAt;

    public Tokens() {
    }

	
    public Tokens(int id) {
        this.id = id;
    }
    public Tokens(int id, String token, Date expireAt, Integer memberId, Boolean isUsed, String type, Date createdAt, Date updatedAt) {
       this.id = id;
       this.token = token;
       this.expireAt = expireAt;
       this.memberId = memberId;
       this.isUsed = isUsed;
       this.type = type;
       this.createdAt = createdAt;
       this.updatedAt = updatedAt;
    }
   
     @Id 

    
    @Column(name="id", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name="token")
    public String getToken() {
        return this.token;
    }
    
    public void setToken(String token) {
        this.token = token;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="expire_at", length=19)
    public Date getExpireAt() {
        return this.expireAt;
    }
    
    public void setExpireAt(Date expireAt) {
        this.expireAt = expireAt;
    }

    
    @Column(name="member_id")
    public Integer getMemberId() {
        return this.memberId;
    }
    
    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    
    @Column(name="is_used")
    public Boolean getIsUsed() {
        return this.isUsed;
    }
    
    public void setIsUsed(Boolean isUsed) {
        this.isUsed = isUsed;
    }

    
    @Column(name="type")
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="created_at", length=19)
    public Date getCreatedAt() {
        return this.createdAt;
    }
    
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="updated_at", length=19)
    public Date getUpdatedAt() {
        return this.updatedAt;
    }
    
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }




}


