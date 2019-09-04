package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCustomerMandateEvaluateOutputModelCustomerMandateInstanceRecordServicingMandateAgreementCustomerProductServiceProfile
 */
public class BQCustomerMandateEvaluateOutputModelCustomerMandateInstanceRecordServicingMandateAgreementCustomerProductServiceProfile   {
  private String productServiceType = null;

  private String servicingMandateAgreementCustomerProductServiceTypeAccess = null;

  private String servicingMandateAgreementCustomerProductServiceTypeUsage = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines if and under what terms a product/service can be accessed for this customer under the mandate 
   * @return servicingMandateAgreementCustomerProductServiceTypeAccess
  **/

  public String getServicingMandateAgreementCustomerProductServiceTypeAccess() {
    return servicingMandateAgreementCustomerProductServiceTypeAccess;
  }

  public void setServicingMandateAgreementCustomerProductServiceTypeAccess(String servicingMandateAgreementCustomerProductServiceTypeAccess) {
    this.servicingMandateAgreementCustomerProductServiceTypeAccess = servicingMandateAgreementCustomerProductServiceTypeAccess;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Records the usage of products/service under the mandate for control purposes 
   * @return servicingMandateAgreementCustomerProductServiceTypeUsage
  **/

  public String getServicingMandateAgreementCustomerProductServiceTypeUsage() {
    return servicingMandateAgreementCustomerProductServiceTypeUsage;
  }

  public void setServicingMandateAgreementCustomerProductServiceTypeUsage(String servicingMandateAgreementCustomerProductServiceTypeUsage) {
    this.servicingMandateAgreementCustomerProductServiceTypeUsage = servicingMandateAgreementCustomerProductServiceTypeUsage;
  }


}

