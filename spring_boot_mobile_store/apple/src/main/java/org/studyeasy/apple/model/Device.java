package org.studyeasy.apple.model;

public class Device {
    String name;
    String type;
    String img;
    String price;
	String display;
    String capacity;
    String box;
    String weight;
    
    public Device() {
    }

    public Device(String name, String type, String img, String price, String display, String capacity, String box, String weight) {
        this.name = name;
        this.type = type;
        this.img  = img;
        this.price = price;
        this.display = display;
        this.capacity = capacity;
        this.box = box;
        this.weight = weight;
    }
     
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
  
    /**
   	 * @return the price
   	 */
   	public String getPrice() {
   		return price;
   	}

   	/**
   	 * @param price the price to set
   	 */
   	public void setPrice(String price) {
   		this.price = price;
   	}

   	/**
   	 * @return the display
   	 */
   	public String getDisplay() {
   		return display;
   	}

   	/**
   	 * @param display the display to set
   	 */
   	public void setDisplay(String display) {
   		this.display = display;
   	}

   	/**
   	 * @return the capacity
   	 */
   	public String getCapacity() {
   		return capacity;
   	}

   	/**
   	 * @param capacity the capacity to set
   	 */
   	public void setCapacity(String capacity) {
   		this.capacity = capacity;
   	}

   	/**
   	 * @return the box
   	 */
   	public String getBox() {
   		return box;
   	}

   	/**
   	 * @param box the box to set
   	 */
   	public void setBox(String box) {
   		this.box = box;
   	}

   	/**
   	 * @return the weight
   	 */
   	public String getWeight() {
   		return weight;
   	}

   	/**
   	 * @param weight the weight to set
   	 */
   	public void setWeight(String weight) {
   		this.weight = weight;
   	}

    @Override
    public String toString() {
        return "Device{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", img='" + img + '\'' +
                 ", price='" + price + '\'' +
                  ", display='" + display + '\'' +
                   ", capacity='" + capacity + '\'' +
                    ", box='" + box + '\'' +
                     ", weight='" + weight + '\'' +
                     
                '}';
    
    }
}
