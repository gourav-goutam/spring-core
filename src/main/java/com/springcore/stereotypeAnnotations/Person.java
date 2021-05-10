package com.springcore.stereotypeAnnotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Properties;

@Component
public class Person {
	
	@Value("#{list}")
	List<Integer> list;
	@Value("#{map}")
	Map<String, Integer> map;
	@Value("#{props}")
	Properties prop;

	public Person() {
		super();
	}

	public Person(List<Integer> list, Map<String, Integer> map, Properties prop) {
		this.list = list;
		this.map = map;
		this.prop = prop;
	}

	public List<Integer> getList() {
		return list;
	}

	public void setList(List<Integer> list) {
		this.list = list;
	}

	public Map<String, Integer> getMap() {
		return map;
	}

	public void setMap(Map<String, Integer> map) {
		this.map = map;
	}

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}

	@Override
	public String toString() {
		return "Person{" +
				"list=" + list +
				", map=" + map +
				", prop=" + prop +
				'}';
	}
}
