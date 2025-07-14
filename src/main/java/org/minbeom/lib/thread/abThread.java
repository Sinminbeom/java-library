package org.minbeom.lib.thread;

public abstract class abThread extends Thread {
    enum E_THREAD_STATUS {
        WAITING("WAITING"),
        RUNNING("RUNNING"),
        STOPING("STOPING");

        private final String status;

        E_THREAD_STATUS(String status) {
            this.status = status;
        }
    }

    private E_THREAD_STATUS status;

    public abThread() {
        status = E_THREAD_STATUS.WAITING;
        System.out.println("Thread wait || status : " + status);
    }

    @Override
    public void run() {
        status = E_THREAD_STATUS.RUNNING;
        System.out.println("Thread start || status : " + status);

        while (status == E_THREAD_STATUS.RUNNING) {
            try {
                Action();
            } catch (Exception e) {
                Stop();
            }
        }
    }

    public void exceptionTest() {
        throw new RuntimeException();
    }

    public void Stop() {
        status = E_THREAD_STATUS.STOPING;
        System.out.println("Thread stop || status : " + status);
    }

    public abstract void Action();

}
