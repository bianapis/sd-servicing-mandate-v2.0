package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRServicingMandateAgreementExchangeInputModelServicingMandateAgreementExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQCustomerMandateExchangeInputModel
 */
public class BQCustomerMandateExchangeInputModel   {
  private String servicingMandateAgreementInstanceReference = null;

  private String customerMandateInstanceReference = null;

  private Object customerMandateExchangeActionTaskRecord = null;

  private CRServicingMandateAgreementExchangeInputModelServicingMandateAgreementExchangeActionRequest customerMandateExchangeActionRequest = null;


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
   * Get customerMandateExchangeActionRequest
   * @return customerMandateExchangeActionRequest
  **/

  public CRServicingMandateAgreementExchangeInputModelServicingMandateAgreementExchangeActionRequest getCustomerMandateExchangeActionRequest() {
    return customerMandateExchangeActionRequest;
  }

  public void setCustomerMandateExchangeActionRequest(CRServicingMandateAgreementExchangeInputModelServicingMandateAgreementExchangeActionRequest customerMandateExchangeActionRequest) {
    this.customerMandateExchangeActionRequest = customerMandateExchangeActionRequest;
  }


}

