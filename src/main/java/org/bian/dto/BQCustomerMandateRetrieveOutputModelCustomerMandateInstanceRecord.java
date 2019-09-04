package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCustomerMandateEvaluateOutputModelCustomerMandateInstanceRecordServicingMandateAgreementCustomerProductServiceProfile;

import javax.validation.Valid;
  
/**
 * BQCustomerMandateRetrieveOutputModelCustomerMandateInstanceRecord
 */
public class BQCustomerMandateRetrieveOutputModelCustomerMandateInstanceRecord   {
  private String customerReference = null;

  private BQCustomerMandateEvaluateOutputModelCustomerMandateInstanceRecordServicingMandateAgreementCustomerProductServiceProfile servicingMandateAgreementCustomerProductServiceProfile = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the individual customer be accessed through the servicing order 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * Get servicingMandateAgreementCustomerProductServiceProfile
   * @return servicingMandateAgreementCustomerProductServiceProfile
  **/

  public BQCustomerMandateEvaluateOutputModelCustomerMandateInstanceRecordServicingMandateAgreementCustomerProductServiceProfile getServicingMandateAgreementCustomerProductServiceProfile() {
    return servicingMandateAgreementCustomerProductServiceProfile;
  }

  public void setServicingMandateAgreementCustomerProductServiceProfile(BQCustomerMandateEvaluateOutputModelCustomerMandateInstanceRecordServicingMandateAgreementCustomerProductServiceProfile servicingMandateAgreementCustomerProductServiceProfile) {
    this.servicingMandateAgreementCustomerProductServiceProfile = servicingMandateAgreementCustomerProductServiceProfile;
  }


}

