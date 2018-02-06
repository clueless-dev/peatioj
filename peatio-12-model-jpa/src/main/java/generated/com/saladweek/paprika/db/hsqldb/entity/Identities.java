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
 * Identities generated by hbm2java
 */
@Entity
@Table(name="identities"
)
public class Identities  implements java.io.Serializable {


     private int id;
     private String email;
     private String passwordDigest;
     private Boolean isActive;
     private Integer retryCount;
     private Boolean isLocked;
     private Date lockedAt;
     private Date lastVerifyAt;
     private Date createdAt;
     private Date updatedAt;

    public Identities() {
    }

	
    public Identities(int id) {
        this.id = id;
    }
    public Identities(int id, String email, String passwordDigest, Boolean isActive, Integer retryCount, Boolean isLocked, Date lockedAt, Date lastVerifyAt, Date createdAt, Date updatedAt) {
       this.id = id;
       this.email = email;
       this.passwordDigest = passwordDigest;
       this.isActive = isActive;
       this.retryCount = retryCount;
       this.isLocked = isLocked;
       this.lockedAt = lockedAt;
       this.lastVerifyAt = lastVerifyAt;
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

    
    @Column(name="email")
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    
    @Column(name="password_digest")
    public String getPasswordDigest() {
        return this.passwordDigest;
    }
    
    public void setPasswordDigest(String passwordDigest) {
        this.passwordDigest = passwordDigest;
    }

    
    @Column(name="is_active")
    public Boolean getIsActive() {
        return this.isActive;
    }
    
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    
    @Column(name="retry_count")
    public Integer getRetryCount() {
        return this.retryCount;
    }
    
    public void setRetryCount(Integer retryCount) {
        this.retryCount = retryCount;
    }

    
    @Column(name="is_locked")
    public Boolean getIsLocked() {
        return this.isLocked;
    }
    
    public void setIsLocked(Boolean isLocked) {
        this.isLocked = isLocked;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="locked_at", length=19)
    public Date getLockedAt() {
        return this.lockedAt;
    }
    
    public void setLockedAt(Date lockedAt) {
        this.lockedAt = lockedAt;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="last_verify_at", length=19)
    public Date getLastVerifyAt() {
        return this.lastVerifyAt;
    }
    
    public void setLastVerifyAt(Date lastVerifyAt) {
        this.lastVerifyAt = lastVerifyAt;
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


