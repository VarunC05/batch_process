package com.spring.batch.config;

import java.math.BigDecimal;

import org.springframework.batch.item.ItemProcessor;

import com.spring.batch.entity.Voltage;

public class VoltageProcessor implements ItemProcessor<Voltage,Voltage>{

	@Override
	public Voltage process(final Voltage voltage) throws Exception {
		final BigDecimal volt = voltage.getVolt();
		final double time = voltage.getTime();
		
		final Voltage processorVoltage = new Voltage();
		processorVoltage.setVolt(volt);
		processorVoltage.setTime(time);
		return processorVoltage;
	}

}
