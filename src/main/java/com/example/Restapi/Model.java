package com.example.Restapi;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Setter
@Getter
@ToString
@Document(collection = "apis")
public class Model implements Serializable {
	@Id
	private String id;
	private String apiName;
	
	private String methodName;
	private Map<String, Object> response;
	public Map<String, Object> getResponse() {
		return response;
	}

	public void setResponse(Map<String, Object> response) {
		this.response = response;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	public String getApiName() {
		return apiName;
	}

	public void setApiName(String apiName) {
		this.apiName = apiName;
	}
	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}


	public Object addAttribute(String string, String string2) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String toString(){
		return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
	}

}
