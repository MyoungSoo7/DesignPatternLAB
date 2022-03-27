package proxy;

public class PrinterProxy implements Printable {
    private String name;            // �̸�
    private Printer real;           // "����"
    public PrinterProxy() {
    }
    public PrinterProxy(String name) {      // ������
        this.name = name;
    }
    public synchronized void setPrinterName(String name) {  // �̸��� ����
        if (real != null) {
            real.setPrinterName(name);  // "����"���Ե� �����Ѵ�.
        }
        System.out.println("proxy : setPrinterName()");
        this.name = name;
    }
    public String getPrinterName() {    // �̸��� ���
    	System.out.println("proxy : getPrinterName()");
    	return name;
    }
    public void print(String string) {  // ǥ��
        realize();
        real.print(string);
    }
    private synchronized void realize() {   // "����"�� ����
        if (real == null) {
            real = new Printer(name);
        }
    }
}
