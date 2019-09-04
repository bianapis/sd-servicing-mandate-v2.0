package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRServicingMandateAgreementEvaluateInputModelServicingMandateAgreementInstanceRecord
 */
public class CRServicingMandateAgreementEvaluateInputModelServicingMandateAgreementInstanceRecord   {
  private String customerReference = null;

  private String servicingMandateAgreementType = null;

  private String servicingMandateAgreementJurisdiction = null;

  private String servicingMandateAgreementValidFromToDate = null;

  private String servicingMandateAgreementResponsibleParties = null;

  private String documentDirectoryEntryInstanceReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the third party service provider with the servicing mandate (also a bank customer) 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of third party mandates (e.g. PSD2) 
   * @return servicingMandateAgreementType
  **/

  public String getServicingMandateAgreementType() {
    return servicingMandateAgreementType;
  }

  public void setServicingMandateAgreementType(String servicingMandateAgreementType) {
    this.servicingMandateAgreementType = servicingMandateAgreementType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The defines any limitation on the geographic coverage/scope of the mandate 
   * @return servicingMandateAgreementJurisdiction
  **/

  public String getServicingMandateAgreementJurisdiction() {
    return servicingMandateAgreementJurisdiction;
  }

  public void setServicingMandateAgreementJurisdiction(String servicingMandateAgreementJurisdiction) {
    this.servicingMandateAgreementJurisdiction = servicingMandateAgreementJurisdiction;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to any involved authorities and interested parties 
   * @return servicingMandateAgreementResponsibleParties
  **/

  public String getServicingMandateAgreementResponsibleParties() {
    return servicingMandateAgreementResponsibleParties;
  }

  public void setServicingMandateAgreementResponsibleParties(String servicingMandateAgreementResponsibleParties) {
    this.servicingMandateAgreementResponsibleParties = servicingMandateAgreementResponsibleParties;
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


}

