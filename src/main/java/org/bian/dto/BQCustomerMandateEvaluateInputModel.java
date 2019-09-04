package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCustomerMandateEvaluateInputModelCustomerMandateInstanceRecord;
import org.bian.dto.BQCustomerMandateEvaluateInputModelServicingMandateAgreementInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQCustomerMandateEvaluateInputModel
 */
public class BQCustomerMandateEvaluateInputModel   {
  private BQCustomerMandateEvaluateInputModelServicingMandateAgreementInstanceRecord servicingMandateAgreementInstanceRecord = null;

  private String servicingMandateAgreementInstanceReference = null;

  private Object customerMandateInitiateActionRecord = null;

  private BQCustomerMandateEvaluateInputModelCustomerMandateInstanceRecord customerMandateInstanceRecord = null;


  /**
   * Get servicingMandateAgreementInstanceRecord
   * @return servicingMandateAgreementInstanceRecord
  **/

  public BQCustomerMandateEvaluateInputModelServicingMandateAgreementInstanceRecord getServicingMandateAgreementInstanceRecord() {
    return servicingMandateAgreementInstanceRecord;
  }

  public void setServicingMandateAgreementInstanceRecord(BQCustomerMandateEvaluateInputModelServicingMandateAgreementInstanceRecord servicingMandateAgreementInstanceRecord) {
    this.servicingMandateAgreementInstanceRecord = servicingMandateAgreementInstanceRecord;
  }


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
   * Get customerMandateInstanceRecord
   * @return customerMandateInstanceRecord
  **/

  public BQCustomerMandateEvaluateInputModelCustomerMandateInstanceRecord getCustomerMandateInstanceRecord() {
    return customerMandateInstanceRecord;
  }

  public void setCustomerMandateInstanceRecord(BQCustomerMandateEvaluateInputModelCustomerMandateInstanceRecord customerMandateInstanceRecord) {
    this.customerMandateInstanceRecord = customerMandateInstanceRecord;
  }


}

