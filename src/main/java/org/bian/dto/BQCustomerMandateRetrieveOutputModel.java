package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCustomerMandateRetrieveOutputModelCustomerMandateInstanceAnalysis;
import org.bian.dto.BQCustomerMandateRetrieveOutputModelCustomerMandateInstanceRecord;
import org.bian.dto.BQCustomerMandateRetrieveOutputModelCustomerMandateInstanceReport;
import org.bian.dto.BQCustomerMandateRetrieveOutputModelServicingMandateAgreementInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQCustomerMandateRetrieveOutputModel
 */
public class BQCustomerMandateRetrieveOutputModel   {
  private BQCustomerMandateRetrieveOutputModelServicingMandateAgreementInstanceRecord servicingMandateAgreementInstanceRecord = null;

  private BQCustomerMandateRetrieveOutputModelCustomerMandateInstanceRecord customerMandateInstanceRecord = null;

  private String customerMandateRetrieveActionTaskReference = null;

  private Object customerMandateRetrieveActionTaskRecord = null;

  private String customerMandateRetrieveActionResponse = null;

  private BQCustomerMandateRetrieveOutputModelCustomerMandateInstanceReport customerMandateInstanceReport = null;

  private BQCustomerMandateRetrieveOutputModelCustomerMandateInstanceAnalysis customerMandateInstanceAnalysis = null;


  /**
   * Get servicingMandateAgreementInstanceRecord
   * @return servicingMandateAgreementInstanceRecord
  **/

  public BQCustomerMandateRetrieveOutputModelServicingMandateAgreementInstanceRecord getServicingMandateAgreementInstanceRecord() {
    return servicingMandateAgreementInstanceRecord;
  }

  public void setServicingMandateAgreementInstanceRecord(BQCustomerMandateRetrieveOutputModelServicingMandateAgreementInstanceRecord servicingMandateAgreementInstanceRecord) {
    this.servicingMandateAgreementInstanceRecord = servicingMandateAgreementInstanceRecord;
  }


  /**
   * Get customerMandateInstanceRecord
   * @return customerMandateInstanceRecord
  **/

  public BQCustomerMandateRetrieveOutputModelCustomerMandateInstanceRecord getCustomerMandateInstanceRecord() {
    return customerMandateInstanceRecord;
  }

  public void setCustomerMandateInstanceRecord(BQCustomerMandateRetrieveOutputModelCustomerMandateInstanceRecord customerMandateInstanceRecord) {
    this.customerMandateInstanceRecord = customerMandateInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Mandate instance retrieve service call 
   * @return customerMandateRetrieveActionTaskReference
  **/

  public String getCustomerMandateRetrieveActionTaskReference() {
    return customerMandateRetrieveActionTaskReference;
  }

  public void setCustomerMandateRetrieveActionTaskReference(String customerMandateRetrieveActionTaskReference) {
    this.customerMandateRetrieveActionTaskReference = customerMandateRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return customerMandateRetrieveActionResponse
  **/

  public String getCustomerMandateRetrieveActionResponse() {
    return customerMandateRetrieveActionResponse;
  }

  public void setCustomerMandateRetrieveActionResponse(String customerMandateRetrieveActionResponse) {
    this.customerMandateRetrieveActionResponse = customerMandateRetrieveActionResponse;
  }


  /**
   * Get customerMandateInstanceReport
   * @return customerMandateInstanceReport
  **/

  public BQCustomerMandateRetrieveOutputModelCustomerMandateInstanceReport getCustomerMandateInstanceReport() {
    return customerMandateInstanceReport;
  }

  public void setCustomerMandateInstanceReport(BQCustomerMandateRetrieveOutputModelCustomerMandateInstanceReport customerMandateInstanceReport) {
    this.customerMandateInstanceReport = customerMandateInstanceReport;
  }


  /**
   * Get customerMandateInstanceAnalysis
   * @return customerMandateInstanceAnalysis
  **/

  public BQCustomerMandateRetrieveOutputModelCustomerMandateInstanceAnalysis getCustomerMandateInstanceAnalysis() {
    return customerMandateInstanceAnalysis;
  }

  public void setCustomerMandateInstanceAnalysis(BQCustomerMandateRetrieveOutputModelCustomerMandateInstanceAnalysis customerMandateInstanceAnalysis) {
    this.customerMandateInstanceAnalysis = customerMandateInstanceAnalysis;
  }


}

