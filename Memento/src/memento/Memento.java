package memento;
import java.util.ArrayList;

public class Memento {
    int money;                              // ��
    ArrayList<String> fruits;                          // ����
    public int getMoney() {                 // ���� ��´�.(narrow interface)
        return money;
    }
    Memento(int money) {                    // ������(wide interface)
        this.money = money;
        this.fruits = new ArrayList<String>();
    }
    void addFruit(String fruit) {           // ������ �߰��Ѵ�.(wide interface)
        fruits.add(fruit);
    }
}
