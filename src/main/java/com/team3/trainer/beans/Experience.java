
package com.team3.trainer.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * 
 * @author Kushal
 * @since February,2022
 * @see trainer experience bean
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Experience {

	private Integer id;
	private String companyName;
	private Integer duration;
	private String technology;

}
