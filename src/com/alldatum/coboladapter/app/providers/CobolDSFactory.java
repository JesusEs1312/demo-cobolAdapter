package com.alldatum.coboladapter.app.providers;

import com.compositesw.extension.ds.impl.RelationalDataSourceFactoryImpl;

public class CobolDSFactory extends RelationalDataSourceFactoryImpl{
	
	public String getResultSetToMetadataConverter() {
	    return null;
	  }
	  
	  public String getShuntFactory() {
	    return null;
	  }
	  
	  public String getIntrospectorClass() {
	    return CobolMetadata.class.getCanonicalName();
	  }
	  
	  public String getIntrospectionFilterClass() {
	    return null;
	  }
	  
	  public String getConnectionFactoryClass() {
	    return null;
	  }
	  
	  public String getPoolableClass() {
	    return null;
	  }
}
