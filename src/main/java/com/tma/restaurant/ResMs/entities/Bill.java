package com.tma.restaurant.ResMs.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.tma.restaurant.ResMs.entities.enums.BillStatus;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Bill {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@OneToMany(fetch = FetchType.EAGER )
	@JoinColumn(name = "bill_id")                                                                                                                                                        
	private List<BillOrder> orders;
	
	@Column
	private BillStatus status;
	
	@Column
	@Temporal(TemporalType.TIME)
	private Date createTime;
	
	
	

}
