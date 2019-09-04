package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRServicingMandateAgreementGrantOutputModelGrantRequestResponseRecord;

import javax.validation.Valid;
  
/**
 * CRServicingMandateAgreementGrantOutputModel
 */
public class CRServicingMandateAgreementGrantOutputModel   {
  private String servicingMandateAgreementGrantActionTaskReference = null;

  private Object servicingMandateAgreementGrantActionTaskRecord = null;

  private String grantRequestRecordReference = null;

  private CRServicingMandateAgreementGrantOutputModelGrantRequestResponseRecord grantRequestResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Servicing Mandate Agreement instance grant service call 
   * @return servicingMandateAgreementGrantActionTaskReference
  **/

  public String getServicingMandateAgreementGrantActionTaskReference() {
    return servicingMandateAgreementGrantActionTaskReference;
  }

  public void setServicingMandateAgreementGrantActionTaskReference(String servicingMandateAgreementGrantActionTaskReference) {
    this.servicingMandateAgreementGrantActionTaskReference = servicingMandateAgreementGrantActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The grant service call consolidated processing record 
   * @return servicingMandateAgreementGrantActionTaskRecord
  **/

  public Object getServicingMandateAgreementGrantActionTaskRecord() {
    return servicingMandateAgreementGrantActionTaskRecord;
  }

  public void setServicingMandateAgreementGrantActionTaskRecord(Object servicingMandateAgreementGrantActionTaskRecord) {
    this.servicingMandateAgreementGrantActionTaskRecord = servicingMandateAgreementGrantActionTaskRecord;
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

