package edu.umb.cs681.hw03;

class SortByYear implements Comparator<Car>
{
    public int compare(Car a, Car b)
    {
        return a.getYear() - b.getYear();
    }
}
