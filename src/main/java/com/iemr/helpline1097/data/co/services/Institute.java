/*
* AMRIT – Accessible Medical Records via Integrated Technology
* Integrated EHR (Electronic Health Records) Solution
*
* Copyright (C) "Piramal Swasthya Management and Research Institute"
*
* This file is part of AMRIT.
*
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see https://www.gnu.org/licenses/.
*/
package com.iemr.helpline1097.data.co.services;

import java.sql.Timestamp;

import com.google.gson.annotations.Expose;
import com.iemr.helpline1097.utils.mapper.OutputMapper;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Data;

@Entity
@Table(name = "m_institution")
@Data
public class Institute
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "InstitutionID")
	@Expose
	private Integer institutionID;
	@Column(name = "InstitutionName")
	@Expose
	private String institutionName;
	@Column(name = "StateID")
	@Expose
	private Integer stateID;
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "StateID", insertable = false, updatable = false)
	@Expose
	private States states;
	@Column(name = "DistrictID")
	@Expose
	private Integer districtID;
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "DistrictID", insertable = false, updatable = false)
	@Expose
	private Districts district;
	@Column(name = "BlockID")
	@Expose
	private Integer blockID;
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "BlockID", insertable = false, updatable = false)
	@Expose
	private DistrictBlock districtBlock;
	@Column(name = "DistrictBranchMappingID")
	@Expose
	private Integer districtBranchMappingID;
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "DistrictBranchMappingID", insertable = false, updatable = false)
	@Expose
	private DistrictBranchMapping m_districtbranchmapping;
	@Column(name = "Deleted", insertable = false, updatable = true)
	@Expose
	private Boolean deleted;
	@Column(name = "CreatedBy")
	@Expose
	private String createdBy;
	@Column(name = "CreatedDate", insertable = false, updatable = false)
	private Timestamp createdDate;
	@Column(name = "ModifiedBy")
	private String modifiedBy;
	@Column(name = "LastModDate", insertable = false, updatable = false)
	private Timestamp lastModDate;
	@Column(name = "GovtInstituteID")
	@Expose
	private String govtInstituteID;
	@Column(name = "address")
	@Expose
	private String address;
	@Column(name = "contactPerson1")
	@Expose
	private String contactPerson1;
	@Column(name = "contactPerson1_Email")
	@Expose
	private String contactPerson1_Email;
	@Column(name = "contactNo1")
	@Expose
	private String contactNo1;
	@Column(name = "contactPerson2")
	@Expose
	private String contactPerson2;
	@Column(name = "contactPerson2_Email")
	@Expose
	private String contactPerson2_Email;
	@Column(name = "contactNo2")
	@Expose
	private String contactNo2;
	@Column(name = "contactPerson3")
	@Expose
	private String contactPerson3;
	@Column(name = "contactPerson3_Email")
	@Expose
	private String contactPerson3_Email;
	@Column(name = "contactNo3")
	@Expose
	private String contactNo3;
	@Column(name = "website")
	@Expose
	private String website;
	@Column(name = "providerServiceMapID")
	@Expose
	private Integer providerServiceMapID;
	@Column(name = "processed")
	@Expose
	private String processed;

	@Transient
	private OutputMapper outputMapper = new OutputMapper();

	protected Institute()
	{
	}

	public Institute(Integer institutionID, String institutionName)
	{
		this.institutionID = institutionID;
		this.institutionName = institutionName;
	}

	public Institute(Integer institutionID, String institutionName, Integer stateID, Integer districtID,
			Integer districtBranchMappingID)
	{
		this.institutionID = institutionID;
		this.institutionName = institutionName;
		this.stateID = stateID;
		this.districtID = districtID;
		this.districtBranchMappingID = districtBranchMappingID;
	}

	public Integer getInstitutionID()
	{
		return institutionID;
	}

	public String getInstitutionName()
	{
		return institutionName;
	}

	public Integer getStateID()
	{
		return stateID;
	}

	public Integer getDistrictID()
	{
		return districtID;
	}

	public Integer getDistrictBranchMappingID()
	{
		return districtBranchMappingID;
	}

	public Boolean getDeleted()
	{
		return deleted;
	}

	public String getCreatedBy()
	{
		return createdBy;
	}

	public Timestamp getCreatedDate()
	{
		return createdDate;
	}

	public String getModifiedBy()
	{
		return modifiedBy;
	}

	public Timestamp getLastModDate()
	{
		return lastModDate;
	}

	@Override
	public String toString()
	{
		return outputMapper.gson().toJson(this);
	}
}
