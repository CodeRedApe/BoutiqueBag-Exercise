public class ClothingArticle {
    private final String Description;
    private final double Cost;

    public ClothingArticle (String Description, double Cost)
    {
        this.Description = Description;
        this.Cost = Cost;
    }
    public String getDescription()
    {
        return this.Description;
    }
    public double getCost()
    {
        return this.Cost;
    }
    @Override
    public String toString()
    {
        return this.Description + " " + this.Cost;

    }
}