import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeParseException;
import java.util.*;

public class Main {
    public static ArrayList<ReportRow> addLater = new ArrayList<>();
    static DateTimeFormatter dtf;
    static DateTimeFormatter dtf2;

    public static void main(String[] args) throws FileNotFoundException {

        Scanner sapphireFile = new Scanner(new File(args[1]));
        Scanner shareworksFile = new Scanner(new File(args[0]));

        dtf = new DateTimeFormatterBuilder().parseCaseInsensitive()
                                        .appendPattern("dd-MMM-yyyy")
                                        .toFormatter();

        dtf2 = new DateTimeFormatterBuilder().parseCaseInsensitive()
                .appendPattern("d-MMM-yyyy")
                .toFormatter();

        int[] sapphColIndex = {};
        int[] swColIndex = {};
        Map<String, ReportRow> sapph = null;
        Map<String, ReportRow> sw = null;

        if (args[2].equals("PAYROLL")){
            Map<String, PayrollReportRow> sapphPayroll = new TreeMap<>();
            Map<String, PayrollReportRow> swPayroll = new TreeMap<>();
            PayrollReportRow row;
            while (sapphireFile.hasNextLine()) {
                row = new PayrollReportRow(sapphireFile.nextLine(), 0,1,2,3,4,5,6,7,
                        8,9,10,11,12,13,14,15,16,
                        17,18,19,20,21,22,23,24,25,26,27,
                        28,29,30,31,32,33,34,35,36,37,38,
                        39,40,41,42,43,44,45,46,47,48,73,
                        74,75,76,77,78,79,80,81,82,
                        83,84,85,86,87,88,89,90,91,92,93,
                        94,95,96,97,98,99,100,101,102,103,
                        104,105,106,107,108,109,-1);
                sapphPayroll.put(row.grantIdAwardId + row.country + row.releaseOrExerciseDate.getDayOfMonth(), row);
            }
            while (shareworksFile.hasNextLine()) {
                row = new PayrollReportRow(shareworksFile.nextLine(), 0,1,2,3,4,5,6,7,
                        8,9,10,11,12,13,14,15,16,
                        17,18,19,20,21,22,23,24,25,26,27,
                        28,29,30,31,32,33,34,35,36,37,38,
                        39,40,41,42,43,44,45,46,47,48,73,
                        74,75,76,77,78,79,80,81,82,
                        83,84,85,86,87,88,89,90,91,92,93,
                        94,95,96,97,98,99,100,101,102,103,
                        104,105,106,107,108,109,-1);
                swPayroll.put(row.grantIdAwardId + row.country + row.releaseOrExerciseDate.getDayOfMonth(), row);
            }
            int countMissing = 0;
            int countNumErrors = 0;
//            for (String sapphKey : sapphPayroll.keySet()){
//                PayrollReportRow sapphRow = sapphPayroll.get(sapphKey);
//                PayrollReportRow swRow = swPayroll.get(sapphKey);
//                if (swRow == null) {
//                    System.out.println(sapphKey + " could not be found in the swReport");
//                    countMissing++;
//                    continue;
//                }
//                String str = sapphRow.compare(swRow);
//                if (!"".equals(str))
//                    System.out.println(str);
//            }
//            System.out.println("Amount of rows missing " + count);
//            System.exit(0);

            for (String swKey : swPayroll.keySet()){
                PayrollReportRow sapphRow = sapphPayroll.get(swKey);
                PayrollReportRow swRow = swPayroll.get(swKey);
                if (sapphRow == null) {
                    //System.out.println(swKey + " could not be found in the sapphReport");
                    countMissing++;
                    continue;
                }
                String str = "";
                if (!sapphRow.country.equals("UK") && ((sapphRow.equityType != null) && (sapphRow.equityType.equals(swRow.equityType))))
                    str = sapphRow.compare(swRow);
                if (!"".equals(str)) {
                    countNumErrors++;
                    System.out.println(str);
                }
            }
            //System.out.println("Amount of rows missing " + count);
            System.out.println(PayrollReportRow.displayErrorCount());
            System.out.println("number of total errors " + countNumErrors);
            System.exit(0);
        }
        else if (args[2].equals("GMOB")){
            sapphColIndex = new int[] {1,5,6,7,8,9,11,12,13,14,15,17,18,19,2,10,3,0};
            swColIndex = new int[] {1,2,3,4,5,6,7,9,10,11,12,13,14,15,16,17,18,19};
            sapph = newGmobReportMap(sapphColIndex, sapphireFile);
            sw = newGmobReportMap(swColIndex, shareworksFile);
        }
        else if (args[2].equals("US")) {
            //System.out.println("Sapph");
            sapph = newUsReportMap(sapphireFile, 0, -1, 1,2,4,5,6,7,8,9,10,11,12,13,15,16,17);
            //System.out.println("SW");
            sw = newUsReportMap(shareworksFile, 26, -1, 2,25,3,4,5,6,24,8,10,12,14,16,18,20,22);
        }
        else if (args[2].equals("ROW")) {
            sapph = newRowReportMap(sapphireFile, 0, -1, 1,2,4,5,6,7,8,9,10,11,12,13);
            sw = newRowReportMap(shareworksFile, 15, -1, 2,14,3,4,5,6,13,7,8,9,-1,10);
        }
        else {
            sapph = newDomIntReportMap(sapphireFile, 0, 1, 2,3,5,
                    6,7,8,9,10,12,13,
                    14,15,17,18,19,
                    20, 21,22,23, 24);

            sw = newDomIntReportMap(shareworksFile, 26, 1, 25,2,3,
                    4,5,6,24,7,9,10,
                    11,12, 13, 14,15,
                    17,18, 19, 20,21);
        }

        for (ReportRow row : addLater) {
            if (!sw.containsKey(row.getHistoricalPurno() + "US")) {
                sw.put(row.getHistoricalPurno() + "US", row);
            }
        }

        System.out.println(CompareReport.compareReport(sapph, sw));
    }

