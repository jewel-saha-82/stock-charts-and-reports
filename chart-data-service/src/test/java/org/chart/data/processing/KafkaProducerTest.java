package org.chart.data.processing;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.concurrent.ExecutionException;

import org.assertj.core.api.BDDAssertions;
import org.chart.data.processing.kafka.KafkaProducer;
import org.chart.data.processing.model.ChartData;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

@SpringBootTest(webEnvironment = WebEnvironment.NONE)
public class KafkaProducerTest {

	@Autowired
	private KafkaProducer kafkaProducer;

	@Test
	@DisplayName(value = "Test for kafka producer")
	void producerTest() throws InterruptedException, ExecutionException {

		// given
		ChartData chartData = new ChartData("AAPL", "Apple Inc.", LocalDate.now(), new BigDecimal("120.22"), "USD");

		// when
		boolean status = kafkaProducer.sendMessage(chartData);

		// then
		BDDAssertions.then(status).isEqualTo(true);
	}
}
