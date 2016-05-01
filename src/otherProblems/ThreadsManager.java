package otherProblems;

public class ThreadsManager {

    private static AtomicInt atomicInt;

    public static void main(String[] args) {
        atomicInt = new AtomicInt();
        Thread[] threads = new Thread[10];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(ThreadsManager::addInLoop);
            threads[i].start();
        }
        outer:
        while(true){
            for (int i = 0; i < threads.length; i++) {
                if (threads[i].isAlive()) continue outer;
            }
            break;
        }
        System.out.println(atomicInt.a);
    }
    private static void addInLoop(){
        for (int i = 0; i < 100 * 1_000_000; i++) {
            atomicInt.add();
        }
    }
}
