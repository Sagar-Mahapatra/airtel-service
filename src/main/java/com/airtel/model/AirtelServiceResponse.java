/** @Copyright 2022 keybank pvt ltd, all rights are reserved, you shouldn't disclose the information outside otherwise terms and condition will apply.
 * 
 */
package com.airtel.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Sagar, 23-Mar-2022
 *
 *         Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AirtelServiceResponse {

	private String respCode;
	private String respMsg;
	private boolean isValid;
	private String description;

}
