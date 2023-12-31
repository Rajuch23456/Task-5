package com.ryan.models;

import java.util.HashMap;
import java.util.Map;

public class Result<T> {
	private T payload;
	private Map<String, String> messages;
	
	public Result() {
		super();
		this.messages = new HashMap<>();
	}
	
	public T getPayload() {
		return payload;
	}
	
	public void setPayload(T payload) {
		this.payload = payload;
	}
	
	public Map<String, String> getMessages() {
		return new HashMap<String, String>(messages);
	}
	
	public void addMessage(String key, String value) {
		messages.put(key, value);
	}
	
	public boolean isSuccess() {
		return messages.size() < 1;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((messages == null) ? 0 : messages.hashCode());
		result = prime * result + ((payload == null) ? 0 : payload.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Result other = (Result) obj;
		if (messages == null) {
			if (other.messages != null)
				return false;
		} else if (!messages.equals(other.messages))
			return false;
		if (payload == null) {
			if (other.payload != null)
				return false;
		} else if (!payload.equals(other.payload))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Result [payload=" + payload + ", messages=" + messages + "]";
	}

}