    public static String convertJuris(String longJuris) {
        String newJuris = longJuris;
        if (longJuris == null)
            newJuris = "";
        else if (longJuris.equals(""))
            newJuris = "";
        else if (longJuris.equals("Switzerland"))
            newJuris = "CH";
        else if (longJuris.equals("SwitzerlandZürich"))
            newJuris = "CH_ZH";
        else if (longJuris.equals("UnitedStates"))
            newJuris = "US";
        else if (longJuris.equals("UnitedStatesCalifornia"))
            newJuris = "US_CA";
        else if (longJuris.equals("UnitedStatesCaliforniaCalifornia-Local"))
            newJuris = "US_CA-Loc";
        else if (longJuris.equals("Australia"))
            newJuris = "AU";
        else if (longJuris.equals("UnitedKingdom"))
            newJuris = "GB";
        else if (longJuris.equals("UnitedStatesFlorida"))
            newJuris = "US_FL";
        else if (longJuris.equals("UnitedStatesNewYork"))
            newJuris = "US_NY";
        else if (longJuris.equals("UnitedStatesNewYorkNewYork-Local"))
            newJuris = "US_NY-Loc";
        else if (longJuris.equals("Ireland"))
            newJuris = "IE";
        else if (longJuris.equals("US_FED"))
            newJuris = "US";
        else if (longJuris.equals("UnitedStatesMassachusetts"))
            newJuris = "US_MA";

        return newJuris;
    }

    public static Map<String, ReportRow> newRowReportMap(Scanner file,
                                                         int histPurno, int juris, int origAwardDate, int awardNum, int vestDate, int gsusVested,
                                                         int sharesDepos, int fmv, int relType, int taxableInc, int totalTax,
                                                         int loc1Tax, int loc2Tax, int fracShareRefund) {

        Map<String, ReportRow> map = new TreeMap<>();
        String line;
        while (file.hasNextLine()) {
            line = file.nextLine();
            List<String> splitLine = Arrays.asList(line.split(","));
            ReportRow row = new ReportRow();

            try {
                row.setHistoricalPurno(splitLine.get(histPurno));
                row.setJuris(juris == -1 ? "" : splitLine.get(juris));
                try {
                    row.setOrigAwardDate(LocalDate.parse(splitLine.get(origAwardDate), dtf));
                } catch (DateTimeParseException e) {
                    row.setOrigAwardDate(LocalDate.parse(splitLine.get(origAwardDate), dtf2));
                }
                row.setAwardNum(splitLine.get(awardNum));
                try {
                    row.setVestingDate(LocalDate.parse(splitLine.get(vestDate), dtf));
                } catch (DateTimeParseException e) {
                    row.setVestingDate(LocalDate.parse(splitLine.get(vestDate), dtf2));
                }
                row.setGsusVested(new Double(splitLine.get(gsusVested)));
                row.setSharesDeposited(new Double(splitLine.get(sharesDepos)));
                row.setFmv(new Double(splitLine.get(fmv)));
                row.setReleaseType(splitLine.get(relType));
                row.setTaxableInc(new Double(splitLine.get(taxableInc)));
                row.setTotalTax(new Double(splitLine.get(totalTax)));
                row.setLoc1Tax(new Double(splitLine.get(loc1Tax)));
                row.setLoc2Tax(loc2Tax == -1 ? new Double(0.0) :  new Double(splitLine.get(loc2Tax)));
                row.setFracShareRefund(new Double(splitLine.get(fracShareRefund)));

                map.put(row.getHistoricalPurno() + convertJuris(row.getJuris()), row);
//                if (row.getJuris().equals("Australia"))
//                    addLater.add(row);

            } catch (Exception e) {
                for (String entry : splitLine) {
                    System.out.println(entry);
                }
                e.printStackTrace();
                System.exit(0);
            }
        }
        return map;
    }

