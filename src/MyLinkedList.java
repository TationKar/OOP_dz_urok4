import java.util.Collection;
import java.util.LinkedList;

public class MyLinkedList<E> {
    transient int razm = 0;
    transient Uzel<E> first;
    transient Uzel<E> last;

    public MyLinkedList(){
    }

    private void svyazPerv(E e){
        final Uzel<E> f = first;
        final Uzel<E> novUzel = new Uzel<>(null, e, f);
        first = novUzel;
        if (f == null)
            last = novUzel;
        else
            f.prev = novUzel;
        razm++;
    }

    private static class Uzel<E> {
        E item;
        Uzel<E> next;
        Uzel<E> prev;

        Uzel(Uzel<E> prev, E element, Uzel<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }
    /**
     * Вставка первого элемента
     */
    public void dobPerv(E e){
        svyazPerv(e);
    }

    /**
     * Вставка последнего элемента
     */
    public void dobPosl(E e){
        svyazPosl(e);
    }

    private void svyazPosl(E e) {
        final Uzel<E> l = last;
        final Uzel<E> novUzel = new Uzel<>(l, e, null);
        last = novUzel;
        if (l == null)
            first = novUzel;
        else
            l.next = novUzel;
        razm++;
    }

    /**
     * Возвращает размер списка
     */
    public int getRazm(){
        return razm;
    }
    Uzel<E> uzel(int ind){
        if (ind < (razm >>1)){
            Uzel<E> x = first;
            for (int i = 0; i < ind; i++)
                x = x.next;
            return x;
        } else {
            Uzel<E> x = last;
            for (int i = razm - 1; i > ind; i--)
                x = x.prev;
            return x;
        }
    }

    /**
     * Возвращает элемент списка по индексу
     */
    public E get(int ind) {
        if (ind > -1 && ind <= razm)
            return uzel(ind).item;
        else
            return null;
    }

@Override
    public String toString() {
        Uzel<E> curr = first;
        StringBuilder sb = new StringBuilder();
        sb.append("MyLinkedList [");
        while (curr != null) {
            sb.append(curr.item);
            if (curr.next != null) {
                sb.append(", ");
            }
            curr = curr.next;
        }
        sb.append("]");
        return sb.toString();
    }
}
