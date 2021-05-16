package creational.factory;

public class CocktailFactory {

    public static Cocktail getCocktail(CocktailType cocktailType) {
        Cocktail cocktail;
        switch (cocktailType) {
            case SOUR:
                cocktail = new SourCocktail();
                break;
            case SWEET:
                cocktail = new SweetCocktail();
                break;
            case STRONG:
                cocktail = new StrongCocktail();
                break;
            default:
                throw new IllegalArgumentException("No type cocktail chosen");
        }
        return cocktail;
    }
}
