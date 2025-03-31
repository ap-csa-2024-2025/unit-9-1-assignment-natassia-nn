public class SpecialityCoffee extends SpecialityCoffee
{
    private String flavor;

    public SpecialityCoffee(String size, boolean isSkinny, int shots, String type, String flavor)
    {
        super(size, isSkinny, shots, type);
        this.flavor = flavor;
    }

    public SpecialityCoffee(String size, String type, String flavor)
    {
        super(size, false, 1, type)
        this.flavor = flavor;
    }
    
    public SpecialityCofee()
    {
        super();
        flavor = "vanilla";
    }

    public String toString()
    {
        return super.toString() + " with " + this.flavor;
    }
}