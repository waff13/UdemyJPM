public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if ((tonerLevel <= -1) || (tonerLevel > 100)) {
            this.tonerLevel = -1;
        } else {
            this.tonerLevel = tonerLevel;
        }
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount) {
        if ((tonerAmount <= 0) || (tonerAmount > 100)) {
            return -1;
        } else {
            if ((this.tonerLevel + tonerAmount) > 100) {
                return -1;
            }
        }
        return (this.tonerLevel += tonerAmount);
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if (duplex) {
            System.out.println("Printing in duplex mode");
            pagesToPrint = ((pages / 2) + (pages % 2));
            pagesPrinted += pagesToPrint;
            return pagesToPrint;
        }
        pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public static void main(String[] args) {
        Printer printer = new Printer(50, true);
        System.out.println(printer.addToner(50));
        System.out.println("Toner level is " + printer.tonerLevel);
        System.out.println("Initial page count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total is " + printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted + " new total is " + printer.getPagesPrinted());

        Printer nonduplex = new Printer(80, false);
        System.out.println("Toner level is " + nonduplex.tonerLevel);
        System.out.println("Add 10 toner => " + nonduplex.addToner(10));
        System.out.println("Now toner level is " + nonduplex.tonerLevel);
    }
}
