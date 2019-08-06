/*
 * @(#)student.java 1.0 1 13/08/2018
 *
 * Copyright (c) 2017, Fatec-Jessen Vidal. All rights reserved.
 * Fatec-Jessen Vidal proprietary/confidential. Use is subject to license terms.
 */

package br.com.fatec.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A classe {@link Student}
 *
 * @author Julia
 * @version 1.0 13/08/2018
 */
@Entity
@Table(name="Student")
@JsonTypeName("student")
public class Student implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String ra;
	private String institutionCode;
	private String courseCode;
	private String startYear;
	private String startSemester;
	private String code;
	
	@OneToOne
	@JoinColumn(name="user_id")
	private Usuario usuario;


	public Student(String ra, String institutionCode, String courseCode, String startYear, String startSemester,
			String code, Usuario usuario) {
		super();
		this.ra = ra;
		this.institutionCode = institutionCode;
		this.courseCode = courseCode;
		this.startYear = startYear;
		this.startSemester = startSemester;
		this.code = code;
		this.usuario = usuario;
	}
	/**
	 * @return the ra
	 */
	public String getRa() {
		return ra;
	}
	/**
	 * @param ra the ra to set
	 */
	public void setRa(String ra) {
		this.ra = ra;
	}
	/**
	 * @return the institutionCode
	 */
	public String getInstitutionCode() {
		return institutionCode;
	}
	/**
	 * @param institutionCode the institutionCode to set
	 */
	public void setInstitutionCode(String institutionCode) {
		this.institutionCode = institutionCode;
	}
	/**
	 * @return the courseCode
	 */
	public String getCourseCode() {
		return courseCode;
	}
	/**
	 * @param courseCode the courseCode to set
	 */
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	/**
	 * @return the startYear
	 */
	public String getStartYear() {
		return startYear;
	}
	/**
	 * @param startYear the startYear to set
	 */
	public void setStartYear(String startYear) {
		this.startYear = startYear;
	}
	/**
	 * @return the startSemester
	 */
	public String getStartSemester() {
		return startSemester;
	}
	/**
	 * @param startSemester the startSemester to set
	 */
	public void setStartSemester(String startSemester) {
		this.startSemester = startSemester;
	}
	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		return true;
	}

}
