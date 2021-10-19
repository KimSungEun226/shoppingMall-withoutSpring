package dto;



public class ItemDTO {
	private int itemNo;             //상품 번호   db에서는 item_No
	private int categoryNo;         //카테고리번호
	private int sellerNo;           //판매자 번호
	private int regionNo;           //지역번호
	private String itemName;        //상품이름
	private int itemPrice ;         //상품 가격
	private int itemStock;           //상품 재고량
	private String itemAddDate;      //상품등록일
	private String itemApprove;       //상품승인여부
	private float itemGrade;          //상품평점
	private String itemDescription;   //제품설명
	
	public ItemDTO(){}


	
	
	public ItemDTO(int categoryNo, int sellerNo, int regionNo, String itemName, int itemPrice, int itemStock,
			String itemDescription) {
		super();
		this.categoryNo = categoryNo;
		this.sellerNo = sellerNo;
		this.regionNo = regionNo;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.itemStock = itemStock;
		this.itemDescription = itemDescription;
	}




	public ItemDTO(int itemNo, int categoryNo, int sellerNo, int regionNo, String itemName, int itemPrice, int itemStock,
			String itemAddDate, String itemApprove, float itemGrade) {
		super();
		this.itemNo = itemNo;
		this.categoryNo = categoryNo;
		this.sellerNo = sellerNo;
		this.regionNo = regionNo;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.itemStock = itemStock;
		this.itemAddDate = itemAddDate;
		this.itemApprove = itemApprove;
		this.itemGrade = itemGrade;
	}
	
	


	public ItemDTO(int itemNo, int categoryNo, int sellerNo, int regionNo, String itemName, int itemPrice,
			int itemStock, String itemAddDate, String itemApprove, float itemGrade, String itemDescription) {
		this(itemNo, categoryNo, sellerNo, regionNo, itemName, itemPrice, itemStock, itemAddDate, itemApprove, itemGrade);
		this.itemDescription = itemDescription;
	}


	public int getItemNo() {
		return itemNo;
	}


	public void setItemNo(int itemNo) {
		this.itemNo = itemNo;
	}


	public int getCategoryNo() {
		return categoryNo;
	}


	public void setCategoryNo(int categoryNo) {
		this.categoryNo = categoryNo;
	}


	public int getSellerNo() {
		return sellerNo;
	}


	public void setSellerNo(int sellerNo) {
		this.sellerNo = sellerNo;
	}
	

	public int getRegionNo() {
		return regionNo;
	}


	public void setRegionNo(int regionNo) {
		this.regionNo = regionNo;
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


	public int getItemStock() {
		return itemStock;
	}


	public void setItemStock(int itemStock) {
		this.itemStock = itemStock;
	}


	public String getItemAddDate() {
		return itemAddDate;
	}


	public void setItemAddDate(String itemAddDate) {
		this.itemAddDate = itemAddDate;
	}


	public String getItemApprove() {
		return itemApprove;
	}


	public void setItemApprove(String itemApprove) {
		this.itemApprove = itemApprove;
	}


	public float getItemGrade() {
		return itemGrade;
	}


	public void setItemGrade(float itemGrade) {
		this.itemGrade = itemGrade;
	}


	public String getItemDescription() {
		return itemDescription;
	}


	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}




	@Override
	public String toString() {
		return "ItemDTO [itemNo=" + itemNo + ", categoryNo=" + categoryNo + ", sellerNo=" + sellerNo + ", regionNo="
				+ regionNo + ", itemName=" + itemName + ", itemPrice=" + itemPrice + ", itemStock=" + itemStock
				+ ", itemAddDate=" + itemAddDate + ", itemApprove=" + itemApprove + ", itemGrade=" + itemGrade
				+ ", itemDescription=" + itemDescription + "]";
	};
	
	
	
	
	
}