    public static Map<String, ReportRow> newDomIntReportMap(Scanner file,
                                                        int histPurno, int juris, int awardNum, int origAwardDate, int vestDate, int gsusVested,
                                                        int sharesDepos, int fmv, int relType, int totalGainOfGsuAtVest, int eeReportableInc, int amountSubjToTaxWithholding,
                                                            int percTotalGainSubjToTaxWithholding, int incSubjToSocSecTax, int totalTax,
                                                            int fedtax, int stateTax, int loc1Tax, int ssTax, int medTax, int fracShareRefund,
                                                            int taxCredit) {

        Map<String, ReportRow> map = new TreeMap<>();
        String line;
        while (file.hasNextLine()) {
            line = file.nextLine();
            List<String> splitLine = Arrays.asList(line.split(","));
            ReportRow row = new ReportRow();

            try {
                row.setHistoricalPurno(splitLine.get(histPurno));
                row.setJuris(juris == -1 ? "" : splitLine.get(juris));
                try {
                    row.setOrigAwardDate(LocalDate.parse(splitLine.get(origAwardDate), dtf));
                } catch (DateTimeParseException e) {
                    row.setOrigAwardDate(LocalDate.parse(splitLine.get(origAwardDate), dtf2));
                }
                row.setAwardNum(splitLine.get(awardNum));
                try {
                    row.setVestingDate(LocalDate.parse(splitLine.get(vestDate), dtf));
                } catch (DateTimeParseException e) {
                    row.setVestingDate(LocalDate.parse(splitLine.get(vestDate), dtf2));
                }
                row.setGsusVested(new Double(splitLine.get(gsusVested)));
                row.setSharesDeposited(new Double(splitLine.get(sharesDepos)));
                row.setFmv(new Double(splitLine.get(fmv)));
                row.setReleaseType(splitLine.get(relType));
                row.setTotalIncOfGsuAtVest(new Double(splitLine.get(totalGainOfGsuAtVest)));
                row.setPayrollReportableAmount(new Double(splitLine.get(eeReportableInc)));
                row.setAmountSubjectToTaxWithholding(new Double(splitLine.get(amountSubjToTaxWithholding)));
                row.setPercentIncAllocToJuris(new Double(splitLine.get(percTotalGainSubjToTaxWithholding)));
                row.setIncSubjToSocSec(splitLine.get(incSubjToSocSecTax).equals("") ? -10.0 : new Double(splitLine.get(incSubjToSocSecTax)));
                row.setTotalTax(new Double(splitLine.get(totalTax)));
                row.setFedTax(new Double(splitLine.get(fedtax)));
                row.setStateTax(new Double(splitLine.get(stateTax)));
                row.setLoc1Tax(new Double(splitLine.get(loc1Tax)));
                row.setSsTax(new Double(splitLine.get(ssTax)));
                row.setMedTax(new Double(splitLine.get(medTax)));
                row.setFracShareRefund(new Double(splitLine.get(fracShareRefund)));
                row.setTaxCredit(new Double(splitLine.get(taxCredit)));

                map.put(row.getHistoricalPurno() + convertJuris(row.getJuris()), row);
//                if (row.getJuris().equals("Australia"))
//                    addLater.add(row);

            } catch (Exception e) {
                for (String entry : splitLine) {
                    System.out.println(entry);
                }
                e.printStackTrace();
                System.exit(0);
            }
        }
        return map;
    }

