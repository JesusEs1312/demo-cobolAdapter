package com.alldatum.coboladapter.app.config;

import com.compositesw.extension.ds.config.AdapterConfig;

public class CobolAdapterConfig implements AdapterConfig{

	@Override
	public Object getPropertyValue(String propertyName) {
		return propertyName;
	}

}
