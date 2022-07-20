package com.alldatum.coboladapter.app.providers;

import com.compositesw.extension.ds.DSAdapterProvider;
import com.compositesw.extension.sdk.annotations.CisExtensionProvider;

@CisExtensionProvider(name="CobolAdapterExtension")
@DSAdapterProvider(adapters={"shortName=cobolExtension:longName=Cobol Extension Adapter"},
factoryClassName = "com.alldatum.coboladapter.app.providers.CobolDSFactory")
public class CobolAdapterProvider {
	public CobolAdapterProvider() {}
}
