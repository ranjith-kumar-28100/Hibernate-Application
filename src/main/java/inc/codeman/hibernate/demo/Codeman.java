package inc.codeman.hibernate.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="users")
public class Codeman {
	@Column(name="u_id")
	@Id
	private int cid;
	private CName cname;
	@Transient
	private boolean isMarried;
	private String speciality;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public void setCname(CName cname) {
		this.cname = cname;
	}
	public CName getCname() {
		return cname;
	}	
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	
	public boolean isMarried() {
		return isMarried;
	}
	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}
	@Override
	public String toString() {
		return "Codeman [cid=" + cid + ", cname=" + cname + ", isMarried=" + isMarried + ", speciality=" + speciality
				+ "]";
	}

}
