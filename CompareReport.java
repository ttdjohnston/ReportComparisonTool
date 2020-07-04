import java.util.Map;

public class CompareReport {
    public static String compareReport(Map<String, ReportRow> sapphire, Map<String, ReportRow> shareworks) {
        String errors = "";

        for (String row : sapphire.keySet()) {
            ReportRow sapphRow = sapphire.get(row);
            ReportRow shareRow = shareworks.getOrDefault(row, null);

//            errors += sapphRow.purno + " \n";

            if (shareRow == null) {
                errors += row + "    is not in the SW report \n";
                continue;
            }
//            try {

                if (!sapphRow.origAwardDate.equals(shareRow.origAwardDate))
                    errors += row + "    original award date " + sapphRow.origAwardDate + " " + shareRow.origAwardDate + "\n";

                if (!sapphRow.vestingDate.equals(shareRow.vestingDate))
                    errors += row + "    vestingDate " + sapphRow.vestingDate + " " + shareRow.vestingDate + "\n";

                if (sapphRow.gsusVested != shareRow.gsusVested)
                    errors += row + "    gsusVested " + sapphRow.gsusVested + " " + shareRow.gsusVested + "\n";

                if (sapphRow.sharesDeposited != shareRow.sharesDeposited)
                    errors += row + "    sharesDeposited " + sapphRow.sharesDeposited + " " + shareRow.sharesDeposited + "\n";

                if (sapphRow.fmv != shareRow.fmv)
                    errors += row + "    fmv " + sapphRow.fmv + " " + shareRow.fmv + "\n";

                if (sapphRow.totalIncOfGsuAtVest != shareRow.totalIncOfGsuAtVest)
                    errors += row + "    totalIncOfGsuAtVest " + sapphRow.totalIncOfGsuAtVest + " " + shareRow.totalIncOfGsuAtVest + "\n";

                if (sapphRow.payrollReportableAmount != shareRow.payrollReportableAmount)
                    errors += row + "    payrollReportableAmount " + sapphRow.payrollReportableAmount + " " + shareRow.payrollReportableAmount + "\n";

                if (sapphRow.amountSubjectToTaxWithholding != 0.0 && sapphRow.amountSubjectToTaxWithholding != shareRow.amountSubjectToTaxWithholding)
                    errors += row + "    amountSubjectToTaxWithholding " + sapphRow.amountSubjectToTaxWithholding + " " + shareRow.amountSubjectToTaxWithholding + "\n";

                if (sapphRow.percentIncAllocToJuris != 0.0 && sapphRow.percentIncAllocToJuris != shareRow.percentIncAllocToJuris)
                    errors += row + "    percentIncAllocToJuris " + sapphRow.percentIncAllocToJuris + " " + shareRow.percentIncAllocToJuris + "\n";

                if (sapphRow.incSubjToSocSec != -10.0 && sapphRow.incSubjToSocSec != shareRow.incSubjToSocSec)
                    errors += row + "    incSubjToSocSec " + sapphRow.incSubjToSocSec + " " + shareRow.incSubjToSocSec + "\n";

                if (sapphRow.totalTax != 0.0 && sapphRow.totalTax != shareRow.totalTax)
                    errors += row + "    totalTax " + sapphRow.totalTax + " " + shareRow.totalTax + "\n";

                if (sapphRow.fracShareRefund != shareRow.fracShareRefund)
                    errors += row + "    fracShareRefund " + sapphRow.fracShareRefund + " " + shareRow.fracShareRefund + "\n";

//                if (sapphRow.fxrate != shareRow.fxrate)
//                    errors += row + "    fxrate is different \n";

                if (!sapphRow.currency.equals(shareRow.currency))
                    errors += row + "    currency " + sapphRow.currency + " " + shareRow.currency + "\n";

                if (!sapphRow.releaseType.equals(shareRow.releaseType))
                    errors += row + "    releaseType " + sapphRow.releaseType + " " + shareRow.releaseType + "\n";

                if (!sapphRow.awardNum.equals(shareRow.awardNum))
                    errors += row + "    awardNum " + sapphRow.awardNum + " " + shareRow.awardNum + "\n";

                if (sapphRow.taxableInc != shareRow.taxableInc)
                    errors += row + "    taxableInc " + sapphRow.taxableInc + " " + shareRow.taxableInc + "\n";

                if (sapphRow.fedTax != shareRow.fedTax)
                    errors += row + "    fedTax " + sapphRow.fedTax + " " + shareRow.fedTax + "\n";

            if (sapphRow.fedTax != shareRow.fedTax)
                errors += row + "    fedTax " + sapphRow.fedTax + " " + shareRow.fedTax + "\n";

            if (sapphRow.stateTax != shareRow.stateTax)
                errors += row + "    stateTax " + sapphRow.stateTax + " " + shareRow.stateTax + "\n";

            if (sapphRow.loc1Tax != shareRow.loc1Tax)
                errors += row + "    loc1Tax " + sapphRow.loc1Tax + " " + shareRow.loc1Tax + "\n";

            if (sapphRow.loc2Tax != shareRow.loc2Tax)
                errors += row + "    loc2Tax " + sapphRow.loc2Tax + " " + shareRow.loc2Tax + "\n";

            if (sapphRow.medTax != shareRow.medTax)
                errors += row + "    medTax " + sapphRow.medTax + " " + shareRow.medTax + "\n";


//            } catch (Exception e) {
//                System.out.println(rowsToString(sapphRow, shareRow));
//                System.exit(-1);
//            }
        }
        return errors;

    }

    public static String rowsToString(ReportRow sapphRow, ReportRow swRow) {


        return sapphRow.toString() + " \n \n" + swRow.toString();
    }
}
