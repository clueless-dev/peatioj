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
 * Tickets generated by hbm2java
 */
@Entity
@Table(name="tickets"
)
public class Tickets  implements java.io.Serializable {


     private int id;
     private String title;
     private String content;
     private String aasmState;
     private Integer authorId;
     private Date createdAt;
     private Date updatedAt;

    public Tickets() {
    }

	
    public Tickets(int id) {
        this.id = id;
    }
    public Tickets(int id, String title, String content, String aasmState, Integer authorId, Date createdAt, Date updatedAt) {
       this.id = id;
       this.title = title;
       this.content = content;
       this.aasmState = aasmState;
       this.authorId = authorId;
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

    
    @Column(name="title")
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    
    @Column(name="content", length=65535)
    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }

    
    @Column(name="aasm_state")
    public String getAasmState() {
        return this.aasmState;
    }
    
    public void setAasmState(String aasmState) {
        this.aasmState = aasmState;
    }

    
    @Column(name="author_id")
    public Integer getAuthorId() {
        return this.authorId;
    }
    
    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
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


