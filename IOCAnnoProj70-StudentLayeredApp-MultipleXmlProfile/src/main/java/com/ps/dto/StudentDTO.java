package com.ps.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class StudentDTO implements Serializable {
	private String sname;
	private String sadd;
	private int m1,m2,m3;		
	
}
