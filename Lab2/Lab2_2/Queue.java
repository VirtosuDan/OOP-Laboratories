package com.company;

public class Queue
{
    public int queueArr[];
    public int elementsNumber = 0;
    public int maxNrOfElements;


    public Queue(int maxNrOfElements)
    {
        this.maxNrOfElements = maxNrOfElements;
        queueArr = new int[maxNrOfElements];
    }


    public Queue()
    {
        this.maxNrOfElements = 1000000;
        queueArr = new int[maxNrOfElements];
    }



    public void push(int value)
    {
        if (elementsNumber + 1 > maxNrOfElements)
            return;
        queueArr[elementsNumber] = value;
        elementsNumber++;
    }

   public int pop()
    {
        int index=0 ;
        if (elementsNumber == 0)
            return 0;

        int value = queueArr[0];

        while (index < elementsNumber - 1)
        {
            queueArr[index] = queueArr[index+1];
            index++;
        }
        elementsNumber--;
        return value;
    }

    public void showElements()
    {
        for (int i = 0; i < elementsNumber; i++)
        {
            System.out.print(queueArr[i] + " ");
        }
        System.out.println();
    }

    public void isEmpty()
{
    if (elementsNumber == 0)
        System.out.println("The Queue does not have elements:");

}

    public void isFull()
    {
        if (elementsNumber == maxNrOfElements)
            System.out.println("The Queue is full.Stop");
        else if (elementsNumber != 0 && elementsNumber < maxNrOfElements) {
            System.out.println("The queue has elements , but the maximum values was not reached!");
        }
    }
}
