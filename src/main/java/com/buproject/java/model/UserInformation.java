package com.buproject.java.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInformation {
	
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;

}
