/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface ServicingMandateApiService {

	SDServicingMandateActivateOutputModel activate(SDServicingMandateActivateInputModel request);
	
	SDServicingMandateConfigureOutputModel configure(String sdReferenceId, SDServicingMandateConfigureInputModel request);
	
	BQCustomerMandateControlOutputModel controlCustomermandate(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCustomerMandateControlInputModel request);
	
	CRServicingMandateAgreementControlOutputModel control(String sdReferenceId, String crReferenceId, CRServicingMandateAgreementControlInputModel request);
	
	CRServicingMandateAgreementEvaluateOutputModel evaluate(String sdReferenceId, CRServicingMandateAgreementEvaluateInputModel request);
	
	BQCustomerMandateEvaluateOutputModel evaluateCustomermandate(String sdReferenceId, String crReferenceId, BQCustomerMandateEvaluateInputModel request);
	
	BQCustomerMandateExchangeOutputModel exchangeCustomermandate(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCustomerMandateExchangeInputModel request);
	
	CRServicingMandateAgreementExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRServicingMandateAgreementExchangeInputModel request);
	
	SDServicingMandateFeedbackOutputModel feedback(String sdReferenceId, SDServicingMandateFeedbackInputModel request);
	
	BQCustomerMandateGrantOutputModel grantCustomermandate(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCustomerMandateGrantInputModel request);
	
	CRServicingMandateAgreementGrantOutputModel grant(String sdReferenceId, String crReferenceId, CRServicingMandateAgreementGrantInputModel request);
	
	CRServicingMandateAgreementRequestOutputModel request(String sdReferenceId, String crReferenceId, CRServicingMandateAgreementRequestInputModel request);
	
	SDServicingMandateRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRServicingMandateAgreementRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	BQCustomerMandateRetrieveOutputModel retrieveCustomermandate(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	CRServicingMandateAgreementUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRServicingMandateAgreementUpdateInputModel request);
	
	BQCustomerMandateUpdateOutputModel updateCustomermandate(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCustomerMandateUpdateInputModel request);
	
}
