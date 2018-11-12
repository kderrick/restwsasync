package com.kyle.restwsasync;

import javax.ws.rs.container.AsyncResponse;

import org.springframework.stereotype.Service;

import com.kyle.restwsasync.model.ChecksList;

@Service
public class CheckProcessorImpl implements CheckProcessor {

	@Override
	public void processChecks(AsyncResponse response, ChecksList checkLists) {
		//logic would go here
		new Thread() {
			public void run() {
				response.resume(true);
			}
		} .start();
		
	}

}
