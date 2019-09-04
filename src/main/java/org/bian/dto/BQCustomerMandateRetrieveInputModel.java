package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCustomerMandateRetrieveInputModelCustomerMandateInstanceAnalysis;
import org.bian.dto.BQCustomerMandateRetrieveInputModelCustomerMandateInstanceReport;

import javax.validation.Valid;
  
/**
 * BQCustomerMandateRetrieveInputModel
 */
public class BQCustomerMandateRetrieveInputModel   {
  private Object customerMandateRetrieveActionTaskRecord = null;

  private String customerMandateRetrieveActionRequest = null;

  private BQCustomerMandateRetrieveInputModelCustomerMandateInstanceReport customerMandateInstanceReport = null;

  private BQCustomerMandateRetrieveInputModelCustomerMandateInstanceAnalysis customerMandateInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return customerMandateRetrieveActionTaskRecord
  **/

  public Object getCustomerMandateRetrieveActionTaskRecord() {
    return customerMandateRetrieveActionTaskRecord;
  }

  public void setCustomerMandateRetrieveActionTaskRecord(Object customerMandateRetrieveActionTaskRecord) {
    this.customerMandateRetrieveActionTaskRecord = customerMandateRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return customerMandateRetrieveActionRequest
  **/

  public String getCustomerMandateRetrieveActionRequest() {
    return customerMandateRetrieveActionRequest;
  }

  public void setCustomerMandateRetrieveActionRequest(String customerMandateRetrieveActionRequest) {
    this.customerMandateRetrieveActionRequest = customerMandateRetrieveActionRequest;
  }


  /**
   * Get customerMandateInstanceReport
   * @return customerMandateInstanceReport
  **/

  public BQCustomerMandateRetrieveInputModelCustomerMandateInstanceReport getCustomerMandateInstanceReport() {
    return customerMandateInstanceReport;
  }

  public void setCustomerMandateInstanceReport(BQCustomerMandateRetrieveInputModelCustomerMandateInstanceReport customerMandateInstanceReport) {
    this.customerMandateInstanceReport = customerMandateInstanceReport;
  }


  /**
   * Get customerMandateInstanceAnalysis
   * @return customerMandateInstanceAnalysis
  **/

  public BQCustomerMandateRetrieveInputModelCustomerMandateInstanceAnalysis getCustomerMandateInstanceAnalysis() {
    return customerMandateInstanceAnalysis;
  }

  public void setCustomerMandateInstanceAnalysis(BQCustomerMandateRetrieveInputModelCustomerMandateInstanceAnalysis customerMandateInstanceAnalysis) {
    this.customerMandateInstanceAnalysis = customerMandateInstanceAnalysis;
  }


}

