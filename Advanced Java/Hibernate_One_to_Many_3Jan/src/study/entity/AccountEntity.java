package study.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name="account3")
public class AccountEntity {

	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column( unique = true, nullable = false)
	    private Integer accountId;

		@Column( unique = true, nullable = false, length = 100)
	    private String accountNumber;

		public AccountEntity() {
			super();
		}

		public Integer getAccountId() {
			return accountId;
		}

		public void setAccountId(Integer accountId) {
			this.accountId = accountId;
		}

		public String getAccountNumber() {
			return accountNumber;
		}

		public void setAccountNumber(String accountNumber) {
			this.accountNumber = accountNumber;
		}
		@ManyToOne
	    private EmployeeEntity employee;

		
		
		public EmployeeEntity getEmployee() {
			return employee;
		}

		public void setEmployee(EmployeeEntity employee) {
			this.employee = employee;
		}

		@Override
		public String toString() {
			return "AccountEntity [accountId=" + accountId + ", accountNumber=" + accountNumber + ", employee="
					+ employee + "]";
		}
		
		
}
