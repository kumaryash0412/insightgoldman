package org.test.project.domain;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StringOp {

	String input;
	String output;

	public StringOp(String input, String output) {
		this.input = input;
		this.output = output;
	}

	public StringOp() {
	}


	@Id
	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public String getOutput() {
		return output;
	}

	public void setOutput(String output) {
		this.output = output;
	}
}
