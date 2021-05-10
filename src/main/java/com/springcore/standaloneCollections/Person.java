package com.springcore.standaloneCollections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Person {

	List<Integer> list;
	Map<String, Integer> map;
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
