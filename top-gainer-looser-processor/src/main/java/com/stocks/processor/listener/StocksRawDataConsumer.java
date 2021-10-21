package com.stocks.processor.listener;

import com.stocks.processor.model.RootModel;
import com.stocks.processor.service.TopGainerLooserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class StocksRawDataConsumer {

    @Autowired
    TopGainerLooserServiceImpl topGainerLooserService;

    @KafkaListener(topics = "script-raw-data", group = "raw-data-consumer", containerFactory = "kafkaListenerContainerFactory")
    public void stocksRawDataListener(RootModel rootModel) {
        topGainerLooserService.collectStocksDetails(rootModel);
    }
}
