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
 * TwoFactors generated by hbm2java
 */
@Entity
@Table(name="two_factors"
)
public class TwoFactors  implements java.io.Serializable {


     private int id;
     private Integer memberId;
     private String otpSecret;
     private Date lastVerifyAt;
     private Boolean activated;
     private String type;
     private Date refreshedAt;

    public TwoFactors() {
    }

	
    public TwoFactors(int id) {
        this.id = id;
    }
    public TwoFactors(int id, Integer memberId, String otpSecret, Date lastVerifyAt, Boolean activated, String type, Date refreshedAt) {
       this.id = id;
       this.memberId = memberId;
       this.otpSecret = otpSecret;
       this.lastVerifyAt = lastVerifyAt;
       this.activated = activated;
       this.type = type;
       this.refreshedAt = refreshedAt;
    }
   
     @Id 

    
    @Column(name="id", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name="member_id")
    public Integer getMemberId() {
        return this.memberId;
    }
    
    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    
    @Column(name="otp_secret")
    public String getOtpSecret() {
        return this.otpSecret;
    }
    
    public void setOtpSecret(String otpSecret) {
        this.otpSecret = otpSecret;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="last_verify_at", length=19)
    public Date getLastVerifyAt() {
        return this.lastVerifyAt;
    }
    
    public void setLastVerifyAt(Date lastVerifyAt) {
        this.lastVerifyAt = lastVerifyAt;
    }

    
    @Column(name="activated")
    public Boolean getActivated() {
        return this.activated;
    }
    
    public void setActivated(Boolean activated) {
        this.activated = activated;
    }

    
    @Column(name="type")
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="refreshed_at", length=19)
    public Date getRefreshedAt() {
        return this.refreshedAt;
    }
    
    public void setRefreshedAt(Date refreshedAt) {
        this.refreshedAt = refreshedAt;
    }




}


