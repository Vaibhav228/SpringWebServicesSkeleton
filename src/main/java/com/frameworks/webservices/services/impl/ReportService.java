package com.frameworks.webservices.services.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.frameworks.webservices.contract.ReportRequest;
import com.frameworks.webservices.contract.ReportResponse;
import com.frameworks.webservices.services.IReportService;

@Component
public class ReportService implements IReportService{
	
	private static final Logger logger = LoggerFactory.getLogger(ReportService.class);

	public ReportResponse saveReportDetail(ReportRequest request) {
		return null;
	}

	public List<ReportResponse> loadReportTemplates(ReportRequest request) {
		return null;
	}
}
