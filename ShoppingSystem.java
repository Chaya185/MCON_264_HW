package ShoppingPriorityQueue;

public class ShoppingSystem {
    public static void main(String[] args) {
        // Create a Priority Queues
        PriorityQueue priorityQueueManager = new PriorityQueue();
        PriorityQueue priorityQueueManagerForCoupon = new PriorityQueue(); //used for couponed list of shoppers


        // Create shoppers for testing
        Shopper shopper1 = new Shopper("Shopper1", 10, 80.0);
        Shopper shopper2 = new Shopper("Shopper2", 15, 120.0);
        Shopper shopper3 = new Shopper("Shopper3", 12, 90.0);
        Shopper shopper4 = new Shopper("Shopper4", 9, 102.0);

        priorityQueueManager = addShoppers(priorityQueueManager, shopper1, shopper2, shopper3, shopper4);

        // Simulate the checkout process
        priorityQueueManager = simulateCheckoutProcess(priorityQueueManager);

        //This handles the coupon. It adds the shoppers to a new queue and checks if eligible for coupon
        priorityQueueManagerForCoupon = addShoppers(priorityQueueManagerForCoupon, shopper1, shopper2, shopper3, shopper4);
        System.out.println();

        priorityQueueManager = addToQueueWithAdjustedCoupon(priorityQueueManagerForCoupon, priorityQueueManager);

        // Simulate the checkout process
        priorityQueueManager = simulateCheckoutProcess(priorityQueueManager);
    }

    //this method receives all the shopper objects and adds it to a queue. Method is good for reusability
    public static PriorityQueue addShoppers(PriorityQueue priorityQueueManager, Shopper one, Shopper two, Shopper three, Shopper four){
        // Add shoppers to the priority queue
        priorityQueueManager.enqueue(one);
        priorityQueueManager.enqueue(two);
        priorityQueueManager.enqueue(three);
        priorityQueueManager.enqueue(four);

        return priorityQueueManager;
    }

    //this method receives the priority queue and simulates the checkout process
    public static PriorityQueue simulateCheckoutProcess(PriorityQueue priorityQueueManager){
        // Simulate the checkout process
        while (!priorityQueueManager.isEmpty()) {
            Shopper shopper = (Shopper) priorityQueueManager.dequeue();
            //display shopper name and total purchase
            System.out.println("Checking out " + shopper.getName() +
                    " with total purchase $" + shopper.getTotalPurchase());
        }
        return priorityQueueManager;
    }

    //this method receives both priority queues, dequeues from the first, checks if its eligible for coupon and then enqueues to second queue
    public static PriorityQueue addToQueueWithAdjustedCoupon(PriorityQueue priorityQueueManager, PriorityQueue priorityQueue){
        //dequeue while not empty
        while (!priorityQueueManager.isEmpty()) {
            Shopper shopper = (Shopper) priorityQueueManager.dequeue();

            // Coupon distribution if total purchase is over 100
            if (shopper.getTotalPurchase() > 100) {
                System.out.println("Congratulations! " + shopper.getName() + " receives a $15 coupon.");
                shopper.setTotalPurchase(shopper.getTotalPurchase() - 15);
            }
            priorityQueue.enqueue(shopper); //enqueues to new priority queue
        }
        return priorityQueue;
    }
}