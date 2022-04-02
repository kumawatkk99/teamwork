package com.team3.trainer.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @author Ashish
 * @since February, 2022
 * @see Qualification Bean
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Qualification {

	private Integer id;
	private String type;
	private Integer year;
	private String stream;
	private Double cgpa;
	private String institute;

}
