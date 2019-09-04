package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRServicingMandateAgreementGrantInputModelGrantRequestInputRecord;

import javax.validation.Valid;
  
/**
 * BQCustomerMandateGrantInputModel
 */
public class BQCustomerMandateGrantInputModel   {
  private String servicingMandateAgreementInstanceReference = null;

  private String customerMandateInstanceReference = null;

  private Object customerMandateGrantActionTaskRecord = null;

  private String grantRequestRecordType = null;

  private CRServicingMandateAgreementGrantInputModelGrantRequestInputRecord grantRequestInputRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The grant service call consolidated processing record 
   * @return customerMandateGrantActionTaskRecord
  **/

  public Object getCustomerMandateGrantActionTaskRecord() {
    return customerMandateGrantActionTaskRecord;
  }

  public void setCustomerMandateGrantActionTaskRecord(Object customerMandateGrantActionTaskRecord) {
    this.customerMandateGrantActionTaskRecord = customerMandateGrantActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Grant request type (e.g. access permission) 
   * @return grantRequestRecordType
  **/

  public String getGrantRequestRecordType() {
    return grantRequestRecordType;
  }

  public void setGrantRequestRecordType(String grantRequestRecordType) {
    this.grantRequestRecordType = grantRequestRecordType;
  }


  /**
   * Get grantRequestInputRecord
   * @return grantRequestInputRecord
  **/

  public CRServicingMandateAgreementGrantInputModelGrantRequestInputRecord getGrantRequestInputRecord() {
    return grantRequestInputRecord;
  }

  public void setGrantRequestInputRecord(CRServicingMandateAgreementGrantInputModelGrantRequestInputRecord grantRequestInputRecord) {
    this.grantRequestInputRecord = grantRequestInputRecord;
  }


}

