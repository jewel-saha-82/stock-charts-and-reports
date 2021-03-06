package org.chart.data.processing.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MetaModel {
	private String symbol;
	private String interval;
	private String currency;
	private String exchange_timezone;
	private String exchange;
	private String type;
}
