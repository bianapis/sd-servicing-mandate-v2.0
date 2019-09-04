package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRServicingMandateAgreementControlInputModelServicingMandateAgreementControlActionRequest;

import javax.validation.Valid;
  
/**
 * BQCustomerMandateControlInputModel
 */
public class BQCustomerMandateControlInputModel   {
  private String servicingMandateAgreementInstanceReference = null;

  private String customerMandateInstanceReference = null;

  private Object customerMandateControlActionTaskRecord = null;

  private CRServicingMandateAgreementControlInputModelServicingMandateAgreementControlActionRequest customerMandateControlActionRequest = null;


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
   * Get customerMandateControlActionRequest
   * @return customerMandateControlActionRequest
  **/

  public CRServicingMandateAgreementControlInputModelServicingMandateAgreementControlActionRequest getCustomerMandateControlActionRequest() {
    return customerMandateControlActionRequest;
  }

  public void setCustomerMandateControlActionRequest(CRServicingMandateAgreementControlInputModelServicingMandateAgreementControlActionRequest customerMandateControlActionRequest) {
    this.customerMandateControlActionRequest = customerMandateControlActionRequest;
  }


}

