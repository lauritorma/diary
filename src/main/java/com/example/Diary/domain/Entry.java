package com.example.Diary.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;


@Entity
@Table(name="entry")
public class Entry {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="entryid", nullable=false)
	private Long entryid;
	
	@Column(name="entrydate", nullable=false)
	private Date entrydate;
	
	@NotBlank
	@Column(name="entryname", nullable=false)
	private String entryname;
	
	@NotBlank
	@Column(name="entrytext", nullable=false)
	private String entrytext;
	
	
	public Entry() {}

	public Entry(Date entrydate, String entryname, String entrytext) {
		super();
		this.entrydate = entrydate;
		this.entryname = entryname;
		this.entrytext = entrytext;
	}

	public Long getEntryid() {
		return entryid;
	}

	public void setEntryid(Long entryid) {
		this.entryid = entryid;
	}

	public Date getEntrydate() {
		return entrydate;
	}

	public void setEntrydate(Date entrydate) {
		this.entrydate = entrydate;
	}
	
	

	public String getEntryname() {
		return entryname;
	}

	public void setEntryname(String entryname) {
		this.entryname = entryname;
	}

	public String getEntrytext() {
		return entrytext;
	}

	public void setEntrytext(String entrytext) {
		this.entrytext = entrytext;
	}

	@Override
	public String toString() {
		return "Entry [entryid=" + entryid + ", entrydate=" + entrydate + ", entryname=" + entryname + ", entrytext="
				+ entrytext + "]";
	}

	
	
	
	
}
