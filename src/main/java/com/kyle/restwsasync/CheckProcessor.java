package com.kyle.restwsasync;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.kyle.restwsasync.model.CheckLists;

@Path("/checkprocessingservice")
public interface CheckProcessor {

	@POST
	@Path("/checks")
	public Boolean processChecks(CheckLists checkLists);
}
