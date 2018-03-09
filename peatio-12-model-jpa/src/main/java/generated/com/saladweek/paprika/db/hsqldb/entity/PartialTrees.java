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
 * PartialTrees generated by hbm2java
 */
@Entity
@Table(name="partial_trees"
)
public class PartialTrees  implements java.io.Serializable {


     private int id;
     private int proofId;
     private int accountId;
     private String json;
     private Date createdAt;
     private Date updatedAt;
     private String sum;

    public PartialTrees() {
    }

	
    public PartialTrees(int id, int proofId, int accountId, String json) {
        this.id = id;
        this.proofId = proofId;
        this.accountId = accountId;
        this.json = json;
    }
    public PartialTrees(int id, int proofId, int accountId, String json, Date createdAt, Date updatedAt, String sum) {
       this.id = id;
       this.proofId = proofId;
       this.accountId = accountId;
       this.json = json;
       this.createdAt = createdAt;
       this.updatedAt = updatedAt;
       this.sum = sum;
    }
   
     @Id 

    
    @Column(name="id", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name="proof_id", nullable=false)
    public int getProofId() {
        return this.proofId;
    }
    
    public void setProofId(int proofId) {
        this.proofId = proofId;
    }

    
    @Column(name="account_id", nullable=false)
    public int getAccountId() {
        return this.accountId;
    }
    
    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    
    @Column(name="json", nullable=false, length=65535)
    public String getJson() {
        return this.json;
    }
    
    public void setJson(String json) {
        this.json = json;
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

    
    @Column(name="sum")
    public String getSum() {
        return this.sum;
    }
    
    public void setSum(String sum) {
        this.sum = sum;
    }




}

