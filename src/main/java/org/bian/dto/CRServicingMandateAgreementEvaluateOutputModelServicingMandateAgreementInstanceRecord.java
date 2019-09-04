package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRServicingMandateAgreementEvaluateOutputModelServicingMandateAgreementInstanceRecordServicingMandateAgreementProductServiceProfile;

import javax.validation.Valid;
  
/**
 * CRServicingMandateAgreementEvaluateOutputModelServicingMandateAgreementInstanceRecord
 */
public class CRServicingMandateAgreementEvaluateOutputModelServicingMandateAgreementInstanceRecord   {
  private String servicingMandateAgreementValidFromToDate = null;

  private String documentDirectoryEntryInstanceReference = null;

  private String servicingMandateAgreementProductServiceProfileReference = null;

  private CRServicingMandateAgreementEvaluateOutputModelServicingMandateAgreementInstanceRecordServicingMandateAgreementProductServiceProfile servicingMandateAgreementProductServiceProfile = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The term for the mandate to be in force 
   * @return servicingMandateAgreementValidFromToDate
  **/

  public String getServicingMandateAgreementValidFromToDate() {
    return servicingMandateAgreementValidFromToDate;
  }

  public void setServicingMandateAgreementValidFromToDate(String servicingMandateAgreementValidFromToDate) {
    this.servicingMandateAgreementValidFromToDate = servicingMandateAgreementValidFromToDate;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to any supporting documents 
   * @return documentDirectoryEntryInstanceReference
  **/

  public String getDocumentDirectoryEntryInstanceReference() {
    return documentDirectoryEntryInstanceReference;
  }

  public void setDocumentDirectoryEntryInstanceReference(String documentDirectoryEntryInstanceReference) {
    this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the record that defines allowed access 
   * @return servicingMandateAgreementProductServiceProfileReference
  **/

  public String getServicingMandateAgreementProductServiceProfileReference() {
    return servicingMandateAgreementProductServiceProfileReference;
  }

  public void setServicingMandateAgreementProductServiceProfileReference(String servicingMandateAgreementProductServiceProfileReference) {
    this.servicingMandateAgreementProductServiceProfileReference = servicingMandateAgreementProductServiceProfileReference;
  }


  /**
   * Get servicingMandateAgreementProductServiceProfile
   * @return servicingMandateAgreementProductServiceProfile
  **/

  public CRServicingMandateAgreementEvaluateOutputModelServicingMandateAgreementInstanceRecordServicingMandateAgreementProductServiceProfile getServicingMandateAgreementProductServiceProfile() {
    return servicingMandateAgreementProductServiceProfile;
  }

  public void setServicingMandateAgreementProductServiceProfile(CRServicingMandateAgreementEvaluateOutputModelServicingMandateAgreementInstanceRecordServicingMandateAgreementProductServiceProfile servicingMandateAgreementProductServiceProfile) {
    this.servicingMandateAgreementProductServiceProfile = servicingMandateAgreementProductServiceProfile;
  }


}

