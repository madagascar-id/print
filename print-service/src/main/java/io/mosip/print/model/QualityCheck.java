package io.mosip.print.model;

import io.mosip.print.constant.BiometricType;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class QualityCheck {
	
	/** 
	 * score per modality, based on input modalitiesToCheck
	 */
	private Map<BiometricType, QualityScore> scores;
	
	/** The analytics info - detailed breakdown and other information */
	private Map<String, String> analyticsInfo;
	
	public QualityCheck() {
		this.scores = new HashMap<BiometricType, QualityScore>();
		this.analyticsInfo = new HashMap<String, String>();
	}

}
