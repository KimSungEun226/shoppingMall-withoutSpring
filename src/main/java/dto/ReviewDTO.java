package dto;

public class ReviewDTO {
    
	private int reviewNo;           //리뷰 번호
	private int itemNo;             //상품 번호
	private String customerName;         //구매자 이름
	private int reviewGrade;        //리뷰 평점
	private String reviewContent;   //리뷰 내용
	private String reviewDate;      //리뷰 작성일자
	
	public ReviewDTO() {}

	public ReviewDTO(int reviewNo, int itemNo, String customerName, int reviewGrade, String reviewContent) {
		super();
		this.reviewNo = reviewNo;
		this.itemNo = itemNo;
		this.customerName = customerName;
		this.reviewGrade = reviewGrade;
		this.reviewContent = reviewContent;
	}
	
	public ReviewDTO(int reviewNo, int itemNo, String customerName, int reviewGrade, String reviewContent, String reviewDate) {
		super();
		this.reviewNo = reviewNo;
		this.itemNo = itemNo;
		this.customerName = customerName;
		this.reviewGrade = reviewGrade;
		this.reviewContent = reviewContent;
		this.reviewDate = reviewDate;
	}

	public int getReviewNo() {
		return reviewNo;
	}

	public void setReviewNo(int reviewNo) {
		this.reviewNo = reviewNo;
	}

	public int getItemNo() {
		return itemNo;
	}

	public void setItemNo(int itemNo) {
		this.itemNo = itemNo;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getReviewGrade() {
		return reviewGrade;
	}

	public void setReviewGrade(int reviewGrade) {
		this.reviewGrade = reviewGrade;
	}

	public String getReviewContent() {
		return reviewContent;
	}

	public void setReviewContent(String reviewContent) {
		this.reviewContent = reviewContent;
	}

	public String getReviewDate() {
		return reviewDate;
	}

	public void setReviewDate(String reviewDate) {
		this.reviewDate = reviewDate;
	}
	
	
	
}
