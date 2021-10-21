package dto;

import java.util.List;

public class OrderDTO {
    private int orderNo;         //주문번호
    private int customerNo;      //구매자번호
    private String orderAddr;    //배송지
    private int orderTotalPrice; //총금액
    
    private List<OrderDetailDTO> orderDetailList;
    
    public OrderDTO() {}
    
    public OrderDTO(int customerNo, String orderAddr, int orderTotalPrice) {
		super();
		this.customerNo = customerNo;
		this.orderAddr = orderAddr;
		this.orderTotalPrice = orderTotalPrice;
	}
    
	public OrderDTO(int orderNo, int customerNo, String orderAddr, int orderTotalPrice) {
		super();
		this.orderNo = orderNo;
		this.customerNo = customerNo;
		this.orderAddr = orderAddr;
		this.orderTotalPrice = orderTotalPrice;
	}

	public int getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}

	public int getCustomerNo() {
		return customerNo;
	}

	public void setCustomerNo(int customerNo) {
		this.customerNo = customerNo;
	}


	public String getOrderAddr() {
		return orderAddr;
	}

	public void setOrderAddr(String orderAddr) {
		this.orderAddr = orderAddr;
	}


	public int getOrderTotalPrice() {
		return orderTotalPrice;
	}

	public void setOrderTotalPrice(int orderTotalPrice) {
		this.orderTotalPrice = orderTotalPrice;
	}

	public List<OrderDetailDTO> getOrderDetailList() {
		return orderDetailList;
	}

	public void setOrderDetailList(List<OrderDetailDTO> orderDetailList) {
		this.orderDetailList = orderDetailList;
	}
    
}
