package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCustomerMandateRetrieveOutputModelCustomerMandateInstanceAnalysis
 */
public class BQCustomerMandateRetrieveOutputModelCustomerMandateInstanceAnalysis   {
  private Object customerMandateInstanceAnalysisRecord = null;

  private String customerMandateInstanceAnalysisReportType = null;

  private String customerMandateInstanceAnalysisParameters = null;

  private Object customerMandateInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return customerMandateInstanceAnalysisRecord
  **/

  public Object getCustomerMandateInstanceAnalysisRecord() {
    return customerMandateInstanceAnalysisRecord;
  }

  public void setCustomerMandateInstanceAnalysisRecord(Object customerMandateInstanceAnalysisRecord) {
    this.customerMandateInstanceAnalysisRecord = customerMandateInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return customerMandateInstanceAnalysisReportType
  **/

  public String getCustomerMandateInstanceAnalysisReportType() {
    return customerMandateInstanceAnalysisReportType;
  }

  public void setCustomerMandateInstanceAnalysisReportType(String customerMandateInstanceAnalysisReportType) {
    this.customerMandateInstanceAnalysisReportType = customerMandateInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return customerMandateInstanceAnalysisParameters
  **/

  public String getCustomerMandateInstanceAnalysisParameters() {
    return customerMandateInstanceAnalysisParameters;
  }

  public void setCustomerMandateInstanceAnalysisParameters(String customerMandateInstanceAnalysisParameters) {
    this.customerMandateInstanceAnalysisParameters = customerMandateInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return customerMandateInstanceAnalysisReport
  **/

  public Object getCustomerMandateInstanceAnalysisReport() {
    return customerMandateInstanceAnalysisReport;
  }

  public void setCustomerMandateInstanceAnalysisReport(Object customerMandateInstanceAnalysisReport) {
    this.customerMandateInstanceAnalysisReport = customerMandateInstanceAnalysisReport;
  }


}

