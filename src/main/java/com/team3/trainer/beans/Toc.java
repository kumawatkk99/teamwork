package com.team3.trainer.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * 
 * @author Yuvraj
 * @since February, 2022
 * @see Toc Bean Class
 *
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Toc {
	private int tid;
	private String cname;
	private Integer duration;
	private String audience;
}
