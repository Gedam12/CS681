package edu.umb.cs681.hw03;

class SortByDominationCount implements Comparator<Car>
{
    public int compare(Car a, Car b)
    {
        return a.getDominationCount() - b.getDominationCount();
    }
}
