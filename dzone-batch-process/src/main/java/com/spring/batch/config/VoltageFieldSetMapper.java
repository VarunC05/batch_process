package com.spring.batch.config;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindException;

import com.spring.batch.entity.Voltage;

@Component
public class VoltageFieldSetMapper implements FieldSetMapper<Voltage>{

	@Override
	public Voltage mapFieldSet(FieldSet fieldSet) throws BindException {
		
		final Voltage voltage = new Voltage();
		
		voltage.setVolt(fieldSet.readBigDecimal("volt"));
		voltage.setTime(fieldSet.readDouble("time"));
		return voltage;
	}

}
