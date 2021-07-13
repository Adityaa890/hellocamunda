package com.example.demo.service;

import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.ProcessEngines;
import org.camunda.bpm.engine.runtime.ProcessInstanceWithVariables;
import org.camunda.bpm.engine.runtime.ProcessInstantiationBuilder;
import org.springframework.stereotype.Service;

@Service
public class TriggerService {

	
	public void triggerProcess(String processKey) throws Exception {
		ProcessEngine engine = ProcessEngines.getDefaultProcessEngine();

		ProcessInstantiationBuilder instance = engine.getRuntimeService().createProcessInstanceByKey(processKey);	
		ProcessInstanceWithVariables response = instance.executeWithVariablesInReturn();
	
}	
}
