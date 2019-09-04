package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCustomerMandateRetrieveOutputModelCustomerMandateInstanceReport
 */
public class BQCustomerMandateRetrieveOutputModelCustomerMandateInstanceReport   {
  private Object customerMandateInstanceReportRecord = null;

  private String customerMandateInstanceReportType = null;

  private String customerMandateInstanceReportParameters = null;

  private Object customerMandateInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return customerMandateInstanceReportRecord
  **/

  public Object getCustomerMandateInstanceReportRecord() {
    return customerMandateInstanceReportRecord;
  }

  public void setCustomerMandateInstanceReportRecord(Object customerMandateInstanceReportRecord) {
    this.customerMandateInstanceReportRecord = customerMandateInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return customerMandateInstanceReportType
  **/

  public String getCustomerMandateInstanceReportType() {
    return customerMandateInstanceReportType;
  }

  public void setCustomerMandateInstanceReportType(String customerMandateInstanceReportType) {
    this.customerMandateInstanceReportType = customerMandateInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return customerMandateInstanceReportParameters
  **/

  public String getCustomerMandateInstanceReportParameters() {
    return customerMandateInstanceReportParameters;
  }

  public void setCustomerMandateInstanceReportParameters(String customerMandateInstanceReportParameters) {
    this.customerMandateInstanceReportParameters = customerMandateInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return customerMandateInstanceReport
  **/

  public Object getCustomerMandateInstanceReport() {
    return customerMandateInstanceReport;
  }

  public void setCustomerMandateInstanceReport(Object customerMandateInstanceReport) {
    this.customerMandateInstanceReport = customerMandateInstanceReport;
  }


}

