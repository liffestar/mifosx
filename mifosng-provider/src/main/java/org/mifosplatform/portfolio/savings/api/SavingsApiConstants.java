/**
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mifosplatform.portfolio.savings.api;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.mifosplatform.accounting.common.AccountingConstants.SAVINGS_PRODUCT_ACCOUNTING_PARAMS;
import org.mifosplatform.portfolio.savings.data.SavingsAccountData;
import org.mifosplatform.portfolio.savings.data.SavingsProductData;

public class SavingsApiConstants {

    public static final String SAVINGS_PRODUCT_RESOURCE_NAME = "savingsproduct";
    public static final String SAVINGS_ACCOUNT_RESOURCE_NAME = "savingsaccount";
    public static final String SAVINGS_ACCOUNT_TRANSACTION_RESOURCE_NAME = "savingsaccount.transaction";

    // general
    public static final String localeParamName = "locale";
    public static final String dateFormatParamName = "dateFormat";
    public static final String monthDayFormatParamName = "monthDayFormat";

    // savings product and account parameters
    public static final String idParamName = "id";
    public static final String accountNoParamName = "accountNo";
    public static final String externalIdParamName = "externalId";
    public static final String statusParamName = "status";
    public static final String clientIdParamName = "clientId";
    public static final String groupIdParamName = "groupId";
    public static final String productIdParamName = "productId";
    public static final String activeParamName = "active";
    public static final String activationDateParamName = "activationDate";
    public static final String nameParamName = "name";
    public static final String descriptionParamName = "description";
    public static final String currencyCodeParamName = "currencyCode";
    public static final String digitsAfterDecimalParamName = "digitsAfterDecimal";
    public static final String nominalAnnualInterestRateParamName = "nominalAnnualInterestRate";
    public static final String interestCompoundingPeriodTypeParamName = "interestCompoundingPeriodType";
    public static final String interestPostingPeriodTypeParamName = "interestPostingPeriodType";
    public static final String interestCalculationTypeParamName = "interestCalculationType";
    public static final String interestCalculationDaysInYearTypeParamName = "interestCalculationDaysInYearType";
    public static final String minRequiredOpeningBalanceParamName = "minRequiredOpeningBalance";
    public static final String lockinPeriodFrequencyParamName = "lockinPeriodFrequency";
    public static final String lockinPeriodFrequencyTypeParamName = "lockinPeriodFrequencyType";
    public static final String withdrawalFeeAmountParamName = "withdrawalFeeAmount";
    public static final String withdrawalFeeTypeParamName = "withdrawalFeeType";
    public static final String annualFeeAmountParamName = "annualFeeAmount";
    public static final String annualFeeOnMonthDayParamName = "annualFeeOnMonthDay";
    public static final String accountingRuleParamName = "accountingRule";
    public static final String paymentTypeIdParamName = "paymentTypeId";
    public static final String accountNumberParamName = "accountNumber";
    public static final String checkNumberParamName = "checkNumber";
    public static final String routingCodeParamName = "routingCode";
    public static final String receiptNumberParamName = "receiptNumber";
    public static final String bankNumberParamName = "bankNumber";

    // transaction parameters
    public static final String transactionDateParamName = "transactionDate";
    public static final String transactionAmountParamName = "transactionAmount";

    public static final Set<String> SAVINGS_PRODUCT_REQUEST_DATA_PARAMETERS = new HashSet<String>(Arrays.asList(localeParamName,
            monthDayFormatParamName, nameParamName, descriptionParamName, currencyCodeParamName, digitsAfterDecimalParamName,
            nominalAnnualInterestRateParamName, interestCompoundingPeriodTypeParamName, interestPostingPeriodTypeParamName,
            interestCalculationTypeParamName, interestCalculationDaysInYearTypeParamName, minRequiredOpeningBalanceParamName,
            lockinPeriodFrequencyParamName, lockinPeriodFrequencyTypeParamName, withdrawalFeeAmountParamName, withdrawalFeeTypeParamName,
            annualFeeAmountParamName, annualFeeOnMonthDayParamName, accountingRuleParamName,
            SAVINGS_PRODUCT_ACCOUNTING_PARAMS.INCOME_FROM_FEES.getValue(),
            SAVINGS_PRODUCT_ACCOUNTING_PARAMS.INTEREST_ON_SAVINGS.getValue(),
            SAVINGS_PRODUCT_ACCOUNTING_PARAMS.PAYMENT_CHANNEL_FUND_SOURCE_MAPPING.getValue(),
            SAVINGS_PRODUCT_ACCOUNTING_PARAMS.SAVINGS_CONTROL.getValue(), SAVINGS_PRODUCT_ACCOUNTING_PARAMS.SAVINGS_REFERENCE.getValue()));

    /**
     * These parameters will match the class level parameters of
     * {@link SavingsProductData}. Where possible, we try to get response
     * parameters to match those of request parameters.
     */
    public static final Set<String> SAVINGS_PRODUCT_RESPONSE_DATA_PARAMETERS = new HashSet<String>(Arrays.asList(idParamName,
            nameParamName, descriptionParamName, "currency", digitsAfterDecimalParamName, nominalAnnualInterestRateParamName,
            interestCompoundingPeriodTypeParamName, interestPostingPeriodTypeParamName, interestCalculationTypeParamName,
            interestCalculationDaysInYearTypeParamName, minRequiredOpeningBalanceParamName, lockinPeriodFrequencyParamName,
            lockinPeriodFrequencyTypeParamName, withdrawalFeeAmountParamName, withdrawalFeeTypeParamName, annualFeeAmountParamName,
            annualFeeOnMonthDayParamName, "currencyOptions", "interestCompoundingPeriodTypeOptions", "interestPostingPeriodTypeOptions",
            "interestCalculationTypeOptions", "interestCalculationDaysInYearTypeOptions", "lockinPeriodFrequencyTypeOptions",
            "withdrawalFeeTypeOptions"));

    public static final Set<String> SAVINGS_ACCOUNT_REQUEST_DATA_PARAMETERS = new HashSet<String>(Arrays.asList(localeParamName,
            dateFormatParamName, monthDayFormatParamName, accountNoParamName, externalIdParamName, clientIdParamName, groupIdParamName,
            productIdParamName, activeParamName, activationDateParamName, nominalAnnualInterestRateParamName,
            interestCompoundingPeriodTypeParamName, interestPostingPeriodTypeParamName, interestCalculationTypeParamName,
            interestCalculationDaysInYearTypeParamName, minRequiredOpeningBalanceParamName, lockinPeriodFrequencyParamName,
            lockinPeriodFrequencyTypeParamName, withdrawalFeeAmountParamName, withdrawalFeeTypeParamName, annualFeeAmountParamName,
            annualFeeOnMonthDayParamName));

    /**
     * These parameters will match the class level parameters of
     * {@link SavingsAccountData}. Where possible, we try to get response
     * parameters to match those of request parameters.
     */
    public static final Set<String> SAVINGS_ACCOUNT_RESPONSE_DATA_PARAMETERS = new HashSet<String>(Arrays.asList(idParamName,
            accountNoParamName, externalIdParamName, statusParamName, activationDateParamName, clientIdParamName, "clientName",
            groupIdParamName, "groupName", "savingsProductId", "savingsProductName", "currency", nominalAnnualInterestRateParamName,
            interestCompoundingPeriodTypeParamName, interestCalculationTypeParamName, interestCalculationDaysInYearTypeParamName,
            minRequiredOpeningBalanceParamName, lockinPeriodFrequencyParamName, lockinPeriodFrequencyTypeParamName,
            withdrawalFeeAmountParamName, withdrawalFeeTypeParamName, annualFeeAmountParamName, annualFeeOnMonthDayParamName, "summary",
            "transactions", "productOptions", "interestCompoundingPeriodTypeOptions", "interestPostingPeriodTypeOptions",
            "interestCalculationTypeOptions", "interestCalculationDaysInYearTypeOptions", "lockinPeriodFrequencyTypeOptions",
            "withdrawalFeeTypeOptions"));

    public static final Set<String> SAVINGS_ACCOUNT_TRANSACTION_REQUEST_DATA_PARAMETERS = new HashSet<String>(Arrays.asList(
            localeParamName, dateFormatParamName, transactionDateParamName, transactionAmountParamName, paymentTypeIdParamName,
            accountNumberParamName, checkNumberParamName, routingCodeParamName, receiptNumberParamName, bankNumberParamName));

    public static final Set<String> SAVINGS_TRANSACTION_RESPONSE_DATA_PARAMETERS = new HashSet<String>(Arrays.asList(idParamName,
            "accountId", accountNoParamName, "currency", "amount"));

    public static final Set<String> SAVINGS_ACCOUNT_ACTIVATION_REQUEST_DATA_PARAMETERS = new HashSet<String>(Arrays.asList(localeParamName,
            dateFormatParamName, activationDateParamName));
}