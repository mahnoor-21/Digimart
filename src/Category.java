
import java.util.*;
public class Category {
    private String categoryName;
    private List<Clothes> items;
    private String filters;
    public Category(String categoryName, List<Clothes> items, String filters) {
        this.categoryName = categoryName;
        this.items = items;
        this.filters = filters;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<Clothes> getItems() {
        return items;
    }

    public void setItems(List<Clothes> items) {
        this.items = items;
    }

    public String getFilters() {
        return filters;
    }

    public void setFilters(String filters) {
        this.filters = filters;
    }

    public void applyFilter(String colorFilter, double maxPrice, String sizeFilter) {
        System.out.println("Applying filters - Color: " + colorFilter + ", Size: " + sizeFilter + ", Max Price: " + maxPrice);
        for (Clothes clothes : items) {
            List<ItemCategory> clothesItems = clothes.viewAvailableItems();
            for (ItemCategory item : clothesItems) {
                if ((sizeFilter.isEmpty() || item.getSize().equalsIgnoreCase(sizeFilter)) &&
                        (colorFilter.isEmpty() || item.getColor().equalsIgnoreCase(colorFilter)) &&
                        (maxPrice == Double.MAX_VALUE || item.getPrice() <= maxPrice)) {
                    System.out.println("Filtered Item: " + item.getItemName() +
                            ", Color: " + item.getColor() +
                            ", Size: " + item.getSize() +
                            ", Price: " + item.getPrice());
                }
            }
        }
    }
}
