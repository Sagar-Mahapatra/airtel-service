/** @Copyright 2022 keybank pvt ltd, all rights are reserved, you shouldn't disclose the information outside otherwise terms and condition will apply.
 * 
 */
package com.airtel.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.airtel.model.AirtelServiceRequest;
import com.airtel.model.AirtelServiceResponse;

/**
 * @author Sagar, 23-Mar-2022
 *
 *         Description:
 */
@RestController
@RequestMapping("/v1/mobile")
public class AirtelRestController {

	@PostMapping("/verify")
	public AirtelServiceResponse verify(@RequestBody AirtelServiceRequest request,
			@RequestHeader(name = "clientId", required = true) String clientId,
			@RequestHeader(name = "requestId", required = true) String requestId,
			@RequestHeader(name = "msgTs", required = true) String msgTs,
			@RequestHeader(name = "version", required = true) String version) {
		return new AirtelServiceResponse("101", "Valid User", true, "Looks like Valid Customer");
	}

}
