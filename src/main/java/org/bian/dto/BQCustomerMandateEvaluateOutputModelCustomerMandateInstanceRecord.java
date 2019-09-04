package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCustomerMandateEvaluateOutputModelCustomerMandateInstanceRecordServicingMandateAgreementCustomerProductServiceProfile;

import javax.validation.Valid;
  
/**
 * BQCustomerMandateEvaluateOutputModelCustomerMandateInstanceRecord
 */
public class BQCustomerMandateEvaluateOutputModelCustomerMandateInstanceRecord   {
  private BQCustomerMandateEvaluateOutputModelCustomerMandateInstanceRecordServicingMandateAgreementCustomerProductServiceProfile servicingMandateAgreementCustomerProductServiceProfile = null;


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

