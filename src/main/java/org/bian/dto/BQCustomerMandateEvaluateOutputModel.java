package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCustomerMandateEvaluateOutputModelCustomerMandateInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQCustomerMandateEvaluateOutputModel
 */
public class BQCustomerMandateEvaluateOutputModel   {
  private String customerMandateInstanceReference = null;

  private String customerMandateInitiateActionReference = null;

  private Object customerMandateInitiateActionRecord = null;

  private String customerMandateInstanceStatus = null;

  private BQCustomerMandateEvaluateOutputModelCustomerMandateInstanceRecord customerMandateInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Customer Mandate instance 
   * @return customerMandateInstanceReference
  **/

  public String getCustomerMandateInstanceReference() {
    return customerMandateInstanceReference;
  }

  public void setCustomerMandateInstanceReference(String customerMandateInstanceReference) {
    this.customerMandateInstanceReference = customerMandateInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return customerMandateInitiateActionReference
  **/

  public String getCustomerMandateInitiateActionReference() {
    return customerMandateInitiateActionReference;
  }

  public void setCustomerMandateInitiateActionReference(String customerMandateInitiateActionReference) {
    this.customerMandateInitiateActionReference = customerMandateInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return customerMandateInitiateActionRecord
  **/

  public Object getCustomerMandateInitiateActionRecord() {
    return customerMandateInitiateActionRecord;
  }

  public void setCustomerMandateInitiateActionRecord(Object customerMandateInitiateActionRecord) {
    this.customerMandateInitiateActionRecord = customerMandateInitiateActionRecord;
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


  /**
   * Get customerMandateInstanceRecord
   * @return customerMandateInstanceRecord
  **/

  public BQCustomerMandateEvaluateOutputModelCustomerMandateInstanceRecord getCustomerMandateInstanceRecord() {
    return customerMandateInstanceRecord;
  }

  public void setCustomerMandateInstanceRecord(BQCustomerMandateEvaluateOutputModelCustomerMandateInstanceRecord customerMandateInstanceRecord) {
    this.customerMandateInstanceRecord = customerMandateInstanceRecord;
  }


}

