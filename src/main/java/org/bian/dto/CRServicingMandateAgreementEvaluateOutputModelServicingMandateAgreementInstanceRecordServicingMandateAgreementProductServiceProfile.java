package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRServicingMandateAgreementEvaluateOutputModelServicingMandateAgreementInstanceRecordServicingMandateAgreementProductServiceProfile
 */
public class CRServicingMandateAgreementEvaluateOutputModelServicingMandateAgreementInstanceRecordServicingMandateAgreementProductServiceProfile   {
  private String productServiceType = null;

  private String servicingMandateAgreementProductServiceTypeEligibility = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A type of product or service covered by the mandate 
   * @return productServiceType
  **/

  public String getProductServiceType() {
    return productServiceType;
  }

  public void setProductServiceType(String productServiceType) {
    this.productServiceType = productServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines if and under what terms a product/service is accessible under the mandate 
   * @return servicingMandateAgreementProductServiceTypeEligibility
  **/

  public String getServicingMandateAgreementProductServiceTypeEligibility() {
    return servicingMandateAgreementProductServiceTypeEligibility;
  }

  public void setServicingMandateAgreementProductServiceTypeEligibility(String servicingMandateAgreementProductServiceTypeEligibility) {
    this.servicingMandateAgreementProductServiceTypeEligibility = servicingMandateAgreementProductServiceTypeEligibility;
  }


}