    public static Map<String, ReportRow> newUsReportMap(Scanner file,
                                                        int histPurno, int juris, int origAwardDate, int awardNum, int vestDate, int gsusVested,
                                                        int sharesDepos, int fmv, int relType, int taxableInc, int totalTax, int fedTax, int stateTax,
                                                        int loc1Tax, int ssTax, int medTax, int fracShareRefund) {

        Map<String, ReportRow> map = new TreeMap<>();
        String line;
        while (file.hasNextLine()) {
            line = file.nextLine();
            List<String> splitLine = Arrays.asList(line.split(","));
            ReportRow row = new ReportRow();

            try {
                row.setHistoricalPurno(splitLine.get(histPurno));
                row.setJuris(juris == -1 ? "" : splitLine.get(juris));
                try {
                    row.setOrigAwardDate(LocalDate.parse(splitLine.get(origAwardDate), dtf));
                } catch (DateTimeParseException e) {
                    row.setOrigAwardDate(LocalDate.parse(splitLine.get(origAwardDate), dtf2));
                }
                row.setAwardNum(splitLine.get(awardNum));
                try {
                    row.setVestingDate(LocalDate.parse(splitLine.get(vestDate), dtf));
                } catch (DateTimeParseException e) {
                    row.setVestingDate(LocalDate.parse(splitLine.get(vestDate), dtf2));
                }
                row.setGsusVested(new Double(splitLine.get(gsusVested)));
                row.setSharesDeposited(new Double(splitLine.get(sharesDepos)));
                row.setFmv(new Double(splitLine.get(fmv)));
                row.setReleaseType(splitLine.get(relType));
                row.setTaxableInc(new Double(splitLine.get(taxableInc)));
                row.setTotalTax(new Double(splitLine.get(totalTax)));
                row.setFedTax(new Double(splitLine.get(fedTax)));
                row.setStateTax(new Double(splitLine.get(stateTax)));
                row.setLoc1Tax(new Double(splitLine.get(loc1Tax)));
                row.setSsTax(new Double(splitLine.get(ssTax)));
                row.setMedTax(new Double(splitLine.get(medTax)));
                row.setFracShareRefund(new Double(splitLine.get(fracShareRefund)));

                //System.out.println(row.getHistoricalPurno() + convertJuris(row.getJuris()));
                map.put(row.getHistoricalPurno() + convertJuris(row.getJuris()), row);
//                if (row.getJuris().equals("Australia"))
//                    addLater.add(row);

            } catch (Exception e) {
                for (String entry : splitLine) {
                    System.out.println(entry);
                }
                e.printStackTrace();
                System.exit(0);
            }
        }
        return map;
    }

    public static Map<String, ReportRow> newGmobReportMap(int[] index, Scanner file) {

        Map<String, ReportRow> map = new TreeMap<>();
        String line;
        while (file.hasNextLine()) {
            line = file.nextLine();
            List<String> splitLine = Arrays.asList(line.split(","));
            ReportRow row = new ReportRow();

            try {
                row.setJuris(splitLine.get(index[0]));
                try {
                    row.setOrigAwardDate(LocalDate.parse(splitLine.get(index[1]), dtf));
                } catch (DateTimeParseException e) {
                    row.setOrigAwardDate(LocalDate.parse(splitLine.get(index[1]), dtf2));
                }
                try {
                    row.setVestingDate(LocalDate.parse(splitLine.get(index[2]), dtf));
                } catch (DateTimeParseException e) {
                    row.setVestingDate(LocalDate.parse(splitLine.get(index[2]), dtf2));
                }
                row.setGsusVested(new Double(splitLine.get(index[3])));
                row.setSharesDeposited(new Double(splitLine.get(index[4])));
                row.setFmv(new Double(splitLine.get(index[5])));
                row.setTotalIncOfGsuAtVest(new Double(splitLine.get(index[6])));
                row.setPayrollReportableAmount(new Double(splitLine.get(index[7])));
                row.setAmountSubjectToTaxWithholding(new Double(splitLine.get(index[8])));
                row.setPercentIncAllocToJuris(new Double(splitLine.get(index[9])));
                row.setIncSubjToSocSec(new Double(splitLine.get(index[10])));
                row.setTotalTax(new Double(splitLine.get(index[11])));
                row.setFracShareRefund(new Double(splitLine.get(index[12])));
                row.setFxrate(splitLine.size() <= index[13] || splitLine.get(index[13]).equals("") ? new Double(1.0) : new Double(splitLine.get(index[13])));
                row.setCurrency(splitLine.get(index[14]));
                row.setReleaseType(splitLine.get(index[15]));
                row.setAwardNum(splitLine.get(index[16]));
                row.setHistoricalPurno(splitLine.get(index[17]));

                map.put(row.getHistoricalPurno() + convertJuris(row.getJuris()), row);
                if (row.getJuris().equals("Australia"))
                    addLater.add(row);

            } catch (Exception e) {
                for (String entry : splitLine) {
                    System.out.println(entry);
                }
                e.printStackTrace();
                System.exit(0);
            }
        }
        return map;
    }
}
