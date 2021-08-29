//Code by Michalis Van Steen
package Model;

public abstract class ToppingSelection extends Food {
    protected Food food;
    protected ToppingSelection(Food food) {this.food = food; }

    protected double Price() { return food.Price(); }
}
