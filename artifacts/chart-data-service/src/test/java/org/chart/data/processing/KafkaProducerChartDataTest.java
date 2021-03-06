package org.chart.data.processing;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.concurrent.ExecutionException;

import org.chart.data.processing.kafka.producer.KafkaProducerChartData;
import org.chart.data.processing.model.ChartData;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

@SpringBootTest(webEnvironment = WebEnvironment.NONE)
public class KafkaProducerChartDataTest {

	@Autowired
	private KafkaProducerChartData kafkaProducer;

	@Test
	@DisplayName(value = "Test for kafka producer for chart-data")
	void producerTest() throws InterruptedException, ExecutionException {

		// given
		ChartData chartData = new ChartData("AAPL", "Apple Inc.", LocalDate.now(), new BigDecimal("120.22"), "USD");

		// when
		//kafkaProducer.sendMessage(chartData);

		// then
	}
}
