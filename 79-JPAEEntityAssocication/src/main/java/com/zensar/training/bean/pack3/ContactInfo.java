package com.zensar.training.bean.pack3;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;
//bi-direction Association
@Entity 
@Table(name = "Contactinfo110")
public class ContactInfo {
	
	@Id
	int contactId;
	
	String email;
	String phone;
	
	@OneToOne//association this is having
	@MapsId//value in primary key will copied in associted entity
	@JoinColumn(name="person_id")//primary key is person id which is named as person_id
	Person person;
	
	
	public ContactInfo() {
		super();
	}
	public ContactInfo(String email, String phone, Person person) {
		super();
		this.email = email;
		this.phone = phone;
		this.person = person;
	}
	
	public ContactInfo(int contactId, String email, String phone, Person person) {
		super();
		this.contactId = contactId;
		this.email = email;
		this.phone = phone;
		this.person = person;
	}
	public int getContactId() {
		return contactId;
	}
	public void setContactId(int contactId) {
		this.contactId = contactId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	@Override
	public String toString() {
		return "ContactInfo [contactId=" + contactId + ", email=" + email + ", phone=" + phone + "]";
	}
	
	/*join column will share primary key here person id is primary key shared by  both class(entity)
	 * if one entity delete the value other will be affected  */
	
	
}
