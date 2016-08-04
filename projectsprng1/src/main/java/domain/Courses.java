package domain;

import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "courses",schema="sruthisql")

public class Courses {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int CId;
	private String CName;
	private String CDes;
	private String CPreq;
	private String CSkillLevel;
	private LocalDateTime createdDate;
	private LocalDateTime updatedDate;
	private String UserName;
	
	@OneToMany(mappedBy="Courses")
	  private Set<Topics> topic;
	@JsonIgnore
	@ManyToMany(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
	@JoinTable(name = "cusers", joinColumns = @JoinColumn(name = "CId"), inverseJoinColumns = @JoinColumn(name = "UserName"))
	private Set<Usertable> use ;

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public void setCId(int cId) {
		CId = cId;
	}

	public String getCName() {
		return CName;
	}

	public void setCName(String cName) {
		CName = cName;
	}

	public String getCDes() {
		return CDes;
	}

	public void setCDes(String cDes) {
		CDes = cDes;
	}

	public String getCPreq() {
		return CPreq;
	}

	public void setCPreq(String cPreq) {
		CPreq = cPreq;
	}

	public String getCSkillLevel() {
		return CSkillLevel;
	}

	public void setCSkillLevel(String cSkillLevel) {
		CSkillLevel = cSkillLevel;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}

}
