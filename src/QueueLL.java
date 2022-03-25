import java.util.*;

public class QueueLL<E>{
    private Queue<E> queueList;

    public QueueLL() {
        queueList = new LinkedList<E>();
    }
    public void enqueue(E object) {
        queueList.add(object);
    }
    public E dequeue() throws NoSuchElementException {
        return queueList.remove();
    }
    public boolean isEmpty() {
        return queueList.isEmpty();
    }
    public void printQueue() {
        Iterator<E> iterator = queueList.iterator();
        while (iterator.hasNext()) {
            Object value = iterator.next();
            System.out.println(value);
        }
    }
    public void menu(){
        String pilihanMenu = "Pilihan Menu : \n" +
                "1. Input List \n" +
                "2. Hapus List \n" +
                "3. Cetak List \n" +
                "4. Keluar";
        System.out.println(pilihanMenu);
    }
}
