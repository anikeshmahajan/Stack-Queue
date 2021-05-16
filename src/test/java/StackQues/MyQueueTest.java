package StackQues;

import org.junit.Test;

import junit.framework.Assert;

public class MyQueueTest {
    @Test
    public void given3Integers_WhenAddedToQueue_ShouldPassTheTest(){
        MyQueue myQueue = new MyQueue();
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        myQueue.enqueue(myFirstNode);
        myQueue.enqueue(mySecondNode);
        myQueue.enqueue(myThirdNode);
        INode peak = myQueue.peak();
        myQueue.printQueue();
        Assert.assertEquals(peak, myFirstNode);
    }
}