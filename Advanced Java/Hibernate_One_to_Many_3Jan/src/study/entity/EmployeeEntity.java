package study.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name="employee3")
public class EmployeeEntity {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(unique=true,nullable=false)
private int empid;

@Column(unique=true,nullable=false)
private String  email;

private String firstname;

private String lastname;
public EmployeeEntity()
{
	super();
}
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}


@OneToMany(cascade=CascadeType.ALL)
@JoinColumn(name="EMPLOYEE_ID")
private Set<AccountEntity> accounts;

public Set<AccountEntity> getAccounts() {
	return accounts;
}
public void setAccounts(Set<AccountEntity> accounts) {
	this.accounts = accounts;
}
@Override
public String toString() {
	return "EmployeeEntity [empid=" + empid + ", email=" + email + ", firstname=" + firstname + ", lastname=" + lastname
			+ ", accounts=" + accounts + "]";
}


}
