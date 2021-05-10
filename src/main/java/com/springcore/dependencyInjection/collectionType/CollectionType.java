package com.springcore.dependencyInjection.collectionType;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionType {

	List<?> addressList;
	Set<?> addressSet;
	Map<?, ?> addressMap;
	Properties addressProp;	
	
	public CollectionType(List<?> addressList, Set<?> addressSet, Map<?, ?> addressMap, Properties addressProp) {
		super();
		this.addressList = addressList;
		this.addressSet = addressSet;
		this.addressMap = addressMap;
		this.addressProp = addressProp;
	}	
	
	public CollectionType() {
		super();
	}

	public List<?> getAddressList() {
		return addressList;
	}
	public void setAddressList(List<?> addressList) {
		this.addressList = addressList;
	}
	public Set<?> getAddressSet() {
		return addressSet;
	}
	public void setAddressSet(Set<?> addressSet) {
		this.addressSet = addressSet;
	}
	public Map<?, ?> getAddressMap() {
		return addressMap;
	}
	public void setAddressMap(Map<?, ?> addressMap) {
		this.addressMap = addressMap;
	}
	public Properties getAddressProp() {
		return addressProp;
	}
	public void setAddressProp(Properties addressProp) {
		this.addressProp = addressProp;
	}

	@Override
	public String toString() {
		return "CollectionType [addressList=" + addressList + ", addressSet=" + addressSet + ", addressMap="
				+ addressMap + ", addressProp=" + addressProp + "]";
	}
	

}
