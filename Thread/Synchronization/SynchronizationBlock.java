package com.f1soft.Task.Thread.Synchronization;

class BlockMessage{

    public void sendMessage(String message){
        System.out.println("Message to be sent"+message);
    }

}
class SyncBlock1 extends Thread{
    final BlockMessage blockMessageObj;
    private final String block1Message;

    SyncBlock1(String block1Message, BlockMessage blockObj){
       blockMessageObj=blockObj;
        this.block1Message=block1Message;
    }

    public void run() {
        synchronized(blockMessageObj){
            blockMessageObj.sendMessage(block1Message);
        }
    }
}

public class SynchronizationBlock {

    public static void main(String[] args)
    {
        BlockMessage sender = new BlockMessage();
        SyncBlock1 sender1 = new SyncBlock1( "Hola " , sender);
        SyncBlock1 sender2 = new SyncBlock1( "Hy " , sender);


        // Start two threads SyncBlock1 type
        sender1.start();
        sender2.start();

        try {
            sender1.join();
            sender2.join();
        } catch (InterruptedException e) {
            System.out.println("Error");
        }

    }
}