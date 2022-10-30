package edu.umb.cs681.hw03;

class SortByMieleage implements Comparator<Car>
{
    public float compare(Car a, Car b)
    {
        return a.getMileage() - b.getMieleage();
    }
}
