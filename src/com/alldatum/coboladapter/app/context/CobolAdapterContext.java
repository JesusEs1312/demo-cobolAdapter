package com.alldatum.coboladapter.app.context;

import java.sql.Connection;
import java.sql.SQLException;

import com.compositesw.extension.ds.DataSourceContext;
import com.compositesw.extension.ds.Logger;
import com.compositesw.extension.ds.Poolable;
import com.compositesw.extension.ds.RelationalConnectionFactory;
import com.compositesw.extension.ds.config.AdapterConfig;
import com.compositesw.extension.ds.config.DataSourceConfig;

public class CobolAdapterContext implements DataSourceContext{

	@Override
	public AdapterConfig getAdapterConfig() {
		// TODO Auto-generated method stub
		AdapterConfig ac = new AdapterConfig() {
			
			@Override
			public Object getPropertyValue(String value) {
				// TODO Auto-generated method stub
				return value;
			}
		};
		
		return ac;
	}

	@Override
	public ClassLoader getClassLoader() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RelationalConnectionFactory getConnectionFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataSourceConfig getDataSourceConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Logger getLogger(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Poolable<Connection> getPoolable() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Connection getPooledConnection() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean returnPooledConnection(Connection arg0) {
		// TODO Auto-generated method stub
		return false;
	}

}
