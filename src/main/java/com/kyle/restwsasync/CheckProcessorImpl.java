package com.kyle.restwsasync;

import javax.ws.rs.BadRequestException;
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
				if(checkLists==null || checkLists.getChecks()==null || checkLists.getChecks().size() == 0) {
					response.resume(new BadRequestException());
				}
				response.resume(true);
			}
		} .start();
		
	}

}
