package ShoppingPriorityQueue;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShoppingSystemTESTS {
	 @Test
	    void testAddShoppersAndCheckNotNullQueue() {
	        PriorityQueue priorityQueueManager = new PriorityQueue();
	        PriorityQueue priorityQueueManagerForCoupon = new PriorityQueue();


	        Shopper shopper1 = new Shopper("Shopper1", 10, 80.0);
	        Shopper shopper2 = new Shopper("Shopper2", 15, 120.0);
	        Shopper shopper3 = new Shopper("Shopper3", 12, 90.0);
	        Shopper shopper4 = new Shopper("Shopper4", 9, 102.0);

	        // Add shoppers to the priority queue
	        priorityQueueManager.enqueue(shopper1);
	        priorityQueueManager.enqueue(shopper2);
	        priorityQueueManager.enqueue(shopper3);
	        priorityQueueManager.enqueue(shopper4);

	        // Ensure shoppers are added to the priority queue
	        assertNotNull(priorityQueueManager);
	    }
	 
	 @Test
	    void testAddShoppersAndCheckout() {
	        PriorityQueue priorityQueueManager = new PriorityQueue();

	        Shopper shopper1 = new Shopper("Shopper1", 10, 80.0);
	        Shopper shopper2 = new Shopper("Shopper2", 15, 120.0);
	        Shopper shopper3 = new Shopper("Shopper3", 12, 90.0);
	        Shopper shopper4 = new Shopper("Shopper4", 9, 102.0);

	        // Add shoppers to the priority queue
	        priorityQueueManager.enqueue(shopper1);
	        priorityQueueManager.enqueue(shopper2);
	        priorityQueueManager.enqueue(shopper3);
	        priorityQueueManager.enqueue(shopper4);

	       
	        // Ensure shoppers are added to the priority queue
	        assertEquals(shopper2, priorityQueueManager.dequeue());
	    }



	 
	    @Test
	    void testCouponDistributionAndCheckout() {
	        PriorityQueue priorityQueueManager = new PriorityQueue();
	        PriorityQueue priorityQueueManagerForCoupon = new PriorityQueue();

	        Shopper shopper1 = new Shopper("Shopper1", 10, 80.0);
	        Shopper shopper2 = new Shopper("Shopper2", 15, 120.0);
	        Shopper shopper3 = new Shopper("Shopper3", 12, 90.0);
	        Shopper shopper4 = new Shopper("Shopper4", 9, 102.0);

	        // Add shoppers to the priority queue
	        priorityQueueManager.enqueue(shopper1);
	        priorityQueueManager.enqueue(shopper2);
	        priorityQueueManager.enqueue(shopper3);
	        priorityQueueManager.enqueue(shopper4);

	        // Simulate checkout process after coupon
	        ShoppingSystem ss = new ShoppingSystem();
	        priorityQueueManager = ss.addToQueueWithAdjustedCoupon(priorityQueueManager, priorityQueueManagerForCoupon);

	        // Ensure shoppers receive coupons based on the specified conditions
	        assertEquals(shopper2, priorityQueueManager.dequeue());
	        assertEquals(105.0, shopper2.getTotalPurchase(), 0.001);
	        
	        assertEquals(shopper3, priorityQueueManager.dequeue());
	        assertEquals(90.0, shopper3.getTotalPurchase(), 0.001);
	    }
	    
	    @Test
	    void testStabilityOfPriorityQueue() {
	        PriorityQueue priorityQueueManager = new PriorityQueue();
	        PriorityQueue priorityQueueManagerForCoupon = new PriorityQueue();

	        Shopper shopper1 = new Shopper("Shopper1", 10, 90.0);
	        Shopper shopper2 = new Shopper("Shopper2", 15, 120.0);
	        Shopper shopper3 = new Shopper("Shopper3", 12, 90.0);
	        Shopper shopper4 = new Shopper("Shopper4", 9, 102.0);

	        // Add shoppers to the priority queue
	        priorityQueueManager.enqueue(shopper1);
	        priorityQueueManager.enqueue(shopper2);
	        priorityQueueManager.enqueue(shopper3);
	        priorityQueueManager.enqueue(shopper4);

	        // Simulate checkout process after coupon
	        ShoppingSystem ss = new ShoppingSystem();
	        priorityQueueManager = ss.addToQueueWithAdjustedCoupon(priorityQueueManager, priorityQueueManagerForCoupon);

	        // Ensure shopper1 is dequeued right before shopper3
	        priorityQueueManager.dequeue();
	        assertEquals(shopper1, priorityQueueManager.dequeue());
	        assertEquals(shopper3, priorityQueueManager.dequeue());
	        
	    }
}
