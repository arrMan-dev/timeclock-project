package net.arrisdev.springboot.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "email")
	private String email;

	@Column(name = "clock_in")
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Date clockIn;

	@Column(name = "clock_out")
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Date clockOut;

	@Column(name = "clock_lunch_in")
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Date clockLunchIn;

	@Column(name = "clock_lunch_out")
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Date clockLunchOut;

	@Column(name = "total_hours_day")
	private Integer totalHourDay;

	private Boolean active;

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public Date getClockIn() {
		return clockIn;
	}

	public void setClockIn(Date clockIn) {
		this.clockIn = clockIn;
	}

	public Date getClockOut() {
		return clockOut;
	}

	public void setClockOut(Date clockOut) {
		this.clockOut = clockOut;
	}

	public Date getClockLunchIn() {
		return clockLunchIn;
	}

	public void setClockLunchIn(Date clockLunchIn) {
		this.clockLunchIn = clockLunchIn;
	}

	public Date getClockLunchOut() {
		return clockLunchOut;
	}

	public void setClockLunchOut(Date clockLuncOut) {
		this.clockLunchOut = clockLuncOut;
	}

	public Integer getTotalHourDay() {
		return totalHourDay;
	}

	public void setTotalHourDay(Integer totalHourDay) {
		this.totalHourDay = totalHourDay;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}
}
