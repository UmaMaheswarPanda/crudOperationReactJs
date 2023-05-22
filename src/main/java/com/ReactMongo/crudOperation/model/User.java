package com.ReactMongo.crudOperation.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Document("users")
public class User {
	@Id
	private String userId;
	private String userName;
	private String name;
	private String email;
	private String mobile;
}
