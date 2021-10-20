package dto;

public class CartViewDTO {
    
	private int cartNo;
	private String itemName;
	private int itemPrice;
	private int itemQuantity;
	private String mainImg;
	
	public CartViewDTO() {}

	public CartViewDTO(int cartNo, String itemName, int itemPrice, int itemQuantity, String mainImg) {
		super();
		this.cartNo = cartNo;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.itemQuantity = itemQuantity;
		this.mainImg = mainImg;
	}
    
	
	
	public int getCartNo() {
		return cartNo;
	}

	public void setCartNo(int cartNo) {
		this.cartNo = cartNo;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}

	public int getItemQuantity() {
		return itemQuantity;
	}

	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	public String getMainImg() {
		return mainImg;
	}

	public void setMainImg(String mainImg) {
		this.mainImg = mainImg;
	}
	
	
	
}
