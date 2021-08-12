package Model;

public abstract class Food {
    protected String description;

    protected void setDescription(String description)
    { this.description = description; }

    protected String getDescription()
    { return description; }

    protected abstract double Price();
}
