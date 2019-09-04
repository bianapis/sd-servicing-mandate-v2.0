package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCustomerMandateUpdateInputModelCustomerMandateInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQCustomerMandateUpdateInputModel
 */
public class BQCustomerMandateUpdateInputModel   {
  private String servicingMandateAgreementInstanceReference = null;

  private String customerMandateInstanceReference = null;

  private BQCustomerMandateUpdateInputModelCustomerMandateInstanceRecord customerMandateInstanceRecord = null;

  private Object customerMandateUpdateActionTaskRecord = null;

  private String customerMandateUpdateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Servicing Mandate Agreement instance 
   * @return servicingMandateAgreementInstanceReference
  **/

  public String getServicingMandateAgreementInstanceReference() {
    return servicingMandateAgreementInstanceReference;
  }

  public void setServicingMandateAgreementInstanceReference(String servicingMandateAgreementInstanceReference) {
    this.servicingMandateAgreementInstanceReference = servicingMandateAgreementInstanceReference;
  }


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
   * Get customerMandateInstanceRecord
   * @return customerMandateInstanceRecord
  **/

  public BQCustomerMandateUpdateInputModelCustomerMandateInstanceRecord getCustomerMandateInstanceRecord() {
    return customerMandateInstanceRecord;
  }

  public void setCustomerMandateInstanceRecord(BQCustomerMandateUpdateInputModelCustomerMandateInstanceRecord customerMandateInstanceRecord) {
    this.customerMandateInstanceRecord = customerMandateInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return customerMandateUpdateActionTaskRecord
  **/

  public Object getCustomerMandateUpdateActionTaskRecord() {
    return customerMandateUpdateActionTaskRecord;
  }

  public void setCustomerMandateUpdateActionTaskRecord(Object customerMandateUpdateActionTaskRecord) {
    this.customerMandateUpdateActionTaskRecord = customerMandateUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return customerMandateUpdateActionRequest
  **/

  public String getCustomerMandateUpdateActionRequest() {
    return customerMandateUpdateActionRequest;
  }

  public void setCustomerMandateUpdateActionRequest(String customerMandateUpdateActionRequest) {
    this.customerMandateUpdateActionRequest = customerMandateUpdateActionRequest;
  }


}

