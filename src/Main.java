import java.util.LinkedList;
import java.util.List;

/**
 * Реализовать свой LinkedList с методами вставки в начало, конец списка, получения размера списка и получения
 * элемента по индексу. (можете выбрать список однонаправленный или двунаправленный, по желанию)
 */
public class Main {
    public static void main(String[] args) {

        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.dobPerv("первый");
        System.out.println(myLinkedList.toString());
        System.out.println("Размер списка = " + myLinkedList.getRazm());

        myLinkedList.dobPosl("последний");
        System.out.println(myLinkedList.toString());
        System.out.println("Размер списка = " + myLinkedList.getRazm());
        System.out.println("Элемент 1 = " + myLinkedList.get(1));
        System.out.println("Элемент 3 = " + myLinkedList.get(3) + "\n");

        MyLinkedList<Integer> myLinkedList1 = new MyLinkedList<>();
        myLinkedList1.dobPerv(11);
        myLinkedList1.dobPerv(10);
        myLinkedList1.dobPosl(12);
        myLinkedList1.dobPosl(13);
        System.out.println(myLinkedList1.toString());
        System.out.println("Размер списка = " + myLinkedList1.getRazm());
        System.out.println("Элемент 2 = " + myLinkedList1.get(2));

    }
}