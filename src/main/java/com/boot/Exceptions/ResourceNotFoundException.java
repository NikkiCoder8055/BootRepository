package com.boot.Exceptions;

public class ResourceNotFoundException extends RuntimeException {
	private String resouceName;
	private String FieldName;
	private int value;

	public ResourceNotFoundException(String resouceName, String fieldName, int value) {
		super(String.format("%s Not Found With %s : %s", resouceName, fieldName, value));
		this.resouceName = resouceName;
		FieldName = fieldName;
		this.value = value;
	}

	public String getResouceName() {
		return resouceName;
	}

	public void setResouceName(String resouceName) {
		this.resouceName = resouceName;
	}

	public String getFieldName() {
		return FieldName;
	}

	public void setFieldName(String fieldName) {
		FieldName = fieldName;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
