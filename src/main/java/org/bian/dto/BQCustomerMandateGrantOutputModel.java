package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRServicingMandateAgreementGrantOutputModelGrantRequestResponseRecord;

import javax.validation.Valid;
  
/**
 * BQCustomerMandateGrantOutputModel
 */
public class BQCustomerMandateGrantOutputModel   {
  private String customerMandateGrantActionTaskReference = null;

  private Object customerMandateGrantActionTaskRecord = null;

  private String grantRequestRecordReference = null;

  private CRServicingMandateAgreementGrantOutputModelGrantRequestResponseRecord grantRequestResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Mandate instance grant service call 
   * @return customerMandateGrantActionTaskReference
  **/

  public String getCustomerMandateGrantActionTaskReference() {
    return customerMandateGrantActionTaskReference;
  }

  public void setCustomerMandateGrantActionTaskReference(String customerMandateGrantActionTaskReference) {
    this.customerMandateGrantActionTaskReference = customerMandateGrantActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the grant request record 
   * @return grantRequestRecordReference
  **/

  public String getGrantRequestRecordReference() {
    return grantRequestRecordReference;
  }

  public void setGrantRequestRecordReference(String grantRequestRecordReference) {
    this.grantRequestRecordReference = grantRequestRecordReference;
  }


  /**
   * Get grantRequestResponseRecord
   * @return grantRequestResponseRecord
  **/

  public CRServicingMandateAgreementGrantOutputModelGrantRequestResponseRecord getGrantRequestResponseRecord() {
    return grantRequestResponseRecord;
  }

  public void setGrantRequestResponseRecord(CRServicingMandateAgreementGrantOutputModelGrantRequestResponseRecord grantRequestResponseRecord) {
    this.grantRequestResponseRecord = grantRequestResponseRecord;
  }


}

