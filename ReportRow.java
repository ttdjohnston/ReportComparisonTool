import java.time.LocalDate;

public class ReportRow {

    String purno = "";
    String juris = "";
    LocalDate origAwardDate = null;
    LocalDate vestingDate = null;
    double gsusVested = -10.0;
    double sharesDeposited = -10.0;
    double fmv = -10.0;
    double totalIncOfGsuAtVest = -10.0;
    double proratedInc = -10.0;
    double payrollReportableAmount = -10.0;
    double amountSubjectToTaxWithholding = -10.0;
    double percentIncAllocToJuris = -10.0;
    double incSubjToSocSec = -10.0;
    double totalTax = -10.0;
    double fracShareRefund = -10.0;
    double fxrate = -10.0;
    String currency = "";
    String releaseType = "";
    String awardNum = "";
    String historicalPurno = "";
    double taxableInc = -10.0;
    double fedTax = -10.0;
    double stateTax = -10.0;
    double loc1Tax = -10.0;
    double loc2Tax = -10.0;
    double ssTax = -10.0;
    double medTax = -10.0;
    double taxCredit = -10.0;

    public double getTaxableInc() {
        return taxableInc;
    }

    public void setTaxableInc(double taxableInc) {
        this.taxableInc = taxableInc;
    }

    public void setFedTax(double stateTax) {
        this.fedTax = stateTax;
    }

    public void setStateTax(double stateTax) {
        this.stateTax = stateTax;
    }

    public void setLoc1Tax(double loc1Tax) {
        this.loc1Tax = loc1Tax;
    }

    public void setLoc2Tax(double loc1Tax) {
        this.loc2Tax = loc2Tax;
    }

    public void setSsTax(double ssTax) {
        this.ssTax = ssTax;
    }

    public void setMedTax(double medTax) {
        this.medTax = medTax;
    }

    public String getPurno() {
        return purno;
    }

    public String getJuris() {
        return juris;
    }

    public LocalDate getOrigAwardDate() {
        return origAwardDate;
    }

    public LocalDate getVestingDate() {
        return vestingDate;
    }

    public Double getGsusVested() {
        return gsusVested;
    }

    public Double getSharesDeposited() {
        return sharesDeposited;
    }

    public Double getFmv() {
        return fmv;
    }

    public Double getTotalIncOfGsuAtVest() {
        return totalIncOfGsuAtVest;
    }

    public Double getProratedInc() {
        return proratedInc;
    }

    public Double getPayrollReportableAmount() {
        return payrollReportableAmount;
    }

    public Double getAmountSubjectToTaxWithholding() {
        return amountSubjectToTaxWithholding;
    }

    public Double getPercentIncAllocToJuris() {
        return percentIncAllocToJuris;
    }

    public Double getIncSubjToSocSec() {
        return incSubjToSocSec;
    }

    public Double getTotalTax() {
        return totalTax;
    }

    public Double getFracShareRefund() {
        return fracShareRefund;
    }

    public Double getFxrate() {
        return fxrate;
    }

    public String getCurrency() {
        return currency;
    }

    public String getReleaseType() {
        return releaseType;
    }

    public String getAwardNum() {
        return awardNum;
    }

    public void setPurno(String purno) {
        this.purno = purno;
    }

    public void setJuris(String juris) {
        this.juris = juris;
    }

    public void setOrigAwardDate(LocalDate origAwardDate) {
        this.origAwardDate = origAwardDate;
    }

    public void setVestingDate(LocalDate vestingDate) {
        this.vestingDate = vestingDate;
    }

    public void setGsusVested(Double gsusVested) {
        this.gsusVested = gsusVested;
    }

    public void setSharesDeposited(Double sharesDeposited) {
        this.sharesDeposited = sharesDeposited;
    }

    public void setFmv(Double fmv) {
        this.fmv = fmv;
    }

    public void setTotalIncOfGsuAtVest(Double totalIncOfGsuAtVest) {
        this.totalIncOfGsuAtVest = totalIncOfGsuAtVest;
    }

    public void setProratedInc(Double proratedInc) {
        this.proratedInc = proratedInc;
    }

    public void setPayrollReportableAmount(Double payrollReportableAmount) {
        this.payrollReportableAmount = payrollReportableAmount;
    }

    public void setAmountSubjectToTaxWithholding(Double amountSubjectToTaxWithholding) {
        this.amountSubjectToTaxWithholding = amountSubjectToTaxWithholding;
    }

    public void setPercentIncAllocToJuris(Double percentIncAllocToJuris) {
        this.percentIncAllocToJuris = percentIncAllocToJuris;
    }

    public void setIncSubjToSocSec(Double incSubjToSocSec) {
        this.incSubjToSocSec = incSubjToSocSec;
    }

    public void setTotalTax(Double totalTax) {
        this.totalTax = totalTax;
    }

    public void setFracShareRefund(Double fracShareRefund) {
        this.fracShareRefund = fracShareRefund;
    }

    public void setFxrate(Double fxrate) {
        this.fxrate = fxrate;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setReleaseType(String releaseType) {
        this.releaseType = releaseType;
    }

    public void setAwardNum(String awardNum) {
        this.awardNum = awardNum;
    }

    public String getHistoricalPurno() {
        return historicalPurno;
    }

    public void setHistoricalPurno(String historicalPurno) {
        this.historicalPurno = historicalPurno;
    }


    @Override
    public String toString() {
        return     "purno " + purno + "\n" +
                "juris " + juris + "\n" +
                "origAwardDate " + origAwardDate + "\n" +
                "vestingDate " + vestingDate + "\n" +
                "gsusVested " + gsusVested + "\n" +
                "sharesDeposited " + sharesDeposited + "\n" +
                "fmv " + fmv + "\n" +
                "totalIncOfGsuAtVest " + totalIncOfGsuAtVest + "\n" +
                "proratedInc " + proratedInc + "\n" +
                "payrollReportableAmount " + payrollReportableAmount + "\n" +
                "amountSubjectToTaxWithholding " + amountSubjectToTaxWithholding + "\n" +
                "percentIncAllocToJuris " + percentIncAllocToJuris + "\n" +
                "incSubjToSocSec " + incSubjToSocSec + "\n" +
                "totalTax " + totalTax + "\n" +
                "fracShareRefund " + fracShareRefund + "\n" +
                "fxrate " + fxrate + "\n" +
                "currency " + currency + "\n" +
                "releaseType " + releaseType + "\n" +
                "awardNum " + awardNum + "\n" +
                "historicalPurno " + historicalPurno + "\n";
    }

    public void setTaxCredit(Double aDouble) {
        taxCredit = aDouble;
    }
}
