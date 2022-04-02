package com.team3.trainer.beans;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Satyaa
 * @since February, 2022
 * @see Trainer Beans
 */
@Data
@AllArgsConstructor
public class Trainer {

	private Integer id;
	private String name;
	private String password;
	private String email;
	private long phone;

	private List<Qualification> qualificationList;
	private List<Toc> toc;
	private List<Experience> experienceList;

}
