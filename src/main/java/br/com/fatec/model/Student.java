/*
 * @(#)student.java 1.0 1 13/08/2018
 *
 * Copyright (c) 2017, Fatec-Jessen Vidal. All rights reserved.
 * Fatec-Jessen Vidal proprietary/confidential. Use is subject to license terms.
 */

package br.com.fatec.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonTypeName;

import br.com.fatec.enums.Roles;

/**
 * A classe {@link Student}
 *
 * @author Julia
 * @version 1.0 13/08/2018
 */
@Entity
@Table(name="Student")
@JsonTypeName("student")
public class Student extends Usuario{
	private static final long serialVersionUID = 1L;
	private String ra;
	private String institutionCode;
	private String courseCode;
	private String startYear;
	private String startSemester;
	private String code;

	public Student(Long id, String username, String password, String ra) {
		super(id, username, password, Roles.STUDENT);
		this.ra = ra;
		this.institutionCode = ra.substring(0, 3);
		this.courseCode = ra.substring(3, 6);
		this.startYear = "20" + ra.substring(6, 8);
		this.startSemester =ra.substring(8, 9);
		this.code = ra.substring(ra.length() -4);
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
		

}
