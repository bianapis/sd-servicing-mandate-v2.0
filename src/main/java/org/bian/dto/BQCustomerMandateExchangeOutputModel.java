package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCustomerMandateExchangeOutputModel
 */
public class BQCustomerMandateExchangeOutputModel   {
  private String customerMandateExchangeActionTaskReference = null;

  private Object customerMandateExchangeActionTaskRecord = null;

  private String customerMandateExchangeActionResponse = null;

  private String customerMandateInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Mandate instance exchange service call 
   * @return customerMandateExchangeActionTaskReference
  **/

  public String getCustomerMandateExchangeActionTaskReference() {
    return customerMandateExchangeActionTaskReference;
  }

  public void setCustomerMandateExchangeActionTaskReference(String customerMandateExchangeActionTaskReference) {
    this.customerMandateExchangeActionTaskReference = customerMandateExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return customerMandateExchangeActionTaskRecord
  **/

  public Object getCustomerMandateExchangeActionTaskRecord() {
    return customerMandateExchangeActionTaskRecord;
  }

  public void setCustomerMandateExchangeActionTaskRecord(Object customerMandateExchangeActionTaskRecord) {
    this.customerMandateExchangeActionTaskRecord = customerMandateExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return customerMandateExchangeActionResponse
  **/

  public String getCustomerMandateExchangeActionResponse() {
    return customerMandateExchangeActionResponse;
  }

  public void setCustomerMandateExchangeActionResponse(String customerMandateExchangeActionResponse) {
    this.customerMandateExchangeActionResponse = customerMandateExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Customer Mandate instance (e.g. accepted, rejected, verified) 
   * @return customerMandateInstanceStatus
  **/

  public String getCustomerMandateInstanceStatus() {
    return customerMandateInstanceStatus;
  }

  public void setCustomerMandateInstanceStatus(String customerMandateInstanceStatus) {
    this.customerMandateInstanceStatus = customerMandateInstanceStatus;
  }


}

