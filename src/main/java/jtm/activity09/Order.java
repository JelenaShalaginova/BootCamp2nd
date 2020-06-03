package jtm.activity09;

import java.util.Objects;

/*- TODO #1
 * Implement Comparable interface with Order class
 * Hint! Use generic type of comparable items in form: Comparable<Order>
 * 
 * TODO #2 Override/implement necessary methods for Order class:
 * - DONE public Order(String orderer, String itemName, Integer count) — constructor of the Order
 * - DONE public int compareTo(Order order) — comparison implementation according to logic described below
 * - public boolean equals(Object object) — check equality of orders
 * - public int hashCode() — to be able to handle it in some hash... collection 
 * - public String toString() — string in following form: "ItemName: OrdererName: Count"
 * 
 * Hints:
 * 1. When comparing orders, compare their values in following order:
 *    - Item name
 *    - Customer name
 *    - Count of items
 * If item or customer is closer to start of alphabet, it is considered "smaller"
 * 
 * 2. When implementing .equals() method, rely on compareTo() method, as for sane design
 * .equals() == true, if compareTo() == 0 (and vice versa).
 * 
 * 3. Also Ensure that .hashCode() is the same, if .equals() == true for two orders.
 * 
 */

public class Order implements Comparable<Order> {
	
	String customer; // Name of the customer
	String name; // Name of the requested item
	int count; // Count of the requested items
	
	public Order(String orderer, String itemName, Integer count) {
		this.customer = orderer;
		this.name = itemName;
		this.count = count;
	}

	@Override
	public int compareTo(Order o) {
		
		int result = this.name.compareTo(o.name);
		if (result == 0) {
			result = this.customer.compareTo(o.customer);
		}if (result == 0) {
			result = Integer.compare(this.count, o.count);
		}
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if (obj != null && obj instanceof Order) {
			Order obj1 = (Order) obj;
		if ((name == obj1.name) && (customer == obj1.customer) && (count == obj1.count)) 
			result = true;
		}
		return result;
	}

	@Override
	public int hashCode() {
		
		return Objects.hash(customer, name, count);
	}

	@Override
	public String toString() {
		
		return "Name of item: " + name + ", name of customer: " + customer + ", count of items: " + count;
	}
	
	
	
	
	
}
