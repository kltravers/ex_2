package org.test.sample_spring_app.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(as = EquationResponse.class)
public class EquationResponse {

	@JsonProperty("Equation")
	String equation;
	@JsonProperty("Answer")
	int answer;
	

	public EquationResponse(String equation, int answer) {
		this.equation = equation;
		this.answer = answer;
	}
	
	
}
