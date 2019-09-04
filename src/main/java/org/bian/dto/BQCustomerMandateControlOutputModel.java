package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCustomerMandateControlOutputModel
 */
public class BQCustomerMandateControlOutputModel   {
  private String customerMandateControlActionTaskReference = null;

  private Object customerMandateControlActionTaskRecord = null;

  private String customerMandateControlActionResponse = null;

  private String customerMandateInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Mandate instance control processing service call 
   * @return customerMandateControlActionTaskReference
  **/

  public String getCustomerMandateControlActionTaskReference() {
    return customerMandateControlActionTaskReference;
  }

  public void setCustomerMandateControlActionTaskReference(String customerMandateControlActionTaskReference) {
    this.customerMandateControlActionTaskReference = customerMandateControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return customerMandateControlActionTaskRecord
  **/

  public Object getCustomerMandateControlActionTaskRecord() {
    return customerMandateControlActionTaskRecord;
  }

  public void setCustomerMandateControlActionTaskRecord(Object customerMandateControlActionTaskRecord) {
    this.customerMandateControlActionTaskRecord = customerMandateControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return customerMandateControlActionResponse
  **/

  public String getCustomerMandateControlActionResponse() {
    return customerMandateControlActionResponse;
  }

  public void setCustomerMandateControlActionResponse(String customerMandateControlActionResponse) {
    this.customerMandateControlActionResponse = customerMandateControlActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Customer Mandate instance (e.g. initialised, pending, active) 
   * @return customerMandateInstanceStatus
  **/

  public String getCustomerMandateInstanceStatus() {
    return customerMandateInstanceStatus;
  }

  public void setCustomerMandateInstanceStatus(String customerMandateInstanceStatus) {
    this.customerMandateInstanceStatus = customerMandateInstanceStatus;
  }


}

