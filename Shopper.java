package ShoppingPriorityQueue;

class Shopper implements Comparable<Shopper> {
    private static int insertionOrderCounter = 0;

    private String name;
    private int itemsPurchased;
    private double totalPurchase;
    private int insertionOrder;

    public Shopper(String name, int itemsPurchased, double totalPurchase) {
        this.name = name;
        this.itemsPurchased = itemsPurchased;
        this.totalPurchase = totalPurchase;
        this.insertionOrder = insertionOrderCounter++;
    }

    public String getName() {
        return name;
    }

    public int getItemsPurchased() {
        return itemsPurchased;
    }

    public double getTotalPurchase() {
        return totalPurchase;
    }
    public void setTotalPurchase(double amnt){
        this.totalPurchase = amnt;
    }

    @Override
    public int compareTo(Shopper other) {
        // Higher total purchase has higher priority
        if (this.totalPurchase != other.totalPurchase) {
            return Double.compare(other.totalPurchase, this.totalPurchase);
        } else {
            // If total purchase is the same, maintain stable sort based on insertion order
            return Integer.compare(this.insertionOrder, other.insertionOrder);
        }
    }
}