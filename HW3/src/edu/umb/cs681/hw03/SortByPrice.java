package umb.edu.cs681.hw03;
 
class SortByPrice implements Comparator<Car>
{
    public int compare(Car a, Car b)
    {
        return a.getPrice() - b.getprice();
    }
}
