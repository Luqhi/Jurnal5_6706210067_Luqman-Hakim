import java.util.Scanner;

public class ToDoList {

    public static void main(String[] args) {
	    // write your code here
        Scanner up = new Scanner(System.in);
        QueueLL<String> queue = new QueueLL<>();
        int noMenu;
        String tugas, yesOrNo;
        do {
            queue.menu();
            noMenu = up.nextInt();

            switch (noMenu){
                case 1:
                    queue.enqueue(tugas = up.next());
                    System.out.println("Apakah anda yakin ingin memasukan tugas ? (y/n)");
                    yesOrNo = up.next();
                    if (yesOrNo.equalsIgnoreCase("y")){
                        queue.printQueue();
                    }
                    break;
                case 2:
                    System.out.println("Apakah anda yakin ingin menghapus tugas ? (y/n)");
                    yesOrNo = up.next();
                    if (yesOrNo.equalsIgnoreCase("y")){
                        if (!queue.isEmpty()) {
                            queue.dequeue();
                            queue.printQueue();
                        }
                    }
                    break;
                case 3:
                    queue.printQueue();
                    break;
                case 4:
                    System.out.println("========== Terimakasih ==========");
                    System.out.println(" ");
                    break;
            }

            if (noMenu < 1 || noMenu > 4){
                System.out.println("Maaf Silahkan Memilih 1 - 4 \n");
            }

        }while (noMenu >= 0);
    }
}
