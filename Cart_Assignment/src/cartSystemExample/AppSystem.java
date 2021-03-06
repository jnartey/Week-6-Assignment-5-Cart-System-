package cartSystemExample;

import java.io.FileNotFoundException;
import java.util.HashMap;

public class AppSystem extends TheSystem {
    public AppSystem() throws FileNotFoundException {
    }
    
    public void display() {
        HashMap<String, Item> current = this.getItemCollection();
      //Fill the code here
       current.forEach((k, v) -> System.out.println(k + " " + v.getItemDesc() + " " + v.getItemPrice() + " " + v.getAvailableQuatity()));
    }
    
    public Boolean add(Item item) {
      //Fill the code here
    	if(this.getItemCollection().containsKey(item.getItemName())) {
    		System.out.println("Item " + item.getItemName() + " is already in the system");
    		return false;
    	}else {
    		HashMap<String, Item> newCollection = this.getItemCollection();
    		newCollection.put(item.getItemName(), item);
    		this.setItemCollection(newCollection);
    		return true;
    	}    	
    }
}
