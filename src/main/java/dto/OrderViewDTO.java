package dto;

public class OrderViewDTO {
	private int itemNo;
    private String itemName;
    private int itemPrice;
	private int itemCount;
    private String orderDate;
    private String orderState;
    private String mainImg;
    
    public OrderViewDTO() {}


	public OrderViewDTO(int itemNo,String itemName, int itemPrice, int itemCount, String orderDate, String orderState, String mainImg) {
		super();
		this.itemNo = itemNo;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.itemCount = itemCount;
		this.orderDate = orderDate;
		this.orderState = orderState;
		this.mainImg = mainImg;
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


	public int getItemCount() {
		return itemCount;
	}


	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}


	public String getOrderDate() {
		return orderDate;
	}


	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}


	public String getOrderState() {
		return orderState;
	}


	public void setOrderState(String orderState) {
		this.orderState = orderState;
	}
    
	public int getItemNo() {
		return itemNo;
	}


	public void setItemNo(int itemNo) {
		this.itemNo = itemNo;
	}


	public String getMainImg() {
		return mainImg;
	}


	public void setMainImg(String mainImg) {
		this.mainImg = mainImg;
	}
    
    
}
