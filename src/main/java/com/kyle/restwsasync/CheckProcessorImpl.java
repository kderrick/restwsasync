package com.kyle.restwsasync;

import javax.ws.rs.container.AsyncResponse;

import com.kyle.restwsasync.model.CheckLists;

public class CheckProcessorImpl implements CheckProcessor {

	@Override
	public void processChecks(AsyncResponse response, CheckLists checkLists) {
		//logic would go here
		new Thread() {
			public void run() {
				response.resume(true);
			}
		} .start();
		
	}

}
