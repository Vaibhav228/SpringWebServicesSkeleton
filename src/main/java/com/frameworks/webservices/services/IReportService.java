package com.frameworks.webservices.services;

import java.util.List;

import com.frameworks.webservices.contract.ReportRequest;
import com.frameworks.webservices.contract.ReportResponse;


public interface IReportService {

	public ReportResponse saveReportDetail(ReportRequest request);
	
	public List<ReportResponse> loadReportTemplates(ReportRequest request);
}
