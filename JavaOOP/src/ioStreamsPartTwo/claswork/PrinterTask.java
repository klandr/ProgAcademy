package ioStreamsPartTwo.claswork;

public class PrinterTask implements Runnable {
    private Printer prn;
    private String text;

    public PrinterTask(Printer prn, String text) {
        this.prn = prn;
        this.text = text;
    }

    @Override
    public void run() {
        for (int i =0; i<5;i++){
            prn.printText(text);
        }
    }
}
