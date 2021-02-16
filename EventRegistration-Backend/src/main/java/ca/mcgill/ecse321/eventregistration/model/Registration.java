package ca.mcgill.ecse321.eventregistration.model;

import java.util.*;
import java.sql.Date;
import java.sql.Time;
import javax.persistence.Id;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;

@Entity
public class Registration{
	private Person person;
	@ManyToOne
	public Person getPerson(){
		return this.person;
	}
	public void setPerson(Person person){
		this.person=person;
	}

	private Event event;
	@ManyToOne
	public Event getEvent(){
		return this.event;
	}
	public void setEvent(Event event){
		this.event=event;
	}

	private Integer id;
	public void setId(Integer id){
		this.id=id;
	}
	@Id
	public Integer getId(Integer id){
		return this.id;
	}
}