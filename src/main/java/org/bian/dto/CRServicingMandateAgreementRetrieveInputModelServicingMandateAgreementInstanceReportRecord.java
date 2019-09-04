package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRServicingMandateAgreementRetrieveInputModelServicingMandateAgreementInstanceReportRecord
 */
public class CRServicingMandateAgreementRetrieveInputModelServicingMandateAgreementInstanceReportRecord   {
  private String servicingMandateAgreementInstanceReportReference = null;

  private String servicingMandateAgreementInstanceReportType = null;

  private String servicingMandateAgreementInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return servicingMandateAgreementInstanceReportReference
  **/

  public String getServicingMandateAgreementInstanceReportReference() {
    return servicingMandateAgreementInstanceReportReference;
  }

  public void setServicingMandateAgreementInstanceReportReference(String servicingMandateAgreementInstanceReportReference) {
    this.servicingMandateAgreementInstanceReportReference = servicingMandateAgreementInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return servicingMandateAgreementInstanceReportType
  **/

  public String getServicingMandateAgreementInstanceReportType() {
    return servicingMandateAgreementInstanceReportType;
  }

  public void setServicingMandateAgreementInstanceReportType(String servicingMandateAgreementInstanceReportType) {
    this.servicingMandateAgreementInstanceReportType = servicingMandateAgreementInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return servicingMandateAgreementInstanceReportParameters
  **/

  public String getServicingMandateAgreementInstanceReportParameters() {
    return servicingMandateAgreementInstanceReportParameters;
  }

  public void setServicingMandateAgreementInstanceReportParameters(String servicingMandateAgreementInstanceReportParameters) {
    this.servicingMandateAgreementInstanceReportParameters = servicingMandateAgreementInstanceReportParameters;
  }


}

