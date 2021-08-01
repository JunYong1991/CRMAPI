package com.example.crmPackage.model;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;

import java.util.Date;

@Entity
@Table(name = "crm_order")

@EntityListeners(AuditingEntityListener.class)
public class Order {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @Column(name = "customer_id", nullable = false)
    private String customerId;
    
    @Column(name = "code")
    private String code;
	
	@Column(name = "quantity")
    private long quantity;
	
	@CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created", nullable = false)
    private Date created;
	
	@CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "last_updated", nullable = false)
    private Date lastUpdated;
	
	@Column(name = "status")
    private String status;
	
	@Column(name = "status_desc")
    private String statusDesc;
	
	@Column(name = "remarks")
    private String remarks;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatusDesc() {
		return statusDesc;
	}

	public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	

}
