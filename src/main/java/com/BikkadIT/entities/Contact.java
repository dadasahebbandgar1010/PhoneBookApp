package com.BikkadIT.entities;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
	@Table(name = "CONTACT_DTLS")
	public class Contact {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "CONTACT_ID")
		private Integer contactId;
		@Column(name = "CONTACT_NAME")
		private String contactName;
		@Column(name = "CONTACT_NUMBER")
		private String contactNumber;
		@Column(name = "CONTACT_EMAIL")
		private String contactEmail;
		@Column(name = "CONTACT_ACTIVE_SWITCH")
		private Character activeSwitch;

		@Column(name = "CONTACT_CREATED_DATE", updatable = false)
		@CreationTimestamp
		private LocalDate createdDate;
		@Column(name = "CONTACT_UPDATED_DATE", insertable = false)
		@UpdateTimestamp
		private LocalDate updateDate;

		public LocalDate getUpdateDate() {
			return updateDate;
		}

		public void setUpdateDate(LocalDate updateDate) {
			this.updateDate = updateDate;
		}

		public Integer getContactId() {
			return contactId;
		}

		public void setContactId(Integer contactId) {
			this.contactId = contactId;
		}

		public String getContactName() {
			return contactName;
		}

		public void setContactName(String contactName) {
			this.contactName = contactName;
		}

		public String getContactNumber() {
			return contactNumber;
		}

		public void setContactNumber(String contactNumber) {
			this.contactNumber = contactNumber;
		}

		public String getContactEmail() {
			return contactEmail;
		}

		public void setContactEmail(String contactEmail) {
			this.contactEmail = contactEmail;
		}

		public Character getActiveSwitch() {
			return activeSwitch;
		}

		public void setActiveSwitch(Character activeSwitch) {
			this.activeSwitch = activeSwitch;
		}

		public LocalDate getCreatedDate() {
			return createdDate;
		}

		public void setCreatedDate(LocalDate createdDate) {
			this.createdDate = createdDate;
		}

		@Override
		public String toString() {
			return "Contact [contactId=" + contactId + ", contactName=" + contactName + ", contactNumber="
					+ contactNumber + ", contactEmail=" + contactEmail + ", activeSwitch=" + activeSwitch
					+ ", createdDate=" + createdDate + ", updateDate=" + updateDate + "]";
		}

		
		
	}

