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
 * Versions generated by hbm2java
 */
@Entity
@Table(name="versions"
)
public class Versions  implements java.io.Serializable {


     private int id;
     private String itemType;
     private int itemId;
     private String event;
     private String whodunnit;
     private String object;
     private Date createdAt;

    public Versions() {
    }

	
    public Versions(int id, String itemType, int itemId, String event) {
        this.id = id;
        this.itemType = itemType;
        this.itemId = itemId;
        this.event = event;
    }
    public Versions(int id, String itemType, int itemId, String event, String whodunnit, String object, Date createdAt) {
       this.id = id;
       this.itemType = itemType;
       this.itemId = itemId;
       this.event = event;
       this.whodunnit = whodunnit;
       this.object = object;
       this.createdAt = createdAt;
    }
   
     @Id 

    
    @Column(name="id", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name="item_type", nullable=false)
    public String getItemType() {
        return this.itemType;
    }
    
    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    
    @Column(name="item_id", nullable=false)
    public int getItemId() {
        return this.itemId;
    }
    
    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    
    @Column(name="event", nullable=false)
    public String getEvent() {
        return this.event;
    }
    
    public void setEvent(String event) {
        this.event = event;
    }

    
    @Column(name="whodunnit")
    public String getWhodunnit() {
        return this.whodunnit;
    }
    
    public void setWhodunnit(String whodunnit) {
        this.whodunnit = whodunnit;
    }

    
    @Column(name="object", length=65535)
    public String getObject() {
        return this.object;
    }
    
    public void setObject(String object) {
        this.object = object;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="created_at", length=19)
    public Date getCreatedAt() {
        return this.createdAt;
    }
    
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }




}

