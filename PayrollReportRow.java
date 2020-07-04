import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PayrollReportRow {
    String country = "";
    String entityCode = null;
    String empId = null;
    String equityType = null;
    String lastName = null;
    String firstName = null;
    LocalDate fmvDateOrExerciseDate = null;
    double eeReportableAmount = -10.0;
    double amountSubgToWithholding = -10.0;
    double amountSubjToSoSec = -10.0;
    double totalTaxWithheldByMssb = -10.0;
    double fracShareRefund = -10.0;
    double totalReceivedByMSSB = -10.0;
    String purno = null;
    LocalDate releaseOrExerciseDate = null;
    LocalDate originalGrantDate = null;
    double numOfShares = -10.0;
    double optionStrikePrice = -10.0;
    double fmvOnDayOfReleaseOrExercise = -10.0;
    String combinedPurno = "";
    String grantIdAwardId = null;
    String paymentMethodOrExerciseType = null;
    double fedTax = -10.0;
    double stateTax = -10.0;
    double loc1 = -10.0;
    double loc2 = -10.0;
    double fica1 = -10.0;
    double fica2 = -10.0;
    LocalDate award_date = null;
    String userCode3China = null;
    String locationId = null;
    String payrollCode = null;
    double salePriceStcSafeOnly = -10.0;
    double backupWithholdingTax = -10.0;
    LocalDate hireDate = null;
    LocalDate terminationDate = null;
    double optionsGranted = -10.0;
    String awardType = null;
    double taxShares = -10.0;
    double sharesDeleivered = -10.0;
    String currentCountry = null;
    LocalDate pwcVestDate = null;
    LocalDate pwcExerciseDate = null;
    String ukGmobNicTransfer = null;
    double foreignTaxCredit = -10.0;
    double taxWithheldByMssb = -10.0;
    double eeSocSecByMssb = -10.0;
    double grossGain = -10.0;
    String usCitizen = null;
    String calcId = null;
    String mobilityType = null;
    double eeReportableIncome = -10.0;
    LocalDate fmvDateFromPwcCalc = null;
    String canCurrentCountryRefund = null;
    String canTaxCountryRefund = null;
    String mssbLocal2ForAuditPurposesOnlyDisreguarding = null;
    String eeLevelPurno = null;
    String notInConos = null;
    double canadaExchangeRate = -10.0;
    String equalizedEe = null;
    String countryEqualized = null;
    String regionEqualized = null;
    String socSecEqualized = null;
    double totalHypo = -10.0;
    double locApportionedIncome = -10.0;
    double hypoTax = -10.0;
    double netIncome = -10.0;
    double grossUp = -10.0;
    double grossedUpIncome = -10.0;
    double netErReportable = -10.0;
    double netSubjToWithholding = -10.0;
    double proRated = -10.0;
    String thirtyPercRuling = null;
    String swissCPermitHolder = null;
    String w4Cert = null;
    String nTCode = null;
    String shadow_Payroll = null;
    double eeSocSecReportable = -10.0;
    String irelandFtc = null;
    String overrideWithholding = null;
    double workdayPercentage = -10.0;
    double erSocSecReportable = -10.0;
    double proratedIncomeAmount = -10.0;
    String locCode = null;
    double domesticTaxCred = -10.0;
    String isResidentInUlti = null;
    String taxRecacStatus = null;

    static int countryCount = 0;
    static int entityCodeCount = 0;
    static int empIdCount = 0;
    static int equityTypeCount = 0;
    static int lastNameCount = 0;
    static int firstNameCount = 0;
    static int fmvDateOrExerciseDateCount = 0;
    static int eeReportableAmountCount = 0;
    static int amountSubgToWithholdingCount = 0;
    static int amountSubjToSoSecCount = 0;
    static int totalTaxWithheldByMssbCount = 0;
    static int fracShareRefundCount = 0;
    static int totalReceivedByMSSBCount = 0;
    static int purnoCount = 0;
    static int releaseOrExerciseDateCount = 0;
    static int originalGrantDateCount = 0;
    static int numOfSharesCount = 0;
    static int optionStrikePriceCount = 0;
    static int fmvOnDayOfReleaseOrExerciseCount = 0;
    static int combinedPurnoCount = 0;
    static int grantIdAwardIdCount = 0;
    static int paymentMethodOrExerciseTypeCount = 0;
    static int fedTaxCount = 0;
    static int stateTaxCount = 0;
    static int loc1Count = 0;
    static int loc2Count = 0;
    static int fica1Count = 0;
    static int fica2Count = 0;
    static int award_dateCount = 0;
    static int userCode3ChinaCount = 0;
    static int locationIdCount = 0;
    static int payrollCodeCount = 0;
    static int salePriceStcSafeOnlyCount = 0;
    static int backupWithholdingTaxCount = 0;
    static int hireDateCount = 0;
    static int terminationDateCount = 0;
    static int optionsGrantedCount = 0;
    static int awardTypeCount = 0;
    static int taxSharesCount = 0;
    static int sharesDeleiveredCount = 0;
    static int currentCountryCount = 0;
    static int pwcVestDateCount = 0;
    static int pwcExerciseDateCount = 0;
    static int ukGmobNicTransferCount = 0;
    static int foreignTaxCreditCount = 0;
    static int taxWithheldByMssbCount = 0;
    static int eeSocSecByMssbCount = 0;
    static int grossGainCount = 0;
    static int usCitizenCount = 0;
    static int calcIdCount = 0;
    static int mobilityTypeCount = 0;
    static int eeReportableIncomeCount = 0;
    static int fmvDateFromPwcCalcCount = 0;
    static int canCurrentCountryRefundCount = 0;
    static int canTaxCountryRefundCount = 0;
    static int mssbLocal2ForAuditPurposesOnlyDisreguardingCount = 0;
    static int eeLevelPurnoCount = 0;
    static int notInConosCount = 0;
    static int canadaExchangeRateCount = 0;
    static int equalizedEeCount = 0;
    static int countryEqualizedCount = 0;
    static int regionEqualizedCount = 0;
    static int socSecEqualizedCount = 0;
    static int totalHypoCount = 0;
    static int locApportionedIncomeCount = 0;
    static int hypoTaxCount = 0;
    static int netIncomeCount = 0;
    static int grossUpCount = 0;
    static int grossedUpIncomeCount = 0;
    static int netErReportableCount = 0;
    static int netSubjToWithholdingCount = 0;
    static int proRatedCount = 0;
    static int thirtyPercRulingCount = 0;
    static int swissCPermitHolderCount = 0;
    static int w4CertCount = 0;
    static int nTCodeCount = 0;
    static int shadow_PayrollCount = 0;
    static int eeSocSecReportableCount = 0;
    static int irelandFtcCount = 0;
    static int overrideWithholdingCount = 0;
    static int workdayPercentageCount = 0;
    static int erSocSecReportableCount = 0;
    static int proratedIncomeAmountCount = 0;
    static int locCodeCount = 0;
    static int domesticTaxCredCount = 0;
    static int isResidentInUltiCount = 0;
    static int taxRecacStatusCount = 0;

    public PayrollReportRow(String row,
                            int country_Index,
                            int entityCode_Index,
                            int empId_Index,
                            int equityType_Index,
                            int lastName_Index,
                            int firstName_Index,
                            int fmvDateOrExerciseDate_Index,
                            int eeReportableAmount_Index,
                            int amountSubgToWithholding_Index,
                            int amountSubjToSoSec_Index,
                            int totalTaxWithheldByMssb_Index,
                            int fracShareRefund_Index,
                            int totalReceivedByMSSB_Index,
                            int purno_Index,
                            int releaseOrExerciseDate_Index,
                            int originalGrantDate_Index,
                            int numOfShares_Index,
                            int optionStrikePrice_Index,
                            int fmvOnDayOfReleaseOrExercise_Index,
                            int combinedPurno_Index,
                            int grantIdAwardId_Index,
                            int paymentMethodOrExerciseType_Index,
                            int fedTax_Index,
                            int stateTax_Index,
                            int loc1_Index,
                            int loc2_Index,
                            int fica1_Index,
                            int fica2_Index,
                            int award_date_Index,
                            int userCode3China_Index,
                            int locationId_Index,
                            int payrollCode_Index,
                            int salePriceStcSafeOnly_Index,
                            int backupWithholdingTax_Index,
                            int hireDate_Index,
                            int terminationDate_Index,
                            int optionsGranted_Index,
                            int awardType_Index,
                            int taxShares_Index,
                            int sharesDeleivered_Index,
                            int currentCountry_Index,
                            int pwcVestDate_Index,
                            int pwcExerciseDate_Index,
                            int ukGmobNicTransfer_Index,
                            int foreignTaxCredit_Index,
                            int taxWithheldByMssb_Index,
                            int eeSocSecByMssb_Index,
                            int grossGain_Index,
                            int usCitizen_Index,
                            int calcId_Index,
                            int mobilityType_Index,
                            int eeReportableIncome_Index,
                            int fmvDateFromPwcCalc_Index,
                            int canCurrentCountryRefund_Index,
                            int canTaxCountryRefund_Index,
                            int mssbLocal2ForAuditPurposesOnlyDisreguarding_Index,
                            int eeLevelPurno_Index,
                            int notInConos_Index,
                            int canadaExchangeRate_Index,
                            int equalizedEe_Index,
                            int countryEqualized_Index,
                            int regionEqualized_Index,
                            int socSecEqualized_Index,
                            int totalHypo_Index,
                            int locApportionedIncome_Index,
                            int hypoTax_Index,
                            int netIncome_Index,
                            int grossUp_Index,
                            int grossedUpIncome_Index,
                            int netErReportable_Index,
                            int netSubjToWithholding_Index,
                            int proRated_Index,
                            int thirtyPercRuling_Index,
                            int swissCPermitHolder_Index,
                            int w4Cert_Index,
                            int nTCode_Index,
                            int shadow_Payroll_Index,
                            int eeSocSecReportable_Index,
                            int irelandFtc_Index,
                            int overrideWithholding_Index,
                            int workdayPercentage_Index,
                            int erSocSecReportable_Index,
                            int proratedIncomeAmount_Index,
                            int locCode_Index,
                            int domesticTaxCred_Index,
                            int isResidentInUlti_Index,
                            int taxRecacStatus_Index) {


        row = row.replaceAll("$", "");
        row = row.replaceAll("%", "");
        row = row.replaceAll(",", "");
        row = row.replaceAll("\"", "");
        row = row.replaceAll("\t", ",");
        row = row.replaceAll(" ", "");
        row = row.replaceAll("Autosale", "SAS");

        DateTimeFormatter dtf = new DateTimeFormatterBuilder().parseCaseInsensitive()
                .appendPattern("dd-MMM-yyyy")
                .toFormatter();

        DateTimeFormatter dtf2 = new DateTimeFormatterBuilder().parseCaseInsensitive()
                .appendPattern("d-MMM-yyyy")
                .toFormatter();

        List<String> splitRow = Arrays.asList(row.split(","));
//        for (int i = 0; i < splitRow.size(); i++) {
//            if ("".equals(splitRow.get(i))) {
//                splitRow.set(i, "Blank");
//            }
//        }


        try {
            if (country_Index != -1)
                country = splitRow.get(country_Index);
            if (entityCode_Index != -1)
                entityCode = splitRow.get(entityCode_Index);
            if (empId_Index != -1)
                empId = splitRow.get(empId_Index);
            if (equityType_Index != -1)
                equityType = splitRow.get(equityType_Index);
            if (lastName_Index != -1)
                lastName = splitRow.get(lastName_Index);
            if (firstName_Index != -1)
                firstName = splitRow.get(firstName_Index);
            if (fmvDateOrExerciseDate_Index != -1 && !splitRow.get(fmvDateOrExerciseDate_Index).equals("")) {
                try {
                    fmvDateOrExerciseDate = LocalDate.parse(splitRow.get(fmvDateOrExerciseDate_Index), dtf);
                } catch (DateTimeParseException e) {
                    fmvDateOrExerciseDate = LocalDate.parse(splitRow.get(fmvDateOrExerciseDate_Index), dtf2);
                }
            }
            if (eeReportableAmount_Index != -1)
                eeReportableAmount = new Double(splitRow.get(eeReportableAmount_Index));
            if (amountSubgToWithholding_Index != -1)
                amountSubgToWithholding = new Double(splitRow.get(amountSubgToWithholding_Index));
            if (amountSubjToSoSec_Index != -1)
                amountSubjToSoSec = new Double(splitRow.get(amountSubjToSoSec_Index));
            if (totalTaxWithheldByMssb_Index != -1)
                totalTaxWithheldByMssb = new Double(splitRow.get(totalTaxWithheldByMssb_Index));
            if (fracShareRefund_Index != -1)
                fracShareRefund = new Double(splitRow.get(fracShareRefund_Index));
            if (totalReceivedByMSSB_Index != -1)
                totalReceivedByMSSB = new Double(splitRow.get(totalReceivedByMSSB_Index));
            if (purno_Index != -1)
                purno = splitRow.get(purno_Index);
            if (releaseOrExerciseDate_Index != -1 && !splitRow.get(releaseOrExerciseDate_Index).equals("")) {
                try {
                    releaseOrExerciseDate = LocalDate.parse(splitRow.get(releaseOrExerciseDate_Index), dtf);
                } catch (DateTimeParseException e) {
                    releaseOrExerciseDate = LocalDate.parse(splitRow.get(releaseOrExerciseDate_Index), dtf2);
                }
            }
            if (originalGrantDate_Index != -1 && !splitRow.get(originalGrantDate_Index).equals("")) {
                try {
                    originalGrantDate = LocalDate.parse(splitRow.get(originalGrantDate_Index), dtf);
                } catch (DateTimeParseException e) {
                    originalGrantDate = LocalDate.parse(splitRow.get(originalGrantDate_Index), dtf2);
                }
            }
            if (numOfShares_Index != -1)
                numOfShares = new Double(splitRow.get(numOfShares_Index));
            if (optionStrikePrice_Index != -1)
                optionStrikePrice = new Double(splitRow.get(optionStrikePrice_Index));
            if (fmvOnDayOfReleaseOrExercise_Index != -1)
                fmvOnDayOfReleaseOrExercise = new Double(splitRow.get(fmvOnDayOfReleaseOrExercise_Index));
            if (combinedPurno_Index != -1)
                combinedPurno = splitRow.get(combinedPurno_Index);
            if (grantIdAwardId_Index != -1)
                grantIdAwardId = splitRow.get(grantIdAwardId_Index);
            if (paymentMethodOrExerciseType_Index != -1)
                paymentMethodOrExerciseType = splitRow.get(paymentMethodOrExerciseType_Index);
            if (fedTax_Index != -1)
                fedTax = new Double(splitRow.get(fedTax_Index));
            if (stateTax_Index != -1)
                stateTax = new Double(splitRow.get(stateTax_Index));
            if (loc1_Index != -1)
                loc1 = new Double(splitRow.get(loc1_Index));
            if (loc2_Index != -1)
                loc2 = new Double(splitRow.get(loc2_Index));
            if (fica1_Index != -1)
                fica1 = new Double(splitRow.get(fica1_Index));
            if (fica2_Index != -1)
                fica2 = new Double(splitRow.get(fica2_Index));
            if (award_date_Index != -1 && !splitRow.get(award_date_Index).equals("")) {
                try {
                    award_date = LocalDate.parse(splitRow.get(award_date_Index), dtf);
                } catch (DateTimeParseException e) {
                    award_date = LocalDate.parse(splitRow.get(award_date_Index), dtf2);
                }
            }
            if (userCode3China_Index != -1)
                userCode3China = splitRow.get(userCode3China_Index);
            if (locationId_Index != -1)
                locationId = splitRow.get(locationId_Index);
            if (payrollCode_Index != -1)
                payrollCode = splitRow.get(payrollCode_Index);
            if (salePriceStcSafeOnly_Index != -1)
                salePriceStcSafeOnly = new Double(splitRow.get(salePriceStcSafeOnly_Index));
            if (backupWithholdingTax_Index != -1)
                backupWithholdingTax = new Double(splitRow.get(backupWithholdingTax_Index));
            if (hireDate_Index != -1 && !splitRow.get(hireDate_Index).equals("") && !splitRow.get(terminationDate_Index).equals("Blank")) {
                try {
                    hireDate = LocalDate.parse(splitRow.get(hireDate_Index), dtf);
                } catch (DateTimeParseException e) {
                    hireDate = LocalDate.parse(splitRow.get(hireDate_Index), dtf2);
                }
            }
            if (terminationDate_Index != -1 && !splitRow.get(terminationDate_Index).equals("Blank") && !splitRow.get(terminationDate_Index).equals("")) {
                try {
                    terminationDate = LocalDate.parse(splitRow.get(terminationDate_Index), dtf);
                } catch (DateTimeParseException e) {
                    terminationDate = LocalDate.parse(splitRow.get(terminationDate_Index), dtf2);
                }
            }
            if (optionsGranted_Index != -1)
                optionsGranted = new Double(splitRow.get(optionsGranted_Index));
            if (awardType_Index != -1)
                awardType = splitRow.get(awardType_Index);
            if (taxShares_Index != -1)
                taxShares = new Double(splitRow.get(taxShares_Index));
            if (sharesDeleivered_Index != -1)
                sharesDeleivered = new Double(splitRow.get(sharesDeleivered_Index));
            if (currentCountry_Index != -1)
                currentCountry = splitRow.get(currentCountry_Index);
            if (pwcVestDate_Index != -1) {
                try {
                    pwcVestDate = LocalDate.parse(splitRow.get(pwcVestDate_Index), dtf);
                } catch (DateTimeParseException e) {
                    pwcVestDate = LocalDate.parse(splitRow.get(pwcVestDate_Index), dtf2);
                }
            }
            if (pwcExerciseDate_Index != -1) {
                try {
                    pwcExerciseDate = LocalDate.parse(splitRow.get(pwcExerciseDate_Index), dtf);
                } catch (DateTimeParseException e) {
                    pwcExerciseDate = LocalDate.parse(splitRow.get(pwcExerciseDate_Index), dtf2);
                }
            }
            if (ukGmobNicTransfer_Index != -1)
                ukGmobNicTransfer = splitRow.get(ukGmobNicTransfer_Index);
            if (foreignTaxCredit_Index != -1)
                foreignTaxCredit = new Double(splitRow.get(foreignTaxCredit_Index));
            if (taxWithheldByMssb_Index != -1)
                taxWithheldByMssb = new Double(splitRow.get(taxWithheldByMssb_Index));
            if (eeSocSecByMssb_Index != -1)
                eeSocSecByMssb = new Double(splitRow.get(eeSocSecByMssb_Index));
            if (grossGain_Index != -1)
                grossGain = new Double(splitRow.get(grossGain_Index));
            if (usCitizen_Index != -1)
                usCitizen = splitRow.get(usCitizen_Index);
            if (calcId_Index != -1)
                calcId = splitRow.get(calcId_Index);
            if (mobilityType_Index != -1)
                mobilityType = splitRow.get(mobilityType_Index);
            if (eeReportableIncome_Index != -1)
                eeReportableIncome = new Double(splitRow.get(eeReportableIncome_Index));
            if (fmvDateFromPwcCalc_Index != -1 && !splitRow.get(fmvDateFromPwcCalc_Index).equals("") && !splitRow.get(fmvDateFromPwcCalc_Index).equals("Blank")) {
                try {
                    fmvDateFromPwcCalc = LocalDate.parse(splitRow.get(fmvDateFromPwcCalc_Index), dtf);
                } catch (DateTimeParseException e) {
                    fmvDateFromPwcCalc = LocalDate.parse(splitRow.get(fmvDateFromPwcCalc_Index), dtf2);
                }
            }
            if (canCurrentCountryRefund_Index != -1)
                canCurrentCountryRefund = splitRow.get(canCurrentCountryRefund_Index);
            if (canTaxCountryRefund_Index != -1)
                canTaxCountryRefund = splitRow.get(canTaxCountryRefund_Index);
            if (mssbLocal2ForAuditPurposesOnlyDisreguarding_Index != -1)
                mssbLocal2ForAuditPurposesOnlyDisreguarding = splitRow.get(mssbLocal2ForAuditPurposesOnlyDisreguarding_Index);
            if (eeLevelPurno_Index != -1)
                eeLevelPurno = splitRow.get(eeLevelPurno_Index);
            if (notInConos_Index != -1)
                notInConos = splitRow.get(notInConos_Index);
            if (canadaExchangeRate_Index != -1)
                canadaExchangeRate = new Double(splitRow.get(canadaExchangeRate_Index));
            if (equalizedEe_Index != -1)
                equalizedEe = splitRow.get(equalizedEe_Index);
            if (countryEqualized_Index != -1)
                countryEqualized = splitRow.get(countryEqualized_Index);
            if (regionEqualized_Index != -1)
                regionEqualized = splitRow.get(regionEqualized_Index);
            if (socSecEqualized_Index != -1)
                socSecEqualized = splitRow.get(socSecEqualized_Index);
            if (totalHypo_Index != -1)
                totalHypo = new Double(splitRow.get(totalHypo_Index));
            if (locApportionedIncome_Index != -1)
                locApportionedIncome = new Double(splitRow.get(locApportionedIncome_Index));
            if (hypoTax_Index != -1)
                hypoTax = new Double(splitRow.get(hypoTax_Index));
            if (netIncome_Index != -1)
                netIncome = new Double(splitRow.get(netIncome_Index));
            if (grossUp_Index != -1)
                grossUp = new Double(splitRow.get(grossUp_Index));
            if (grossedUpIncome_Index != -1)
                grossedUpIncome = new Double(splitRow.get(grossedUpIncome_Index));
            if (netErReportable_Index != -1)
                netErReportable = new Double(splitRow.get(netErReportable_Index));
            if (netSubjToWithholding_Index != -1 && !"".equals(splitRow.get(netSubjToWithholding_Index)))
                netSubjToWithholding = new Double(splitRow.get(netSubjToWithholding_Index));
//            if ((proRated_Index != -1) && (!"".equals(splitRow.get(proRated_Index))))
//                proRated = new Double(splitRow.get(proRated_Index));
            if (thirtyPercRuling_Index != -1)
                thirtyPercRuling = splitRow.get(thirtyPercRuling_Index);
            if (swissCPermitHolder_Index != -1)
                swissCPermitHolder = splitRow.get(swissCPermitHolder_Index);
            if (w4Cert_Index != -1)
                w4Cert = splitRow.get(w4Cert_Index);
            if (nTCode_Index != -1)
                nTCode = splitRow.get(nTCode_Index);
            if (shadow_Payroll_Index != -1)
                shadow_Payroll = splitRow.get(shadow_Payroll_Index);
            if (eeSocSecReportable_Index != -1)
                eeSocSecReportable = new Double(splitRow.get(eeSocSecReportable_Index));
            if (irelandFtc_Index != -1)
                irelandFtc = splitRow.get(irelandFtc_Index);
            if (overrideWithholding_Index != -1)
                overrideWithholding = splitRow.get(overrideWithholding_Index);
            if (workdayPercentage_Index != -1)
                if ("".equals(splitRow.get(workdayPercentage_Index)))
                    workdayPercentage = 0.0;
                else
                    workdayPercentage = new Double(splitRow.get(workdayPercentage_Index));
            if (erSocSecReportable_Index != -1)
                erSocSecReportable = new Double(splitRow.get(erSocSecReportable_Index));
            if (proratedIncomeAmount_Index != -1)
                proratedIncomeAmount = new Double(splitRow.get(proratedIncomeAmount_Index));
            if (locCode_Index != -1)
                locCode = splitRow.get(locCode_Index);
            if (domesticTaxCred_Index != -1)
                domesticTaxCred = new Double(splitRow.get(domesticTaxCred_Index));
            if (isResidentInUlti_Index != -1)
                try {
                    isResidentInUlti = splitRow.get(isResidentInUlti_Index);
                } catch (ArrayIndexOutOfBoundsException e) {

                }
            if (taxRecacStatus_Index != -1)
                taxRecacStatus = splitRow.get(taxRecacStatus_Index);
        } catch (Exception e) {
            System.out.println(row);
            System.out.println(e.getCause());
            e.printStackTrace();
            System.exit(-1);
        }
    }


    public String compare(PayrollReportRow other) {
        String errors = "";

// todo       if ((entityCode == null && other.entityCode != null) || !entityCode.equals(other.entityCode))
//            errors += grantIdAwardId + country + " ->  entityCode " + entityCode + " " + other.entityCode + "\n";
        if ((empId == null && other.empId != null) || !empId.equals(other.empId)) {
            errors += grantIdAwardId + country + " ->  empId " + empId + " " + other.empId + "\n";
            empIdCount++;
        }
        if ((equityType == null && other.equityType != null) || !equityType.equals(other.equityType)) {
            errors += grantIdAwardId + country + " ->  equityType " + equityType + " " + other.equityType + "\n";
            equityTypeCount++;
        }
//        if ((lastName == null && other.lastName != null) || !lastName.equals(other.lastName))
//            errors += grantIdAwardId + country + " ->  lastName " + lastName + " " + other.lastName + "\n";
//        if ((firstName == null && other.firstName != null) || !firstName.equals(other.firstName))
//            errors += grantIdAwardId + country + " ->  firstName " + firstName + " " + other.firstName + "\n";
        if ((fmvDateOrExerciseDate == null && other.fmvDateOrExerciseDate != null) || !fmvDateOrExerciseDate.equals(other.fmvDateOrExerciseDate)) {
            errors += grantIdAwardId + country + " ->  fmvDateOrExerciseDate " + fmvDateOrExerciseDate + " " + other.fmvDateOrExerciseDate + "\n";
            fmvDateOrExerciseDateCount++;
        }
// todo       if (compareDouble(eeReportableAmount,other.eeReportableAmount,0.01)) {
//            errors += grantIdAwardId + country + " ->  eeReportableAmount " + eeReportableAmount + " " + other.eeReportableAmount + "\n";
//              eeReportableAmountCount++;
//              }
//        if (amountSubgToWithholding != other.amountSubgToWithholding)
//            errors += grantIdAwardId + country + " ->  amountSubgToWithholding " + amountSubgToWithholding + " " + other.amountSubgToWithholding + "\n";
//              amountSubgToWithholdingCount++;
//              }
//        if (amountSubjToSoSec != other.amountSubjToSoSec)
//            errors += grantIdAwardId + country + " ->  amountSubjToSoSec " + amountSubjToSoSec + " " + other.amountSubjToSoSec + "\n";
//            amountSubjToSoSecCount++;
//        }
        if (totalTaxWithheldByMssb != other.totalTaxWithheldByMssb) {
            errors += grantIdAwardId + country + " ->  totalTaxWithheldByMssb " + totalTaxWithheldByMssb + " " + other.totalTaxWithheldByMssb + "\n";
            totalTaxWithheldByMssbCount++;
        }
// todo       if (fracShareRefund != other.fracShareRefund) {
//            errors += grantIdAwardId + country + " ->  fracShareRefund " + fracShareRefund + " " + other.fracShareRefund + "\n";
//              fracShareRefundCount++;
//              }
//  todo      if (totalReceivedByMSSB != other.totalReceivedByMSSB) {
//            errors += grantIdAwardId + country + " ->  totalReceivedByMSSB " + totalReceivedByMSSB + " " + other.totalReceivedByMSSB + "\n";
//          totalReceivedByMSSBCount++;
//        }
        if (purno == null || purno.equals(other.purno))
            errors += grantIdAwardId + country + " ->  purno " + purno + " " + other.purno + "\n";
        if ((releaseOrExerciseDate == null && other.releaseOrExerciseDate != null) || !releaseOrExerciseDate.equals(other.releaseOrExerciseDate)) {
            errors += grantIdAwardId + country + " ->  releaseOrExerciseDate " + releaseOrExerciseDate + " " + other.releaseOrExerciseDate + "\n";
            releaseOrExerciseDateCount++;
        }

        if ((originalGrantDate == null && other.originalGrantDate != null)
                || (originalGrantDate != null
                && !(originalGrantDate.getYear() == other.originalGrantDate.getYear() &&
                originalGrantDate.getMonth().getValue() == other.originalGrantDate.getMonth().getValue() &&
                originalGrantDate.getDayOfMonth() == other.originalGrantDate.getDayOfMonth()))) {
            errors += grantIdAwardId + country + " ->  originalGrantDate " + originalGrantDate + " " + other.originalGrantDate + "\n";
            originalGrantDateCount++;
        }

        if (numOfShares != other.numOfShares) {
            errors += grantIdAwardId + country + " ->  numOfShares " + numOfShares + " " + other.numOfShares + "\n";
            numOfSharesCount++;
        }
        if (optionStrikePrice != other.optionStrikePrice) {
            errors += grantIdAwardId + country + " ->  optionStrikePrice " + optionStrikePrice + " " + other.optionStrikePrice + "\n";
            optionStrikePriceCount++;
        }
        if (fmvOnDayOfReleaseOrExercise != other.fmvOnDayOfReleaseOrExercise) {
            errors += grantIdAwardId + country + " ->  fmvOnDayOfReleaseOrExercise " + fmvOnDayOfReleaseOrExercise + " " + other.fmvOnDayOfReleaseOrExercise + "\n";
            fmvOnDayOfReleaseOrExerciseCount++;
        }
        // we have different ref num naming methods
//        if (combinedPurno == null || combinedPurno.equals(other.combinedPurno))
//            errors += grantIdAwardId + country + " ->  combinedPurno " + combinedPurno + " " + other.combinedPurno + "\n";
        if ((paymentMethodOrExerciseType == null && other.paymentMethodOrExerciseType != null) || !paymentMethodOrExerciseType.equals(other.paymentMethodOrExerciseType)) {
            errors += grantIdAwardId + country + " ->  paymentMethodOrExerciseType " + paymentMethodOrExerciseType + " " + other.paymentMethodOrExerciseType + "\n";
            paymentMethodOrExerciseTypeCount++;
        }
        if (fedTax != other.fedTax) {
            errors += grantIdAwardId + country + " ->  fedTax " + fedTax + " " + other.fedTax + "\n";
            fedTaxCount++;
        }
        if (stateTax != other.stateTax) {
            errors += grantIdAwardId + country + " ->  stateTax " + stateTax + " " + other.stateTax + "\n";
            stateTax++;
        }

        if (loc1 != other.loc1) {
            errors += grantIdAwardId + country + " ->  loc1 " + loc1 + " " + other.loc1 + "\n";
            loc1Count++;
        }

        if (loc2 != other.loc2) {
            errors += grantIdAwardId + country + " ->  loc2 " + loc2 + " " + other.loc2 + "\n";
            loc2Count++;
        }

        if (fica1 != other.fica1) {
            errors += grantIdAwardId + country + " ->  fica1 " + fica1 + " " + other.fica1 + "\n";
            fica1Count++;
        }

        if (fica2 != other.fica2) {
            errors += grantIdAwardId + country + " ->  fica2 " + fica2 + " " + other.fica2 + "\n";
            fica2Count++;
        }

        if ((award_date == null && other.award_date != null) || !award_date.equals(other.award_date)) {
            errors += grantIdAwardId + country + " ->  award_date " + award_date + " " + other.award_date + "\n";
            award_dateCount++;
        }
        if ((userCode3China == null && other.userCode3China != null) || !userCode3China.equals(other.userCode3China)) {
            errors += grantIdAwardId + country + " " + other.purno + " " + other.empId + " ->  userCode3China " + userCode3China + " " + other.userCode3China + "\n";
            userCode3ChinaCount++;
        }

        if ((locationId == null && other.locationId != null) || !locationId.equals(other.locationId)) {
            errors += grantIdAwardId + country + " ->  locationId " + locationId + " " + other.locationId + "\n";
            locationIdCount++;
        }
        if ((payrollCode == null && other.payrollCode != null) || !payrollCode.equals(other.payrollCode)) {
            errors += grantIdAwardId + country + " ->  payrollCode " + payrollCode + " " + other.payrollCode + "\n";
            payrollCodeCount++;
        }
        if (Math.abs(salePriceStcSafeOnly - other.salePriceStcSafeOnly) > 0.004) {
            errors += grantIdAwardId + country + " " + other.purno + " " + other.empId + " ->  salePriceStcSafeOnly " + salePriceStcSafeOnly + " " + other.salePriceStcSafeOnly + "\n";
            salePriceStcSafeOnlyCount++;
        }

// todo       if (backupWithholdingTax != other.backupWithholdingTax) {
//            errors += grantIdAwardId + country + " ->  backupWithholdingTax " + backupWithholdingTax + " " + other.backupWithholdingTax + "\n";
//                backupWithholdingTaxCount++;
//                }

//todo        if ((hireDate == null && other.hireDate != null) || (hireDate != null && !hireDate.equals(other.hireDate))) {
//            errors += grantIdAwardId + country + " ->  hireDate " + hireDate + " " + other.hireDate + "\n";
//                hireDateCount++;
//                }

// todo       if ((terminationDate == null && other.terminationDate != null) || (terminationDate != null &&!terminationDate.equals(other.terminationDate))) {
//            errors += grantIdAwardId + country + " ->  terminationDate " + terminationDate + " " + other.terminationDate + "\n";
//                terminationDateCount++;
//                }

        if (optionsGranted != other.optionsGranted) {
            errors += grantIdAwardId + country + " ->  optionsGranted " + optionsGranted + " " + other.optionsGranted + "\n";
            optionsGrantedCount++;
        }
        if ((awardType == null && other.awardType != null) || !awardType.equals(other.awardType)) {
            errors += grantIdAwardId + country + " ->  awardType " + awardType + " " + other.awardType + "\n";
            awardTypeCount++;
        }
        if (taxShares != other.taxShares) {
            errors += grantIdAwardId + country + " ->  taxShares " + taxShares + " " + other.taxShares + "\n";
            taxSharesCount++;
        }

        if (sharesDeleivered != other.sharesDeleivered) {
            errors += grantIdAwardId + country + " ->  sharesDeleivered " + sharesDeleivered + " " + other.sharesDeleivered + "\n";
            sharesDeleiveredCount++;
        }
//  our data is more accurate because they report at time of report and we report at time of transaction
//        if ((currentCountry == null && other.currentCountry != null) || !currentCountry.equals(other.currentCountry))
//            errors += grantIdAwardId + country + " ->  currentCountry " + currentCountry + " " + other.currentCountry + "\n";

        if ((pwcVestDate == null && other.pwcVestDate != null) || !pwcVestDate.equals(other.pwcVestDate)) {
            errors += grantIdAwardId + country + " ->  pwcVestDate " + pwcVestDate + " " + other.pwcVestDate + "\n";
            pwcVestDateCount++;
        }

        if ((pwcExerciseDate == null && other.pwcExerciseDate != null) || !pwcExerciseDate.equals(other.pwcExerciseDate)) {
            errors += grantIdAwardId + country + " ->  pwcExerciseDate " + pwcExerciseDate + " " + other.pwcExerciseDate + "\n";
            pwcExerciseDateCount++;
        }
        if ((ukGmobNicTransfer == null && other.ukGmobNicTransfer != null) || !ukGmobNicTransfer.equals(other.ukGmobNicTransfer)) {
            errors += grantIdAwardId + country + " ->  ukGmobNicTransfer " + ukGmobNicTransfer + " " + other.ukGmobNicTransfer + "\n";
            ukGmobNicTransferCount++;
        }

        if (compareDouble(foreignTaxCredit, other.foreignTaxCredit, 0.01)) {
            errors += grantIdAwardId + country + " ->  foreignTaxCredit " + foreignTaxCredit + " " + other.foreignTaxCredit + "\n";
            foreignTaxCreditCount++;
        }

        if (taxWithheldByMssb != other.taxWithheldByMssb) {
            errors += grantIdAwardId + country + " ->  taxWithheldByMssb " + taxWithheldByMssb + " " + other.taxWithheldByMssb + "\n";
            taxWithheldByMssbCount++;
        }

        //SW is counting as SDI/SUI ect. as state level social taxes making our numbers higher
//        if (eeSocSecByMssb != other.eeSocSecByMssb)
//            errors += grantIdAwardId + country + " " + other.purno + " " + other.empId + " ->  eeSocSecByMssb " + eeSocSecByMssb + " " + other.eeSocSecByMssb + "\n";

        if (Math.abs(grossGain - other.grossGain) > 0.011) {
            errors += grantIdAwardId + country + " ->  grossGain " + grossGain + " " + other.grossGain + "\n";
            grossGainCount++;
        }

        //SW data is more accurate.  Expecting discrp.
//        if ((usCitizen == null && other.usCitizen != null) || !usCitizen.equals(other.usCitizen))
//            errors += grantIdAwardId + country + " ->  usCitizen " + usCitizen + " " + other.usCitizen + "\n";

        if ((calcId == null && other.calcId != null) || !calcId.equals(other.calcId)) {
            errors += grantIdAwardId + country + " ->  calcId " + calcId + " " + other.calcId + "\n";
            calcIdCount++;
        }

        if ((mobilityType == null && other.mobilityType != null) || !mobilityType.equals(other.mobilityType)) {
            errors += grantIdAwardId + country + " ->  mobilityType " + mobilityType + " " + other.mobilityType + "\n";
            mobilityTypeCount++;
        }
//todo explain       if (compareDouble(eeReportableIncome, other.eeReportableIncome, 0.01)) {
//            errors += grantIdAwardId + country + " ->  eeReportableIncome " + eeReportableIncome + " " + other.eeReportableIncome + "\n";
//            eeReportableIncomeCount++;
//        }
        if ((fmvDateFromPwcCalc == null && other.fmvDateFromPwcCalc != null) || !fmvDateFromPwcCalc.equals(other.fmvDateFromPwcCalc)) {
            errors += grantIdAwardId + country + " ->  fmvDateFromPwcCalc " + fmvDateFromPwcCalc + " " + other.fmvDateFromPwcCalc + "\n";
            fmvDateFromPwcCalcCount++;
        }

        // Google confirmed they will not use this column.  We hard coded to Y
//        if ((canCurrentCountryRefund == null && other.canCurrentCountryRefund != null) || !canCurrentCountryRefund.equals(other.canCurrentCountryRefund))
//            errors += grantIdAwardId + country + " ->  canCurrentCountryRefund " + canCurrentCountryRefund + " " + other.canCurrentCountryRefund + "\n";
        // Google confirmed they will not use this column.  We hard coded to Y
//        if ((canTaxCountryRefund == null && other.canTaxCountryRefund != null) || !canTaxCountryRefund.equals(other.canTaxCountryRefund))
//            errors += grantIdAwardId + country + " ->  canTaxCountryRefund " + canTaxCountryRefund + " " + other.canTaxCountryRefund + "\n";

//todo        if ((mssbLocal2ForAuditPurposesOnlyDisreguarding != null && other.mssbLocal2ForAuditPurposesOnlyDisreguarding == null) || !mssbLocal2ForAuditPurposesOnlyDisreguarding.equals(other.mssbLocal2ForAuditPurposesOnlyDisreguarding)) {
//            errors += grantIdAwardId + country + " ->  mssbLocal2ForAuditPurposesOnlyDisreguarding " + mssbLocal2ForAuditPurposesOnlyDisreguarding + " " + other.mssbLocal2ForAuditPurposesOnlyDisreguarding + "\n";
//            mssbLocal2ForAuditPurposesOnlyDisreguardingCount++;
//        }

        if ((eeLevelPurno == null && other.eeLevelPurno != null) || !eeLevelPurno.equals(other.eeLevelPurno)) {
            errors += grantIdAwardId + country + " ->  eeLevelPurno " + eeLevelPurno + " " + other.eeLevelPurno + "\n";
            eeLevelPurnoCount++;
        }

        if ((notInConos == null && other.notInConos != null) || !notInConos.equals(other.notInConos)) {
            errors += grantIdAwardId + country + " ->  notInConos " + notInConos + " " + other.notInConos + "\n";
            notInConosCount++;
        }

        if (canadaExchangeRate != other.canadaExchangeRate) {
            errors += grantIdAwardId + country + " ->  canadaExchangeRate " + canadaExchangeRate + " " + other.canadaExchangeRate + "\n";
            canadaExchangeRateCount++;
        }

        if ((equalizedEe == null && other.equalizedEe != null) || !equalizedEe.equals(other.equalizedEe)) {
            errors += grantIdAwardId + country + " ->  equalizedEe " + equalizedEe + " " + other.equalizedEe + "\n";
            equalizedEeCount++;
        }

        if ((countryEqualized == null && other.countryEqualized != null) || !countryEqualized.equals(other.countryEqualized)) {
            errors += grantIdAwardId + country + " ->  countryEqualized " + countryEqualized + " " + other.countryEqualized + "\n";
            countryEqualizedCount++;
        }

        if ((regionEqualized == null && other.regionEqualized != null) || !regionEqualized.equals(other.regionEqualized)) {
            errors += grantIdAwardId + country + " ->  regionEqualized " + regionEqualized + " " + other.regionEqualized + "\n";
            regionEqualizedCount++;
        }

        if ((socSecEqualized == null && other.socSecEqualized != null) || !socSecEqualized.equals(other.socSecEqualized)) {
            errors += grantIdAwardId + country + " ->  socSecEqualized " + socSecEqualized + " " + other.socSecEqualized + "\n";
            socSecEqualizedCount++;
        }

        if ( totalHypo != other.totalHypo) {
            errors += grantIdAwardId + country + " ->  totalHypo " + totalHypo + " " + other.totalHypo + "\n";
            totalHypoCount++;
        }

        if (locApportionedIncome != other.locApportionedIncome) {
            errors += grantIdAwardId + country + " ->  locApportionedIncome " + locApportionedIncome + " " + other.locApportionedIncome + "\n";
            locApportionedIncomeCount++;
        }

//todo
        if (hypoTax != other.hypoTax) {
            errors += grantIdAwardId + country + " ->  hypoTax " + hypoTax + " " + other.hypoTax + "\n";
            hypoTaxCount++;
        }

        if (netIncome != other.netIncome) {
            errors += grantIdAwardId + country + " ->  netIncome " + netIncome + " " + other.netIncome + "\n";
            netIncomeCount++;
        }

        if (grossUp != other.grossUp) {
            errors += grantIdAwardId + country + " ->  grossUp " + grossUp + " " + other.grossUp + "\n";
            grossUpCount++;
        }

        if (grossedUpIncome != other.grossedUpIncome) {
            errors += grantIdAwardId + country + " ->  grossedUpIncome " + grossedUpIncome + " " + other.grossedUpIncome + "\n";
            grossedUpIncomeCount++;
        }

        if (netErReportable != other.netErReportable) {
            errors += grantIdAwardId + country + " ->  netErReportable " + netErReportable + " " + other.netErReportable + "\n";
            netErReportableCount++;
        }

        if (netSubjToWithholding != other.netSubjToWithholding) {
            errors += grantIdAwardId + country + " ->  netSubjToWithholding " + netSubjToWithholding + " " + other.netSubjToWithholding + "\n";
            netSubjToWithholdingCount++;
        }

        if ((releaseOrExerciseDate.getYear() >= 2016) && (proRated != other.proRated)) {
            errors += grantIdAwardId + country + " " + equityType + " ->  proRated " + proRated + " " + other.proRated + "\n";
            releaseOrExerciseDateCount++;
        }

        if ((thirtyPercRuling == null && other.thirtyPercRuling != null) || !thirtyPercRuling.equals(other.thirtyPercRuling)) {
            errors += grantIdAwardId + country + " ->  thirtyPercRuling " + thirtyPercRuling + " " + other.thirtyPercRuling + "\n";
            thirtyPercRulingCount++;
        }

        if ((swissCPermitHolder == null && other.swissCPermitHolder != null) || !swissCPermitHolder.equals(other.swissCPermitHolder)) {
            errors += grantIdAwardId + country + " ->  swissCPermitHolder " + swissCPermitHolder + " " + other.swissCPermitHolder + "\n";
            swissCPermitHolderCount++;
        }

        if ((w4Cert == null && other.w4Cert != null) || !w4Cert.equals(other.w4Cert)) {
            errors += grantIdAwardId + country + " ->  w4Cert " + w4Cert + " " + other.w4Cert + "\n";
            w4CertCount++;
        }

        if ((nTCode == null && other.nTCode != null) || !nTCode.equals(other.nTCode)) {
            errors += grantIdAwardId + country + " ->  nTCode " + nTCode + " " + other.nTCode + "\n";
            nTCodeCount++;
        }

        if ((shadow_Payroll == null && other.shadow_Payroll != null) || !shadow_Payroll.equals(other.shadow_Payroll)) {
            errors += grantIdAwardId + country + " ->  shadow_Payroll " + shadow_Payroll + " " + other.shadow_Payroll + "\n";
            shadow_PayrollCount++;
        }

//        if (eeSocSecReportable != other.eeSocSecReportable) {
//            errors += grantIdAwardId + country + " " + other.purno + " " + other.empId + " ->  eeSocSecReportable " + eeSocSecReportable + " " + other.eeSocSecReportable + "\n";
//            eeSocSecReportableCount++;
//          }

        if ((irelandFtc == null && other.irelandFtc == null) || !irelandFtc.equals(other.irelandFtc)) {
            errors += grantIdAwardId + country + " ->  irelandFtc " + irelandFtc + " " + other.irelandFtc + "\n";
            irelandFtcCount++;
        }

        if ((overrideWithholding == null && other.overrideWithholding != null) || !overrideWithholding.equals(other.overrideWithholding)) {
            errors += grantIdAwardId + country + " ->  overrideWithholding " + overrideWithholding + " " + other.overrideWithholding + "\n";
            overrideWithholdingCount++;
        }

        if (compareDouble(workdayPercentage, other.workdayPercentage, 0.005)) {
            errors += grantIdAwardId + country + " ->  workdayPercentage " + workdayPercentage + " " + other.workdayPercentage + "\n";
            workdayPercentageCount++;
        }

//        if (erSocSecReportable != other.erSocSecReportable) {
//            errors += grantIdAwardId + country + " ->  erSocSecReportable " + erSocSecReportable + " " + other.erSocSecReportable + "\n";
//            erSocSecReportableCount++;
//        }

        if (proratedIncomeAmount != other.proratedIncomeAmount) {
            errors += grantIdAwardId + country + " ->  proratedIncomeAmount " + proratedIncomeAmount + " " + other.proratedIncomeAmount + "\n";
            proratedIncomeAmountCount++;
        }

        if ((locCode == null && other.locCode != null) || !locCode.equals(other.locCode)) {
            errors += grantIdAwardId + country + " ->  locCode " + locCode + " " + other.locCode + "\n";
            locCodeCount++;
        }

        if (domesticTaxCred != other.domesticTaxCred) {
            errors += grantIdAwardId + country + " ->  domesticTaxCred " + domesticTaxCred + " " + other.domesticTaxCred + "\n";
            domesticTaxCredCount++;
        }

        if ((isResidentInUlti == null && other.isResidentInUlti == null) || (isResidentInUlti != null && !isResidentInUlti.equals(other.isResidentInUlti))) {
            errors += grantIdAwardId + country + " ->  isResidentInUlti " + isResidentInUlti + " " + other.isResidentInUlti + "\n";
            isResidentInUltiCount++;
        }

        // not in sapphire
//        if ((taxRecacStatus == null && other.taxRecacStatus != null) || !taxRecacStatus.equals(other.taxRecacStatus))
//            errors += grantIdAwardId + country + " ->  taxRecacStatus " + taxRecacStatus + " " + other.taxRecacStatus + "\n";

        if (!"".equals(errors))
            errors = other.purno + " " + other.empId + "\n" + errors;
        return errors;
    }


    public boolean compareDouble(double left, double right, double tolerance) {
        return Math.abs(left - right) > tolerance + 0.0001;
    }

    public static String displayErrorCount() {
        String ret = "";
        if (countryCount > 0)
            ret += "countryCount " + countryCount + "\n";

        if (entityCodeCount > 0)
            ret += "entityCodeCount " + entityCodeCount + "\n";

        if (empIdCount > 0)
            ret += "empIdCount " + empIdCount + "\n";

        if (equityTypeCount > 0)
            ret += "equityTypeCount " + equityTypeCount + "\n";

        if (lastNameCount > 0)
            ret += "lastNameCount " + lastNameCount + "\n";

        if (firstNameCount > 0)
            ret += "firstNameCount " + firstNameCount + "\n";

        if (fmvDateOrExerciseDateCount > 0)
            ret += "fmvDateOrExerciseDateCount " + fmvDateOrExerciseDateCount + "\n";

        if (eeReportableAmountCount > 0)
            ret += "eeReportableAmountCount " + eeReportableAmountCount + "\n";

        if (amountSubgToWithholdingCount > 0)
            ret += "amountSubgToWithholdingCount " + amountSubgToWithholdingCount + "\n";

        if (amountSubjToSoSecCount > 0)
            ret += "amountSubjToSoSecCount " + amountSubjToSoSecCount + "\n";

        if (totalTaxWithheldByMssbCount > 0)
            ret += "totalTaxWithheldByMssbCount " + totalTaxWithheldByMssbCount + "\n";

        if (fracShareRefundCount > 0)
            ret += "fracShareRefundCount " + fracShareRefundCount + "\n";

        if (totalReceivedByMSSBCount > 0)
            ret += "totalReceivedByMSSBCount " + totalReceivedByMSSBCount + "\n";

        if (purnoCount > 0)
            ret += "purnoCount " + purnoCount + "\n";

        if (releaseOrExerciseDateCount > 0)
            ret += "releaseOrExerciseDateCount " + releaseOrExerciseDateCount + "\n";

        if (originalGrantDateCount > 0)
            ret += "originalGrantDateCount " + originalGrantDateCount + "\n";

        if (numOfSharesCount > 0)
            ret += "numOfSharesCount " + numOfSharesCount + "\n";

        if (optionStrikePriceCount > 0)
            ret += "optionStrikePriceCount " + optionStrikePriceCount + "\n";

        if (fmvOnDayOfReleaseOrExerciseCount > 0)
            ret += "fmvOnDayOfReleaseOrExerciseCount " + fmvOnDayOfReleaseOrExerciseCount + "\n";

        if (combinedPurnoCount > 0)
            ret += "combinedPurnoCount " + combinedPurnoCount + "\n";

        if (grantIdAwardIdCount > 0)
            ret += "grantIdAwardIdCount " + grantIdAwardIdCount + "\n";

        if (paymentMethodOrExerciseTypeCount > 0)
            ret += "paymentMethodOrExerciseTypeCount " + paymentMethodOrExerciseTypeCount + "\n";

        if (fedTaxCount > 0)
            ret += "fedTaxCount " + fedTaxCount + "\n";

        if (stateTaxCount > 0)
            ret += "stateTaxCount " + stateTaxCount + "\n";

        if (loc1Count > 0)
            ret += "loc1Count " + loc1Count + "\n";

        if (loc2Count > 0)
            ret += "loc2Count " + loc2Count + "\n";

        if (fica1Count > 0)
            ret += "fica1Count " + fica1Count + "\n";

        if (fica2Count > 0)
            ret += "fica2Count " + fica2Count + "\n";

        if (award_dateCount > 0)
            ret += "award_dateCount " + award_dateCount + "\n";

        if (userCode3ChinaCount > 0)
            ret += "userCode3ChinaCount " + userCode3ChinaCount + "\n";

        if (locationIdCount > 0)
            ret += "locationIdCount " + locationIdCount + "\n";

        if (payrollCodeCount > 0)
            ret += "payrollCodeCount " + payrollCodeCount + "\n";

        if (salePriceStcSafeOnlyCount > 0)
            ret += "salePriceStcSafeOnlyCount " + salePriceStcSafeOnlyCount + "\n";

        if (backupWithholdingTaxCount > 0)
            ret += "backupWithholdingTaxCount " + backupWithholdingTaxCount + "\n";

        if (hireDateCount > 0)
            ret += "hireDateCount " + hireDateCount + "\n";

        if (terminationDateCount > 0)
            ret += "terminationDateCount " + terminationDateCount + "\n";

        if (optionsGrantedCount > 0)
            ret += "optionsGrantedCount " + optionsGrantedCount + "\n";

        if (awardTypeCount > 0)
            ret += "awardTypeCount " + awardTypeCount + "\n";

        if (taxSharesCount > 0)
            ret += "taxSharesCount " + taxSharesCount + "\n";

        if (sharesDeleiveredCount > 0)
            ret += "sharesDeleiveredCount " + sharesDeleiveredCount + "\n";

        if (currentCountryCount > 0)
            ret += "currentCountryCount " + currentCountryCount + "\n";

        if (pwcVestDateCount > 0)
            ret += "pwcVestDateCount " + pwcVestDateCount + "\n";

        if (pwcExerciseDateCount > 0)
            ret += "pwcExerciseDateCount " + pwcExerciseDateCount + "\n";

        if (ukGmobNicTransferCount > 0)
            ret += "ukGmobNicTransferCount " + ukGmobNicTransferCount + "\n";

        if (foreignTaxCreditCount > 0)
            ret += "foreignTaxCreditCount " + foreignTaxCreditCount + "\n";

        if (taxWithheldByMssbCount > 0)
            ret += "taxWithheldByMssbCount " + taxWithheldByMssbCount + "\n";

        if (eeSocSecByMssbCount > 0)
            ret += "eeSocSecByMssbCount " + eeSocSecByMssbCount + "\n";

        if (grossGainCount > 0)
            ret += "grossGainCount " + grossGainCount + "\n";

        if (usCitizenCount > 0)
            ret += "usCitizenCount " + usCitizenCount + "\n";

        if (calcIdCount > 0)
            ret += "calcIdCount " + calcIdCount + "\n";

        if (mobilityTypeCount > 0)
            ret += "mobilityTypeCount " + mobilityTypeCount + "\n";

        if (eeReportableIncomeCount > 0)
            ret += "eeReportableIncomeCount " + eeReportableIncomeCount + "\n";

        if (fmvDateFromPwcCalcCount > 0)
            ret += "fmvDateFromPwcCalcCount " + fmvDateFromPwcCalcCount + "\n";

        if (canCurrentCountryRefundCount > 0)
            ret += "canCurrentCountryRefundCount " + canCurrentCountryRefundCount + "\n";

        if (canTaxCountryRefundCount > 0)
            ret += "canTaxCountryRefundCount " + canTaxCountryRefundCount + "\n";

        if (mssbLocal2ForAuditPurposesOnlyDisreguardingCount > 0)
            ret += "mssbLocal2ForAuditPurposesOnlyDisreguardingCount " + mssbLocal2ForAuditPurposesOnlyDisreguardingCount + "\n";

        if (eeLevelPurnoCount > 0)
            ret += "eeLevelPurnoCount " + eeLevelPurnoCount + "\n";

        if (notInConosCount > 0)
            ret += "notInConosCount " + notInConosCount + "\n";

        if (canadaExchangeRateCount > 0)
            ret += "canadaExchangeRateCount " + canadaExchangeRateCount + "\n";

        if (equalizedEeCount > 0)
            ret += "equalizedEeCount " + equalizedEeCount + "\n";

        if (countryEqualizedCount > 0)
            ret += "countryEqualizedCount " + countryEqualizedCount + "\n";

        if (regionEqualizedCount > 0)
            ret += "regionEqualizedCount " + regionEqualizedCount + "\n";

        if (socSecEqualizedCount > 0)
            ret += "socSecEqualizedCount " + socSecEqualizedCount + "\n";

        if (totalHypoCount > 0)
            ret += "totalHypoCount " + totalHypoCount + "\n";

        if (locApportionedIncomeCount > 0)
            ret += "locApportionedIncomeCount " + locApportionedIncomeCount + "\n";

        if (hypoTaxCount > 0)
            ret += "hypoTaxCount " + hypoTaxCount + "\n";

        if (netIncomeCount > 0)
            ret += "netIncomeCount " + netIncomeCount + "\n";

        if (grossUpCount > 0)
            ret += "grossUpCount " + grossUpCount + "\n";

        if (grossedUpIncomeCount > 0)
            ret += "grossedUpIncomeCount " + grossedUpIncomeCount + "\n";

        if (netErReportableCount > 0)
            ret += "netErReportableCount " + netErReportableCount + "\n";

        if (netSubjToWithholdingCount > 0)
            ret += "netSubjToWithholdingCount " + netSubjToWithholdingCount + "\n";

        if (proRatedCount > 0)
            ret += "proRatedCount " + proRatedCount + "\n";

        if (thirtyPercRulingCount > 0)
            ret += "thirtyPercRulingCount " + thirtyPercRulingCount + "\n";

        if (swissCPermitHolderCount > 0)
            ret += "swissCPermitHolderCount " + swissCPermitHolderCount + "\n";

        if (w4CertCount > 0)
            ret += "w4CertCount " + w4CertCount + "\n";

        if (nTCodeCount > 0)
            ret += "nTCodeCount " + nTCodeCount + "\n";

        if (shadow_PayrollCount > 0)
            ret += "shadow_PayrollCount " + shadow_PayrollCount + "\n";

        if (eeSocSecReportableCount > 0)
            ret += "eeSocSecReportableCount " + eeSocSecReportableCount + "\n";

        if (irelandFtcCount > 0)
            ret += "irelandFtcCount " + irelandFtcCount + "\n";

        if (overrideWithholdingCount > 0)
            ret += "overrideWithholdingCount " + overrideWithholdingCount + "\n";

        if (workdayPercentageCount > 0)
            ret += "workdayPercentageCount " + workdayPercentageCount + "\n";

        if (erSocSecReportableCount > 0)
            ret += "erSocSecReportableCount " + erSocSecReportableCount + "\n";

        if (locCodeCount > 0)
            ret += "locCodeCount " + locCodeCount + "\n";

        if (domesticTaxCredCount > 0)
            ret += "domesticTaxCredCount " + domesticTaxCredCount + "\n";

        if (isResidentInUltiCount > 0)
            ret += "isResidentInUltiCount " + isResidentInUltiCount + "\n";

        return ret;
    }



}
