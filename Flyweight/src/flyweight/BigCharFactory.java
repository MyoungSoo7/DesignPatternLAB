package flyweight;

import java.util.Hashtable;

public class BigCharFactory {
    // �̹� ������� BigChar�� �ν��Ͻ��� ����
    private Hashtable<String,BigChar> pool = 
    		new Hashtable<String,BigChar>();
    // Singleton ����
    private static BigCharFactory singleton = new BigCharFactory();
    // ������
    private BigCharFactory() {
    }
    // ������ �ϳ��� �ν��Ͻ��� ��´�.
    public static BigCharFactory getInstance() {
        return singleton;
    }
    // BigChar�� �ν��Ͻ� ����(����)
    public synchronized BigChar getBigChar(char charname) {
        BigChar bc = pool.get("" + charname);
        if (bc == null) {
            bc = new BigChar(charname); // ���⿡�� BigChar�� �ν��Ͻ��� ����
            pool.put("" + charname, bc);
        }
        return bc;
    }
}
