package Shalini.com;

public class Main {
    public static void main(String args[]) {
        Printer printer = new Printer(20, true);
        System.out.println(" initial page count= " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println(" printed pages was= " + pagesPrinted + " new total print count for printer" + printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println(" printed pages was= " + pagesPrinted + " new total print count for printer" + printer.getPagesPrinted());

    }
}
