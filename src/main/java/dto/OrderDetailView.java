package dto;

public class OrderDetailView {
   private int orderNo;
   private String customerName;
   private int customerNo;
   private String addr;
   private int count;
   private String orderDate;
   private String orderStatus;
   private String customerEamil;
   private String customerContact;
   
   public OrderDetailView() {}


	public OrderDetailView(int orderNo, int customerNo, String addr, int count, String orderDate, String orderStatus) {
		super();
		this.orderNo = orderNo;
		this.customerNo = customerNo;
		this.addr = addr;
		this.count = count;
		this.orderDate = orderDate;
		this.orderStatus = orderStatus;
	}


	public int getOrderNo() {
		return orderNo;
	}


	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public int getCustomerNo() {
		return customerNo;
	}


	public void setCustomerNo(int customerNo) {
		this.customerNo = customerNo;
	}


	public String getAddr() {
		return addr;
	}


	public void setAddr(String addr) {
		this.addr = addr;
	}


	public int getCount() {
		return count;
	}


	public void setCount(int count) {
		this.count = count;
	}


	public String getOrderDate() {
		return orderDate;
	}


	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}


	public String getOrderStatus() {
		return orderStatus;
	}


	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}


	public String getCustomerEamil() {
		return customerEamil;
	}


	public void setCustomerEamil(String customerEamil) {
		this.customerEamil = customerEamil;
	}


	public String getCustomerContact() {
		return customerContact;
	}


	public void setCustomerContact(String customerContact) {
		this.customerContact = customerContact;
	}

    
	
}
